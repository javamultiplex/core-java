package com.javamultiplex.iostream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

//Copy image file to another image file.
public class CopyImageFile {

	public static void main(String[] args) {

		try (
				FileInputStream fileInputStream = new FileInputStream("timesheet.jpg");
				FileOutputStream fileOutputStream = new FileOutputStream("image.jpg");
			){
			
			int size=fileInputStream.available();
			byte[] b=new byte[size];
			fileInputStream.read(b);
			fileOutputStream.write(b);
			System.out.println("Image copy completed.");

		} catch (FileNotFoundException exception) {
			exception.printStackTrace();
		} catch (IOException exception) {
			exception.printStackTrace();
		}

	}

}
