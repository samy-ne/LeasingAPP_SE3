package packLeasing;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.ImageIcon;

public class AdminMainPage implements ActionListener {
    JFrame f = new JFrame("Admin Page"); // set a topic
    // creates the buttons
    JButton carsButton = new JButton("Cars details");
    JButton cleintsButton = new JButton("Client details");
    JButton sellButton = new JButton("Sell a car");
    JButton buyButton = new JButton("Buy new cars");

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

        cleintsButton.setFont(new Font("Arial", Font.BOLD, 20));
        cleintsButton.setBounds(200,5,190,550);
        cleintsButton.addActionListener(this);
        panel.add(cleintsButton);

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
			f.dispose();
			//ClientDataPage clientDataPage = new ClientDataPage
		}
		if (e.getSource()==cleintsButton) {
			f.dispose();
			//ClientBuyPage clientBuyPage = new ClientBuyPage
		}
		if (e.getSource()==sellButton) {
			f.dispose();
			//ClientRentPage clientRentPage = new ClientRentPage
		}
		if (e.getSource()==buyButton) {
			f.dispose();
			//ClientRentPage clientRentPage = new ClientRentPage
		}
		
	}
    
}
