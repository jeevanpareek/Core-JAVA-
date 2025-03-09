package basic;

import java.io.FileWriter;
import java.io.IOException;

public class FileCreation {
	public static void main(String[] args) throws IOException {
		FileWriter filewriter = new FileWriter("Java Folder/First.txt");
		
		filewriter.write("Hello,My name is Jeeva Pareek");
		
		System.out.println("File is created");
		
		filewriter.close();
	}
}
