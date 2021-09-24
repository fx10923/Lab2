package vn.edu.adpter_pattern.transaction;

public class InternalTransaction implements TransactionHandler{
	
	@Override
	public void pay() {
		System.out.println("Deduct money by internal method");
	}

}
