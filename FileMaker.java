import java.io.*;
import java.util.*;
public class FileMaker {
	public static void main(String[] args) {
		FileMaker fm = new FileMaker();
		fm.newFile();
	}
	
	//function to make new file
	public void newFile() {
		String strPath = " ", strName = " ";
		
		//Try-catch block
		try {
			//Creating BufferedReader object
			BufferedReader br =new BufferedReader( new InputStreamReader(System.in));
			System.out.println("Enter the file name:");
			//Reading File name
			strName = br.readLine();
			
			System.out.println("Enter the file path:");
			//Reading File path
			strPath = br.readLine();
			
			//creating File Object
			File file1 = new File(strPath + " " + strName + ".txt");
			
			//Method createNewFile() method creates blank file
			file1.createNewFile();
			
		}
		
		//Try-Catch Block
		catch (Exception ex1) {
		}
	}
}