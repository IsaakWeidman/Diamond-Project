import java.util.*;
import java.io.*;

public class DiamondsProject
{
	public static void main(String[] args)throws IOException
	{
		getInfo();
	}
	public static void getInfo()throws IOException
	{
		File file = new File("diamonds.csv");

		BufferedReader br = new BufferedReader(new FileReader(file));

		String st;
		while((st = br.readLine()) != null)
		{
			System.out.println(st);
		}
	}
}
