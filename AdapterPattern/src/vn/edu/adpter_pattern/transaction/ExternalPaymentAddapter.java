package vn.edu.adpter_pattern.transaction;

import vn.edu.adapter_pattern.external_payment.ATMCard;
import vn.edu.adapter_pattern.external_payment.Ewallet;
import vn.edu.adapter_pattern.external_payment.ExternalPaymentMethod;

public class ExternalPaymentAddapter implements TransactionHandler {
	
	public ExternalPaymentMethod paymentMethod;
	
	public ExternalPaymentAddapter(String payType) {
		if(payType.equals("ATM")) {
			paymentMethod = new ATMCard();
		} else if (payType.equals("EWALLET")) {
			paymentMethod = new Ewallet();
		}
	}
	
	@Override
	public void pay() {
		paymentMethod.sendDeductRequest();			
	}

}
