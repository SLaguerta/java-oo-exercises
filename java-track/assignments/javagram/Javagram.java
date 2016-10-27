package javagram;

import javagram.filters.*;

import java.io.File;
import java.util.Arrays;
import java.util.Scanner;

public class Javagram {

	public static void main(String[] args) {

		// Create the base path for images		
		String[] baseParts = {System.getProperty("user.dir"), "images"};
		String dir = String.join(File.separator, baseParts);
		String relPath;
		Picture picture = null;
		Scanner in = new Scanner(System.in);
		
		// prompt user for image to filter and validate input
		do {
			
			String imagePath = "path not set";
			
			// try to open the file
			try {
				
				System.out.println("Image path (relative to " + dir + "):");
				relPath = in.next();
				
				String[] relPathParts = relPath.split(File.separator);
				imagePath = dir + File.separator + String.join(File.separator, Arrays.asList(relPathParts));
				
				picture = new Picture(imagePath);
				
			} catch (RuntimeException e) {
				System.out.println("Could not open image: " + imagePath);
			}
			
		} while(picture == null);
		
		// TODO - prompt user for filter and validate input
		int filterID = displayFilterMenu(in);
	
	
		// TODO - pass filter ID int to getFilter, and get an instance of Filter back 
		
		Filter filter = null;
		
		try{
			filter = getFilter(filterID);
		} catch (IllegalArgumentException e){
			System.out.println("Cannot filter image: Invalid filterID");
			e.printStackTrace();
		}

		// filter and display image
		Picture processed = filter.process(picture);
		processed.show();
		
		System.out.println("Image successfully filtered");
		
		// save image, if desired
		
		System.out.println("Save image to (relative to " + dir + ") (type 'exit' to quit w/o saving):");
		String fileName = in.next();
		
		// TODO - if the user enters the same file name as the input file, confirm that they want to overwrite the original
		
		if (fileName.equals("exit")) {
			System.out.println("Image not saved");
		} else {
			String absFileName = dir + File.separator + fileName;
			processed.save(absFileName);
			System.out.println("Image saved to " + absFileName);
		}	
		
		// close input scanner
		in.close();
	}
	
	// TODO - refactor this method to accept an int parameter, and return an instance of the Filter interface
	// TODO - refactor this method to thrown an exception if the int doesn't correspond to a filter
	private static Filter getFilter(int filterID) {
		
		// TODO - create some more filters, and add logic to return the appropriate one
	
		Filter newFilter;
		switch (filterID){
		
		case 1: newFilter = new BlueFilter();
		break;
		case 2: newFilter = new GrayscaleFilter();
		break;
		case 3: newFilter = new InvertFilter();
		break;
		default: throw new IllegalArgumentException ("Not a valid selection, select from listed filters");
		}
		return newFilter;
		
	}
	
	public static int displayFilterMenu(Scanner in){
		System.out.println("Welcome to Javagram! Select a filter: ");
		System.out.println("1. Blue filter");
		System.out.println("2. Grayscale filter");
		System.out.println("3. Invert filter");
		
		int filterID = in.nextInt();
		while(filterID <0 || filterID > 3){
			System.out.println("Invalid selection, please try again:");
			filterID = in.nextInt();
		}
		return filterID;
	}

}