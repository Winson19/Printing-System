package printingsystem;

public class DummyPhotoPrinter implements IPhotoPrinter{

	String strToReturn;
	int type;
    double[] totalsum = new double[10];
    int[] totalqty = new int[10];
    double sumtotal;
    int sumqty;
    String[] combo ={"Document (Black & White)","Document (Colour)","Photo Normal(4R)","Photo (Passport)","Photo Normal(4R) + High Quality Paper","Photo (Passport) + High Quality Paper","Photo Normal(4R) + Design Effect","Photo (Passport) + Design Effect","Photo Normal(4R) + Design Effect + High Quality Paper","Photo (Passport) + Design Effect + High Quality Paper"};
    public void diffType(int type)
	{
    	this.type=type;
	}
    
    public double[] getTotalSum()
    {
    	return totalsum;
    }
    
    public void setTotalSum(double[] totalsum)
    {
    	this.totalsum[type]=totalsum[type];
    	sumtotal+=totalsum[type];
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
    	this.totalqty[type] = totalqty[type];
        sumqty += totalqty[type];
    }
    
    public void setSumQty()
    {
    	for(int i=0; i<totalqty.length; i++)
	    	sumqty+=totalqty[i];
    }
    
    public void queueRequest()
    {
    	strToReturn="|"+combo[type]+"|"+String.format("%.2f",totalsum[type])+"|"+totalqty[type]+"|";
    }
    
    public String getStr()
    {
    	return strToReturn;
    }

}
