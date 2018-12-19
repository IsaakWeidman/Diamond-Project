import java.text.DecimalFormat;
import java.util.*;
import java.io.*;

public class DiamondProject {
	public static void main(String [] args) {

		//Reads in file
		File inputFile = new File("diamonds.csv");
		List<String> data = new ArrayList<>();
		String[][] chart;

		//Lists of prices for each cut quality
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
				"Fair:\t\t$%f\n" +
				"Good:\t\t$%f\n" +
				"Very good:\t$%f\n" +
				"Ideal:\t\t$%f\n" +
				"Premium:\t$%f\n",
						average(fair), average(good), average(veryGood), average(ideal), average(premium));
		

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
	
	
	
	//Turns a list of comma separated values into a chart format.
	public static String[][] toChart(List<String> list, int numCols) {

		String[][] chart = new String[list.size()][numCols];
		
		for(int i = 0; i < chart.length; i++) {
			
			String s = list.get(i);
			chart[i] = s.split("\\s*,\\s*");
		}
		
		return chart;
	}//end toChart

	
	//Returns the a list of all of the prices of a certain cut quality
	public static List<Double> getPrices(String[][] chart, String cut) {

		List<Double> prices = new ArrayList<>();

		for(int i = 0; i < chart.length; i++) {
			
			if(chart[i][2].toLowerCase().equals(cut)) {

				prices.add(Double.parseDouble(chart[i][7]));
			}
		}

		return prices;
	}//end getPrices
	
	
	//Calculates the average from a list of doubles
	public static double average(List<Double> list) {
		
		double sum = 0, avg;
		int counter = 0;
		
		for(Double d : list) {
		
			sum = sum + d;
			counter++;
		}
		
		avg = sum / counter;

		//Used to change the long double into a price format
		avg = Double.parseDouble(new DecimalFormat("#.##").format(avg));

		return avg;
	}//end average
}
