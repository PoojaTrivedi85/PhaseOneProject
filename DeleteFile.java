package com.delete;
import java.io.File;

public class DeleteFile {
	
	public void deleteFile(String name1, File file) {
		try 
		{
		File[] list = file.listFiles();
	      
        for (File fil : list)
        {
            if (name1.equals(fil.getName()))
            {
              fil.delete();
    
              System.out.println("File deleted :" + fil.getName());
            	
              return;
            }
        }
        System.out.println("File Not Found to be deleted");
		}
		catch(Exception e)
		{
			System.out.println("Some error occured, try again later.");
		}
	}
}
