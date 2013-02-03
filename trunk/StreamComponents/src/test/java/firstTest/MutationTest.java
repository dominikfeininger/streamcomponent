package test.java.firstTest;

import org.junit.Test;
import static main.java.firstTest.Mutation.*;
import static org.junit.Assert.*;

import java.util.Collection;
import org.junit.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameters;
import static main.java.firstTest.FirstComponent.*;
import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

public class MutationTest {
	
	@Test
	public void fooBarTest(){
		int i = 5;
		assertEquals("foo", fooBar(i));

	}

}
