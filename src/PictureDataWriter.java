import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.PrintWriter;
import java.io.File;
import java.util.Scanner;


public class PictureDataWriter extends PictureFrame {
	public static void saveData() { // Saves the new date & description
		String line;
		try {
			Scanner fsc = new Scanner(new File("descriptions.txt"));
			PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter(new File("descriptions.txt"))));
			
			while (fsc.hasNextLine()) {
				line = fsc.nextLine();
				pw.println(line.toUpperCase());
			}
			fsc.close();
			pw.close();
		} catch(Exception ex) {
			System.out.print("Could not save to file");
		}
		
	}
}
