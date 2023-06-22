package packLeasing;

import java.util.Collections;


public class Main {
	public static void main(String[] args) {
		
		
		LoginPage loginPage = new LoginPage(1);
		
		LeasingPatio my_patio = new LeasingPatio();
		
		Collections.sort(my_patio._all_vehicles, new CompareClass.PriceComparator());
		
		

	}
	
	public static void main_Admin() {		
		;
	}
	
	public static void main_Client() {
		;
	}
	
}
