package packLeasing;

public class Motorcycle extends Vehicles {

	// members
	
	// constructors
		
	// override
	
	public Motorcycle(String color, int rent_price, int buy_price, String brand, String model, int age, String img_path) {
		super(color, rent_price, buy_price, brand, model, age, img_path);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Integer getType() {
		return Attributes.TYPE_MOTORCYCLE;
	}
	
	
	// getters & setters
}
