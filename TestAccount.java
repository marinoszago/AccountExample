
public class TestAccount {


	public static void main(String[] args) {
		Account a1 = new Account(1234,99.99);
		System.out.println(a1);
		
		a1.credit(10.001);
		a1.debit(5);
		
		System.out.println(a1);
		System.out.println(a1.getBalance());
		
		a1.setBalance(0);
		System.out.println(a1);
		
		Account a2 = new Account(5523,250000);
		System.out.println(a2);
		
		a2.debit(249999);
		
		System.out.println(a2.getBalance());
		System.out.println(a2);
		
		a2.credit(200000);
		System.out.println(a2.getBalance());
		System.out.println(a2);
		

		
		
		

	}

}
