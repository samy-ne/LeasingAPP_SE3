package packLeasing;

import javax.naming.InterruptedNamingException;

public abstract class Vehicles {
	// members
	static Integer _counter = 0;
	String _color;
	Integer _renting_price;
	Integer _buying_price;
	String _brand;
	String _model;
	Integer _age;
	Integer _id;
//  Image _picture;
	
	
	//Constructors
	public Vehicles(String _color, Integer _renting_price, Integer _buying_price, String _brand, String _model,
			Integer _age) {
		Vehicles._counter =+ 1;
		
		this._color = _color;
		this._renting_price = _renting_price;
		this._buying_price = _buying_price;
		this._brand = _brand;
		this._model = _model;
		this._age = _age;
		this._id = Vehicles._counter;
		
	}
	
	public Vehicles() {
		this(null, Attributes.NOT_FOR_RENT, Attributes.NOT_FOR_SALE, null, null, null);
	}
	
	
			
	// override
	
		
	// getters & setters
	public String get_color() {
		return _color;
	}

	public void set_color(String _color) {
		this._color = _color;
	}

	public Integer get_renting_price() {
		return _renting_price;
	}

	public void set_renting_price(Integer _renting_price) {
		this._renting_price = _renting_price;
	}

	public Integer get_buying_price() {
		return _buying_price;
	}

	public void set_buying_price(Integer _buying_price) {
		this._buying_price = _buying_price;
	}

	public String get_brand() {
		return _brand;
	}

	public void set_brand(String _brand) {
		this._brand = _brand;
	}

	public String get_model() {
		return _model;
	}

	public void set_model(String _model) {
		this._model = _model;
	}

	public Integer get_age() {
		return _age;
	}

	public void set_age(Integer _age) {
		this._age = _age;
	}

	
	
	// abstract functions
	abstract public Integer getType(); 
		    
}

