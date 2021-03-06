package com.chainsys.stream;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.LineNumberInputStream;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;
import java.io.PrintWriter;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.sql.Blob;

public class TestFile {
	public static void main(String[] args) throws IOException {
		TestFile fr = new TestFile();
//		fr.getEncod();
//		fr.TestreadLine();
//		fr.few();
//		fr.Testread();
//		fr.linenumbertest();
//		fr.testdataIOStream();
//		fr.testfilterSTream();
//		fr.pipeStream();
//		fr.pipeFileStream();
//		fr.pipedWithoutThread();
//		fr.TestbufferedInput();
//		fr.Testbufferedoutput();
//		fr.file();
		fr.fileWriter();
	}

	public void Testread() {
		InputStreamReader str = new InputStreamReader(System.in);
		System.out.println("enter any character or number");
		try {
			int bytevalue = str.read();
			System.out.println(bytevalue);
			System.out.println((char) bytevalue);
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}

	public void TestreadLine() {
		InputStreamReader str = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(str);
		// BufferedReader(str) it is constructor here str is must be reader
		System.out.println("enter a string:");
		String name =null;

		try {

			name = br.readLine();
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		System.out.println(name);
	}

	public void getEncod() {
		try {
			FileInputStream file = new FileInputStream("d:\\ass\\sam\\testFile.txt");
			InputStreamReader reader = new InputStreamReader(file, Charset.forName("cp1252"));
//			InputStreamReader reader = new InputStreamReader(file, Charset.forName("cp1252")); 
			System.out.println("Character Encoding of the reader is: " + reader.getEncoding());
			reader.close();
		} catch (Exception e) {
			System.out.print("Error: " + e.toString());
		}

	}

	public void few() {
		System.out.println("enter somthing");
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		String str;
		try {
			str = br.readLine();
			byte[] byt = str.getBytes();
			ByteArrayInputStream bA = new ByteArrayInputStream(byt);
			LineNumberInputStream l = new LineNumberInputStream(bA);
			for (int x : byt) {
				System.out.println(x);
				l.reset();
				System.out.println(l.read(byt));
			}
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}

	public void linenumbertest() throws IOException {
		try {
			// this program will throw an error.
			// lineNumberinputStream is deprecated in java.
			// Because in this class incorrectly assumes that bytes adequately represent
			// character!
			// This class is used to track the current line.
			// Or we can say it gives number lines in reader.
			FileInputStream fin = new FileInputStream("d:\\ass\\sam\\testFile.txt");
			LineNumberInputStream l = new LineNumberInputStream(fin);
			int len = fin.available();
			System.out.println("length:" + len);
			fin.skip(10);
			int numberOfline = l.getLineNumber();

			int line = 0;
			while ((line = l.read()) != 0) {
				System.out.println("number of line in this file:" + numberOfline);
			}
			fin.close();
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
	}
	/*A data output stream lets an application write primitive Java data
	 * types to an output stream in a portable way. An application can
	 * then use a data input stream to read the data back in.
	 * <p>
	 * A DataOutputStream is not safe for use by multiple concurrent
	 * threads. If a DataOutputStream is to be used by more than one
	 * thread then access to the data output stream should be controlled
	 * by appropriate synchronization.*/

	public void testdataIOStream() {
		File obj = new File("d:\\ass\\sam\\testFile.txt");
		try {
			FileOutputStream fout = new FileOutputStream(obj);
			DataOutputStream dout = new DataOutputStream(fout);
			dout.writeInt(19); // write integer into file
			dout.writeUTF("prithivi"); // write string into file
			dout.writeBoolean(true); // write boolean value into file
			dout.writeDouble(23.4);
			dout.writeLong(4321);
			dout.writeShort(34); // here some output get miss matched
			dout.writeByte(45);
			dout.writeBytes("p");
			fout.close();
			dout.close();
			FileInputStream fin = new FileInputStream(obj);
			DataInputStream din = new DataInputStream(fin);
			//here we should read data from file in the order of write methods
			int data = din.readInt();
			String name = din.readUTF();
			boolean bool = din.readBoolean();
			double num2 = din.readDouble();
			long num3 = din.readLong();
			Short num = din.readShort();
			byte num4 = din.readByte();
//			byte[] num5=din.readAllBytes();
			
			System.out.println("Int:" + data + "\n" + "name:" + name + "\n" + "boolean:" + bool);
			System.out.println("short:" + num + "\n" + "double" + num2 + "\n" + "long:" + num3 + "\n" + "byte:" + num4);
			fin.close();
			din.close();

		} catch (IOException e) {
		
			e.printStackTrace();
		}
	}

	public void testDataStream() throws IOException {

//		DataInputStream din =new DataInputStream(fin);
//		fin.close();
//		din.close();
	}

	public void testfilterSTream() throws IOException {
		FileOutputStream fout = new FileOutputStream("d:\\ass\\sam\\testFile.txt", true);
//		BufferedWriter writer = new BufferedWriter(fout);
		CustomFilterOutput c = new CustomFilterOutput(fout);
		String lo = "prithiviraj";
		String up = "HE IS THE INTELLIGENT";
		byte b1[] = lo.getBytes();
		byte b2[] = up.getBytes();
		c.write(b1);
		c.write(b2);
		FileInputStream fin = new FileInputStream("d:\\ass\\sam\\testFile.txt");
		CustomFilterInput ci = new CustomFilterInput(fin);
		int charfromfile;
		StringBuilder s1 = new StringBuilder();
		do {
			charfromfile = ci.read();
			if (charfromfile != -1) {
				s1.append((char) charfromfile);
				System.out.print((char) charfromfile);
			}
		} while (charfromfile != -1);
		s1.trimToSize();
		System.out.println("\n" + s1);
		c.close();
		fin.close();
	}

	public void apppendinginFile1() throws IOException {
		String textToAppend = "Happy Learning !!";

		Path path = Paths.get("d://ass//samplefile.txt");

		Files.write(path, textToAppend.getBytes(), StandardOpenOption.APPEND);
	}

	public void apppendinginFile2() throws IOException {
		String textToAppend = "Happy Learning !!";
		String filePath = "d://ass//samplefile.txt";

		try (FileWriter fw = new FileWriter(filePath, true); BufferedWriter writer = new BufferedWriter(fw);) {
			writer.write(textToAppend);
		}
	}

	public void apppendinginFile3() throws IOException {
		String textToAppend = "Happy Learning !!";
		String fileName = "c:/temp/samplefile.txt";

		try (FileWriter fileWriter = new FileWriter(fileName, true);
				PrintWriter printWriter = new PrintWriter(fileWriter);) {

			printWriter.println(textToAppend);
		}
	}

	public void apppendinginFile4() throws FileNotFoundException, IOException {
		String textToAppend = "\r\n Happy Learning !!";
		String fileName = "d:/ass/samplefile.txt";

		try (FileOutputStream outputStream = new FileOutputStream(fileName, true)) {

			byte[] strToBytes = textToAppend.getBytes();
			outputStream.write(strToBytes);
		}
	}

	public void pipeStream() throws IOException {
		
		PipedOutputStream pout = new PipedOutputStream();
		PipedInputStream pin = new PipedInputStream();
		pin.connect(pout);

		Thread thread1 = new Thread() {
			public void run() {
				try {
					for (int i = 0; i < 10; i++) {
						pout.write(i);
						System.out.println("PipedOutputStream val:" + i);
						Thread.sleep(1000);
					}
					pout.close();
				} catch (IOException | InterruptedException err) {
					err.printStackTrace();
				}
			}
		};

		Thread thread2 = new Thread() {
			public void run() {
				int i;
				try {
					while ((i = pin.read()) != -1) {
						System.out.println("pipedinputStream reader val:" + i);
					}
					pin.close();
				} catch (IOException err) {
					err.printStackTrace();
				}
			}
		};
		thread1.start();
		thread2.start();

	}

	public void pipeFileStream() throws IOException {
		FileOutputStream fout = new FileOutputStream("d:\\ass\\sam\\testFile.txt");
		FileInputStream fin = new FileInputStream("d:\\ass\\sam\\testFile.txt");
		PipedInputStream pin = new PipedInputStream();
		PipedOutputStream pout = new PipedOutputStream();
		String text = "This is going well";
		pin.connect(pout);

		Thread thread1 = new Thread() {
			public void run() {
				try {
					byte[] strToBytes = text.getBytes();
					int i=0;
					for(i=0;i<strToBytes.length;i++) {
					pout.write(strToBytes[i]);
					fout.write(strToBytes[i]);
					Thread.sleep(1);
				
					}
				} catch (IOException | InterruptedException er) {
					er.printStackTrace();
				}
				try {
					
					fout.close();
				} catch (IOException e) {
				
					e.printStackTrace();
				}
			}
		};
         System.out.println("read:");
		Thread thread2 = new Thread() {
			public void run() {
				try {
					int i;
//					int s;
					do {
						Thread.sleep(500);
						i = fin.read();
//					    s = pin.read();
					    if (i!=-1) {
//						System.out.print((char)s);
						System.out.print((char)i);
					    }
						
					} while (i!=-1 );
				} catch (IOException | InterruptedException er) {
					er.printStackTrace();
				}
				try {
					fin.close();
				} catch (IOException e) {
				
					e.printStackTrace();
				}
			}
		};
		
		thread1.start();
		thread2.start();
//		pout.close();
	}
	public void pipedWithoutThread(){
		PipedInputStream pin = new PipedInputStream();
		PipedOutputStream pout = new PipedOutputStream();
		try {
			pin.connect(pout);
			pout.write(79);
			pout.write(84);
			pout.write(68);
			pout.write(87);
			pout.write(89);
			
			byte [] buffer =new byte[5];
			pin.read(buffer, 0, 5);
			String str=new String(buffer);
			System.out.println("Ans:"+ str);
			pout.close();
			pin.close();
		}catch(IOException er) {
			System.out.println(er.getMessage());
		}
	}
	public void TestbufferedInput() throws IOException {
		FileInputStream fin = new FileInputStream("d:\\ass\\sam\\testFile.txt");
		BufferedInputStream buf=new BufferedInputStream(fin);
		int a=0;
	
		int len=buf.available();
		System.out.println(len);
		buf.skip(3);
		for(int i=0;a!=-1;i++) {
			a=buf.read();
			System.out.print((char)a);
			if(i==0) {
				buf.mark(0);
			}
			else if(i==29) {
				System.out.print(" ");
				buf.reset();
			}
		    
		}
		
		fin.close();
		buf.close();
	}
	public void Testbufferedoutput() {
		FileOutputStream fout;
		try {
			fout = new FileOutputStream("d:\\ass\\sam\\testFile.txt");
			BufferedOutputStream buf=new BufferedOutputStream(fout);
			String text="Samayapuram mariyamman";
			byte b[]=text.getBytes();
		     
			buf.write(b);
			buf.flush();
			buf.close();
			fout.flush();
			fout.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public void file() {
		try {
			System.out.println("somthing:");
			FileInputStream fin=new FileInputStream("d:\\ass\\sam\\testFile.txt");
			int a=0;
			String s="  great";
			byte b[]=s.getBytes();
			while(a!=-1) {
				a=fin.read(b);
				System.out.print((char)a);
			}
			System.out.println(b.length);
			System.out.println();
			for(int i=0;i<b.length;i++) {
				System.out.print((char)b[i]);
			}
			
			fin.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public void fileWriter() {
		String fileName="test.log";
		File fout=new File("D://LogManager//"+fileName+".txt");
		FileWriter fw=null;
		BufferedWriter buf=null;
		String message="rersgypfofgoifwyt87yiriffr";
		try {
			fw=new FileWriter(fout);
			buf = new BufferedWriter(fw);
			buf.write(message);
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				fw.close();
			}catch(IOException e){
				e.printStackTrace();
			}
		}
		
	}
	
	
}
