package AbstractionConcept;

public class TestBank {

	public static void main(String[] args) {
		HDFCBank hb = new HDFCBank();
		
		hb.debit();
		hb.credit();
		hb.loan();
		hb.funds();
		
		System.out.println("Bank Abstraction");
		Bank b = new HDFCBank();
		b.debit();
		b.credit();
		b.loan();
	//	b.funds(); //- can not be accessed by the parent abstract class Bank
		
		

	}

}
