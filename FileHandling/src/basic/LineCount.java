package basic;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LineCount {
	public static void main(String[] args) throws IOException {
		FileReader filereader = new FileReader("Java folder/First.txt");
		BufferedReader br = new BufferedReader(filereader);
		
		int lineCount = 0;
		String s;
		
		while((s = br.readLine())!=null){
			lineCount ++;
//			System.out.println(s);
		};
		System.out.println("The total lines in the file is :" + lineCount);
		
		filereader.close();
		br.close();
	}
}
