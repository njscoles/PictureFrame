import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import javax.imageio.ImageIO;

public class PictureLoader extends PictureDataReader {
	private static String filename, date, description, image;
	private static ArrayList<PictureData> pictureData = new ArrayList<PictureData>();
	public static ArrayList<BufferedImage> loadImagesFromPictureData (File image) throws IOException {
		ArrayList<BufferedImage> bufferedImage = new ArrayList<BufferedImage>();
		int count = 0;
		BufferedImage picture = null;
		picture = new BufferedImage(200, 200, BufferedImage.TYPE_INT_ARGB);
		while(count < 4) {
			image = pictureData.get(0);
			picture = ImageIO.read(image);
			bufferedImage.add(picture);
			count += 1;
		}
		System.out.println(bufferedImage);
		return bufferedImage;
	}
}
