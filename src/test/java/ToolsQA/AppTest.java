package ToolsQA;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
 	public static void greet(){ 
		System.out.println("Hello Rishi from Maven");}

   public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        assertTrue( true );
	System.out.println("Changes done by me");
    }

	public static void main (String [] args){
	AppTest apObj = new AppTest();
	apObj.greet();
	apObj.testApp();}
}
