package Oops_Concepts;

public class MethodOverloading {       
//MethodOverLoadding ->When the method name is same with different arguments within the same class	
	public static void main(String[] args) {
		
		MethodOverloading	mol = new MethodOverloading();
		
		mol.sum();
		mol.sum(20);
		mol.sum(20, 40);
}
	public static void main(int p){
		
	}
	public static void main(int q, int h){
		
	}
	//We can overload main method also
	//Cannot create Method inside a method
	//duplicate methods,(i.e)Same method names with same number of arguments & data types  are not allowed
	
	public void sum(){//0 input arguments
		System.out.println("0 input arguments");
	}
	public void sum(int x){//1 input argument
		System.out.println("1 input arguments");
	}
	public void sum(double d){//1 input argument - different datatype
		System.out.println("1 input arguments");
	}
	public void sum(int a, int b){//2 input argument
		System.out.println("2 input arguments");
	}
}
