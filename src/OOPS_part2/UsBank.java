package OOPS_part2;

public interface UsBank {
	
	int min_bal = 100;
	
	public void credit();
	
	public void debit();
	
	public void transferMoney();
	
	//Only method declaration
	//no method body -  only method prototype
	//we can declare the variables, vars are by default static in nature
	//vars value will not be changed
	//no static methods in interface
	//no main method in interface
	//we cannot create object of an interface
	//interface is abstract in nature
	

}
