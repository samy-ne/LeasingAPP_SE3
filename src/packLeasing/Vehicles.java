package packLeasing;



public abstract class Vehicles {
	String _color;
	Integer _renting_price;
	Integer _buying_price;
	String _brand;
	String _model;
	Integer _age;
//  Image _picture;
	
	
	//Constructors
	public Vehicles(String _color, Integer _renting_price, Integer _buying_price, String _brand, String _model,
			Integer _age) {
		this._color = _color;
		this._renting_price = _renting_price;
		this._buying_price = _buying_price;
		this._brand = _brand;
		this._model = _model;
		this._age = _age;
	}
	
	public Vehicles() {
		this._color = null;
		this._renting_price = Attributes.NOT_FOR_RENT;
		this._buying_price = Attributes.NOT_FOR_SALE;
		this._brand = null;
		this._model = null;
		this._age = null;
	}

// abstract functions
	abstract public Integer getType(); 
		    
}

