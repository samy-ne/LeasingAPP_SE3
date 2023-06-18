package packLeasing;

import java.util.ArrayList;

public class Client extends Person {
	ArrayList<Contract> _my_contracts;
	
	

	public Client(ArrayList<Contract> _my_contracts) {
		super();
		this._my_contracts = _my_contracts;
	}
	
	
}
