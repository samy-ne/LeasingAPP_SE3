package packLeasing;

import java.util.ArrayList;
import java.util.Collections;

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




	
	// override
	
	@Override
	public String toString() {
		String new_str = new String();
		new_str = super.toString();
		new_str = new_str + "Client contracts: /n";
		for (Contract contract : _my_contracts) {
			new_str = new_str + contract.toString();
		}
		return new_str;
	}
	
	
	// getters & setters
	public Contract nextContractGet() {
		Collections.sort(this._my_contracts, new CompareClass.NextContractComparator());
		return this._my_contracts.get(0);
	}
	
	public ArrayList<Contract> get_my_contracts() {
		return _my_contracts;
	}
	
	
	// Advanced methods
	public void displayVehiclesFromSearch(ArrayList<Vehicles> _matching_vehicles) {
		int num = 0;
	    new  OptionPaneExample(num, _matching_vehicles );  
	}

	
}
