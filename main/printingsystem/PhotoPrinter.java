package printingsystem;

interface IPhotoPrinter
{
	public void queueRequest();
	public void diffType(int type);
	public double[] getTotalSum();
	public void setTotalSum(double[] totalsum);
	public void setSumTotal();
	public int[] getTotalQty();
	public void setTotalQty(int[] totalqty);
	public void setSumQty();
}

public class PhotoPrinter implements IPhotoPrinter {

	 private int type;
	    private double[] totalsum = new double[10];
	    private int[] totalqty = new int[10];
	    private double sumtotal;
	    private int sumqty;
	    private String[] combo ={"Document (Black & White)","Document (Colour)","Photo Normal(4R)","Photo (Passport)","Photo Normal(4R) + High Quality Paper","Photo (Passport) + High Quality Paper","Photo Normal(4R) + Design Effect","Photo (Passport) + Design Effect","Photo Normal(4R) + Design Effect + High Quality Paper","Photo (Passport) + Design Effect + High Quality Paper"};
	    
	    public void diffType(int type)
	    {
	        this.type = type;
	    }
	    
	    public double[] getTotalSum()
	    {
	    	return totalsum;
	    }
	    
	    public void setTotalSum(double[] totalsum)
	    {
	    	this.totalsum[type] = totalsum[type];
	    }
	    
	    public void setSumTotal()
	    {
	    	for(int i=0;i<totalsum.length; i++)
	    	sumtotal += totalsum[i];
	    }
	    
	    public int[] getTotalQty()
	    {
	    	return totalqty;
	    }
	    
	    public void setTotalQty(int[] totalqty)
	    {
	    	this.totalqty[type]=totalqty[type];
	    }
	    
	    public void setSumQty()
	    {
	    	for(int i=0; i<totalqty.length; i++)
	    	sumqty+=totalqty[i];
	    }
	    
	    public void queueRequest()
	    {
	    	if(sumqty!=0)
	    	{
	    		System.out.printf("| %-60s | %-30s | %-30s |","Combo","Total Price","Total Quantity");
	    		System.out.println();
	    		for(int i=0;i<combo.length;i++)
	    		{
	    			if(totalqty[i]!=0)
	    			{
	    				System.out.printf("| %-60s | %-30s | %-30s |",combo[i],String.format("%.02f", totalsum[i]),totalqty[i]);
	    				System.out.println();
	    			}
	    		}
	    		System.out.printf("| %-60s | %-30s | %-30s |","Total",String.format("%.02f", sumtotal),sumqty);
	    	}
	    }
	    
}
