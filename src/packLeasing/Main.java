package packLeasing;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner; //to get input from user

public class Main {
	public static Scanner input = new Scanner(System.in); //Create a Scanner object
	
	
	public static void main(String[] args) {
	    // login~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~       
		//static final Integer NoSuchUser = 0 ;
		//static final Integer Admin = 1;
		//static final Integer Client = 2;
		//static final Integer Worker = 3;
	    Login login = new Login();
	    boolean authenticated = false;
	    Scanner scanner = new Scanner(System.in);

	    login.readUserAndPasswordsFromFile("usernames_passwords.txt");

	    while (!authenticated) {
	        // Get username and password from the user
	        System.out.print("Enter username: ");
	        String username = scanner.nextLine();
	        System.out.print("Enter password: ");
	        String password = scanner.nextLine();

	        authenticated = login.verifyPassword(username, password);

	        if (authenticated) {
	            int userType = login.getUserType(username);

	            if (userType==Attributes.ADMIN) {
	            	 // TODO AdminWindow(); 
	            } 
	            else if (userType==Attributes.CLIENT) {
	            	// TODO ClientWindow();
	            } 
	            else if (userType==Attributes.WORKER) {
	            	 // TODO WorkerWindow();
	            }
	        } else {
	        	// TODO window of "Wrong username or password. Please try again.");
	        }
	    }
	    // login~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~      
		
		
		
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
