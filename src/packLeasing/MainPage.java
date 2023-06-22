package packLeasing;

import java.awt.*;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.ImageIcon;

public class MainPage {
    JFrame f = new JFrame("Client Page"); // set a topic
    // creates the buttons
    JButton checkButton = new JButton("Check my Cars");
    JButton rentButton = new JButton("Rent Car");
    JButton buyButton = new JButton("Buy Car");

    MainPage() {
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(800, 800); // set size
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
        int panelHeight = 350;
        panel.setBounds((f.getWidth() - panelWidth) / 2, (f.getHeight() - panelHeight) / 2, panelWidth, panelHeight);

        checkButton.setFont(new Font("Arial", Font.BOLD, 20));
        checkButton.setBounds(0, 10, 250, 350);
        panel.add(checkButton);

        rentButton.setFont(new Font("Arial", Font.BOLD, 20));
        rentButton.setBounds(275,10,250,350);
        panel.add(rentButton);

        buyButton.setFont(new Font("Arial", Font.BOLD, 20));
        buyButton.setBounds(550,10,250,350);
        panel.add(buyButton);

        ImageIcon backgroundImageIcon = new ImageIcon("C:\\Users\\User\\eclipse-workspace\\LeasingAPP_SE3\\src\\packLeasing\\images\\back.jpg"); // Replace with the path to your image
        JLabel backgroundImageLabel = new JLabel(backgroundImageIcon);
        backgroundImageLabel.setBounds(0, 370, 800, 380);
        panel.add(backgroundImageLabel);

        f.add(panel);

        f.setVisible(true); // must set as true to see the window
    }
}
