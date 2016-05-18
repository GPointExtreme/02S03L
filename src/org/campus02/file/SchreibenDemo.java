package org.campus02.file;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SchreibenDemo {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		File file = new File("/temp/Textdatei.txt");
		FileOutputStream fos = new FileOutputStream(file);
		
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject("Ein kleiner Code fürs Studium, ein großer für mich!");
		
		fos.flush();
		fos.close();
		
		FileInputStream fis = new FileInputStream(file);
		ObjectInputStream ois = new ObjectInputStream(fis);
		String inputText = (String) ois.readObject();
		
		ois.close();
		System.out.println(inputText);
		
	}

}
