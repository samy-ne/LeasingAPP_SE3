package packLeasing;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Iterator;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.ImageIcon;

import javax.swing.*;  
import java.awt.event.*;


public class AdminMainPage extends WindowAdapter implements ActionListener {
    JFrame f = new JFrame("Admin Page"); // set a topic
    // creates the buttons
    JButton carsButton = new JButton("Cars details");
//    JButton clientsButton = new JButton("Client details");
    JButton sellButton = new JButton("Sell a car");
    JButton buyButton = new JButton("Buy new cars");
    
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

        carsButton.setFont(new Font("Arial", Font.BOLD, 20));
        carsButton.setBounds(5, 5, 190, 550);
        carsButton.addActionListener(this);
        panel.add(carsButton);

//        clientsButton.setFont(new Font("Arial", Font.BOLD, 20));
//        clientsButton.setBounds(200,5,190,550);
//        clientsButton.addActionListener(this);
//        panel.add(clientsButton);

        sellButton.setFont(new Font("Arial", Font.BOLD, 20));
        sellButton.setBounds(395,5,190,550);
        sellButton.addActionListener(this);
        panel.add(sellButton);
        
        buyButton.setFont(new Font("Arial", Font.BOLD, 20));
        buyButton.setBounds(590,5,190,550);
        buyButton.addActionListener(this);
        panel.add(buyButton);

        ImageIcon backgroundImageIcon = new ImageIcon("C:\\Users\\User\\eclipse-workspace\\LeasingAPP_SE3\\src\\packLeasing\\images\\back.jpg"); // Replace with the path to your image
        JLabel backgroundImageLabel = new JLabel(backgroundImageIcon);
        backgroundImageLabel.setBounds(00, 0, panelWidth, panelHeight);
        panel.add(backgroundImageLabel);

        f.add(panel);

    
        f.setVisible(true); // must set as true to see the window
    }
    
    @Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource()==carsButton) {
			admin_print();
			f.dispose();
			//ClientDataPage clientDataPage = new ClientDataPage
		}
//		if (e.getSource()==clientsButton) {
//			f.dispose();
//			//ListOfClientsPage clientList = new ListOfClientsPage(***insert the clients vector***);
//		}
		if (e.getSource()==sellButton) {
			sell();
			f.dispose();
			//ClientRentPage clientRentPage = new ClientRentPage
		}
		if (e.getSource()==buyButton) {
			f.dispose();
			//ClientRentPage clientRentPage = new ClientRentPage
		}
		
		LoginPage l1 = new LoginPage(1);
		
	}
    
    public void admin_print() {
    	for (Iterator iterator = Main.my_patio._all_vehicles.iterator(); iterator.hasNext();) {
			Vehicles vehicle = (Vehicles) iterator.next();;
			
			
			Icon carImage1 = new ImageIcon(vehicle.get_image_path());
			int a =JOptionPane.showOptionDialog(f, vehicle, "Search",JOptionPane.DEFAULT_OPTION, 
					JOptionPane.QUESTION_MESSAGE,carImage1,
					options, options[0]); 
			if(a==0){  
			    break;  
			}  
		}
    }
    
    
    public void sell() {
    	for (Iterator iterator = Main.my_patio._all_vehicles.iterator(); iterator.hasNext();) {
			Vehicles vehicle = (Vehicles) iterator.next();;
			
			
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
