package test.java.firsTest;

import java.util.Arrays;

import java.util.Collection;
import org.junit.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameters;
import static main.java.firstTest.FirstComponent.*;
import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.*;

public class FirstComponentTest{
	
	private static Object obj;

	/**
	 * Asserts
	 */
	@SuppressWarnings("deprecation")
	@Test
	public void testAsserts() throws Exception{
		fail("Let the method fail");
		
		//check for boolean
		assertTrue(true); 
		 //check for boolean
		assertFalse(false);
		//check for boolean
		assertTrue("message to identify", true);
		
		//deprecated
		assertEquals("message to identify", 17.9, return179());
		//use instead
		assertEquals("messgae to identify", 17.8, return179(), 0.1);
		
		assertNull(returnNull());
		assertNull("message to identify", returnNull());
		assertNotNull(returnNotNull());
		
		assertSame(getObj(), obj);
		assertNotSame(obj, returnNotNull());
	}

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		Object obj = new Object();
		setObj(obj);
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	/**
	 * red
	 */
	public void return5Test_Fail() {
		//assertEquals(6, return5());
		assertThat("Zero is one", 0, is(not(0)));
		//assertEquals(6, return5());
	}

	@Test
	/**
	 * red
	 */
	public void returnFertig_Fail(){
		assertEquals("Erster", returnFertig());
	}

	@Test (timeout = 1000)
	/**
	 * red
	 */
	public void return6Test_Fail() throws InterruptedException {
		//faild because of timeout
		//Thread.sleep(2000);
		//succ for equals test
		assertEquals("attentione, test failed", 5, return5WithTimeout());
	}

	@Test
	/**
	 * green
	 */
	public void returnFertig_Succ(){
		assertEquals("Fertig", returnFertig());
	}

	@Test
	/**
	 * green
	 */
	public void return5Test_Succ() throws InterruptedException {
		assertEquals(5, return5());
	}

	//Getter and Setter for test obj
	public static Object getObj() {
		return obj;
	}

	public static void setObj(Object o) {
		obj = o;
	}


	public static void runWithTest(){

	}

	@SuppressWarnings("rawtypes") //Collection
	@Parameters
	/**
	 * is used to setup a collection for the RunWith Test
	 * @return
	 */
	public static Collection data() {
		return Arrays.asList(new Object[][]{
				{0, 0},
				{1, 1},
				{2, 4},
				{4, 16},	// OK : 4² = 16
				{5, 25},
				{6, 36},
				{7, 48}		// NOK : 7² = 49 not 48
		});
	}

	@Test (timeout=100)
	public void testTimout100() throws InterruptedException {
		wait(200);
		assertTrue("failed because of timeout",true);
	}

	
	//TODO: @RunWith and @suite
	//@RunWith(Parameterized.class)
	
}

