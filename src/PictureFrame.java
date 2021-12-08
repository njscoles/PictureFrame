import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.ArrayList;
import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class PictureFrame extends JFrame {
	private JTextArea descriptionField;
	private JTextField dateField;
	private PicturePanel panCenter;
	
	private ArrayList<BufferedImage> bufferedImages;
	private ArrayList<PictureData> pictureData;
	
	public PictureFrame() {
		bufferedImages = new ArrayList<BufferedImage>();
		pictureData = new ArrayList<PictureData>();
		setupGUI();
	}
	public PictureFrame(ArrayList<BufferedImage>imageList, ArrayList<PictureData>dataList){
		bufferedImages = imageList;
		pictureData = dataList;
		setupGUI();
	}
	public void setupPictureFrame() {
		
		// Adds buttons/options to top of Frame
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
				// System.out.println("Hello!"); //Testing functionality
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
		Container c = getContentPane();
	    c.setLayout(new BorderLayout());
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setupPictureFrame();
		PicturePanel panNorth = new PicturePanel(); // Picture Panel occupies northern area
		
		c.add(panNorth,BorderLayout.NORTH);
		JPanel panCenter = new JPanel();
		dateField = new JTextField("Date"); // needs date variable
		descriptionField = new JTextArea("Desc"); // needs description variable
		JButton previousImgBtn = new JButton("Prev");
		JButton saveInfoBtn = new JButton("Save");
		JButton nextImgBtn = new JButton("Next");
		
		// JPanel below the actual image
		JPanel Buttons = new JPanel(new FlowLayout());
		JPanel p = new JPanel(new BorderLayout());
		p.add(dateField,BorderLayout.NORTH);
		p.add(descriptionField,BorderLayout.CENTER);
		Buttons.add(previousImgBtn, BorderLayout.WEST);
		Buttons.add(saveInfoBtn,BorderLayout.CENTER);
		Buttons.add(nextImgBtn);
		c.add(p,BorderLayout.CENTER); // JPanel occupies central area
		c.add(Buttons, BorderLayout.SOUTH);
		
		int currentPosition = 0;
		String filename, date, description;
		BufferedImage picture;
		previousImgBtn.addActionListener(
				new ActionListener() {
					public void actionPerfomed (ActionEvent e) {
						if (currentPosition == 0) {
							currentPosition = 3; // Reverts to the last image if prev is hit on first image
						}
						else {
							currentPosition -= 1;
						}
						picture.setPicture(bufferedImages.get(currentPosition));
						dateField.setText(pictureData.get(currentPosition).getDate());
						descriptionField.setText(pictureData.get(currentPosition).getDescription());
					}

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
	}
	

	public static void main(String[] args) throws IOException {
		String file = "descriptions.txt";
		PictureLoader loader = new PictureLoader(file, file, file);
		PictureDataReader reader = new PictureDataReader();
		PictureFrame frame = new PictureFrame(loader.loadImagesFromPictureData(reader.readPictureDataFromFile("descriptions.txt")),reader.readPictureDataFromFile("descriptions.txt"));
		String filename = null, description = null, date = null;
		PictureData.PictureData(filename, description, date);
		ArrayList<PictureData> pictureData = PictureDataReader.readPictureDataFromFile(file);
		ArrayList<BufferedImage> bufferedImage = PictureLoader.loadImagesFromPictureData(pictureData);
		PictureDataReader.readPictureDataFromFile(file);
		//PictureLoader.loadImagesFromPictureData();
		
		PictureFrame mmf = new PictureFrame();
		mmf.setVisible(true);

        
      
	}
}
