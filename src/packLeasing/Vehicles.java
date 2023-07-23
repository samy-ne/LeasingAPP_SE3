package packLeasing;

import javax.naming.InterruptedNamingException;

public abstract class Vehicles {
	
	static Integer _counter = 0;
	
	// members
	private String _color;
	private Integer _renting_price;
	private Integer _buying_price;
	private String _brand;
	private String _model;
	private Integer _age;
	private Integer _id;
	private String _image_path;
	
	
    boolean _available = true;
    boolean _ticketOpned = false;
	
	
	//Constructors
	public Vehicles(String _color, Integer _renting_price, Integer _buying_price, String _brand, String _model,
			Integer _age, String _image_path) {
		Vehicles._counter =+ 1;
		
		this._color = _color;
		this._renting_price = _renting_price;
		this._buying_price = _buying_price;
		this._brand = _brand;
		this._model = _model;
		this._age = _age;
		this._image_path = _image_path;
		this._id = Vehicles._counter;
		
	}
	
	public Vehicles() {
		this(null, Attributes.NOT_FOR_RENT, Attributes.NOT_FOR_SALE, null, null, null, null);
	}
	
	
			
	// override
	@Override
	public String toString() {
		return "color=" + _color + "\nrenting_price=" + _renting_price + "\nbuying_price=" + _buying_price
				+ "\nbrand=" + _brand + "\nmodel=" + _model + "\nage=" + _age + "\nid=" + _id + "\nimage_path="
				+ "\navailable=" + _available;
		
		// TODO
	}
	
	
		
	// getters & setters
	public String get_color() {
		return _color;
	}
	public void set_color(String color) {
		this._color = color;
	}

	public Integer get_renting_price() {
		return _renting_price;
	}
	public void set_renting_price(Integer renting_price) {
		this._renting_price = renting_price;
	}

	public Integer get_buying_price() {
		return _buying_price;
	}
	public void set_buying_price(Integer buying_price) {
		this._buying_price = buying_price;
	}

	public String get_brand() {
		return _brand;
	}
	public void set_brand(String brand) {
		this._brand = brand;
	}

	public String get_model() {
		return _model;
	}
	public void set_model(String model) {
		this._model = model;
	}

	public Integer get_age() {
		return _age;
	}
	public void set_age(Integer _age) {
		this._age = _age;
	}
	public Integer get_id() {
		return _id;
	}
	public void set_id(Integer _id) {
		this._id = _id;
	}
	public String get_image_path() {
		return _image_path;
	}
	public void set_image_path(String image_path) {
		this._image_path = image_path;
	}
	
	public boolean is_available() {
		return _available;
	}
	public void set_available(boolean available) {
		this._available = available;
	}

	
	// abstract functions
	abstract public Integer getType(); 
		    
}

