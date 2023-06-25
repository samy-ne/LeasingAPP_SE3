package packLeasing;

import java.time.LocalDate;

public class Contract {
	// members
	LocalDate _start;
	LocalDate _finish;
	Vehicles _vehicle;
	
	// constructor
	public Contract(LocalDate _start, LocalDate _finish, Vehicles _vehicle) {
		//this method is a constructor for a contract ;)
		super();
		this._start = _start;
		this._finish = _finish;
		this._vehicle = _vehicle;
	}
	
	// override
		
	// getters & setters

}
