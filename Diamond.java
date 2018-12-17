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

	public getCut ()
	{
		return cut;
	}
	public getPrice ()
	{
		return price;
	}
}