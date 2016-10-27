package IO;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderTest {

	public static void main(String[] args) throws IOException {
		File f = new File("//Users//hbisht//Desktop//him.txt");
		
		FileReader fr = new FileReader(f);
		
		int i = fr.read();
		
		while(i!=-1){
			System.out.print((char)i);
			i=fr.read();
		}

	}

}
