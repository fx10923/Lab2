package vn.edu.strategy_pattern.strategies;

public interface PayStrategy {
	boolean pay(int paymentAmount);
	
	void collectPaymentDetails();
}
