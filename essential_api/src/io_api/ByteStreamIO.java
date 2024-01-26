package io_api;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStreamIO {
	
	static String inputPath = "src/io_api/origin/girl-cute.jpg";
	static String outputPath = "src/io_api/destination/girl-cute.jpg";
	
	static void copyImageWithoutBuffer() throws IOException {
		System.out.println("Inside copyImageWithoutBuffer");
		File inputFile = new File(inputPath);
		System.out.println("File Bytes : " + inputPath.length());
		File outputFile = new File(outputPath);
		
		FileInputStream inputStream = new FileInputStream(inputFile);
		FileOutputStream outputStream = new FileOutputStream(outputFile);
		int readByte=0;
		
		while((readByte = inputStream.read()) != -1) {
			outputStream.write(readByte);
		}
		inputStream.close();
		System.out.println("Image is compiled");
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			copyImageWithoutBuffer();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
