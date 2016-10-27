package IO;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterTest {
	
	public static void main(String args[]) throws IOException {
		
		File f = new File("//Users//hbisht//Desktop//him.txt");
		FileWriter f1 = new FileWriter(f,true);
		f1.append("Himanshu\n");
		f1.write("Bisht\n");
		f1.write("abc");
		//f1.write("Himanshu");
		f1.flush();

	}

}
