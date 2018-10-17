package OOPS_part2;

public class hsbcBank implements UsBank, Brazil_Bank {
	
//if a class is implementing any interface, its mandatory to define/override all the methods of the interface		
//Inheriting from US_Bank
public void credit()
{
System.out.println("HSBC - Credit Method");
}
public void debit(){
	System.out.println("HSBC - Debit Method");
}
public void transferMoney(){
	System.out.println("HSBC - Transfer Money");
}
//Own Methods
public void educationLoan(){
	System.out.println("HSBC - Education Loan");
	}
public void carLoan(){
	System.out.println("HSBC - Car Loan");
}
//Inheriting from Brazil Bank
public void mutualFunds(){
	System.out.println("HSBC - Mutual Fund");
}
}
