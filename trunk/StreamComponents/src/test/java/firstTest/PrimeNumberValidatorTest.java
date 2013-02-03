package test.java.firstTest;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import main.java.firstTest.*;

@RunWith(Parameterized.class)
public class PrimeNumberValidatorTest {
	
    private Integer primeNumber;
    private Boolean expectedValidation;
    private PrimeNumberValidator primeNumberValidator;
    
    //setup instances of object which can be used and configured in your test methods
    @Rule
    public ExpectedException exception = ExpectedException.none();

    @Before
    public void initialize() {
        primeNumberValidator = new PrimeNumberValidator();
    }

    // constructor in which you store the values for each test.
    // Each parameter should be placed as an argument here
    // Every time runner triggers, it will pass the arguments from parameters we defined
    public PrimeNumberValidatorTest(Integer primeNumber, Boolean expectedValidation) {
        this.primeNumber = primeNumber;
        this.expectedValidation = expectedValidation;
    }
    
    // generates and returns a Collection of Arrays. Each item in this collection is used as the parameters for the test method.
    @Parameterized.Parameters
    public static Collection<Object[]> primeNumbers() {
        return Arrays.asList(new Object[][] {
                { 2, true },
                { 6, false },
                { 19, true },
                { 22, false }
        });
    }
    
    @Parameters
    public static Collection<Object[]> data() {
      Object[][] data = new Object[][] { 
    		  { 1 },
    		  { 2 },
    		  { 3 },
    		  { 4 }
    	};
      return Arrays.asList(data);
    }

    // This test will run 4 times since we have 4 parameters defined
    @Test
    public void testPrimeNumberValidator() {
        assertEquals(expectedValidation, primeNumberValidator.validate(primeNumber));
    }

}