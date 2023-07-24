package printingsystem;

public class Printing {

	IPhotoPrinter ipp;
	
	public Printing(IPhotoPrinter ipp)
	{
		this.ipp=ipp;
	}
	
	public Printing()
	{
		ipp=new PhotoPrinter();
	}
}
