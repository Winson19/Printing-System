package printingsystem;

import static org.junit.Assert.*;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;

@RunWith(JUnitParamsRunner.class)

public class IntegrationTest {
	
	static List<Order> ol=new ArrayList<Order>();
	static Order o=null;
	static Scanner orderInput=null;
	static File orderFile=null;
	static File requestFile;
	static Scanner requestInput=null;
	static List<String> rl=new ArrayList<String>();

	@Before
	public static void start()//Read test values and expected results from files
	{
		try
		{
			orderFile=new File("orders.txt");
			orderInput=new Scanner(orderFile);
			requestFile=new File("requests.txt");
			requestInput=new Scanner(requestFile);
		}
		catch (FileNotFoundException e)
		{
			System.out.println("Error opening the files");
		}
		while(orderInput.hasNextLine())
		{
			o=new Order();
			o.setType(orderInput.nextInt());
			o.setOption(orderInput.nextInt());
			o.setQty(orderInput.nextInt());
			if(o.getType()==2)
			{
				o.setAddOption(orderInput.nextInt());
				if(o.getAddOption()==1||o.getAddOption()==2)
				{
					o.setAddContinueOption(orderInput.nextInt());
				}
			}
			ol.add(o);
		}
		while(requestInput.hasNextLine())
		{
			rl.add(requestInput.nextLine());
		}
	}
	
	@After
	public static void end()
	{
		orderInput.close();
		requestInput.close();
	}
	
	//Big Bang Approach
	@Test
	public void testPrintingSystemValidBVA() {
		String[] expectedResult=new String[ol.size()];
		String[] actualResult=new String[ol.size()];
		for(int i=0;i<ol.size();i++)
		{
			Order o=ol.get(i);
			Charge c=new Charge();
			DummyPhotoPrinter dpp=new DummyPhotoPrinter();
			Printing p=new Printing(dpp);
			c.setType(o.getType(), o.getOption(), o.getAddOption(), o.getAddContinueOption());
			c.setQty(o.getQty());
			c.setCharge();
			c.setTotal();
			c.setTotalSum();
			c.setTotalQty();
			p.ipp.diffType(c.getType());
			p.ipp.setTotalSum(c.getTotalSum());
			p.ipp.setTotalQty(c.getTotalQty());
			p.ipp.setSumTotal();
			p.ipp.setSumQty();
			p.ipp.queueRequest();
			actualResult[i]=dpp.getStr();
			expectedResult[i]=rl.get(i);
		}
		
			assertArrayEquals(expectedResult,actualResult);
		
	}
	
	@Test(expected=IllegalArgumentException.class)
	@Parameters(method="getParamsForTestPrintingSystemWithDocumentInvalidTypeBVA")
	public void testPrintingSystemWithDocumentInvalidTypeBVA(int type)
	{
		Order o=new Order();
		Charge c=new Charge();
		DummyPhotoPrinter dpp=new DummyPhotoPrinter();
		o.setType(type);

		c.setType(o.getType(),o.getOption(),o.getAddOption(),o.getAddContinueOption());
		c.setQty(o.getQty());
		c.setCharge();
		c.setTotal();
		c.setTotalSum();
		c.setTotalQty();
		dpp.setTotalSum(c.getTotalSum());
		dpp.setTotalQty(c.getTotalQty());
		dpp.setSumTotal();
		dpp.setSumQty();
		dpp.queueRequest();
	}
	
	private Object[] getParamsForTestPrintingSystemWithDocumentInvalidTypeBVA()
	{
		return new Object[] {
				new Object[] {0},//invalid type
				new Object[] {3},//invalid type
		};
	}
	
	@Test(expected=IllegalArgumentException.class)
	@Parameters(method="getParamsForTestPrintingSystemWithDocumentInvalidOptionOrQuantityBVA")
	public void testPrintingSystemWithDocumentInvalidOptionOrQuantityBVA(int type,int option,int quantity)
	{
		Order o=new Order();
		Charge c=new Charge();
		DummyPhotoPrinter dpp=new DummyPhotoPrinter();
		o.setType(type);
		o.setOption(option);
		o.setQty(quantity);

		c.setType(o.getType(),o.getOption(),o.getAddOption(),o.getAddContinueOption());
		c.setQty(o.getQty());
		c.setCharge();
		c.setTotal();
		c.setTotalSum();
		c.setTotalQty();
		dpp.setTotalSum(c.getTotalSum());
		dpp.setTotalQty(c.getTotalQty());
		dpp.setSumTotal();
		dpp.setSumQty();
		dpp.queueRequest();
	}
	
	private Object[] getParamsForTestPrintingSystemWithDocumentInvalidOptionOrQuantityBVA()
	{
		return new Object[] {
				new Object[] {1,1,-1},//invalid quantity
				new Object[] {1,1,51},//invalid quantity
				new Object[] {1,0,5},//invalid option
				new Object[] {1,3,5}//invalid option
		};
	}
	
	@Test(expected=IllegalArgumentException.class)
	@Parameters(method="getParamsForTestPrintingSystemWithPhotoInvalidOptionQuantityOrAdditionalOptionBVA")
	public void testPrintingSystemWithPhotoInvalidOptionQuantityOrAdditionalOptionBVA(int type,int option,int quantity,int addOption)
	{
		Order o=new Order();
		Charge c=new Charge();
		DummyPhotoPrinter dpp=new DummyPhotoPrinter();
		o.setType(type);
		o.setOption(option);
		o.setQty(quantity);
		o.setAddOption(addOption);

		c.setType(o.getType(),o.getOption(),o.getAddOption(),o.getAddContinueOption());
		c.setQty(o.getQty());
		c.setCharge();
		c.setTotal();
		c.setTotalSum();
		c.setTotalQty();
		dpp.setTotalSum(c.getTotalSum());
		dpp.setTotalQty(c.getTotalQty());
		dpp.setSumTotal();
		dpp.setSumQty();
		dpp.queueRequest();
	}
	
	private Object[] getParamsForTestPrintingSystemWithPhotoInvalidOptionQuantityOrAdditionalOptionBVA()
	{
		return new Object[] {
				new Object[] {2,0,5,3},//invalid option
				new Object[] {2,3,5,3},//invalid option
				new Object[] {2,1,-5,3},//invalid quantity
				new Object[] {2,1,60,3},//invalid quantity
				new Object[] {2,1,5,0},//invalid addOption
				new Object[] {2,1,5,4},//invalid addOption
		};
	}
	
	@Test(expected=IllegalArgumentException.class)
	@Parameters(method="getParamsForTestPrintingSystemWithPhotoInvalidAdditionalContinueOptionBVA")
	public void testPrintingSystemWithPhotoInvalidAddidtionalContinueOptionBVA(int type,int option,int quantity,int addOption,int addContinueOption)
	{
		Order o=new Order();
		Charge c=new Charge();
		DummyPhotoPrinter dpp=new DummyPhotoPrinter();
		o.setType(type);
		o.setOption(option);
		o.setQty(quantity);
		o.setAddOption(addOption);
		o.setAddContinueOption(addContinueOption);
		c.setType(o.getType(),o.getOption(),o.getAddOption(),o.getAddContinueOption());
		c.setQty(o.getQty());
		c.setCharge();
		c.setTotal();
		c.setTotalSum();
		c.setTotalQty();
		dpp.setTotalSum(c.getTotalSum());
		dpp.setTotalQty(c.getTotalQty());
		dpp.setSumTotal();
		dpp.setSumQty();
		dpp.queueRequest();
	}
	
	private Object[] getParamsForTestPrintingSystemWithPhotoInvalidAdditionalContinueOptionBVA()
	{
		return new Object[] {
				new Object[] {2,1,5,1,0},//invalid addContinueOption
				new Object[] {2,1,5,1,3},//invalid addContinueOption
		};
	}
}