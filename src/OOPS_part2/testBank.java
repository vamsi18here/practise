package OOPS_part2;

public class testBank {

	public static void main(String[] args) {
		hsbcBank hb = new hsbcBank();
		hb.carLoan();
		hb.credit();
		hb.debit();
		hb.educationLoan();
		hb.transferMoney();
		
		//Dynamic polymorphism
		//Child class object can be referred by parent Interface reference variable
		//only overridden methods can be accessed
		UsBank ub = new hsbcBank();
		ub.credit();
		ub.debit();
		ub.transferMoney();
		
	}

}
