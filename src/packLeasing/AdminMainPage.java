package packLeasing;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Iterator;
import java.util.NoSuchElementException;

import javax.swing.*;  
import java.awt.event.*;


public class AdminMainPage extends WindowAdapter implements ActionListener {
    JFrame f = new JFrame("Admin Page"); // set a topic
    // creates the buttons
    JButton carsButton = new JButton("View all cars");
    JButton buyButton = new JButton("Add a vehicle to list");
    Vehicles _new_vehicle;
	Object[] options = { "< Quit >", "< Next >"};
	Object[] options2 = { "< Quit >", "< Next >", "< Sell >"};


    AdminMainPage() {
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

        //Button to view all the cars in the system: 
        carsButton.setFont(new Font("Arial", Font.BOLD, 20));
        carsButton.setBounds(5, 5, 250, 100);
        carsButton.addActionListener(this);
        panel.add(carsButton);

        //Button to add a new car: 
        buyButton.setFont(new Font("Arial", Font.BOLD, 20));
        buyButton.setBounds(530,5,250,100);
        buyButton.addActionListener(this);
        panel.add(buyButton);

        ImageIcon backgroundImageIcon = new ImageIcon("back2.jpg"); // Replace with the path to your image
        JLabel backgroundImageLabel = new JLabel(backgroundImageIcon);
        backgroundImageLabel.setBounds(00, 0, panelWidth, panelHeight);
        panel.add(backgroundImageLabel);

        f.add(panel);
    
        f.setVisible(true); // must set as true to see the window
    }
    
    @Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource()==carsButton) {
			//System.out.println(Main.my_patio._all_vehicles.get(8).toString());
			f.dispose();
			admin_print();
			AdminMainPage backToAdminPage = new AdminMainPage();
			//ClientDataPage clientDataPage = new ClientDataPage
		}
//		
		if (e.getSource()==buyButton) {
			f.dispose();
			AddVehiclePageNew addCar = new AddVehiclePageNew();
			addCar.start(Main.my_patio._all_vehicles);
			
			//System.out.println("stammm");
			
		}
				
	}
    
    
    public Vehicles getVehicle() {
    	return _new_vehicle;
    }
    
    
    public void admin_print() {
    	try{for (Iterator iterator = Main.my_patio._all_vehicles.iterator(); iterator.hasNext();) {
			Vehicles vehicle = (Vehicles) iterator.next();;
			if(vehicle==null) {vehicle = (Vehicles) iterator.next();}
			//System.out.println(Main.my_patio._all_vehicles.size());
			//System.out.println(vehicle.toString());
			//System.out.println(Main.my_patio._all_vehicles.size());
			Icon carImage1 = new ImageIcon(vehicle.get_image_path());
			int a =JOptionPane.showOptionDialog(f, vehicle, "Search",JOptionPane.DEFAULT_OPTION, 
					JOptionPane.QUESTION_MESSAGE,carImage1,
					options, options[0]); 
			if(a==0){  
			    break;  
			}  
		}
    	}catch(IndexOutOfBoundsException e) 
    	{
    		JOptionPane.showMessageDialog(null,"Not available.");
    		System.out.println(e);
    	}catch(NoSuchElementException e) 
    	{
    		JOptionPane.showMessageDialog(null,"Not available.");
    		System.out.println(e);
    	}
    	
    }
    
    
    public void sell() {
    	for (Iterator iterator = Main.my_patio._all_vehicles.iterator(); iterator.hasNext();) {
			Vehicles vehicle = (Vehicles) iterator.next();;
			//System.out.println(Main.my_patio._all_vehicles.get(9).toString());
			//if(vehicle==null) {vehicle = (Vehicles) iterator.next();}
			Icon carImage1 = new ImageIcon(vehicle.get_image_path());
			int a =JOptionPane.showOptionDialog(f, vehicle, "Search",JOptionPane.DEFAULT_OPTION, 
					JOptionPane.QUESTION_MESSAGE,carImage1,
					options2, options2[2]); 
			if(a==0){  
			    break;  
			}
			if(a==2){  
				iterator.remove(); 
			}  
		}
    }
    


    
}
