package cst8284.calculator;


public class ComplexCalculator {
	
	private java.util.Scanner op = new java.util.Scanner(System.in);
	private Complex c;  // stores result of current calculation 
	
	public ComplexCalculator(Complex c1, Complex c2){
		
		System.out.println("Which math operation do you wish to perform?  Enter +, -, *, /");
				
		switch (op.nextLine().charAt(0)){
		   case '+':
		      setComplexResult(add(c1, c2));  
		      break;
		   case '-':
			   setComplexResult(subtract(c1, c2));
			   break;
		   case '*':
			   setComplexResult(multiply(c1, c2));
			   break;
		   case '/':
			   setComplexResult(divide(c1, c2));
			   break;
		   default:
			  System.out.println("Unknown operation requested");
		}		
	}
	
	public ComplexCalculator() {}  // Needed for Lab 4; do not change
	
	public Complex add(Complex c1, Complex c2){
		double real = c1.getReal() + c2.getReal();  
		double imag = c1.getImag() + c2.getImag();
		return(new Complex(real, imag));
	}
	
	public Complex subtract(Complex c1, Complex c2){
		double real = c1.getReal() - c2.getReal();  // As per the Lab Appendix
		double imag = c1.getImag() - c2.getImag();
		return(new Complex(real, imag));
	}
	
	public Complex multiply(Complex c1, Complex c2){
		double a = c1.getReal();
		double B = c1.getImag();
		double x = c2.getReal();
		double Y = c2.getImag();
		double real = a * x - B * Y;
		double imag = a * Y + x * B;
		return(new Complex(real, imag));
	}
	
	public Complex divide(Complex c1, Complex c2){		
		double a = c1.getReal();
		double B = c1.getImag();
		double x = c2.getReal();
		double Y = c2.getImag();
		if (c2.isZero()) {     
			System.err.println("Divide-by-zero error detected");
			return new Complex(0, 0);
		}		
		double real = (a * x + B * Y) / (x * x + Y * Y);
		double imag = (x * B - a * Y) / (x * x + Y * Y);
		return(new Complex(real, imag));
	}
	    
	public void setComplexResult(Complex c) {
		this.c = c;
	}

	public Complex getComplexResult(){
		return c;
	}

	public String toString(){
		return c.toString();
	}
	
}

