package com.javamultiplex.iostream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

//Count number of words present in file and count how many times word "Rohit" repeated
public class WordCount {

	public static void main(String[] args) {

		try (FileInputStream fileInputStream = new FileInputStream("file1.txt")) {
			int size = fileInputStream.available();
			byte[] b = new byte[size];
			fileInputStream.read(b);
			String data = new String(b);
			String[] words = data.split(" ");
			System.out.println("Number of words : " + words.length);
			int count = 0;
			for (String word : words) {
				if (word.equals("Rohit")) {
					count++;
				}
			}
			System.out.println("Word Rohit is repeated in " + count + " times.");

		} catch (FileNotFoundException exception) {
			exception.printStackTrace();
		} catch (IOException exception) {
			exception.printStackTrace();
		}
	}

}
