package outside;

public class ObjectsAndClasses {
	String company;
	String model;
	double price;
	double mileage;
	static int tyres;
	
	public ObjectsAndClasses(String company, String model, double price, double mileage) {
		
		this.company = company;
		this.model = model;
		this.price = price;
		this.mileage = mileage;
		
	}
	
	public void carDetails() {
		System.out.println("The car is from the \""+company+"\" maker.");
		System.out.println("The model of the car is \""+model+"\"");
		System.out.println("The Price of the car \""+company+"\" \""+model+"\" is "+price+" lakhs.");
		System.out.println("The Mileage of the \""+company+" "+model+"\" is :"+mileage);
		System.out.println("The car has "+tyres+" tyres.");
		System.out.println("------------------------------------------");
	}
	

}
