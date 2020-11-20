package com;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.stream.Stream;

public class ParallerStreamEx {

	public static void main(String[] args)throws IOException {
		
		File fileLoc=new File("src/file1.txt");
		
		/*
		FileInputStream fis=new FileInputStream(fileLoc);
		
		for(int i=0;i<fileLoc.length();i++) {
			System.out.print((char)fis.read());
		}
		*/
		
		 Stream<String> data= Files.lines(fileLoc.toPath());
		 
		 data.parallel().forEach(System.out::println);
		
		

	}

}
