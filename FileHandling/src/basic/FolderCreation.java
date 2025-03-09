package basic;

import java.io.File;

public class FolderCreation {
	public static void main(String[] args) {
		
		File file = new File("Java Folder");
		
		file.mkdir();
		
		System.out.println("Folder Created");
	}
}
