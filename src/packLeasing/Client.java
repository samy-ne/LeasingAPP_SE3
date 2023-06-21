package packLeasing;

import java.util.ArrayList;

//import pack1.OptionPaneExample;

public class Client extends Person {
	private ArrayList<Contract> _my_contracts;
	
	

	public Client(ArrayList<Contract> _my_contracts) {
		super();
		this._my_contracts = _my_contracts;
	}
	public void displayVehiclesFromSearch(ArrayList<Vehicles> _matching_vehicles) {
		int num = 0;
	    new  OptionPaneExample(num, _matching_vehicles );  
	}
	
}
