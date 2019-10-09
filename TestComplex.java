package test.cst8284.calculator;
import cst8284.calculator.*;
import static org.junit.Assert.*;

//import org.junit.After;
import org.junit.Test;

public class TestComplex {
   //2
	@Test
        public void testComplexStringString() {
		Complex c=new Complex("3","0i");  // create a new object c
		assertEquals(3.0, c.getReal(),0.000000000001); 
		//use assertEquals(double, double, double)to test if getReal()returns the correct value
	}
	
	
   //3
	@Test
	public void testComplexIntInt() {
		Complex c1 = new Complex(2,0); //create a new object c1
		c1.setReal(3);
		assertEquals(3.0, c1.getReal(),0.00000000001);
		//use assertEquals(double,double,double)to test if setReal()correctly resets the value
	}

	
	//5
	@Test
	public void testEqualsComplex() {
		Complex c1 = new Complex("0-0i");  //create new object c1 using Complex(String)constructor
		String[] s = {"5","-6i"};   //using Complex(String[])constructor
		Complex c2 = new Complex(s);  //using Complex(String[])constructor to create c2
		ComplexCalculator cc = new ComplexCalculator();
		Complex c3 = cc.multiply(c1, c2);  //c3 is the result of multiply(c1, c2)
		Complex c4 = new Complex("0","0i");  //c4 is the expected result
		assertTrue(c3.equals(c4));
		//use assertTrue(boolean) to test two Complex numbers created using the above two method give the correct
		//result using the mutiply()method
	}
		
	
	//4
	@Test
	public void testEquals_IntInt() {
		Complex c1=new Complex();  //create a new object c1
		c1.setReal(6);
		c1.setImag(7);
		assertTrue(c1.equals(6,7));
		//use assertTrue(boolean)to test the validity of newly equals(int int)method
	}	
}
