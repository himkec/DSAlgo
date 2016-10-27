package IO;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ReadFile {
	
	public static void main(String args[]) throws IOException {
		

		String fileName = "//Users//hbisht//Desktop//him.txt";
		
		Stream<String> stream = Files.lines(Paths.get(fileName));
		
		//list.forEach(System.out::println);
		stream.forEach(System.out::println);
		

		//read file into stream, try-with-resources
		/*try (Stream<String> stream = Files.lines(Paths.get(fileName))) {

			stream.forEach(System.out::println);

		} catch (IOException e) {
			e.printStackTrace();
		}*/

	}


}
