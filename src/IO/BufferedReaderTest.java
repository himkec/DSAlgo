package IO;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class BufferedReaderTest {
	public static void main(String[] args) throws IOException {
		long startTime = System.nanoTime();
		BufferedReader br = null;


			String sCurrentLine;
			int count = 0;
			br = new BufferedReader(new FileReader("//Users//hbisht//Desktop//him.txt"));
			sCurrentLine = br.readLine();

			while (sCurrentLine  != null) {
				//System.out.println(sCurrentLine);
				count++;
				sCurrentLine=br.readLine();
			}

		
		long endTime = System.nanoTime();
		long elapsedTimeInMillis = TimeUnit.MILLISECONDS.convert((endTime - startTime), TimeUnit.NANOSECONDS);
        System.out.println("Total elapsed time: " + elapsedTimeInMillis + " ms" + count);
 

	}
}
