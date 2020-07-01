package com.add;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class AddFile {
	Scanner sc = new Scanner(System.in);
	String dirPath= "";
 
	public void addFile() throws IOException
	{
		try {
		System.out.println("Enter the path to create a directory: ");
	    dirPath = sc.next();
	     
	    System.out.println("Enter the name of the desired directory: ");
	    dirPath = dirPath+sc.next();
   
        File newDirectory = new File(dirPath);
        
        boolean isCreated = newDirectory.mkdirs();
        if (isCreated)
        {
            System.out.printf("Successfully created directory, path:%s", newDirectory.getCanonicalPath());
        }
        else if (newDirectory.exists())
        {
            System.out.printf("Directory path already exist, path:%s", newDirectory.getCanonicalPath());
        } 
        else
        {
            System.out.println("Unable to create directory,it may already exist");
        }
                      
        System.out.println("\nEnter file name to add in directory:");
        String newFileName = sc.next();
      
        File newFile = new File(dirPath + File.separator + newFileName);
        
        isCreated = newFile.createNewFile();
        
        if (isCreated) {
            System.out.printf("\nSuccessfully created new file, path:%s", newFile.getCanonicalPath());
        } 
        else 
        { 
            System.out.printf("\n Unable to create new file, it may already exist");
        }
		}
		catch(Exception e) {
			System.out.println("Some error occured, try again later");
		}
 }
 
 
 public void retrive() {
	 System.out.println("\nEnter the path from where to retrive the files: ");
	    dirPath = sc.next();

	    System.out.println("Files in the Directory:");
 	
	    File fileDir = new File(dirPath);
		
	    if(fileDir.isDirectory())
	    {
			List listFile = Arrays.asList(fileDir.list());
    
			Collections.sort(listFile);
		
			System.out.println("---------------------------------------");
			System.out.println("Retrived files in ascending order:");
			
			for(Object s : listFile)
			{
				System.out.println(s);
			}
		}
 }
}
