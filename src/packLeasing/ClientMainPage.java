package packLeasing;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.ImageIcon;

public class ClientMainPage implements ActionListener {
	Attributes Attributes = null;
	Client client ;//= new Client();
    JFrame f = new JFrame("Client Page"); // set a topic
    // creates the buttons
    JButton checkButton = new JButton("My rented vehicles");
    JButton rentButton = new JButton("Rent a car");
    JButton buyButton = new JButton("Buy a car");
    ArrayList <Vehicles> _vehicles;
    
    ClientMainPage(String username,String password) {
    	this.client = new Client(username,password);
    	
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

        checkButton.setFont(new Font("Arial", Font.BOLD, 20));
        checkButton.setBounds(5, 5, 250, 50);
        checkButton.addActionListener(this);
        panel.add(checkButton);

        rentButton.setFont(new Font("Arial", Font.BOLD, 20));
        rentButton.setBounds(267,5,250,50);
        rentButton.addActionListener(this);
        panel.add(rentButton);

        buyButton.setFont(new Font("Arial", Font.BOLD, 20));
        buyButton.setBounds(530,5,250,50);
        buyButton.addActionListener(this);
        panel.add(buyButton);

        ImageIcon backgroundImageIcon = new ImageIcon("back.jpg"); // Replace with the path to your image
        JLabel backgroundImageLabel = new JLabel(backgroundImageIcon);
        backgroundImageLabel.setBounds(00, 0, panelWidth, panelHeight);
        panel.add(backgroundImageLabel);

        f.add(panel);

        f.setVisible(true); // must set as true to see the window
    }
    
    String[] returnVal= null;
    Contract cont = null;
    @Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource()==checkButton) {

			new DisplayContracts(0,1,client.get_my_contracts());

		}
		if (e.getSource()==buyButton) {
			//f.dispose();
			MyFrame frameSearch = new MyFrame();
			cont = frameSearch.start(_vehicles,0);

		}
		if (e.getSource()==rentButton) {
			//f.dispose();
			MyFrame frameSearch = new MyFrame();
			cont = frameSearch.start(_vehicles,1,client);

			
			//System.out.println("ssssssssssssssssssssssssssssss");

		}
		
	}
    public String[] start( ArrayList<Vehicles> vehicles) {
    	this._vehicles=(Main.my_patio._all_vehicles);
    	//AvailableCarsPage a = new AvailableCarsPage(_vehicles);
    	f.setVisible(true);
    	return returnVal;
    }
    public ArrayList<Vehicles> get_vehicles() {
    	return _vehicles;
    }
 
    
}
