package vn.edu.adapter_pattern.external_payment;

public class ATMCard implements ExternalPaymentMethod{

	@Override
	public void sendDeductRequest() {
		System.out.println("Deduct money ATM card");
	}

}
