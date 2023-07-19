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
public class DisplayContracts extends WindowAdapter{  

 
	//JFrame f;
	//f.setBounds(100, 100, 450, 300);
	Object[] options = { "< Previous >", "< View contract's detail >", "< Next >"};
	String[] ImageArray= { "car1.png","car2.png","car3.png"};
	public Contract contractvar;

	
	
	DisplayContracts(int num,int buyOrRent, ArrayList<Contract> _contracts){  
		JFrame f = null;
		
		//Contract contractvar = null;
		try{
			Contract contract =_contracts.get(num);
			Vehicles vehicle=contract.get_vehicle();
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
			+  "\n "+vehicle.get_model()+"\n"+"Not for buying, but match other prefrences" +"\n"+"Renting Price: " + vehicle.get_renting_price()+"\n"+"Age: "+vehicle.get_age(), "Search Results",JOptionPane.DEFAULT_OPTION, 
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
				+  "\n "+vehicle.get_model()+"\n"+"Not for renting, but match other prefrences" +"\n"+"Buying Price: " + vehicle.get_buying_price()+"\n"+"Age: "+vehicle.get_age(), "Search Results",JOptionPane.DEFAULT_OPTION, 
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
			new DisplayContracts(num,buyOrRent,_contracts);  
		}  
		if(a==JOptionPane.NO_OPTION){  
		      
			 JOptionPane.showMessageDialog(null,contract.getDate());     
			//new DisplayContracts(num,buyOrRent,_contracts);
		}
		if(a==JOptionPane.CANCEL_OPTION){ 
			num = num +1;
			DisplayContracts jopt = new DisplayContracts(num,buyOrRent,_contracts);
			}  
		
	}catch(IndexOutOfBoundsException e) 
	{
		System.out.println(e);
	}catch(NullPointerException e) {
		System.out.println("Not avialable");
		JOptionPane.showMessageDialog(null,"You don't have any rented vehicles yet.");  
	}  
	
	
	    
	}



	public Contract getchosen() {
		
		// TODO Auto-generated method stub
		return contractvar;
	}
}