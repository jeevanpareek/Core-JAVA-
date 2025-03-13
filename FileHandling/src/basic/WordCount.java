package basic;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class WordCount {
	public static void main(String[] args) throws IOException {
		FileReader filereader = new FileReader("New Folder/Java.txt");
		BufferedReader br = new BufferedReader(filereader);
		
		int wordcount = 0;
		
		String line = br.readLine();
		
		for(char c:line.toCharArray()) {
			if(c == ' ') {
				wordcount++;
			}
		}
		br.close();
		System.out.println("The total number of words in the file is : " +(++wordcount));
	}
}
