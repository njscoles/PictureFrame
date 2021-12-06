import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import javax.imageio.ImageIO;

public class PictureLoader extends PictureDataReader {
	private static String filename, date, description;
	public PictureLoader (String filename, String date, String description, String image) {
		super();
	}

	private static ArrayList<PictureData> pictureData;
	public static ArrayList<BufferedImage> loadImagesFromPictureData (PictureData filename) throws IOException {
		PictureDataReader.readPictureDataFromFile(date);
		ArrayList<BufferedImage> bufferedImage = new ArrayList<BufferedImage>();
		int count = 0;
		BufferedImage picture;
		picture = new BufferedImage(200, 200, BufferedImage.TYPE_INT_ARGB);
		while(count < 4) {
			filename = pictureData.get(1);
			
			//picture = ImageIO.read(new File(filename));
			bufferedImage.add(picture);
			count += 1;
			System.out.println(pictureData);
		}
		System.out.println(bufferedImage);
		return bufferedImage;
	}
}
