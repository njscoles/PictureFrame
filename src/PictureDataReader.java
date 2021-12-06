import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class PictureDataReader {
	private static String filename, date, description;
	private static ArrayList<PictureData> pictureData = new ArrayList<PictureData>();
	public static ArrayList<PictureData> readPictureDataFromFile(String filename) {
		try {
			Scanner fsc = new Scanner(new File(filename));
			String line;
			String[] lineSplit;
			int count = 1;
			
			while(fsc.hasNextLine()) {
				line = fsc.nextLine();
				lineSplit = line.split("\t");
				filename = lineSplit[0];
				date = lineSplit[1];
				description = lineSplit[2];
				pictureData.add(new PictureData(filename, date, description));
			}
			
			
		} catch (Exception ex) {
			System.out.println("File could not be found");
		}
		
		//System.out.println(pictureData); //Testing
		return pictureData;
	}
}
