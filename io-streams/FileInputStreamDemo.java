package com.javamultiplex.iostream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamDemo {

	public static void main(String[] args){

		try (FileInputStream fileInputStream = new FileInputStream("file1.txt")) {
			int size = fileInputStream.available();
			byte[] b = new byte[size];
			fileInputStream.read(b);
			String data = new String(b);
			System.out.println(data);
		} catch (FileNotFoundException exception) {
			exception.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
