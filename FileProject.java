import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import com.delete.DeleteFile;
import com.find.FindFile;
import com.add.AddFile;
public class FileProject 
{ 		
    public static void main(String[] args) throws IOException {
    	
    	FindFile ff = new FindFile();
    	
    	DeleteFile deletef = new DeleteFile();
    	
    	AddFile ad = new AddFile();
    	
    	Scanner sc = new Scanner(System.in);
    	char c ;
      
        System.out.println("Welcome to LockedMe.com");
        
        System.out.println("Developer Name: Pooja Trivedi");
        
        System.out.println("You can perform various File Operations:");

        System.out.println("Retrive the files, Add files to Directory, Delete the file, Search files");
        
        do
        {
        System.out.println("\n 1. Retrive the files \n 2. File Manipulations \n 3. Exit");
        
        System.out.println("\n Enter your Choice:");
        int ch = sc.nextInt();
        
        switch(ch) {
        
        case 1:
        
        	ad.retrive();
    	    
    	break;
    		
        case 2:
        
        	System.out.println("\n 1. Add file into directory \n 2. Delete file from Directory \n 3. Search Files in Directory");
        	System.out.println("Enter your choice:");
        	ch = sc.nextInt();
        	
        	switch(ch)
        	{
        	case 1:
        	
        		ad.addFile();
        		
            break;
            
        	case 2:
        		
        		System.out.println("\nEnter the folder from where file is to be deleted: ");
        		String dir = sc.next();
       
        	    System.out.println("\nEnter file name to be deleted:");
    	        String name1 = sc.next();     	        
    	        
    	        deletef.deleteFile(name1,new File(dir));
      
             break;
                
        	case 3:
        		
    	        System.out.println("Enter the filename with extension to be searched:");
    	        String name = sc.next();
    	        
    	        System.out.println("Enter the directory path where to search: ");
    	        String directory = sc.next();
    	        
    	        ff.findFile(name,new File(directory));
        		
        	break;
        	
        	default:
        		System.out.println("Please Choose correct option");
        	break;
        	
        	}
        	
        	
        break;
        
        case 3:
        	System.out.println("Thank you for using LockedMe.com!");
        	break;
        	
        default:
        	System.out.println("Please Choose correct option");
        break;
        }
        
        System.out.println("\nDo you want to continue file manipulations? Y/N:");
        c = sc.next().charAt(0);
        
        }while(c == 'y' || c == 'Y');
       
        sc.close();
       }
    }
