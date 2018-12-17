import java.io.*;

public class DiamondsProject {
	public static void main(String [] args) {

			File inputFile = new File("diamonds.csv");
			Scanner splitter;
			List<String> data = new ArrayList<>;

			data = getData(inputFile);

			splitter = new Scanner(data).useDelimiter("\s");

	}// end main()

	public static List<String> getData(File in) {

		List<String> output = new ArrayList<>();

		try {
			String line;

			BufferedReader br = new BufferedReader(new FileReader(in)));

			while((line = br.readLine()) != null)
				output.add(line);

		} catch (IOException e) {
			System.out.println("File was not found");
		}

		System.out.println("File input complete");

		return data;
	}
}
