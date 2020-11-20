package com;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.stream.Stream;

public class ParallelStreamsEx1 {
	
	public static void main(String[] args)throws IOException {
		
		File fileLoc=new File("src/file2.txt");
		
		Stream<String> data=Files.lines(fileLoc.toPath());
		
		data.parallel().forEach(System.out::println);
		
		
		
	}

}
