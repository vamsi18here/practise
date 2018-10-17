package Oops_Concepts;

public class CallbyValuevsCallbyRef {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CallbyValuevsCallbyRef obj = new CallbyValuevsCallbyRef();
		int x = 10;
		int y = 20;
		obj.testsum(x, y); //Call by value or pass by value
	}
	public int testsum(int a, int b){
		a = 30;
		b = 40;
		int c = a+b;
		 return c;
	}

}

