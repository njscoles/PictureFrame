
public class PictureData {
// Stores the filename, data, and description from each image
	// Variables
	private String filename;
	private String date;
	private String description;
	
	// Getters and Setters
	public String getFilename() {
		return filename;
	}
	public void setFilename(String filename) {
		this.filename = filename;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	// Constructor
	public PictureData(String filename, String date, String description) {
		setFilename(filename);
		setDate(date);
		setDescription(description);
	}
	@Override
	public String toString() {
		return String.format("%s, %s, %s, filename, date, description");
	}
	public String get(String filename2) {
		// TODO Auto-generated method stub
		return null;
	}
	public static void PictureData(String filename2, String description2, String date2) {
		// TODO Auto-generated method stub
		
	}
}
