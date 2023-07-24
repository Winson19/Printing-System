package printingsystem;

import static org.junit.Assert.*;


import org.junit.Test;
import org.junit.runner.RunWith;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;

@RunWith(JUnitParamsRunner.class)
public class CalculateChargeForDocumentTest {
	
	@Test //Test Charges for Document Black&White with EP
	@Parameters(method="getParamsForTestCalculateChargesDocumentBlackandWhiteEP")
	public void testChargeForDocumentBlackandWhiteEP(int type,int option,int addOption, int addContinueOption,int quantity, double expectedResult) {
		
		Charge cc=new Charge();
		cc.setType(type, option, addOption, addContinueOption);
		cc.setQty(quantity);
		cc.setCharge();
		cc.setTotal();
		cc.setTotalSum();
		cc.setTotalQty();
		
		double actualResult=cc.getTotal();
		assertEquals(expectedResult,actualResult,0.01);
	}
	
	private Object[] getParamsForTestCalculateChargesDocumentBlackandWhiteEP()
	{
		return new Object[] {
				new Object[] {1,1,0,0,3,1.50 },   //Black & White quantity=3
				new Object[] {1,1,0,0,7,2.80 },   //Black & White quantity=7
				new Object[] {1,1,0,0,15,4.50 },   //Black & White quantity=15
				new Object[] {1,1,0,0,35,7.00 },   //Black & White quantity=35

				
		};
	}
	
	@Test //Test Charges for Document Colour with EP
	@Parameters(method="getParamsForTestCalculateChargesDocumentColourEP")
	public void testChargeForDocumentColourEP(int type,int option,int addOption, int addContinueOption,int quantity, double expectedResult) {
		
		Charge cc=new Charge();
		cc.setType(type, option, addOption, addContinueOption);
		cc.setQty(quantity);
		cc.setCharge();
		cc.setTotal();
		cc.setTotalSum();
		cc.setTotalQty();
		
		double actualResult=cc.getTotal();
		assertEquals(expectedResult,actualResult,0.01);
	}
	
	private Object[] getParamsForTestCalculateChargesDocumentColourEP()
	{
		return new Object[] {
				new Object[] {1,2,0,0,3,3.00 },     //Colour quantity=3
				new Object[] {1,2,0,0,7,6.30 },     //Colour quantity=7
				new Object[] {1,2,0,0,15,12.00 },   //Colour quantity=15
				new Object[] {1,2,0,0,35,24.50 },   //Colour quantity=35

				
		};
	}
	
	@Test //Test Charges for Document Black&White with BVA	
	@Parameters(method="getParamsForTestCalculateChargesDocumentBlackandWhiteBVA")
	public void testChargeForDocumentBlackandWhiteBVA(int type,int option,int addOption, int addContinueOption,int quantity, double expectedResult) {
		
		Charge cc=new Charge();
		cc.setType(type, option, addOption, addContinueOption);
		cc.setQty(quantity);
		cc.setCharge();
		cc.setTotal();
		cc.setTotalSum();
		cc.setTotalQty();
		
		double actualResult=cc.getTotal();
		assertEquals(expectedResult,actualResult,0.01);
	}
	
	private Object[] getParamsForTestCalculateChargesDocumentBlackandWhiteBVA()
	{
		return new Object[] {
				new Object[] {1,1,0,0,0,0.00 },   //Black & White quantity=0
				new Object[] {1,1,0,0,4,2.00 },   //Black & White quantity=4
				new Object[] {1,1,0,0,5,2.00 },   //Black & White quantity=5
				new Object[] {1,1,0,0,10,4.00 },  //Black & White quantity=10
				new Object[] {1,1,0,0,11,3.30 },  //Black & White quantity=11
				new Object[] {1,1,0,0,20,6.00},  //Black & White quantity=20
				new Object[] {1,1,0,0,21,4.20 }, //Black & White quantity=21
				new Object[] {1,1,0,0,50,10.00 }, //Black & White quantity=50
		};
	}
	
	@Test //Test Charges for Document Colour with BVA	
	@Parameters(method="getParamsForTestCalculateChargesDocumentColourBVA")
	public void testChargeForDocumentColourBVA(int type,int option,int addOption, int addContinueOption,int quantity, double expectedResult) {
		
		Charge cc=new Charge();
		cc.setType(type, option, addOption, addContinueOption);
		cc.setQty(quantity);
		cc.setCharge();
		cc.setTotal();
		cc.setTotalSum();
		cc.setTotalQty();
		
		double actualResult=cc.getTotal();
		assertEquals(expectedResult,actualResult,0.01);
	}
	
	private Object[] getParamsForTestCalculateChargesDocumentColourBVA()
	{
		return new Object[] {
				new Object[] {1,2,0,0,0,0.00 },   //Colour quantity=0
				new Object[] {1,2,0,0,4,4.00 },   //Colour quantity=4
				new Object[] {1,2,0,0,5,4.50 },   //Colour quantity=5
				new Object[] {1,2,0,0,10,9.00 },  //Colour quantity=10
				new Object[] {1,2,0,0,11,8.80 },  //Colour quantity=11
				new Object[] {1,2,0,0,20,16.00},  //Colour quantity=20
				new Object[] {1,2,0,0,21,14.70 }, //Colour quantity=21
				new Object[] {1,2,0,0,50,35.00 }, //Colour quantity=50
		};
	}
	
	@Test (expected= IllegalArgumentException.class) 
	@Parameters(method="getParamsForDocumentException")
	public void testChargeForDocumentException(int type,int option,int addOption, int addContinueOption,int quantity) {
		
		Charge cc=new Charge();
		cc.setType(type, option, addOption, addContinueOption);
		cc.setQty(quantity);
		cc.setCharge();
		cc.setTotal();
		cc.setTotalSum();
		cc.setTotalQty();
		
	}
	
	private Object[] getParamsForDocumentException()
	{
		return new Object[] {
				new Object[] {-1,1,0,0,3},   //invalid type
				new Object[] {5,1,0,0,3},   //invalid type
				new Object[] {1,-1,0,0,15 }, //invalid option
				new Object[] {1,8,0,0,5},   //invalid option
				new Object[] {1,1,0,0,-5 },  // quantity out of range
				new Object[] {1,1,0,0,55 }   // quantity out of range
				
		};
	}

}

