package OOPs;

class BankAccount{
	private long accNo;
	private float balance;
	
	void setAccNo(long accNo) {
		this.accNo = accNo;
	}
	
	long getAccNo() {
		return accNo;
	}
}


public class EncapsulationDemo {
	public static void main(String [] args) {
		
		BankAccount s = new BankAccount();
		s.setAccNo(3456789);
		long accNo = s.getAccNo();
		System.out.println("Acc No: " + accNo);
	}

}
