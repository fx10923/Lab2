package vn.edu.adpter_pattern.transaction;

public class Transaction {
	
	public void createPayment(TransactionHandler transactionHandler) {
		transactionHandler.pay();
	}
}
