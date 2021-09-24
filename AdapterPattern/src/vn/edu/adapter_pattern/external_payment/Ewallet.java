package vn.edu.adapter_pattern.external_payment;

public class Ewallet implements ExternalPaymentMethod {

	@Override
	public void sendDeductRequest() {
		System.out.println("Deduct money Ewallet");
	}

}
