public class Diamond {
	String cut;
	double price;

	public Diamond (String c, double p)
	{
		cut = c;
		price = p;
	}

	public void setCut (String c)
	{
		cut = c;
	}
	public void setPrice (double p)
	{
		price = p;
	}

	public String getCut ()
	{
		return cut;
	}
	public double getPrice ()
	{
		return price;
	}
}