package code.on.work.files;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
class FH001 {

	public static void main(String[] args) {
		try {
			
			BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\pc\\Desktop\\Car.txt"));  //Existing file
	        
			String str;
	        List<String> list = new ArrayList<String>();
	       
	        while((str =br.readLine()) != null ){
	            list.add(str);
	        }
	        
	        String[] stringArr = list.toArray(new String[0]);//text is count from line 1
	        System.out.println(" "+Arrays.toString(stringArr));  
	        br.close();
	    }
		
		
		catch (FileNotFoundException e) {
         System.err.println("File not found");//If file Does not exist
     } 
		
		catch (IOException e) {
         System.err.println("Unable to read the file."); //  When File is empty
     }
     
	}
}