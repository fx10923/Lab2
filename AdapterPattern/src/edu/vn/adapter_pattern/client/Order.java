package edu.vn.adapter_pattern.client;

import vn.edu.adpter_pattern.transaction.ExternalPaymentAddapter;
import vn.edu.adpter_pattern.transaction.InternalTransaction;
import vn.edu.adpter_pattern.transaction.Transaction;
import vn.edu.adpter_pattern.transaction.TransactionHandler;

public class Order {
	public static void main(String[] args) {
		String payType = "ATM";
		String payType2 = "EWALLET";
		TransactionHandler handler = new InternalTransaction();
		TransactionHandler handler2 = new ExternalPaymentAddapter(payType);
		TransactionHandler handler3 = new ExternalPaymentAddapter(payType2);
		
		Transaction transaction = new Transaction();		
		transaction.createPayment(handler);
		transaction.createPayment(handler2);
		transaction.createPayment(handler3);
		
	}
}
