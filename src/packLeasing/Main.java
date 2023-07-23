package packLeasing;
import java.awt.Window.Type;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner; //to get input from user

import fileAPI.fileAPI;
//import fileAPI.*;
//import pack1.MyFrame;

public class Main {
	
	
	public static LeasingPatio my_patio = new LeasingPatio();
	
	public static void main(String[] args) {

		LocalDate d1 = LocalDate.now();

		//adding some vehicles to see actual cars in the system:
		Cars vehicle1 =  new Cars("Orange", 0, 80000, "Toyota", "2023 GR86 Special Edition",
				0, "ToyotaOrangeGR.png", Attributes.MOTOR_ELETRIC, Attributes.GEARS_MANUAL, Attributes.ROOF_CLOSED);
		Cars vehicle2 =  new Cars("Gray", 2000, 50000, "Tesla", "2023 Model S",
				0, "TeslaModelSGray.png", Attributes.MOTOR_ELETRIC, Attributes.GEARS_MANUAL, Attributes.ROOF_CLOSED);
		Cars vehicle3 =  new Cars("White", 3000, 70000, "Tesla", "2023 Model Y",
				0, "TeslaModelYWhite.png", Attributes.MOTOR_ELETRIC, Attributes.GEARS_MANUAL, Attributes.ROOF_CLOSED);
		Cars vehicle4 =  new Cars("White", 1000, 75000, "Hyundai", "SONATA",
				0, "hyundai-sonata-2013.png", Attributes.MOTOR_ELETRIC, Attributes.GEARS_MANUAL, Attributes.ROOF_CLOSED);
		Cars vehicle5 =  new Cars("White", 1500, 0, "Tesla", "Model X luxury SUV electric car with open falcon wing doors",
				0, "white-tesla-x-luxury-suv.png", Attributes.MOTOR_ELETRIC, Attributes.GEARS_MANUAL, Attributes.ROOF_CLOSED);
		Cars vehicle6 =  new Cars("Gray", 5000, 110000, "Universal Studios", "Back To The Future Car Model",
				0, "backToTheFutureCar.png", Attributes.MOTOR_ELETRIC, Attributes.GEARS_MANUAL, Attributes.ROOF_CLOSED);
		Cars vehicle7 =  new Cars("Black", 4500, 100000, "DC comics", "Batmobile",
				0, "batmobile.png", Attributes.MOTOR_ELETRIC, Attributes.GEARS_MANUAL, Attributes.ROOF_CLOSED);
		Cars vehicle8 =  new Cars("Off-White", 2500, 60000, "The Walt Disney Company", "Indiana Jones Car Model",
				0, "IndianaJonesCar.png", Attributes.MOTOR_ELETRIC, Attributes.GEARS_MANUAL, Attributes.ROOF_CLOSED);
		
		//creating array that hold all the vehicles:
		ArrayList<Vehicles> _all_vehicles = new ArrayList<Vehicles> ();
		_all_vehicles.add(vehicle1);
		_all_vehicles.add(vehicle2);
		_all_vehicles.add(vehicle3);
		_all_vehicles.add(vehicle4);
		_all_vehicles.add(vehicle5);
		_all_vehicles.add(vehicle6);
		_all_vehicles.add(vehicle7);
		_all_vehicles.add(vehicle8);
		//System.out.println(_all_vehicles);
		Main.my_patio._all_vehicles = _all_vehicles;
		
		
		fileAPI api = new fileAPI();
		api.setVehicleArray(_all_vehicles);//this is a must do not delete
		
		//starting the system by opening the first page - login:
		LoginPage loginpage = new LoginPage(1);

	}
	
	public static void main_Admin() {
		;
	}
	
	public static void main_Client(ArrayList<Vehicles> _all_vehicles) {
		
		Client Client = new Client(null);
		Client.displayVehiclesFromSearch(_all_vehicles);
	}
    
}