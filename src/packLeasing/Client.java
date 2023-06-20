package packLeasing;

import java.util.ArrayList;

public class Client extends Person {	
	// members

	private ArrayList<Contract> _my_contracts;
	
	
	// constructors
	public Client(ArrayList<Contract> _my_contracts) {
		super();
		this._my_contracts = _my_contracts;
	}
	
	public Client() {
		this(null);
	}

	
	// override
	
	@Override
	public String toString() {
		return "Client [_my_contracts=" + _my_contracts + "]"; //TODO
	}
	
	
	// getters & setters
	
}
