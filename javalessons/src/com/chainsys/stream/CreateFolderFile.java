package com.chainsys.stream;
import java.io.File;
import java.io.IOException;
import java.io.BufferedWriter;
public class CreateFolderFile {
	public static void main(String[] args) {
		CreateFolderFile f=new CreateFolderFile();
        f.filefolderdemo();
		f.newfile();
	}
	 public void newfile()
	    {
	    File file=new File("D:\\ram\\testing.txt");
//	    boolean present=file.exists();
	        try {
	        boolean created=    file.createNewFile();
	        System.out.println("File created"+created);
	        } catch (IOException e) {
	            // TODO Auto-generated catch block
	            e.printStackTrace();
	        }

	}
	    public void filefolderdemo()
	    {
	        File file=new File("D:\\ram");
	        boolean present =file.exists();
	        System.out.println("Folder present:"+present);
	        if(present==false)
	            file.mkdirs();
	        
	        present=file.exists();
	        System.out.println("Folder present:"+present);
	        
	    }
	    public void appendStringIntoFile() {
	    	
	    }

}
