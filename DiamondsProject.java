import java.io.*;
import java.util.*;

public class DiamondsProject {
	public static void main(String [] args) {

			File inputFile = new File("diamonds.csv");
			Scanner splitter;
			List<String> data = new ArrayList<>();
			String[][] chart;

			data = getData(inputFile);

			chart = new String[11][chart.length];
			//splitter = new Scanner(data).useDelimiter("\\,");

	}// end main()

	public static List<String> getData(File in) {

		List<String> output = new ArrayList<>();
		Scanner splitter;

		try {
			String line;

			BufferedReader br = new BufferedReader(new FileReader(in));

			while((line = br.readLine()) != null)
				splitter = new Scanner(line).useDelimiter("\\,");
				output.add(line);

		} catch (IOException e) {
			System.out.println("File was not found");
		}

		System.out.println("File input complete");

		return output;
	}
}
