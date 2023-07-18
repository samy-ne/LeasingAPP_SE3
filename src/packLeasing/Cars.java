package packLeasing;

public class Cars extends Vehicles {
	// members
	private Integer _motor;
	private Integer _gears;
	private Integer _roof;
	private String _type;
	
	
	// constructor
	public Cars(String color, int rent_price, int buy_price, String brand, String model, int age, String img_path, Integer motor, Integer roof, Integer gears) {
		super(color, rent_price, buy_price, brand, model, age, img_path);
		this._gears = gears;
		this._roof = roof;
		this._motor = motor;
	}
	
	
	// override
	@Override
	public Integer getType() {
		return Attributes.TYPE_CAR;
	}

	@Override
	public String toString() {
		return "Car\n" + super.toString(); 
	}


	// getters & setters
	public Integer get_motor() {
		return _motor;
	}


	public Integer get_gears() {
		return _gears;
	}


	public Integer get_roof() {
		return _roof;
	}
	
	
	
	
	
}
