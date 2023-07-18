package packLeasing;

import java.time.LocalDate;
import java.util.ArrayList;

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

		public Contract (Vehicles _vehicle) {
		//this method is a constructor for a contract of a year with start day= today  ;)
		super();
		this._start = LocalDate.now();
		this._finish = LocalDate.now().plusYears(1);;
		this._vehicle = _vehicle;
	}

	
	// override
	@Override
	public String toString() {
		return "Contract [start=" + _start + ", finish=" + _finish + ", vehicle=" + _vehicle + "] /n";
	}
	public String getVehicles() {
		return "Contract [start=" + _start + ", finish=" + _finish + ", vehicle=" + _vehicle + "] /n";
	}
	
		
	// getters & setters
	public Vehicles get_vehicle(){
		return _vehicle;
	}
}
