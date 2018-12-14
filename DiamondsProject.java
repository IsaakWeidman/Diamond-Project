import java.io.*;

public class DiamondsProject {
	public static void main(String [] args) {

			getData();
			
	}// end main()

	public static void getData() {

		try {
			String st;

			BufferedReader br = new BufferedReader(new FileReader(new File("diamonds.csv")));

			while((st = br.readLine()) != null)
				System.out.println(st);

		} catch (IOException e) {
			System.out.println("File was not found");
		}

	}
}
