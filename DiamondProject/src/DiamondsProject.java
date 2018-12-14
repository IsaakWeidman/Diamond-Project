import java.util.*;
import java.io.*;

public class DiamondsProject
{
	public static void main(String[] args)throws IOException
	{
		File file = new File("C:\\Users\\cl20myerk\\Documents\\GitHub\\Diamond-Project");

		BufferedReader br = new BufferedReader(new FileReader(file));
		//Scanner diamonds = new Scanner(new FileReader("C:\\Users\\cl20myerk\\Documents\\GitHub\\Diamond-Project"));

		String st;
		while((st = br.readLine()) != null)
		{
			System.out.println(st);
		}

		//System.out.println(br);
	}
}