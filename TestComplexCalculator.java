package test.cst8284.calculator;
import cst8284.calculator.*;
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Test;

public class TestComplexCalculator {
	
   //1
	@Test
	public void testGetComplexResult() {
		Complex c1=new Complex("1-1i");   //create a new object c1
		Complex c2=new Complex("1-1i");   //create a new object c2
		ComplexCalculator c = new ComplexCalculator();
		c.setComplexResult(c.add(c1, c2));
		assertNotNull(c.getComplexResult()); //use assertNotNull()to test the result
	}
	
	
   //6
	@Test
	public void testMultiply() {
		int a = 1;
		int b = 2;
		Complex c1 = new Complex(a, b);   //create new object like a+bi
		Complex c2 = new Complex(String.valueOf(a), String.valueOf(-b));   //create new object like a-bi
		ComplexCalculator cc = new ComplexCalculator();
		
		int r = a*a + b*b;    //"r" is the expected result of (a+bi)(a-bi) which is pure real number
		for (int real =-100; real<100; real++) {
		   for (int imag=-100; imag<100; imag++) {
			   Complex c = cc.multiply(new Complex(real, imag), new Complex(real, -imag));	
			   if (c.getImag() != 0.0) {
			   fail();
			   break;}
	    }
		   assertTrue(true);  	//use equals(int real, int imag) to compare	
	  }	
	}
}
	/*
	@Test
	public void testToString() {
		Complex c =new Complex(3, 2);
		assertTrue(c.toString().contentEquals("3.0 + 2.0i"));
	}
   */





	
	

