package packLeasing;
import javax.swing.*;  
import java.awt.event.*;
import java.util.ArrayList;
public class OptionPaneExample extends WindowAdapter{  


	JFrame f; 
	Object[] options = { "< Previous >", "< Buy >", "< Next >"};
	String[] ImageArray= { "car1.png","car2.png","car3.png"};

	
	
	OptionPaneExample(int num,ArrayList<Vehicles> _matching_vehicles){  
		Vehicles vehicle=_matching_vehicles.get(num);
		Icon carImage1 = new ImageIcon(vehicle.get_image_path());
		int a =JOptionPane.showOptionDialog(f, vehicle.get_brand()+ "\n " + vehicle.get_model(), "Search Results",JOptionPane.DEFAULT_OPTION, 
				JOptionPane.QUESTION_MESSAGE,carImage1,
				options, options[0]); 
		if(a==JOptionPane.YES_OPTION){  
			num = num -1;
			new OptionPaneExample(num,_matching_vehicles);  
		}  
		if(a==JOptionPane.NO_OPTION){  
		      
			int input = JOptionPane.showConfirmDialog(null, "Are you sure you want to buy this product?");
			if(input==JOptionPane.YES_OPTION) {
			    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			}
			new OptionPaneExample(num,_matching_vehicles);
		}
		if(a==JOptionPane.CANCEL_OPTION){ 
			num = num +1;
			new OptionPaneExample(num,_matching_vehicles);}  
		}  
	 
	  
	
	
	    
	}

