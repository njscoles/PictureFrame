import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;

public class PictureFrame extends JFrame {
	public static void main(String[] args) {
		String file = "descriptions.txt";
		PictureDataReader.readPictureDataFromFile(file);
		PictureFrame mmf = new PictureFrame();
		mmf.setVisible(true);
	
		JMenuBar mbar = new JMenuBar();
		JMenu mnuFile = new JMenu("File");
		JMenu mnuHelp = new JMenu("Help");
		mbar.add(mnuFile);
		mbar.add(mnuHelp);
		//setTitle("Picture Frame");
		//setSize(290, 400);
        
       // setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
}
