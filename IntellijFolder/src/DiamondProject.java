import java.util.*;
import java.io.*;

public class DiamondProject {
	public static void main(String [] args) {
		
		File inputFile = new File("diamonds.csv");
		List<String> data = new ArrayList<>();
		String[][] chart;

		chart = toChart(data, 11);

		List<String> fair = getPrices(chart, "fair");
		List<String> good = new ArrayList<>();
		List<String> ideal = new ArrayList<>();
		List<String> veryGood = new ArrayList<>();
		List<String> premium = new ArrayList<>();
		
		data = getData(inputFile);

		
//		for(int row = 0; row < chart.length; row++) {
//			for(int col = 0; col < chart[0].length; col++) {
//				System.out.print(chart[row][col] + ", ");
//			}
//			System.out.println();
//		}

	}// end main()
	
	
	
	public static List<String> getData(File in) {
		
		List<String> output = new ArrayList<>();
		
		try {
			String line;
			
			BufferedReader br = new BufferedReader(new FileReader(in));
			
			while((line = br.readLine()) != null)
				output.add(line);
			
		} catch (IOException e) {
			System.out.println("File was not found");
		}
		
		System.out.println("File input complete");
		
		return output;
	}//end getData()
	
	
	
	//Turns a list of comma seperated values into a chart format.
	public static String[][] toChart(List<String> list, int numCols) {

		String[][] chart = new String[list.size()][numCols];
		
		for(int i = 0; i < chart.length; i++) {
			
			String s = list.get(i);
			chart[i] = s.split("\\s*,\\s*");
		}
		
		return chart;
	}//end toChart


	public static List<Double> getPrices(String[][] chart, String cut) {

		List<Double> prices = new ArrayList<>();

		for(int i = 0; i < chart.length; i++) {

			if(chart[i][2].equals(cut)) {

				prices.add(Double.parseDouble(chart[i][7]));
			}
		}

		return prices;
	}
}
