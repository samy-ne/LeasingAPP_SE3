package packLeasing;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner; //to get input from user

import fileAPI.fileAPI;
//import fileAPI.*;
//import pack1.MyFrame;

public class Main {
	
	public static LeasingPatio my_patio = new LeasingPatio();
	
	
	//public static Scanner input = new Scanner(System.in); //Create a Scanner object
	//stam 
	
	public static void main(String[] args) {
		//fileAPI api = new fileAPI();
		//api.returnUserPasswordMap().toString();
		//api.insertNewUser("kaka", "123123");
		
		
		//ArrayList<Vehicles> vehicles= my_patio.get_all_vehicles();
		
		

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
		System.out.println(vehicle4.get_id());
		System.out.println(vehicle5.get_id());
		ArrayList<Vehicles> _all_vehicles = new ArrayList<Vehicles> ();
		_all_vehicles.add(vehicle1);
		_all_vehicles.add(vehicle2);
		_all_vehicles.add(vehicle3);
		_all_vehicles.add(vehicle4);
		_all_vehicles.add(vehicle5);
		_all_vehicles.add(vehicle6);
		_all_vehicles.add(vehicle7);
		_all_vehicles.add(vehicle8);
		
		Main.my_patio._all_vehicles = _all_vehicles;
 
		
		
		LoginPage loginpage = new LoginPage(1);
		//ListOfClientsPage hi = new ListOfClientsPage();
		/*Cars vehicle1 =  new Cars("Orange", 0, 80000, "Toyota", "2023 GR86 Special Edition",
				0, "ToyotaGR86Resized.png", Attributes.MOTOR_ELETRIC, Attributes.GEARS_MANUAL, Attributes.ROOF_CLOSED);
		Cars vehicle2 =  new Cars("Gray", 2000, 50000, "Tesla", "2023 Model S",
				0, "TeslaModelSGrayResized.png", Attributes.MOTOR_ELETRIC, Attributes.GEARS_MANUAL, Attributes.ROOF_CLOSED);
		Cars vehicle3 =  new Cars("White", 3000, 70000, "Tesla", "2023 Model Y",
				0, "TeslaModelYWhiteResized.png", Attributes.MOTOR_ELETRIC, Attributes.GEARS_MANUAL, Attributes.ROOF_CLOSED);
		Cars vehicle4 =  new Cars("White", 1000, 75000, "Hyundai", "SONATA",
				0, "png-clipart-2015-hyundai-accent-car-2013-hyundai-sonata-2013-hyundai-accent-hyundai-compact-car-sedan.png", Attributes.MOTOR_ELETRIC, Attributes.GEARS_MANUAL, Attributes.ROOF_CLOSED);
		Cars vehicle5 =  new Cars("White", 1500, 0, "Tesla", "Model X luxury SUV electric car with open falcon wing doors",
				0, "white-tesla-x-luxury-suv-electric-car-with-open-falcon-wing-doors-MXI30574.png", Attributes.MOTOR_ELETRIC, Attributes.GEARS_MANUAL, Attributes.ROOF_CLOSED);
		//System.out.println(vehicle4.get_id());
		//System.out.println(vehicle5.get_id());
		ArrayList<Vehicles> _all_vehicles = new ArrayList<Vehicles> ();
		_all_vehicles.add(vehicle1);
		_all_vehicles.add(vehicle2);
		_all_vehicles.add(vehicle3);
		_all_vehicles.add(vehicle4);
		_all_vehicles.add(vehicle5);
		//Client Clientsample = new Client(my_patio.get_all_vehicles());
		
		
		
		
		
		//Integer num =0;
		//while (num==0) {
			//Clientsample.searchOptionManagment();
		//}
		//Clientsample.searchOptionManagment();
		//Clientsample.sortBuyingPriceHighToLow(_all_vehicles);
		//Clientsample.displayVehiclesFromSearch(_all_vehicles);
		//main_Client(_all_vehicles);
		//ListOfClientsPage c =new ListOfClientsPage();
		//MyFrame frameSearch = new MyFrame();
		//frameSearch.start(my_patio.get_all_vehicles());
		//String[] returnVal =frameSearch.get_Search_Options();
		
		//AvailableCarsPage a = new AvailableCarsPage(_all_vehicles);
	    // login~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~       
		//static final Integer NoSuchUser = 0 ;
		//static final Integer Admin = 1;
		//static final Integer Client = 2;
		//static final Integer Worker = 3;
//	    Login login = new Login();
//	    boolean authenticated = false;
//	    Scanner scanner = new Scanner(System.in);
//	    
//	    login.readUserAndPasswordsFromFile("usernames_passwords.txt");
//	    login.printUserAndPass();
//	    
//	    fileAPI api = new fileAPI();
//	    
//	    while (!authenticated) {
//	        // Get username and password from the user
//	        System.out.print("Enter username: ");
//	        String username = scanner.nextLine();
//	        System.out.print("Enter password: ");
//	        String password = scanner.nextLine();
//	        authenticated = login.verifyPassword(username, password);
//
//	        if (authenticated) {
//	            int userType = login.getUserType(username);
//
//	            if (userType==Attributes.ADMIN) {
//	            	 // TODO AdminWindow(); 	  
//	            	System.out.println("progress");
//	            } 
//	            else if (userType==Attributes.CLIENT) {
//	            	// TODO ClientWindow();
//
//	            	  ClientMainPage Clientsample = new ClientMainPage();
//	          		          		
//	          		//ClientMainPage b = new ClientMainPage();	          		
//	          		
//	          		String[] val =Clientsample.start(_all_vehicles);
//	            } 
//	            else if (userType==Attributes.WORKER) {
//	            	 // TODO WorkerWindow();
//	            }
//	        } else {
//	        	// TODO window of "Wrong username or password. Please try again.");
//	        }
//	    }
//	    // login~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~      
//	  ;
		
		
		//LeasingPatio my_patio = new LeasingPatio();
		
		Collections.sort(my_patio._all_vehicles, new CompareClass.PriceComparator());
		//Cars vehicle1 =  new Cars("Orange", 0, 800000, "Toyota", "2023 GR86 Special Edition",
			//	0, "ToyotaGR86Resized.png", Attributes.MOTOR_ELETRIC, Attributes.GEARS_MANUAL, Attributes.ROOF_CLOSED);
		//Cars vehicle2 =  new Cars("Gray", 0, 800000, "Telsa", "2023 Model S",
				//0, "TeslaModelSGrayResized.png", Attributes.MOTOR_ELETRIC, Attributes.GEARS_MANUAL, Attributes.ROOF_CLOSED);
		//Cars vehicle3 =  new Cars("White", 0, 800000, "Tesla", "2023 Model Y",
				//0, "TeslaModelYWhiteResized.png", Attributes.MOTOR_ELETRIC, Attributes.GEARS_MANUAL, Attributes.ROOF_CLOSED);
		//ArrayList<Vehicles> _all_vehicles = new ArrayList<Vehicles> ();
		//_all_vehicles.add(vehicle1);
		//_all_vehicles.add(vehicle2);
		//_all_vehicles.add(vehicle3);
		main_Client(_all_vehicles);*/
	}
	
	public static void main_Admin() {
		;
	}
	
	public static void main_Client(ArrayList<Vehicles> _all_vehicles) {
		
		Client Client = new Client(null);
		Client.displayVehiclesFromSearch(_all_vehicles);
	}
    
}