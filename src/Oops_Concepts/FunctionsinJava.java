package Oops_Concepts;

public class FunctionsinJava {

	public static void main(String[] args) {
	//Main method is void, as it never returns a value
		FunctionsinJava fij = new FunctionsinJava();
		//One Object will be created. fij is the reference variable, referring to the object
		//after creating the object, the copy of all the non-static methods will be given to this object
		
	fij.test();
	
	int l = fij.pqr();
	System.out.println("return value of PQR method is "+l);
	
	String s1 = fij.qa();
	System.out.println("return value of QA method is "+s1);
	
	int d = fij.division(1000, 5);
	System.out.println("return value of Division method is "+d);
		
	}
	// Non-static methods
	
	//void -- does not return any values
	//return type - void
		public void test()//no-input, no-output
		{
			System.out.println("Test Method");
		}
		
		//return type - int
		public int pqr()//no-input, some output
		{
			System.out.println("PQR method");
			int a = 10;
			int b = 20;
			int c = a + b;
			
			return c;
		}
		
		public String qa()//no-input, Some Output
		{
			System.out.println("QA method");
			String s = "Selenium";
			
			return s;
		}
		
		//x, y input parameters/arguments
		public int division(int x, int y){
			System.out.println("Division Method");
			int d = x/y;
			
			return d;
		}
}
