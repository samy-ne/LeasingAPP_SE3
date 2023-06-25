package packLeasing;

import java.util.ArrayList;

public class Client extends Person {	
	// members

	private ArrayList<Contract> _my_contracts;
	
	
	// constructors

	public Client() {
		this(null);
	}
	public Client(ArrayList<Contract> _my_contracts) {
		super();
		this._my_contracts = _my_contracts;
	}



	public void displayVehiclesFromSearch(ArrayList<Vehicles> _matching_vehicles) {
		int num = 0;
	    new  OptionPaneExample(num, _matching_vehicles );  
	}

	
	// override
	
	@Override
	public String toString() {
		return "Client [_my_contracts=" + _my_contracts + "]"; //TODO
	}
	
	
	// getters & setters
	
}
