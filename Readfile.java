import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Readfile {
	public static void main(String[] args) throws FileNotFoundException{
		 File file = new File("read.txt");
		 Scanner reader = new Scanner(file);
		 while(reader.hasNext()) {
			 System.out.println( reader.nextLine());
		 }
		 reader.close();
		
	}

}
