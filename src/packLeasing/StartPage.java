package packLeasing;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

//crating a simple window with Java Swing. 

public class StartPage implements ActionListener {

	JFrame f = new JFrame("rent a car");	 //set a topic
	JButton b = new JButton("pres to start");

	StartPage(){

		f.setVisible(true);		//must set as true to see the window
		f.setSize(600,600);		//size of the page - (width,length) 
		f.setLayout(null);
		
		
		//setting buttons:
		b.setBounds(210, 50, 150, 50);
		b.addActionListener(this);
		f.add(b);
		
		// Adding an image:
        ImageIcon imageIcon = new ImageIcon("C:\\Users\\User\\eclipse-workspace\\LeasingAPP_SE3\\src\\packLeasing\\images\\openScreen.jpg"); // Replace with the actual path to your image
        JLabel imageLabel = new JLabel(imageIcon);
        imageLabel.setBounds(5, 5, 570, 550);
        f.add(imageLabel);
        
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()== b) {
			f.dispose();
			LoginPage loginPage = new LoginPage(1);
		}
		
	}
	
	
}
	