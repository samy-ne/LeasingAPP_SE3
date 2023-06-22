package packLeasing;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

//crating a simple window with Java Swing. 

public class LoginPage implements ActionListener {

	JFrame f = new JFrame("User Login");	 //set a topic
	JButton b = new JButton("submit");
	

	LoginPage(int i){

		f.setSize(600,600);		//size of the page - (width,length) 
		f.setLayout(null);
        f.setLocationRelativeTo(null); // Center the frame on the screen

		//creating labels: 
		JLabel userLabel = new JLabel("Username: ");
		userLabel.setBounds(100,50,100,30);
		userLabel.setFont(userLabel.getFont().deriveFont(Font.BOLD)); // Make the font bold
		f.add(userLabel);
		JTextField t1 = new JTextField(20);		//field in length of 20 chars.
		t1.setBounds(200, 50, 200, 30);
		f.add(t1);
		
		JLabel passwordLabel = new JLabel("Password: ");
		passwordLabel.setBounds(100, 120, 100, 30);
		passwordLabel.setFont(userLabel.getFont().deriveFont(Font.BOLD)); // Make the font bold
		f.add(passwordLabel);
        JPasswordField passwordField = new JPasswordField(20);		//field in length of 20 chars. 
		passwordField.setBounds(200, 120, 200, 30);
		f.add(passwordField);
		
		//if details are not good - open new win for renter user name and password but this time a msg will show. 
		if(i==0) {
			JLabel wrongPass = new JLabel("Wrong Username or Password, please try agine.");
			wrongPass.setBounds(130, 210, 300, 30);
			wrongPass.setFont(userLabel.getFont().deriveFont(Font.BOLD)); // Make the font bold
	        wrongPass.setForeground(Color.WHITE); // Set the foreground color to white
	        wrongPass.setBackground(Color.RED); // Set the background color to red
	        wrongPass.setOpaque(true); // Make the background color visible
			f.add(wrongPass);

		}
		
		//setting buttons:
		b.setBounds(240, 170, 100, 30);
		b.addActionListener(this);
		f.add(b);
		
		// Adding an image:
        ImageIcon imageIcon = new ImageIcon("C:\\Users\\User\\eclipse-workspace\\LeasingAPP_SE3\\src\\packLeasing\\images\\openScreen.jpg"); // Replace with the actual path to your image
        JLabel imageLabel = new JLabel(imageIcon);
        imageLabel.setBounds(5, 5, 570, 550);
        f.add(imageLabel);
		
        
        b.addActionListener(e -> {
            char[] password = passwordField.getPassword();
            String username = t1.getText();
            // Perform login logic with the username and password
            // ...
            //************ add an "if" to check if login was good !!!!!! : 
            f.dispose();
            MainPage mainPage = new MainPage();		//if the login was good - lunch the main system. 
            //LoginPage login = new LoginPage(1);	//if the login was wrong - run this! 
            
        });
        
        f.add(b);

        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
		f.setVisible(true);		//must set as true to see the window

	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}


		

	
}
	