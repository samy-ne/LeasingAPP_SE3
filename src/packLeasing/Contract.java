package packLeasing;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Random;
public class Contract {
	// members
	private static final Random random = new Random();
	LocalDate _start;
	LocalDate _finish;
	Vehicles _vehicle;
	private int contractID;
	// constructor
	public Contract(LocalDate _start, LocalDate _finish, Vehicles _vehicle) {
		//this method is a constructor for a contract ;)
		
		super();
		this._start = _start;
		this._finish = _finish;
		this._vehicle = _vehicle;
		this.contractID = generateRandomContractID();
	}
	public Contract(int _ContractID, LocalDate _start, LocalDate _finish, Vehicles _vehicle) {
		//this method is a constructor for a contract ;)
		
		super();
		this._start = _start;
		this._finish = _finish;
		this._vehicle = _vehicle;
		this.contractID = _ContractID;
	}
	
	public Contract (Vehicles _vehicle) {
		//this method is a constructor for a contract of a year with start day= today  ;)
		super();
		this._start = LocalDate.now();
		this._finish = LocalDate.now().plusYears(1);;
		this._vehicle = _vehicle;
		this.contractID = generateRandomContractID();
	}
		// Method to generate a random ContractID between 1 and 1000
	private int generateRandomContractID() {
	    return random.nextInt(1000) + 1;
	}
	
	
	// override
	@Override
	public String toString() {
		return "Contract [start=" + _start + ", finish=" + _finish + ", vehicle=" + _vehicle + "] /n";
	}
	public String getVehicles() {
		return "Contract [start=" + _start + ", finish=" + _finish + ", vehicle=" + _vehicle + "] /n";
	}
	public String getDate() {
		return "Your contract starts on: " + _start +"\n"+ "The contract starts on: " + _finish;
	}
	public int getContractID() {
		return this.contractID;
	}
	// getters & setters
	public Vehicles get_vehicle(){
		return _vehicle;
	}
	
}
