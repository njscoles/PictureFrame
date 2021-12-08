import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.PrintWriter;
import java.io.File;
import java.util.Scanner;


public class PictureDataWriter extends PictureFrame {
	public static void saveData() { // Saves the new date & description
		String line;
		int count = 0;
		try {
			Scanner fsc = new Scanner("descriptions.txt");
			PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("descriptions.txt")));
			
			while (count != 4) {
				if (count == 0) {
					line = ("pic1.png\t" + newDate + "\t" + newDesc);
					pw.print(line);
				}
				if (count == 1) {
					line = ("\npic2.png\t" + newDate + "\t" + newDesc);
					pw.print(line);
				}
				if (count == 2) {
					line = ("\npic3.png\t" + newDate + "\t" + newDesc);
					pw.print(line);
				}
				else {
					line = ("\npic4.png\t" + newDate + "\t" + newDesc);
					pw.print(line);
				}
				count += 1;
			}
			fsc.close();
			pw.close();
		} catch(Exception ex) {
			System.out.print("Could not save to file");
		}
		
	}
}
