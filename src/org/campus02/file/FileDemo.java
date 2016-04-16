package org.campus02.file;

import java.io.File;
import java.io.IOException;

public class FileDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File dir = new File("/temp");
		
		for (File file : dir.listFiles()) {
			System.out.println("Filename: " + file.getName());
		}
		
		int byteRead;

		while((byteRead = System.in.read()) != -1) {
			char[] ch = Character.toChars(byteRead);
			System.out.println(ch[0]);
			
			if(ch[0] == 'x')
				break;
		}	
	}
}
