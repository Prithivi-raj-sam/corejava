package com.chainsys.stream;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class AssignmentIOStream {

	public static void main(String args[]) throws IOException {
		AssignmentIOStream obj = new AssignmentIOStream();
//	       obj.newfile();
//	       obj.renameTheFile();
//	       obj.modifydata();
//	       obj.readFile();
//	       obj.deleteFile();
//	       obj.copyFile();
	       obj.appendDataInToFile();
//		   obj.moveFile();
	}

	public void newfile() {
		filefolder();
		File file = new File("D:\\ram\\testing.txt");
//	    boolean present=file.exists();
		
			boolean newfilecreated;
			try {
				newfilecreated = file.createNewFile();
				if (newfilecreated == true)
					System.out.println("File created!!");
				else
					System.out.println("File not ctreated !!");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}

	public void filefolder() {
		File file = new File("D:\\ram");
		boolean present = file.exists();
		System.out.println("Folder present:" + present);
		if (present == false)
			file.mkdirs();

		present = file.exists();
		System.out.println("Folder present:" + present);

	}

	public File renameTheFile() {
		File file = new File("D:\\ram\\testing.txt");
		File file1 = new File("D:\\ram\\Renamedtesting.txt");
		boolean rename = file.renameTo(file1);
		System.out.println("Rename success: " + rename);
		return file1;
	}


	public void readFile() {
		try {
			File file = new File("D:\\ram\\testing.txt");
			@SuppressWarnings("resource")
			FileReader Fr = new FileReader(file);
			char[] ch = new char[(int) file.length()];
			// System.out.println(ch.length);
			Fr.read(ch);
			for (char c : ch) {
				System.out.print(c);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void deleteFile() {
		File file = new File("D:\\ram\\testing.txt");
		boolean checkdelete = file.delete();
		if (checkdelete == true)
			System.out.println("file was deleted");
	}

	public void copyFile() {
		try {
			@SuppressWarnings("resource")
			InputStream firstfile = new FileInputStream("D:\\ram\\testing.txt");
			@SuppressWarnings("resource")
			OutputStream copyfile = new FileOutputStream("D:\\ram\\testing_copy.txt");
			int content = firstfile.read();
			while (content != -1) {
				copyfile.write(content);
				content = firstfile.read();
			}
			copyfile.flush();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void appendDataInToFile() throws IOException {
		String text = "Am I joke to you !!";
		String filePath = "D:\\ram\\testing.txt";

		try (FileWriter fw = new FileWriter(filePath, true); BufferedWriter writer = new BufferedWriter(fw);) {
			writer.write(text);
			//we can also write here fw.write(text);
			System.out.println("Text is appended");
		}
	}

	public void modifydata() throws IOException {
		String filePath = "D:\\ram\\testing_copy.txt";
		Scanner sc = new Scanner(new File(filePath));
		StringBuffer buffer = new StringBuffer();
		while (sc.hasNextLine()) {
			buffer.append(sc.nextLine() + System.lineSeparator());
		}
		String fileContents = buffer.toString();
		System.out.println("Contents of the file: " + fileContents);
		sc.close();
		String oldLine = "Intelligent";
		String newLine = "joke";
		fileContents = fileContents.replaceAll(oldLine, newLine);
		@SuppressWarnings("resource")
		FileWriter writer = new FileWriter(filePath);
		System.out.println("new data: " + fileContents);
		writer.append(fileContents);
		writer.flush();
	}

	public void moveFile() throws IOException {
		Path pathfile = Files.move(Paths.get("D:\\ram\\testing_copy.txt"),
				Paths.get("D:\\rom\\testing_copy.txt"));

		if (pathfile != null) {
			System.out.println("File moved to our destination");
		} else {
			System.out.println("file not moved");
		}
	}
}
