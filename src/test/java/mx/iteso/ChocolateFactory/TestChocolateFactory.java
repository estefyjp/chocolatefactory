package mx.iteso.ChocolateFactory;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class TestChocolateFactory {
	
		ChocolateBoiler uniqueInstance = ChocolateBoiler.getInstance();
		ChocolateBoiler uniqueInstance2 = ChocolateBoiler.getInstance();
	

	@Test
	public void TestSingleton(){
		assertEquals(true, uniqueInstance==uniqueInstance2);
		ChocolateBoiler.ClearBoiler();
		assertNotSame(null,uniqueInstance);
	}
	@Test
	public void TestFill(){
		uniqueInstance.fill();
		assertNotSame(true, uniqueInstance.isEmpty());
	}
	@Test
	public void TestDrain(){
		uniqueInstance.drain();
		assertEquals(true, uniqueInstance.isEmpty());
	}
	//@Test
	//public void TestBoil(){
		//uniqueInstance.boil();
		//assertEquals(true, uniqueInstance.isBoiled());
	//}
	@Test 
	public void TestIsEmpty(){
		uniqueInstance.drain();
		uniqueInstance2.fill();
		assertNotSame(uniqueInstance.isEmpty(), uniqueInstance2.isEmpty());
	}
	@Test
	public void TestIsBoiled(){
		uniqueInstance.boil();
		assertEquals(true, uniqueInstance.isBoiled());
	}
	
	
}
