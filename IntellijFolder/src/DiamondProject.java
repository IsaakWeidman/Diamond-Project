import java.util.*;
import java.io.*;

public class DiamondProject {
	public static void main(String [] args) {
		
		File inputFile = new File("diamonds.csv");
		List<String> data = new ArrayList<>();
		String[][] chart;

		List<Double> fair;
		List<Double> good;
		List<Double> veryGood;
		List<Double> ideal;
		List<Double> premium;
		
		data = getData(inputFile);
		chart = toChart(data, 11);
		
		fair = getPrices(chart, "fair");
		good = getPrices(chart, "good");
		veryGood = getPrices(chart, "very good");
		ideal = getPrices(chart, "ideal");
		premium = getPrices(chart, "premium");

		System.out.printf
				("The average prices for each cut type are as follows\n" +
				"Fair:\t\t%f\n" +
				"Good:\t\t%f\n" +
				"Very good:\t%f\n" +
				"Ideal:\t\t%f\n" +
				"Premuim:\t%f\n",
						average(fair), average(good), average(veryGood), average(ideal), average(premium));
		
		
//		//Print out data to the screen.
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
			
			if(chart[i][2].toLowerCase().equals(cut)) {

				prices.add(Double.parseDouble(chart[i][7]));
			}
		}

		return prices;
	}
	
	
	
	public static double average(List<Double> list) {
		
		double sum = 0, avg;
		int counter = 0;
		
		for(Double d : list) {
		
			sum = sum + d;
			counter++;
		}
		
		avg = sum / counter;
		
		return avg;
	}
}
