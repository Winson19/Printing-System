package printingsystem;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;

@RunWith(JUnitParamsRunner.class)
public class CalculateChargeForPhotoTest {

	
	@Test //Test Charges for Photo Normal(4R) with EP
	@Parameters(method="getParamsForTestCalculateChargesNormalPhotoEP")
	public void testChargeForNormalPhotoEP(int type,int option,int addOption, int addContinueOption,int quantity, double expectedResult) {
		
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
	
	private Object[] getParamsForTestCalculateChargesNormalPhotoEP()
	{
		return new Object[] {
				new Object[] {2,1,3,0,3,3.00 },   //normal(4r) quantity=3
				new Object[] {2,1,3,0,7,6.30 },   //normal(4r) quantity=7
				new Object[] {2,1,3,0,15,11.25 }, //normal(4r) quantity=15
				new Object[] {2,1,3,0,35,17.50 }, //normal(4r) quantity=35
				new Object[] {2,1,1,2,3,3.30 },   //normal(4r) high quality- quantity=3
				new Object[] {2,1,1,2,7,7.00 },   //normal(4r) high quality- quantity=7
				new Object[] {2,1,1,2,15,12.75 }, //normal(4r) high quality- quantity=15
				new Object[] {2,1,1,2,35,21.00 }, //normal(4r) high quality- quantity=35
				new Object[] {2,1,2,2,3,3.45 },   //normal(4r) design effect-quantity=3
				new Object[] {2,1,2,2,7,7.35 },   //normal(4r) design effect-quantity=7
				new Object[] {2,1,2,2,15,13.50 }, //normal(4r) design effect-quantity=15
				new Object[] {2,1,2,2,35,22.75 }  //normal(4r) design effect-quantity=35
				
		};
	}
	
	
	@Test //Test Charges for Photo PassPort with EP
	@Parameters(method="getParamsForTestCalculateChargesPassPortPhotoEP")
	public void testChargeForPassPortPhotoEP(int type,int option,int addOption, int addContinueOption,int quantity, double expectedResult) {
		
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
	
	private Object[] getParamsForTestCalculateChargesPassPortPhotoEP()
	{
		return new Object[] {
				new Object[] {2,2,3,0,3,3.60 },   //passport quantity=3
				new Object[] {2,2,3,0,7,6.65 },   //passport quantity=7
				new Object[] {2,2,3,0,15,12.75 }, //passport quantity=15
				new Object[] {2,2,3,0,35,26.25 }, //passport quantity=35
				new Object[] {2,2,1,2,3,3.90 },   //passport high quality -quantity=3
				new Object[] {2,2,1,2,7,7.35 },   //passport high quality -quantity=7
				new Object[] {2,2,1,2,15,14.25 }, //passport high quality -quantity=15
				new Object[] {2,2,1,2,35,29.75 }, //passport high quality -quantity=35
				new Object[] {2,2,2,2,3,4.05 },   //passport design effect-quantity=3
				new Object[] {2,2,2,2,7,7.70 },   //passport design effect-quantity=7
				new Object[] {2,2,2,2,15,15.00 }, //passport design effect-quantity=15
				new Object[] {2,2,2,2,35,31.50 }  //passport design effect-quantity=35
				
		};
	}
	
	@Test //Test Charges for Photo Normal(4R) with BVA	
	@Parameters(method="getParamsForTestCalculateChargesNormalPhotoBVA")
	public void testChargeForNormalPhotoBVA(int type,int option,int addOption, int addContinueOption,int quantity, double expectedResult) {
		
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
	
	private Object[] getParamsForTestCalculateChargesNormalPhotoBVA()
	{
		return new Object[] {
				new Object[] {2,1,3,0,0,0.00 },   //normal(4r) quantity=0
				new Object[] {2,1,3,0,4,4.00 },   //normal(4r) quantity=4
				new Object[] {2,1,3,0,5,4.50 },   //normal(4r) quantity=5
				new Object[] {2,1,3,0,10,9.00 },  //normal(4r) quantity=10
				new Object[] {2,1,3,0,11,8.25 },  //normal(4r) quantity=11
				new Object[] {2,1,3,0,20,15.00},  //normal(4r) quantity=20
				new Object[] {2,1,3,0,21,10.50 }, //normal(4r) quantity=21
				new Object[] {2,1,3,0,50,25.00 }, //normal(4r) quantity=50
				new Object[] {2,1,1,2,0,0.00 },   //normal(4r) high quality- quantity=0
				new Object[] {2,1,1,2,4,4.40 },   //normal(4r) high quality- quantity=4
				new Object[] {2,1,1,2,5,5.00 },   //normal(4r) high quality- quantity=5
				new Object[] {2,1,1,2,10,10.00 }, //normal(4r) high quality- quantity=10
				new Object[] {2,1,1,2,11,9.35 },  //normal(4r) high quality- quantity=11
				new Object[] {2,1,1,2,20,17.00 }, //normal(4r) high quality- quantity=20
				new Object[] {2,1,1,2,21,12.60 }, //normal(4r) high quality- quantity=21
				new Object[] {2,1,1,2,50,30.00 }, //normal(4r) high quality- quantity=50
				new Object[] {2,1,2,2,0,0.00 },   //normal(4r) design effect-quantity=0
				new Object[] {2,1,2,2,4,4.60 },   //normal(4r) design effect-quantity=4
				new Object[] {2,1,2,2,5,5.25 },   //normal(4r) design effect-quantity=5
				new Object[] {2,1,2,2,10,10.50 }, //normal(4r) design effect-quantity=10
				new Object[] {2,1,2,2,11,9.90 },  //normal(4r) design effect-quantity=11
				new Object[] {2,1,2,2,20,18.00},  //normal(4r) design effect-quantity=20
				new Object[] {2,1,2,2,21,13.65 }, //normal(4r) design effect-quantity=21
				new Object[] {2,1,2,2,50,32.50 }  //normal(4r) design effect-quantity=50
				
		};
	}
	
	
	@Test //Test Charges for Photo PassPort with BVA
	@Parameters(method="getParamsForTestCalculateChargesPassPortPhotoBVA")
	public void testChargeForPassPortPhotoBVA(int type,int option,int addOption, int addContinueOption,int quantity, double expectedResult) {
		
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
	
	private Object[] getParamsForTestCalculateChargesPassPortPhotoBVA()
	{
		return new Object[] {
				new Object[] {2,2,3,0,0,0.00 },   //passport quantity=0
				new Object[] {2,2,3,0,4,4.80 },   //passport quantity=4
				new Object[] {2,2,3,0,5,4.75 },   //passport quantity=5
				new Object[] {2,2,3,0,10,9.50 },  //passport quantity=10
				new Object[] {2,2,3,0,11,9.35 },  //passport quantity=11
				new Object[] {2,2,3,0,20,17.00},  //passport quantity=20
				new Object[] {2,2,3,0,21,15.75 }, //passport quantity=21
				new Object[] {2,2,3,0,50,37.50 }, //passport quantity=50
				new Object[] {2,2,1,2,0,0.00 },   //passport high quality- quantity=0
				new Object[] {2,2,1,2,4,5.20 },   //passport high quality- quantity=4
				new Object[] {2,2,1,2,5,5.25 },   //passport high quality- quantity=5
				new Object[] {2,2,1,2,10,10.50 }, //passport high quality- quantity=10
				new Object[] {2,2,1,2,11,10.45 }, //passport high quality- quantity=11
				new Object[] {2,2,1,2,20,19.00 }, //passport high quality- quantity=20
				new Object[] {2,2,1,2,21,17.85 }, //passport high quality- quantity=21
				new Object[] {2,2,1,2,50,42.50 }, //passport high quality- quantity=50
				new Object[] {2,2,2,2,0,0.00 },   //passport design effect-quantity=0
				new Object[] {2,2,2,2,4,5.40 },   //passport design effect-quantity=4
				new Object[] {2,2,2,2,5,5.50},    //passport design effect-quantity=5
				new Object[] {2,2,2,2,10,11.00 }, //passport design effect-quantity=10
				new Object[] {2,2,2,2,11,11.00 }, //passport design effect-quantity=11
				new Object[] {2,2,2,2,20,20.00},  //passport design effect-quantity=20
				new Object[] {2,2,2,2,21,18.90 }, //passport design effect-quantity=21
				new Object[] {2,2,2,2,50,45.00 }  //passport design effect-quantity=50
				
				
		};
	}
	
	@Test //Test Charges for Photo Normal(4R) with EP
	@Parameters(method="getParamsForTestCalculateChargesNormalPhotoContinueEP")
	public void testChargeForNormalPhotoContinueEP(int type,int option,int addOption, int addContinueOption,int quantity, double expectedResult) {
		
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
	
	private Object[] getParamsForTestCalculateChargesNormalPhotoContinueEP()
	{
		return new Object[] {
				new Object[] {2,1,1,1,3,3.75 },   //normal(4r) high quality- quantity=3
				new Object[] {2,1,1,1,7,8.05 },   //normal(4r) high quality- quantity=7
				new Object[] {2,1,2,1,15,15.00 }, //normal(4r) design effect-quantity=15
				new Object[] {2,1,2,1,35,26.25 }  //normal(4r) design effect-quantity=35
				
		};
	}
	
	@Test //Test Charges for Photo PassPort with EP
	@Parameters(method="getParamsForTestCalculateChargesPassPortPhotoContinueEP")
	public void testChargeForPassPortPhotoContinueEP(int type,int option,int addOption, int addContinueOption,int quantity, double expectedResult) {
		
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
	
	private Object[] getParamsForTestCalculateChargesPassPortPhotoContinueEP()
	{
		return new Object[] {
				new Object[] {2,2,1,1,3,4.35 },   //passport high quality -quantity=3
				new Object[] {2,2,1,1,7,8.40 },   //passport high quality -quantity=7
				new Object[] {2,2,2,1,15,16.50 }, //passport design effect-quantity=15
				new Object[] {2,2,2,1,35,35.00 }  //passport design effect-quantity=35
				
		};
	}
	
	@Test //Test Charges for Photo Normal(4R) with BVA	
	@Parameters(method="getParamsForTestCalculateChargesNormalPhotoContinueBVA")
	public void testChargeForNormalPhotoContinueBVA(int type,int option,int addOption, int addContinueOption,int quantity, double expectedResult) {
		
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
	
	private Object[] getParamsForTestCalculateChargesNormalPhotoContinueBVA()
	{
		return new Object[] {
				new Object[] {2,1,1,1,0,0.00 },   //normal(4r) high quality- quantity=0
				new Object[] {2,1,1,1,4,5.00 },   //normal(4r) high quality- quantity=4
				new Object[] {2,1,2,1,5,5.75 },   //normal(4r) design effect- quantity=5
				new Object[] {2,1,2,1,10,11.50 }, //normal(4r) design effect- quantity=10
				new Object[] {2,1,1,1,11,11.00 }, //normal(4r) high quality- quantity=11
				new Object[] {2,1,1,1,20,20.00 }, //normal(4r) high quality- quantity=20
				new Object[] {2,1,2,1,21,15.75 }, //normal(4r) design effect- quantity=21
				new Object[] {2,1,2,1,50,37.50 }, //normal(4r) design effect- quantity=50
				
		};
	}
	
	@Test //Test Charges for Photo PassPort with BVA
	@Parameters(method="getParamsForTestCalculateChargesPassPortPhotoContinueBVA")
	public void testChargeForPassPortPhotoContinueBVA(int type,int option,int addOption, int addContinueOption,int quantity, double expectedResult) {
		
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
	
	private Object[] getParamsForTestCalculateChargesPassPortPhotoContinueBVA()
	{
		return new Object[] {
				new Object[] {2,2,1,1,0,0.00 },   //passport high quality- quantity=0
				new Object[] {2,2,1,1,4,5.80 },   //passport high quality- quantity=4
				new Object[] {2,2,2,1,5,6.00 },   //passport design effect- quantity=5
				new Object[] {2,2,2,1,10,12.00 }, //passport design effect- quantity=10
				new Object[] {2,2,1,1,11,12.10 }, //passport high quality- quantity=11
				new Object[] {2,2,1,1,20,22.00 }, //passport high quality- quantity=20
				new Object[] {2,2,2,1,21,21.00 }, //passport design effect- quantity=21
				new Object[] {2,2,2,1,50,50.00 }, //passport design effect- quantity=50
				
				
		};
	}
	
	@Test (expected= IllegalArgumentException.class) 
	@Parameters(method="getParamsForPhotoException")
	public void testChargeForPhotoException(int type,int option,int addOption, int addContinueOption,int quantity) {
		
		Charge cc=new Charge();
		cc.setType(type, option, addOption, addContinueOption);
		cc.setQty(quantity);
		cc.setCharge();
		cc.setTotal();
		cc.setTotalSum();
		cc.setTotalQty();
		
	}
	
	private Object[] getParamsForPhotoException()
	{
		return new Object[] {
				new Object[] {-2,1,3,0,3},   //invalid type
				new Object[] {5,1,3,0,3},   //invalid type
				new Object[] {2,-1,5,0,15 }, //invalid option
				new Object[] {2,8,1,2,-5},   //invalid option
				new Object[] {2,1,-1,2,-5},	 //invalid addOption	
				new Object[] {2,1,5,2,7 },   //invalid addOption
				new Object[] {2,1,1,-2,35},  //invalid addContinueOption
				new Object[] {2,1,2,9,3 },   //invalid addContinueOption
				new Object[] {2,1,2,2,-5 },  // quantity out of range
				new Object[] {2,1,2,2,55 }   // quantity out of range
				
		};
	}

}
