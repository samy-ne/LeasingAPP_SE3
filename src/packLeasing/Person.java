package packLeasing;

public abstract class Person {
	// members
	String _username;
	String _password;
	String _id;
	Integer _age;
	
	
	// Constructors
	public Person(String _username, String _password, String _id, Integer _age) {
		this._username = _username;
		this._password = _password;
		this._id = _id;
		this._age = _age;
	}
	
	public Person() {
		this(null, null, null, 0);
	}

	
	// override
	
	@Override
	public String toString() {
		return "Person"; //TODO
	}		
		
		
	// getters & setters
}
