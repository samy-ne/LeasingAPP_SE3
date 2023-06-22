package packLeasing;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.ImageIcon;

public class ClientMainPage implements ActionListener {
    JFrame f = new JFrame("Client Page"); // set a topic
    // creates the buttons
    JButton checkButton = new JButton("Check my cars");
    JButton rentButton = new JButton("Rent a car");
    JButton buyButton = new JButton("Buy a car");

    ClientMainPage() {
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
        panel.setBounds((f.getWidth() - panelWidth) / 2, (f.getHeight() - panelHeight) / 2, panelWidth, panelHeight);

        checkButton.setFont(new Font("Arial", Font.BOLD, 20));
        checkButton.setBounds(5, 5, 250, 550);
        checkButton.addActionListener(this);
        panel.add(checkButton);

        rentButton.setFont(new Font("Arial", Font.BOLD, 20));
        rentButton.setBounds(275,5,250,550);
        rentButton.addActionListener(this);
        panel.add(rentButton);

        buyButton.setFont(new Font("Arial", Font.BOLD, 20));
        buyButton.setBounds(550,5,250,550);
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
		if (e.getSource()==checkButton) {
			f.dispose();
			//ClientDataPage clientDataPage = new ClientDataPage
		}
		if (e.getSource()==buyButton) {
			f.dispose();
			//ClientBuyPage clientBuyPage = new ClientBuyPage
		}
		if (e.getSource()==rentButton) {
			f.dispose();
			//ClientRentPage clientRentPage = new ClientRentPage
		}
		
	}
    
}
