package packLeasing;

import java.util.ArrayList;

public class LeasingPatio {
	ArrayList<Vehicles> _all_vehicles;
	ArrayList<Client> _all_clients;
	ArrayList<Admin> _all_admins;
	
	
	public LeasingPatio(ArrayList<Vehicles> _all_vehicles, ArrayList<Client> _all_clients,
			ArrayList<Admin> _all_admins) {
		this._all_vehicles = _all_vehicles;
		this._all_clients = _all_clients;
		this._all_admins = _all_admins;
	}
	
	public LeasingPatio() {
		this._all_vehicles = new ArrayList<Vehicles>();
		this._all_clients = new ArrayList<Client>();
		this._all_admins = new ArrayList<Admin>();
	}

}
