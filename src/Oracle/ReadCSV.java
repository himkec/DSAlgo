package Oracle;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

// Java Simple exchange Format API

/*
 * @CsvDataType()
	public class Person {
    @CsvField(pos = 1)
    String name;

    @CsvField(pos = 2, format = "dd.MM.yyyy")
    Date   birthDate;
}
 * 
 * 
 */

public class ReadCSV {
	
	public static void main (String [] args){
		 String csvFile = "/Users/mkyong/csv/country.csv";
	        String line = "";
	        String cvsSplitBy = ",";

	        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {

	            while ((line = br.readLine()) != null) {

	                // use comma as separator
	                String[] country = line.split(cvsSplitBy);

	                System.out.println("Country [code= " + country[4] + " , name=" + country[5] + "]");

	            }

	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	}

}
