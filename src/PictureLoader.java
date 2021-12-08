import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import javax.imageio.ImageIO;

public class PictureLoader extends PictureData {
	public PictureLoader(String filename, String date, String description) {
		super(filename, date, description);
		// TODO Auto-generated constructor stub
	}
	private static String filename, date, description;
	
	static String picture;
	private static ArrayList<BufferedImage> bufferedImage = new ArrayList<BufferedImage>();
	//private static ArrayList<PictureData> pictureData;
	public static ArrayList<BufferedImage> loadImagesFromPictureData (ArrayList<PictureData> pictureData) throws IOException {
		//picture = new BufferedImage(200, 200, BufferedImage.TYPE_INT_ARGB);
		
		for (PictureData objects : pictureData) {
			picture = objects.getFilename();
			BufferedImage img = ImageIO.read(new File(picture));
			bufferedImage.add(img);
		}
		return bufferedImage;
	}
	
}
