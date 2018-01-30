package com.javamultiplex.iostream;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamDemo {

	public static void main(String[] args) {

		try (FileOutputStream fileOutputStream = new FileOutputStream("file1.txt", true)) {
			String data = "Rohit Agarwal";
			byte[] b = data.getBytes();
			fileOutputStream.write(b);
		} catch (IOException exception) {
			exception.printStackTrace();
		}
	}

}
