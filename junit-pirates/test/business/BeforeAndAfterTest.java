package business;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class BeforeAndAfterTest {

	@Test
	public void test1() {
		System.out.println("test1");
		assertTrue(true);
	}
	@Test
	public void test2() {
		System.out.println("test2");
		assertTrue(true);
	}
	@Test
	public void test3() {
		System.out.println("test3");
		assertTrue(true);
	}
	//Before test - will run before all tests
	@Before
	public void beforeTest(){
		System.out.println("Before");
		assertTrue(true);
	}
	
	//After test - will run after all tests
		@After
		public void afterTest(){
			System.out.println("After");
			assertTrue(true);
		}
		//Before Class - will run ONCE before all tests
		@BeforeClass
		public static void beforeClass(){
			System.out.println("Before Class");
			assertTrue(true);
		}
		
		//After test - will run after all test
			@AfterClass
			public static void afterClass(){
				System.out.println("After Class");
				assertTrue(true);
			}
}
