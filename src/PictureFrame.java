import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

public class PictureFrame extends JFrame {
	
	public void setupPictureFrame() {
		JMenuBar mbar = new JMenuBar();
		JMenu mnuFile = new JMenu("File");
		JMenu mnuHelp = new JMenu("Help");
		mbar.add(mnuFile);
		mbar.add(mnuHelp);
		JMenuItem miSave = new JMenuItem("Save");
		JMenuItem miExit = new JMenuItem("Exit");
		
		// Save button frame
		mnuFile.add(miSave);
		miSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("Hello!");
			}
		});
		// Exit button frame
		mnuFile.add(miExit);
		miExit.addActionListener(
				new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						System.exit(0);
					}
				});
		
		// About button
		JMenuItem miAbout = new JMenuItem("About");
		miAbout.addActionListener(
				new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						JOptionPane.showMessageDialog(null, "Created by Nick Scoles in December, 2021");
					}
				});
		mnuFile.add(miSave);
		mnuFile.add(miExit);
		mnuHelp.add(miAbout);
		setJMenuBar(mbar);
	}
	
	public void setupGUI() {
		setTitle("Picture Frame");
		setSize(290, 400);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setupPictureFrame();
	}
	
	public PictureFrame() {
		setupGUI();
	}
	public static void main(String[] args) {
		String file = "descriptions.txt";
		PictureDataReader.readPictureDataFromFile(file);
		PictureFrame mmf = new PictureFrame();
		mmf.setVisible(true);

        
      
	}
}
