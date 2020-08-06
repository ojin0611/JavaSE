import java.util.Scanner;

public class TestCustomer {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("name : "); 
		String name = scan.nextLine();
		
		System.out.print("address : "); 
		String address = scan.nextLine();
		
		System.out.print("phone number : "); 
		String phoneNumber = scan.nextLine();

		System.out.print("customer number : "); 
		String customerNumber = scan.nextLine();

		System.out.print("mileage : "); 
		int mileage = scan.nextInt();
		
		Customer c = new Customer(name, address, phoneNumber, customerNumber, mileage);
		System.out.println(c);
	}
}

class Person{
	private String name;
	private String address;
	private String phoneNumber;
	
	public Person() {
	}
	
		
	public Person(String name, String address, String phoneNumber) {
		this.name = name;
		this.address = address;
		this.phoneNumber = phoneNumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	@Override
	public String toString() {
		return String.format("name=%s, address=%s, phoneNumber=%s", name, address, phoneNumber);
	}
	
	
}

class Customer extends Person{
	private String customerNumber;
	private int mileage;
	public Customer(String name, String address, String phoneNumber, String customerNumber, int mileage) {
		super(name, address, phoneNumber);
		this.customerNumber = customerNumber;
		this.mileage = mileage;
	}
	public String getCustomerNumber() {
		return customerNumber;
	}
	public void setCustomerNumber(String customerNumber) {
		this.customerNumber = customerNumber;
	}
	public int getMileage() {
		return mileage;
	}
	public void setMileage(int mileage) {
		this.mileage = mileage;
	}
	@Override
	public String toString() {
		return String.format("%s, customerNumber=%s, mileage=%s", super.toString(), customerNumber, mileage);
	}	
}