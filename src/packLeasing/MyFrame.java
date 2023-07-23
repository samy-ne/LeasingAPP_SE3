package packLeasing;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Iterator;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.ImageIcon;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class MyFrame extends JFrame implements ActionListener {
	Contract returnContract= null;
	int _buyOrRent;
	Client _client;
	
	String[] _options = new String[4];
	ArrayList <Vehicles> _vehicles =new ArrayList<Vehicles>();;
	    JFrame f = new JFrame("Client Search Page"); // set a topic
	    // creates the buttons
	    JButton searchButton = new JButton("SEARCH");
	    //JButton rentButton = new JButton("Rent a car");
	    //JButton buyButton = new JButton("Buy a car");
	    JComboBox comboBox;
	   	JComboBox comboBox1;
	   	JComboBox comboBox2;
	   	JComboBox comboBox3;
		
	    MyFrame() {
	        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        f.setSize(800, 600); // set size
	        f.setLocationRelativeTo(null); // Center the frame on the screen

	        // set a panel
	        JPanel panel = new JPanel() {
	            @Override
	            protected void paintComponent(Graphics g) {
	                super.paintComponent(g);
	                g.setColor(Color.ORANGE);
	                g.fillRect(0, 0, getWidth(), getHeight());
	            }
	        };
	        panel.setLayout(null);

	        // style and add the buttons:

	        int panelWidth = 800;
	        int panelHeight = 600;

	        
	        
	        
	        
	        
	        
	     
	   	 
	        //panel.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        panel.setLayout(new FlowLayout()); 
	   	  
	   	  String[] opt = {"Sort by price from lowest to highest","Sort by price from highest to lowest"};
	   	  String[] opt1 = {"Any color","Red", "Black", "Orange", "White", "Blue", "Gray"};
	   	  String[] opt2 = {"All brands","Toyota","Tesla", "Ford", "Hyundai"};
	   	  String[] opt3 = {"Any Vehicle","Cars", "Motorcycle"};
	   	  comboBox = new JComboBox(opt);
	   	  comboBox.addActionListener(this);
	   	  comboBox1 = new JComboBox(opt1);
	   	  comboBox1.addActionListener(this);
	   	  comboBox2 = new JComboBox(opt2);
	   	  comboBox2.addActionListener(this);
	   	  comboBox3 = new JComboBox(opt3);
	   	  comboBox3.addActionListener(this);
	   	 
	   	panel.add(comboBox);
	   	panel.add(comboBox1);
	   	panel.add(comboBox2);
	   	panel.add(comboBox3);
	   	searchButton.setFont(new Font("Arial", Font.BOLD, 20));
	   	//searchButton.setBounds(5, 5, 250, 550);
        searchButton.addActionListener(this);
        panel.add(searchButton);
	   	//panel.pack();
	   	panel.setVisible(true);
	   	 
	   	 
	   	 
	        

	        ImageIcon backgroundImageIcon = new ImageIcon("back.jpg"); // Replace with the path to your image
	        JLabel backgroundImageLabel = new JLabel(backgroundImageIcon);
	        backgroundImageLabel.setBounds(00, 0, panelWidth, panelHeight);
	        panel.add(backgroundImageLabel);

	        f.add(panel);

	    
	       // f.setVisible(true); // must set as true to see the window
	    }
	    
	    @Override
	   	 public void actionPerformed(ActionEvent e) {
	   	  if(e.getSource()==searchButton) {
	   		 // if (comboBox.getSelectedItem()=="Sort by price from lowest to highest") {
	   			//  if (comboBox1.getSelectedItem()=="Black") {
	   			//  System.out.println(comboBox.getSelectedItem());
	   		//	  }
	   		  //}
	   		  Integer temp = 0;
	   		String[] opt = {"Sort by price from lowest to highest","Sort by price from highest to lowest"};
		   	  String[] opt1 = {"Any color","Red", "Black", "Orange", "White", "Blue", "Gray"};
		   	  String[] opt2 = {"All brands","Toyota","Tesla", "Ford", "Hyundai"};
		   	  String[] opt3 = {"Any Vehicle","Cars", "Motorcycle"};
	   		temp= comboBox.getSelectedIndex();
	   		
			_options[0]=(opt[temp]);
			temp= comboBox1.getSelectedIndex();
	   		
			_options[1]=(opt1[temp]);
			temp= comboBox2.getSelectedIndex();
			System.out.println(temp);
			_options[2]=(opt2[temp]);
			temp= comboBox3.getSelectedIndex();
	   		
			_options[3]=(opt3[temp]);
			System.out.println("****");
			System.out.println(_options[0]);
			System.out.println(_options[3]);
			System.out.println("****");
			
	   		//_options.add((String) comboBox1.getSelectedItem());
	   		//_options.add((String) comboBox2.getSelectedItem());
	   		//_options.add((String) comboBox3.getSelectedItem());
	   		//returnChosenOptions( _options);
	   		  //sortManagment()
			searchOptionManagment(_options);
	   	  }
	    
	
	    }
	    //public ArrayList<String> returnChosenOptions(ArrayList<String> _options){
	    //	return _options;
	    //}
	    
	    public Contract start(ArrayList<Vehicles> vehicles,int buyOrRent) {//1 for rent
	    	//Cars //vehicletrial =  new Cars("White", 0, 0, "Tesla", "Model X luxury SUV electric car with open falcon wing doors",
					//0, "white-tesla-x-luxury-suv-electric-car-with-open-falcon-wing-doors-MXI30574.png", Attributes.MOTOR_ELETRIC, Attributes.GEARS_MANUAL, Attributes.ROOF_CLOSED);
	    	//this._vehicles.add(vehicletrial);
	    	//this._vehicles.add(vehicletrial);
	    	this._vehicles.addAll(vehicles);
	    	this._buyOrRent=buyOrRent;
	    	//this._vehicles=vehicles;
	    	f.setVisible(true);
			return returnContract;
	    }
	    public String[] get_Search_Options() {
	    	return _options;
	    }
	    public ArrayList<Vehicles> get_vehicles() {
	    	return _vehicles;
	    }
	    public Contract searchOptionManagment(String[] val) {
	    	//System.out.println("check1");
	    	//System.out.println(val[0]);
			if (val[0]=="Sort by price from lowest to highest") {
				//sortBuyingPriceLowToHighMyFrame(_vehicles);
				//sortColor(sortBuyingPriceLowToHighMyFrame(_vehicles),val[1]);
				if(_buyOrRent==0) {
					sortType(sortBrand(sortColor( sortBuyingPriceLowToHighMyFrame(_vehicles),val[1]),val[2]),val[3]);
				}else {
					sortType(sortBrand(sortColor( sortRentingPriceLowToHighMyFrame(_vehicles),val[1]),val[2]),val[3]);
				}
				//System.out.println("check done");
				//AvailableCarsPage a = new AvailableCarsPage(_vehicles);
				OptionPaneExample ope=new  OptionPaneExample(0,_buyOrRent, _vehicles,_client);
				 returnContract=ope.getchosen();
				//System.out.println("check2");
				//return returnContract;
				//_vehicles=_vehicles_original;
			}else {
				//sortBuyingPriceHighToLowMyFrame(_vehicles);
				ArrayList<Vehicles> vehicleARR;
				if(_buyOrRent==0) {
					vehicleARR= sortBuyingPriceHighToLowMyFrame(_vehicles);
				}else {
					vehicleARR= sortRentingPriceHighToLowMyFrame(_vehicles);
				}
				//sortColor( vehicleARR,val[1]);
				sortType(sortBrand(sortColor( vehicleARR,val[1]),val[2]),val[3]);
				//AvailableCarsPage a = new AvailableCarsPage(_vehicles);
				OptionPaneExample ope= new  OptionPaneExample(0,_buyOrRent, _vehicles,_client);
				returnContract=ope.getchosen();
				System.out.println("check3");
				//return returnContract;
				//_vehicles=_vehicles_original;
			}
			f.dispose();
			return null;
		}
	    public ArrayList<Vehicles> sortBuyingPriceLowToHighMyFrame(ArrayList<Vehicles> _matching_vehicles) {
			int n = _matching_vehicles.size();
			Vehicles temp;
			for (int i = 0; i<n; i++) {
				for (int j=1; j<(n-i); j++) {
					 if (_matching_vehicles.get(j).get_buying_price().compareTo(_matching_vehicles.get(j-1).get_buying_price()) < 0) {
						 temp = _matching_vehicles.get(j-1);
						 _matching_vehicles.set((j-1),_matching_vehicles.get(j));
						 _matching_vehicles.set(j,temp);
					 }
				}
			}
			return _matching_vehicles;
			  
		}
	    public ArrayList<Vehicles> sortBuyingPriceHighToLowMyFrame(ArrayList<Vehicles> _matching_vehicles) {
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
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    public ArrayList<Vehicles> sortRentingPriceLowToHighMyFrame(ArrayList<Vehicles> _matching_vehicles) {
			int n = _matching_vehicles.size();
			Vehicles temp;
			for (int i = 0; i<n; i++) {
				for (int j=1; j<(n-i); j++) {
					 if (_matching_vehicles.get(j).get_renting_price().compareTo(_matching_vehicles.get(j-1).get_renting_price()) < 0) {
						 temp = _matching_vehicles.get(j-1);
						 _matching_vehicles.set((j-1),_matching_vehicles.get(j));
						 _matching_vehicles.set(j,temp);
					 }
				}
			}
			return _matching_vehicles;
			  
		}
	    public ArrayList<Vehicles> sortRentingPriceHighToLowMyFrame(ArrayList<Vehicles> _matching_vehicles) {
			int n = _matching_vehicles.size();
			Vehicles temp;
			for (int i = 0; i<n; i++) {
				for (int j=1; j<(n-i); j++) {
					 if (_matching_vehicles.get(j).get_renting_price().compareTo(_matching_vehicles.get(j-1).get_renting_price()) > 0) {
						 temp = _matching_vehicles.get(j-1);
						 _matching_vehicles.set((j-1),_matching_vehicles.get(j));
						 _matching_vehicles.set(j,temp);
					 }
				}
			}
			return _matching_vehicles;
			  
		}
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    //ArrayList<Vehicles> matching_colors;
	    public ArrayList<Vehicles> sortColor(ArrayList<Vehicles> _matchingVehicles, String color) {
			//int n = _matching_vehicles.size();
	    	Vehicles vehicle;
			ArrayList<Vehicles> matching_colors =  _matchingVehicles;
			Iterator<Vehicles> it = matching_colors.iterator();
			if (color=="Any color") {
				return _matchingVehicles;
			}
			while (it.hasNext()) {
				
				vehicle =it.next();
				if(vehicle.get_color()!=color) {
					it.remove();
				
				
			}
			
			  
		}
			return matching_colors;
	    }
	    public ArrayList<Vehicles> sortBrand(ArrayList<Vehicles> _matchingVehicles, String color) {
			//int n = _matching_vehicles.size();
	    	Vehicles vehicle;
			ArrayList<Vehicles> matching_colors =  _matchingVehicles;
			Iterator<Vehicles> it = matching_colors.iterator();
			if (color=="All brands") {
				return _matchingVehicles;
			}
			while (it.hasNext()) {
				
				vehicle =it.next();
				if(vehicle.get_brand()!=color) {
					it.remove();
				
				
			}
			
			  
		}
			return matching_colors;
	    }
	    public ArrayList<Vehicles> sortType(ArrayList<Vehicles> _matchingVehicles, String type) {
			//int n = _matching_vehicles.size();
	    	Vehicles vehicle;
	    	Cars car;
	    	String string1;
			ArrayList<Vehicles> matching_colors =  _matchingVehicles;
			Iterator<Vehicles> it = matching_colors.iterator();
			//System.out.println("checkkkbbbbbbbbbbbbbbkk");
			if (type=="Any Vehicle") {
				//System.out.println("checkkkkkttttttttt");
				return _matchingVehicles;
			}
			if (type=="Cars") {
			while (it.hasNext()) {
				
				//vehicle =it.next();
				//string1 = (vehicle.getClass()).toString();
				//System.out.println(string1);
				if( it.next() instanceof Motorcycle)  {
					System.out.println("inside Motorcycle");
					it.remove();
				
				
			}
			}
			}
			if (type=="Motorcycle") {
				while (it.hasNext()) {
					
					//vehicle =it.next();
					//string1 = (vehicle.getClass()).toString();
					//System.out.println(string1);
					if( it.next() instanceof Cars)  {
						System.out.println("inside Motorcycle");
						it.remove();
					
					
				}
				}
			  
		}
			
	    
			return matching_colors;
	    }

		public Contract getContract() {
			// TODO Auto-generated method stub
			return returnContract;
		}

		public Contract start(ArrayList<Vehicles> vehicles,int buyOrRent, Client client) {
	    	//Cars //vehicletrial =  new Cars("White", 0, 0, "Tesla", "Model X luxury SUV electric car with open falcon wing doors",
					//0, "white-tesla-x-luxury-suv-electric-car-with-open-falcon-wing-doors-MXI30574.png", Attributes.MOTOR_ELETRIC, Attributes.GEARS_MANUAL, Attributes.ROOF_CLOSED);
	    	//this._vehicles.add(vehicletrial);
	    	//this._vehicles.add(vehicletrial);
	    	this._vehicles.addAll(vehicles);
	    	this._buyOrRent=buyOrRent;
	    	this._client=client;
	    	//this._vehicles=vehicles;
	    	f.setVisible(true);
			return returnContract;
		}
	    
}
