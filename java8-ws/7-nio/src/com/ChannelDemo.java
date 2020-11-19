package com;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.ReadableByteChannel;
import java.nio.channels.WritableByteChannel;

public class ChannelDemo {

	static void copyData(ReadableByteChannel src, WritableByteChannel dest) throws IOException {

		{
			ByteBuffer buffer = ByteBuffer.allocateDirect(20 * 1024);
			while (src.read(buffer) != -1) {
				// The buffer is used to drained
				buffer.flip();
				// keep sure that buffer was fully drained
				while (buffer.hasRemaining()) {
					dest.write(buffer);
				}
				buffer.clear(); // Now the buffer is empty, ready for the filling
			}
		}

	}

	public static void main(String[] args) throws Exception {
		FileInputStream fis = null;
		ReadableByteChannel source = null;
		WritableByteChannel destination = null;

		File fileLoc = new File("src/testin.txt");
		if (fileLoc.exists()) {
			
			

			fis = new FileInputStream(fileLoc);
			
			/*
			for(int i=0;i<fileLoc.length();i++) {
				System.out.println((char)fis.read());
			}
			*/

			source = fis.getChannel();

			File outputLoc = new File("src/testout.txt");

			FileOutputStream fos = new FileOutputStream(outputLoc);

			destination = fos.getChannel();

			System.out.println(".. copying is in progress...");

			copyData(source, destination);

			// Perfom some other module ops

			System.out.println("... some other modules");

			source.close();
			destination.close();

		} else {
			System.out.println("File Does not exists");
		}

		//

	}

}
