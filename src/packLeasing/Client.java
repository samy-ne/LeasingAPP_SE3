package packLeasing;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

import javax.swing.*;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.*;
import java.util.ArrayList;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;


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
			System.out.println((Vehicles) contract._vehicle);
		}
	}
	
}

