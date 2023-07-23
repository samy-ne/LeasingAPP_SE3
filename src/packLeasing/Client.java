package packLeasing;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

import javax.swing.*;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.*;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import fileAPI.*;
public class Client extends Person {	
	// members
	//ClientMainPage b = new ClientMainPage();
	//String[] val =b.start();
	ArrayList<Vehicles> _my_matching_vehicles ;
	public ArrayList<Contract> _my_contracts;
	//=new ArrayList<Contract>();
	//this._my_contracts = new ArrayList<Contract>();
	// constructors
	//this._my_contracts = new ArrayList<Contract>();
	public Client() {
		this._my_contracts = new ArrayList<Contract>();
		//this(null, null);
	}
	public Client(ArrayList<Contract> _my_contracts,ArrayList<Vehicles> _all_vehicles ) {
		super();
		this._my_contracts = _my_contracts;
		this._my_matching_vehicles = _all_vehicles;
	}
	public Client(ArrayList<Vehicles> _all_vehicles ) {
		super();
		this._my_contracts = _my_contracts;
		this._my_matching_vehicles = _all_vehicles;
	}
	public Client(String user,String pass) {
		super(user,pass,"208111111",50);
		fileAPI api = new fileAPI();
		
		HashMap<String, ArrayList<String>> userContractMap= api.getAllUserContracts();
		List<Contract> contracts = api.getAllContracts();
		this._my_matching_vehicles= new ArrayList<>();
		this._my_contracts = new ArrayList<>();
		
		// Build _my_contracts list
	    for (String username : userContractMap.keySet()) {
	        // Check if the username matches the client's username
	        if (user.equals(username)) {
	            // Get the contract ID associated with the client's username
	            //int contractID = Integer.parseInt(userContractMap.get(username));
	        	ArrayList<String> allcontractIDs= userContractMap.get(username);
	        	// Find the contract in allContracts with the matching contract ID
	            for (Contract contract : contracts) {
	                if (allcontractIDs.contains(Integer.toString(contract.getContractID()))) {//        contract.getContractID() == contractID)
	                    // Add the contract to the _my_contracts list
	                    _my_contracts.add(contract);
	                    break; // Break the loop once the matching contract is found
	                }
	            }
	        }
	    }
	 // Find the contract IDs associated with the client's username
	    ArrayList<String> clientContractIDs = new ArrayList<>();
	    for (String username : userContractMap.keySet()) {
	        if (user.equals(username)) {
	        	clientContractIDs= userContractMap.get(username);
	            //int contractID = Integer.parseInt(userContractMap.get(username));
	            //clientContractIDs.add(contractID);
	        }
	    }
	 // Build _my_contracts list and _my_matching_vehicles list
	    for (Contract contract : contracts) {
	        // Check if the contract ID belongs to the client's contract IDs
	        if (clientContractIDs.contains(Integer.toString(contract.getContractID()))) {
	            // Add the contract to the _my_contracts list
	            _my_contracts.add(contract);
	            // Add the contract's vehicle to the _my_matching_vehicles list
	            _my_matching_vehicles.add(contract.get_vehicle());
	        }
	    }
	    
	    //System.out.println("the current user vehicles:");
	    //System.out.println(this._my_matching_vehicles);
	    //System.out.println("the current user contracts");
	    //System.out.println(this._my_contracts);
		//this method builds all existing information about vehicles and contracts of the client
		//with the username
		
	}

	//public ArrayList<Vehicles> searchOptionManagment() {
	//	if (val[0]=="Sort by price from lowest to highest") {
		//	this.sortBuyingPriceHighToLow(_my_matching_vehicles);
		//	AvailableCarsPage a = new AvailableCarsPage(_my_matching_vehicles);
		//	System.out.println("check");
		//}
		//return null;
	//}


	
	// override
	
	//public String toString() {
	//	String new_str = new String();
	//	new_str = super.toString();
		//new_str = new_str + "Client contracts: /n";
		//for (Contract contract : _my_contracts) {
		//	new_str = new_str + contract.toString();
		//}
		//return new_str;
	//}
	
	
	// getters & setters
	public Contract nextContractGet() {
		Collections.sort(this._my_contracts, new CompareClass.NextContractComparator());
		return this._my_contracts.get(0);
	}
	
	public ArrayList<Contract> get_my_contracts() {
		return _my_contracts;
	}
	public ArrayList<Vehicles> get_vehicles(){
		return _my_matching_vehicles;
	}
	
	
	
	// Advanced methods
	public void displayVehiclesFromSearch(ArrayList<Vehicles> _matching_vehicles) {
		int num = 0;
	    //new  OptionPaneExample(num,0, _matching_vehicles );  
	}
	public ArrayList<Vehicles> sortBuyingPriceHighToLow(ArrayList<Vehicles> _matching_vehicles) {
		int n = _matching_vehicles.size();
		Vehicles temp;
		for (int i = 0; i<n; i++) {
			for (int j=1; j<(n-i); j++) {
				 if (_matching_vehicles.get(j).get_buying_price().compareTo(_matching_vehicles.get(j-1).get_buying_price()) > 0) {
					 temp = _matching_vehicles.get(j-1);
					 _matching_vehicles.set((j-1),_matching_vehicles.get(j));
					 _matching_vehicles.set(j,temp);
				 }
			}
		}
		return _matching_vehicles;
		  
	}

	public void rentVehycleForYear(Vehicles v)
	{
		Contract new_contract = new Contract(v);
		this._my_contracts.add(new_contract);
		v.set_available(false);
	}
	
	public void addContact(Contract c)
	{
		//this._my_contracts = new ArrayList<Contract>();
		this._my_contracts.add(c);
		//insert to file for later use:
		fileAPI api = new fileAPI();
		api.insertContract(this._username, c.getContractID());
		api.insertVehicleWithContract(c.getContractID(),api.getIndexVfVehicleVnVehicleArray(c._vehicle),c._start,c._finish);
		
		//v.set_available(false);
	}
	public void buyVehycle(Vehicles v)
	{
		v.set_available(false);
	}
	
	public void printRentedVehycles()
	{
		for (Iterator iterator = _my_contracts.iterator(); iterator.hasNext();) {
			Contract contract = (Contract) iterator.next();
			//System.out.println((Vehicles) contract._vehicle);
		}
	}
	
}

