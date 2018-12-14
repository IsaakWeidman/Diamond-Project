import java.io.*;

public class DiamondsProject {
	public static void main(String [] args) {

			getData();

	}// end main()

	public static void getData() {

		try {
			String line;

			BufferedReader br = new BufferedReader(new FileReader(new File("diamonds.csv")));

			while((line = br.readLine()) != null)
				System.out.println(line);

		} catch (IOException e) {
			System.out.println("File was not found");
		}

	}
}
