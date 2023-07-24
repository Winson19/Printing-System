package printingsystem;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;

@RunWith(JUnitParamsRunner.class)
public class OrderTest {
	
	Order order=new Order();
	
	@Test 
	@Parameters({"1","2"})
	public void testSetTypeValid(int type) {
		
		order.setType(type);
		int actualResult=order.getType();
		assertEquals(type,actualResult);
	}
	
	
	@Test(expected=IllegalArgumentException.class)
	@Parameters({"0","3"})
	public void testSetTypeInvalidBVA(int type) {
		
		order.setType(type);
	}
	
	@Test
	@Parameters({"1","2"})
	public void testSetOptionValid(int option)
	{
		order.setOption(option);
		int actualResult=order.getOption();
		assertEquals(option,actualResult);
	}
	
	@Test(expected=IllegalArgumentException.class)
	@Parameters({"0","3"})
	public void testSetOptionInvalidBVA(int option) {
		
		order.setOption(option);
	}
	
	@Test
	@Parameters({"1","2","3"})
	public void testSetAddOptionValid(int addOption)
	{
		order.setAddOption(addOption);
		int actualResult=order.getAddOption();
		assertEquals(addOption,actualResult);
	}
	
	@Test(expected=IllegalArgumentException.class)
	@Parameters({"0","4"})
	public void testSetAddOptionInvalidBVA(int addOption) {
		
		order.setAddOption(addOption);
	}
	
	@Test
	@Parameters({"1","2"})
	public void testSetAddContinueOptionValid(int addContinueOption)
	{
		order.setAddContinueOption(addContinueOption);
		int actualResult=order.getAddContinueOption();
		assertEquals(addContinueOption,actualResult);
	}
	
	@Test(expected=IllegalArgumentException.class)
	@Parameters({"0","3"})
	public void testSetAddContinueOptionInvalidBVA(int addContinueOption) {
		
		order.setAddContinueOption(addContinueOption);
	}
	
	@Test
	@Parameters({"0","50"})
	public void testSetQtyValidBVA(int qty)
	{
		order.setQty(qty);
		int actualResult=order.getQty();
		assertEquals(qty,actualResult);
	}
	
	@Test(expected=IllegalArgumentException.class)
	@Parameters({"-1","51"})
	public void testSetQtyInvalidBVA(int qty)
	{
		order.setQty(qty);
	}
	
	@Test
	@Parameters({"25"})
	public void testSetQtyValidEP(int qty)
	{
		order.setQty(qty);
		int actualResult=order.getQty();
		assertEquals(qty,actualResult);
	}
	
	@Test(expected=IllegalArgumentException.class)
	@Parameters({"-25","75"})
	public void testSetQtyInvalidEP(int qty)
	{
		order.setQty(qty);
	}
	
	@Test
	@Parameters({"1","2"})
	public void testSetContinueOptionValidBVA(int continueOption)
	{
		order.setContinueOption(continueOption);
		int actualResult=order.getContinueOption();
		assertEquals(continueOption,actualResult);
	}
	
	@Test(expected=IllegalArgumentException.class)
	@Parameters({"0","3"})
	public void testSetContinueOptionInvalidBVA(int continueOption)
	{
		order.setContinueOption(continueOption);
	}
}

