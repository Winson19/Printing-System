/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package printingsystem;

/**
 *
 * @author pc
 */
public class Charge {
    
    private int qty;
    private double charge,total;
    private int type;
    private double[] totalsum = new double[10];
    private int[] totalqty = new int[10];

    public void setQty(int qty)
    {
        this.qty = qty;
    }
    
    public void setType(int category,int option,int addOption,int addContinueOption)
    {
        if(category==1 &&option==1)
        	type=0;
        else if(category==1 && option==2)
        	type=1;
        else if(category==2 && option==1 && addOption==3 && addContinueOption==0)
        	type=2;
        else if(category==2 && option==2 && addOption==3 && addContinueOption==0)
        	type=3;
        else if(category==2 && option==1 && addOption==1 && addContinueOption==2)
        	type=4;
        else if(category==2 && option==2 && addOption==1 && addContinueOption==2)
        	type=5;
        else if(category==2 && option==1 && addOption==2 && addContinueOption==2)
        	type=6;
        else if(category==2 && option==2 && addOption==2 && addContinueOption==2)
        	type=7;
        else if(category==2 && option==1 &&(addOption==1||addOption==2) && addContinueOption==1)
        	type=8;
        else if(category==2 && option==2 &&(addOption==1||addOption==2) && addContinueOption==1)
        	type=9;
        else 
        	throw new IllegalArgumentException("Invalid type");
    }
    
    public void setCharge()
    {
        if(type==0)
        {
        	if(qty>=0 && qty<5)
        		charge=0.5;
        	else if(qty>=5 && qty<=10)
        		charge=0.4;
        	else if(qty>=11 &&qty<=20)
        		charge=0.3;
        	else if(qty>=21 &&qty<=50)
        		charge=0.2;
        	else if(qty<0 ||qty>=51)
        		throw new IllegalArgumentException("Invalid quantity");
        }
        else if(type==1)
        {
        	if(qty>=0 &&qty<5)
        		charge=1;
        	else if(qty>=5 && qty<=10)
        		charge=0.9;
        	else if(qty>=11 &&qty<=20)
        		charge=0.8;
        	else if(qty>=21 &&qty<=50)
        		charge=0.7;
        	else if(qty<0 ||qty>=51)
        		throw new IllegalArgumentException("Invalid quantity");
        }
        else if(type==2)
        {
        	if(qty>=0 &&qty<5)
        		charge=1;
        	else if(qty>=5 && qty<=10)
        		charge=0.9;
        	else if(qty>=11 &&qty<=20)
        		charge=0.75;
        	else if(qty>=21 &&qty<=50)
        		charge=0.5;
        	else if(qty<0 ||qty>=51)
        		throw new IllegalArgumentException("Invalid quantity");
        }
        else if(type==3)
        {
        	if(qty>=0 &&qty<5)
        		charge=1.2;
        	else if(qty>=5 && qty<=10)
        		charge=0.95;
        	else if(qty>=11 &&qty<=20)
        		charge=0.85;
        	else if(qty>=21 &&qty<=50)
        		charge=0.75;
        	else if(qty<0 ||qty>=51)
        		throw new IllegalArgumentException("Invalid quantity");
        }
        else if(type==4)
        {
        	if(qty>=0 &&qty<5)
        		charge=1.1;
        	else if(qty>=5 && qty<=10)
        		charge=1;
        	else if(qty>=11 &&qty<=20)
        		charge=0.85;
        	else if(qty>=21 &&qty<=50)
        		charge=0.60;
        	else if(qty<0 ||qty>=51)
        		throw new IllegalArgumentException("Invalid quantity");
        }
        else if(type==5)
        {
        	if(qty>=0 &&qty<5)
        		charge=1.3;
        	else if(qty>=5 && qty<=10)
        		charge=1.05;
        	else if(qty>=11 &&qty<=20)
        		charge=0.95;
        	else if(qty>=21 &&qty<=50)
        		charge=0.85;
        	else if(qty<0 ||qty>=51)
        		throw new IllegalArgumentException("Invalid quantity");
        }
        else if(type==6)
        {
        	if(qty>=0 &&qty<5)
        		charge=1.15;
        	else if(qty>=5 && qty<=10)
        		charge=1.05;
        	else if(qty>=11 &&qty<=20)
        		charge=0.9;
        	else if(qty>=21 &&qty<=50)
        		charge=0.65;
        	else if(qty<0 ||qty>=51)
        		throw new IllegalArgumentException("Invalid quantity");
        }
        else if(type==7)
        {
        	if(qty>=0 &&qty<5)
        		charge=1.35;
        	else if(qty>=5 && qty<=10)
        		charge=1.1;
        	else if(qty>=11 &&qty<=20)
        		charge=1;
        	else if(qty>=21 &&qty<=50)
        		charge=0.9;
        	else if(qty<0 ||qty>=51)
        		throw new IllegalArgumentException("Invalid quantity");
        }
        else if(type==8)
        {
        	if(qty>=0 &&qty<5)
        		charge=1.25;
        	else if(qty>=5 && qty<=10)
        		charge=1.15;
        	else if(qty>=11 &&qty<=20)
        		charge=1;
        	else if(qty>=21 &&qty<=50)
        		charge=0.75;
        	else if(qty<0 ||qty>=51)
        		throw new IllegalArgumentException("Invalid quantity");
        }
        else if(type==9)
        {
        	if(qty>=0 &&qty<5)
        		charge=1.45;
        	else if(qty>=5 && qty<=10)
        		charge=1.2;
        	else if(qty>=11 &&qty<=20)
        		charge=1.1;
        	else if(qty>=21 &&qty<=50)
        		charge=1;
        	else if(qty<0 ||qty>=51)
        		throw new IllegalArgumentException("Invalid quantity");
        }
    }
    
    public void setTotal()
    {
        this.total = this.qty * this.charge;
    }
        
    public double getTotal()
    {
        return total;
    }
    
    public int getQty()
    {
        return qty;
    }
    
    public void setTotalSum()
    {
        this.totalsum[type] += this.total;
    }
    
    public void setTotalQty()
    {
        this.totalqty[type] += this.qty;
    }
    
    public double[] getTotalSum()
    {
        return totalsum;
    }
    
    public int[] getTotalQty()
    {
        return totalqty;
    }
    
    public double getCharge()
    {
        return charge;
    }
    
    public int getType()
    {
        return type;
    }
    
    
    
//    public void displayTotal()
//    {
//        System.out.println(type);
//    }
    
}
