package packLeasing;

import java.util.ArrayList;

public class Admin extends Person{

	
	// members
	
	// constructors
	
	// override
	
	// getters & setters
	
	
	public void addVehycle(LeasingPatio Lp, Vehicles v1)
	{
		Lp._all_vehicles.add(v1);
	}
	
	public void removeVehycle(LeasingPatio Lp, Vehicles v1)
	{
		Lp._all_vehicles.remove(v1);
	}
	
	
	
	
	
	
	
	// main methods
	public void addVehicles(Vehicles newVehicle, ArrayList<Vehicles> all_vehicles) {
		
	}
	
	public void delVehicles(Vehicles vehicle, ArrayList<Vehicles> all_vehicles) {
		
	}
	
	public void showVehicles(ArrayList<Vehicles> all_vehicles) {
		
	}
	
	public void showClients (ArrayList<Vehicles> all_clients) {

	}
	
	
}
