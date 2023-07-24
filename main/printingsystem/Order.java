package printingsystem;

public class Order {

	private int type;
    private int option;
    private int qty;
    private int addOption;
    private int addContinueOption;
    private int continueOption;
    
    public Order()
    {
    	type=0;
    	option=0;
    	qty=0;
    	addOption=0;
    	addContinueOption=0;
    	continueOption=0;
    }
    
    public int getType() 
    {
    	return type;
    }
    
    public void setType(int type)
    {
    	if(type!=1&&type!=2)
    		throw new IllegalArgumentException("Invalid type");
    	else
    		this.type=type;
    	if(this.type==1)
    	{
    		addOption=0;
    		addContinueOption=0;
    	}
    }
    
    public int getOption()
    {
    	return option;
    }
    
    public void setOption(int option)
    {
    	if(option!=1&&option!=2)
    		throw new IllegalArgumentException("Invalid option");
    	else
    		this.option=option;
    }
    
    public int getQty()
    {
    	return qty;
    }
    
    public void setQty(int qty)
    {
    	if(qty<0||qty>50)
    		throw new IllegalArgumentException("Invalid quantity");
    	else
    		this.qty=qty;
    }
    
    public int getAddOption()
    {
    	return addOption;
    }
    
    public void setAddOption(int addOption)
    {
    	if(addOption<1||addOption>3)
    		throw new IllegalArgumentException("Invalid choice");
    	this.addOption=addOption;
    	if(this.addOption==3)
    		addContinueOption=0;
    }
    
    public int getAddContinueOption()
    {
    	return addContinueOption;
    }
    
    public void setAddContinueOption(int addContinueOption)
    {
    	if(addContinueOption!=1&&addContinueOption!=2)
    		throw new IllegalArgumentException("Invalid choice");
    	else
    		this.addContinueOption=addContinueOption;
    }
    
    public int getContinueOption()
    {
    	return continueOption;
    }
    
    public void setContinueOption(int continueOption)
    {
    	if(continueOption!=1&&continueOption!=2)
    		throw new IllegalArgumentException("Invalid choice");
    	else
    		this.continueOption=continueOption;
    }

}
