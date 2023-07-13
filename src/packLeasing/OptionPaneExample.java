package packLeasing;
import javax.swing.*;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.*;
import java.util.ArrayList;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
public class OptionPaneExample extends WindowAdapter{  

 
	JFrame f;
	//f.setBounds(100, 100, 450, 300);
	Object[] options = { "< Previous >", "< Buy >", "< Next >"};
	String[] ImageArray= { "car1.png","car2.png","car3.png"};

	
	
	OptionPaneExample(int num,int buyOrRent, ArrayList<Vehicles> _matching_vehicles){  
		Vehicles vehicle=_matching_vehicles.get(num);
		Icon carImage1 = new ImageIcon(vehicle.get_image_path());
		//JLabel BrandLabel = new JLabel(vehicle.get_brand());
		//BrandLabel.setFont (new java.awt.Font("Arial", java.awt.Font.BOLD, 22));
		
		
		
		//JLabel BrandLabel = new JLabel(vehicle.get_brand());
		//BrandLabel.setBounds(100,100,450,300);
	    //JTextField txt=new JTextField("add");
	    //BrandLabel.setFont (new Font("Arial", Font.BOLD, 22));
	    //f.setVisible(true);
	    JLabel label = new JLabel("MESSAGE");
	    label.setFont(new Font("Arial", Font.BOLD, 18));
	    JLabel string1=new JLabel("Some Text");
	    int a;
	    if (buyOrRent==0) {
	    	if (vehicle.get_buying_price()==0) {
	    	a =JOptionPane.showOptionDialog(f, vehicle.get_brand()+  "\n "+ vehicle.get_color()
			+  "\n "+vehicle.get_model()+"\n"+"Not for buying, but match other prefrences" +"\n"+"Age: "+vehicle.get_age(), "Search Results",JOptionPane.DEFAULT_OPTION, 
					JOptionPane.QUESTION_MESSAGE,carImage1,
					options, options[0]);
	    	}else {
	    		a =JOptionPane.showOptionDialog(f, vehicle.get_brand()+  "\n "+ vehicle.get_color()
				+  "\n "+vehicle.get_model()+"\n"+"Buying Price: " + vehicle.get_buying_price()+"\n"+"Age: "+vehicle.get_age(), "Search Results",JOptionPane.DEFAULT_OPTION, 
						JOptionPane.QUESTION_MESSAGE,carImage1,
						options, options[0]);
	    	}
	    	
	    }else {
	    	if (vehicle.get_renting_price()==0) {
		    	a =JOptionPane.showOptionDialog(f, vehicle.get_brand()+  "\n "+ vehicle.get_color()
				+  "\n "+vehicle.get_model()+"\n"+"Not for renting, but match other prefrences" +"\n"+"Age: "+vehicle.get_age(), "Search Results",JOptionPane.DEFAULT_OPTION, 
						JOptionPane.QUESTION_MESSAGE,carImage1,
						options, options[0]);
	    	}else {
			a =JOptionPane.showOptionDialog(f, vehicle.get_brand()+  "\n "+ vehicle.get_color()
			+  "\n "+vehicle.get_model()+"\n"+"Rent Price: " + vehicle.get_renting_price()+"\n" +"Age: "+vehicle.get_age(), "Search Results",JOptionPane.DEFAULT_OPTION, 
					JOptionPane.QUESTION_MESSAGE,carImage1,
					options, options[0]);
	    	}
	    }

	    string1.setBounds(100,100,450,300);
	    JTextField txt=new JTextField("add");
	    string1.setFont (new Font("Arial", Font.BOLD, 80));
	    string1.setForeground(Color.RED);
	    //string1.getText()
    
	    
		
		
		//string1.setFont (new Font("Arial", Font.BOLD, 40));
		//f.add(string1);
		if(a==JOptionPane.YES_OPTION){  
			num = num -1;
			new OptionPaneExample(num,buyOrRent,_matching_vehicles);  
		}  
		if(a==JOptionPane.NO_OPTION){  
		      
			int input = JOptionPane.showConfirmDialog(null, "Are you sure you want to buy this product?");
			if(input==JOptionPane.YES_OPTION) {
			    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			}
			new OptionPaneExample(num,buyOrRent,_matching_vehicles);
		}
		if(a==JOptionPane.CANCEL_OPTION){ 
			num = num +1;
			OptionPaneExample jopt = new OptionPaneExample(num,buyOrRent,_matching_vehicles);
			}  
		}  
	 
	  
	
	
	    
	}

