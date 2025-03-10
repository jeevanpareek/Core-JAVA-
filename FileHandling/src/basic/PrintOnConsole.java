package basic;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class PrintOnConsole {
	public static void main(String[] args) throws IOException {
		FileReader filereader = new FileReader("Java Folder/First.txt");
		BufferedReader br = new BufferedReader(filereader);
		
		System.out.println(br.readLine());
		
		br.close();
		filereader.close();
	}
}
