package ch08;

public class CustomerTest1 {

	public static void main(String[] args) {
		Customer customerLee = new Customer(10010,"이순신");
		customerLee.bonusPoint = 1000;
		System.out.println(customerLee.show());
		
		VIPCustomer customerKim = new VIPCustomer(10020,"김유신",111);
		customerKim.bonusPoint = 10000;
		System.out.println(customerKim.show());
	}

}
