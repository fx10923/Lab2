package vn.edu.strategy_pattern.demo;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

import vn.edu.strategy_pattern.order.Order;
import vn.edu.strategy_pattern.strategies.PayByCreditCard;
import vn.edu.strategy_pattern.strategies.PayByPayPal;
import vn.edu.strategy_pattern.strategies.PayStrategy;

public class Demo {
	private static Map<Integer, Integer> priceOnProducts = new HashMap<Integer, Integer>();
	private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	private static Order order = new Order();
	private static PayStrategy payStrategy;
	
	static {
        priceOnProducts.put(1, 2200);
        priceOnProducts.put(2, 1850);
        priceOnProducts.put(3, 1100);
        priceOnProducts.put(4, 890);
    }
	
	public static void main(String[] args) {
		try {
			while (!order.isClosed()) {
				int cost;
				boolean continueChoice = true;
				
				while(continueChoice) {
					System.out.println("Vao day: " + continueChoice);
					System.out.print("Please, select a product:" + "\n" +
	                        "1 - Mother board" + "\n" +
	                        "2 - CPU" + "\n" +
	                        "3 - HDD" + "\n" +
	                        "4 - Memory" + "\n");
					int choice = Integer.parseInt(reader.readLine());
					cost = priceOnProducts.get(choice);
					System.out.print("Count: ");
					int count = Integer.parseInt(reader.readLine());
	                order.setTotalCost(cost * count);
	                System.out.print("Do you wish to continue selecting products? Y/N: ");
	                String ctnChoice = reader.readLine();
	                if (ctnChoice.equalsIgnoreCase("N")) {
						continueChoice = false;
					}
				}
			
				if (payStrategy == null) {
					System.out.println("Please, select a payment method:" + "\n" +
	                        "1 - PalPay" + "\n" +
	                        "2 - Credit Card");
					String paymentMethod = reader.readLine();
					
					if (paymentMethod.equals("1")) {
						payStrategy = new PayByPayPal();
	                } else {
	                	payStrategy = new PayByCreditCard();
	                }
				}
				
				order.processOrder(payStrategy);
				
				System.out.print("Pay " + order.getTotalCost() + " units or Continue shopping? P/C: ");
	            String proceed = reader.readLine();
	            if (proceed.equalsIgnoreCase("P")) {
	                // Finally, strategy handles the payment.
	                if (payStrategy.pay(order.getTotalCost())) {
	                    System.out.println("Payment has been successful.");
	                } else {
	                    System.out.println("FAIL! Please, check your data.");
	                }
	                order.setClosed();
	            }
			} 
		} catch (Exception e) {
				e.printStackTrace();
		}
	}		
}
