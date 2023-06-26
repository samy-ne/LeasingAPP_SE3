package packLeasing;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

//crating a simple window with Java Swing. 

public class SignUpPage implements ActionListener {

	JFrame f = new JFrame("User signUp");	 //set a topic
	JButton signUp = new JButton("sign up");
	

	SignUpPage(){

		f.setSize(600,600);		//size of the page - (width,length) 
		f.setLayout(null);
        f.setLocationRelativeTo(null); // Center the frame on the screen

		//creating labels: 
        
        JLabel headLine = new JLabel("Creating new account");
        headLine.setBounds(190, 10, 300, 30);
        headLine.setForeground(Color.WHITE); // Set the text color to white
        headLine.setFont(new Font(headLine.getFont().getName(), Font.BOLD, 20)); // Set the font size to 20 and make it bold
        f.add(headLine);
        
		JLabel userLabel = new JLabel("Username: ");
		userLabel.setBounds(100,70,100,30);
		userLabel.setFont(userLabel.getFont().deriveFont(Font.BOLD)); // Make the font bold
		f.add(userLabel);
		JTextField t1 = new JTextField(20);		//field in length of 20 chars.
		t1.setBounds(200, 70, 200, 30);
		f.add(t1);
		
		JLabel passwordLabel = new JLabel("Password: ");
		passwordLabel.setBounds(100, 120, 100, 30);
		passwordLabel.setFont(userLabel.getFont().deriveFont(Font.BOLD)); // Make the font bold
		f.add(passwordLabel);
        JPasswordField passwordField = new JPasswordField(20);		//field in length of 20 chars. 
		passwordField.setBounds(200, 120, 200, 30);
		f.add(passwordField);
		
		
		//setting buttons:
		signUp.setBounds(240, 170, 100, 30);
		signUp.addActionListener(this);
		f.add(signUp);

		
		// Adding an image:
        ImageIcon imageIcon = new ImageIcon("C:\\Users\\User\\eclipse-workspace\\LeasingAPP_SE3\\src\\packLeasing\\images\\openScreen.jpg"); // Replace with the actual path to your image
        JLabel imageLabel = new JLabel(imageIcon);
        imageLabel.setBounds(5, 5, 570, 550);
        f.add(imageLabel);
		
        
        signUp.addActionListener(e -> {
            char[] password = passwordField.getPassword();
            String username = t1.getText();
            // Perform login logic with the username and password
            // ...
            //************ add an "if" to check if login was good !!!!!! : 
            f.dispose();
            ClientMainPage clientMainPage = new ClientMainPage();		//if its client - lunch client main system.
            //AdminMainPage adminMainPage = new AdminMainPage();		//if its admin - lunch admin main system. 
            //WorkerMainPage workerMainPage = new WorkerMainPage();		//if its worker - lunch worker main system. 
            //LoginPage login = new LoginPage(0);	//if the login was wrong - run this! 
            
        });
        
        //f.add(signIn);

        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
		f.setVisible(true);		//must set as true to see the window

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == signUp) {
			LoginPage login = new LoginPage(1);
		}
		
	}


	
}
	