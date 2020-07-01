package com.find;
import java.io.File;

public class FindFile {
	
	public void findFile(String name,File file)
    {
		
	try {
	 File[] list = file.listFiles();
      
        for (File fil : list)
        {
          
           if (name.equals(fil.getName()))   
            {
                System.out.println("File found in: " + fil.getParentFile());
                return;
            }
        }  
        	System.out.println("File Not Found in Given Directory.");
		}
		
		catch(Exception e) 
		{
			System.out.println("Some error occured, try again later.");
		}
    }
}
