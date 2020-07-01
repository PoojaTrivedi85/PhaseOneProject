package com.find;
import java.io.File;

public class FindFile {
	
	public void findFile(String name,File file)
    {
		
		try {
		 File[] list = file.listFiles();
      
        for (File fil : list)
        {
          // if (fil.isDirectory())   // This line recursively search all the folders if there is any in the given particular path
            //{                             // and prints FNF for every directory searched.
              // findFile(name,fil);  
            //}
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
