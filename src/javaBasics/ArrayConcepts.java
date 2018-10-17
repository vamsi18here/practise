package javaBasics;

public class ArrayConcepts {

	public static void main(String[] args) {
		// lowest bound - 0
		//upper bound - (n-1), n being size of array
		//one dimensional array
		
		//Disadvantage 
		//1.Size is fixed - Static array - use collections - Arraylist, Hashtable --Dynamic array
		//2. Stores only similar datatype variables - overcome this problem use Object Array
		
		//1. Int array		
		int i[] = new int[4];
	
			i[0]=1;
			i[1]=2;
			i[2]=3;
			i[3]=4;
			//Printing a value in an array
			//System.out.println(i[2]);

			//printing the size of array
			//System.out.println(i.length);

			//printing all the values in the array
				//for(int j=0;j<i.length;j++){
					//System.out.println(i[j]);	
				//}

		//2. Double Array
		double d[] = new double[3];
		d[0] = 2.33;
		d[1] = 14.32;
		d[2] = 2.79;
		
		//3. Char Array
		char c[] = new char[3];
		c[0] = 'a';
		c[1] = '1';
		c[2] = '$';
		
		//4. boolean Array
		boolean b[] = new boolean[2];
		b[0] = true;
		b[1] = false;
		
		//5. String Array
		String s[] = new String[3];
		s[0] = "abc";
		s[1] = "find";
		s[2] = "Any Body can Dance";
		
		//6. Object Array{Object is a class}-Used to store different data types 
		Object ob[] = new Object[6];
		ob[0]="Tom";
		ob[1]=23;
		ob[2]=12.23;
		ob[3]="06/09/2018";
		ob[4]='M';
		ob[5]="Paris";
		
		for(int a=0;a<ob.length;a++)
		{
			System.out.println(ob[a]);
		}
		
		
			}
			

			}
