package question3;



import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class IHMFahrenheitTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class IHMFahrenheitTest
{
    /**
     * Default constructor for test class IHMFahrenheitTest
     */
    public IHMFahrenheitTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }
    
    public void test_val_min_celsius()
    {
        //La valeur minimale en celsius est -273.1
        assertEquals("-460 °F -> -273.1°C ? ", -273.1, question2.FahrenheitCelsius.fahrenheitEnCelsius(-460), 0.1);
        assertEquals("-500°F -> -273.1 °C ? ", -273.1, question2.FahrenheitCelsius.fahrenheitEnCelsius(-500), 0.1);
        assertEquals("-1000°F -> -273.1°C ?", -273.1, question2.FahrenheitCelsius.fahrenheitEnCelsius(-1000), 0.1);
        assertEquals("-10000°F -> -273.1 °C ?", -273.1, question2.FahrenheitCelsius.fahrenheitEnCelsius(-10000), 0.1);
       
        
    }
    

    @Test
    public void est_FahrenheitToCelsius()
    {
    }
}

