package Oops_Concepts;
public class wrappercclass {

	public static void main(String[] args) {
		
		String x = "100";
		System.out.println("Without Wrapper: "+ x+20);
		
		//Data Conversion: String to Int
		int i = Integer.parseInt(x);
		System.out.println("Wrapper: "+(i+20));
		
		//Integer, Double, Character, Boolean
		
		//String to Double Conversion
		String y = "12.23";
		double d = Double.parseDouble(y);
		System.out.println("Wrapper: "+(d+10));
		
		//String to Boolean Conversion
				String k = "true";
				boolean b = Boolean.parseBoolean(k);
				System.out.println("Wrapper: "+b);
	
				//int to String Conversion
				int j = 200;
				System.out.println("Without Wrapper: "+ (j+20));
				String s = String.valueOf(j);
				System.out.println("Wrapper: "+(s+10));
	}

}

