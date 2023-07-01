package packLeasing;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner; //to get input from user

public class Main {
	
	
	//public static Scanner input = new Scanner(System.in); //Create a Scanner object
	
	
	public static void main(String[] args) {
		
		//LoginPage loginpage = new LoginPage(1);
		//ListOfClientsPage hi = new ListOfClientsPage();
		
		LeasingPatio my_patio = new LeasingPatio();
		
		Collections.sort(my_patio._all_vehicles, new CompareClass.PriceComparator());
		Cars vehicle1 =  new Cars("Orange", 0, 800000, "Toyota", "2023 GR86 Special Edition",
				0, "ToyotaGR86Resized.png", Attributes.MOTOR_ELETRIC, Attributes.GEARS_MANUAL, Attributes.ROOF_CLOSED);
		Cars vehicle2 =  new Cars("Gray", 0, 800000, "Telsa", "2023 Model S",
				0, "TeslaModelSGrayResized.png", Attributes.MOTOR_ELETRIC, Attributes.GEARS_MANUAL, Attributes.ROOF_CLOSED);
		Cars vehicle3 =  new Cars("White", 0, 800000, "Tesla", "2023 Model Y",
				0, "TeslaModelYWhiteResized.png", Attributes.MOTOR_ELETRIC, Attributes.GEARS_MANUAL, Attributes.ROOF_CLOSED);
		ArrayList<Vehicles> _all_vehicles = new ArrayList<Vehicles> ();
		_all_vehicles.add(vehicle1);
		_all_vehicles.add(vehicle2);
		_all_vehicles.add(vehicle3);
		main_Client(_all_vehicles);
	}
	
	public static void main_Admin() {
		;
	}
	
	public static void main_Client(ArrayList<Vehicles> _all_vehicles) {
		Client Client = new Client(null);
		Client.displayVehiclesFromSearch(_all_vehicles);
	}
    
}
