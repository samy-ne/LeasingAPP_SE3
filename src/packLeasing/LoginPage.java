package packLeasing;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.*;

//crating a simple window with Java Swing. 

public class LoginPage implements ActionListener {

	JFrame f = new JFrame("User Login");	 //set a topic
	JButton signIn = new JButton("submit");
	JButton signUp = new JButton("sign up");
	

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
			wrongPass.setBounds(130, 250, 300, 30);
			wrongPass.setFont(userLabel.getFont().deriveFont(Font.BOLD)); // Make the font bold
	        wrongPass.setForeground(Color.WHITE); // Set the foreground color to white
	        wrongPass.setBackground(Color.RED); // Set the background color to red
	        wrongPass.setOpaque(true); // Make the background color visible
			f.add(wrongPass);

		}
		
		//setting buttons:
		signIn.setBounds(240, 170, 100, 30);
		signIn.addActionListener(this);
		f.add(signIn);
		
		signUp.setBounds(240, 210, 100, 30);
		signUp.addActionListener(this);
		f.add(signUp);
		
		// Adding an image:
        ImageIcon imageIcon = new ImageIcon("C:\\Users\\User\\eclipse-workspace\\LeasingAPP_SE3\\src\\packLeasing\\images\\openScreen.jpg"); // Replace with the actual path to your image
        JLabel imageLabel = new JLabel(imageIcon);
        imageLabel.setBounds(5, 5, 570, 550);
        f.add(imageLabel);
		
        
        signIn.addActionListener(e -> {
        	
    	    Login login = new Login();
    	    boolean authenticated = false;
    	    login.readUserAndPasswordsFromFile("usernames_passwords.txt");
    	    login.printUserAndPass(); //help to see what users allow to go in the system and thier types
        	
        	char[] passwordChar = passwordField.getPassword();
        	String password = new String(passwordChar);
            String username = t1.getText();
            // Perform login logic with the username and password
            System.out.println(username);
            System.out.println(password);
    		// login~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~               
    		//static final Integer NoSuchUser = 0 ;
    		//static final Integer Admin = 1;
    		//static final Integer Client = 2;
    		//static final Integer Worker = 3;



    	    // TODO if someone press sign in show window of sign in
    		// $$$$$$$$$ sign in start $$$$$$$$$             
    	    authenticated = login.verifyPassword(username, password);//check if password+user OK(?!)
    	    if (authenticated) { //if password is good open the right window
    	    	int userType = login.getUserType(username);
    	    	if (userType==Attributes.ADMIN) {
    	    		// show AdminWindow();
    	    		f.dispose();
    	    		AdminMainPage adminMainPage = new AdminMainPage();
    	    		} 
    	    	
    	    	else if (userType==Attributes.CLIENT) {
    	    		// TODO show ClientWindow();
    	    		f.dispose();
    	    		Cars vehicle1 =  new Cars("Orange", 0, 80000, "Toyota", "2023 GR86 Special Edition",
    	    				0, "ToyotaOrangeGR.png", Attributes.MOTOR_ELETRIC, Attributes.GEARS_MANUAL, Attributes.ROOF_CLOSED);
    	    		Cars vehicle2 =  new Cars("Gray", 2000, 50000, "Tesla", "2023 Model S",
    	    				0, "TeslaModelSGray.png", Attributes.MOTOR_ELETRIC, Attributes.GEARS_MANUAL, Attributes.ROOF_CLOSED);
    	    		Cars vehicle3 =  new Cars("White", 3000, 70000, "Tesla", "2023 Model Y",
    	    				0, "TeslaModelYWhite.png", Attributes.MOTOR_ELETRIC, Attributes.GEARS_MANUAL, Attributes.ROOF_CLOSED);
    	    		Cars vehicle4 =  new Cars("White", 1000, 75000, "Hyundai", "SONATA",
    	    				0, "hyundai-sonata-2013.png", Attributes.MOTOR_ELETRIC, Attributes.GEARS_MANUAL, Attributes.ROOF_CLOSED);
    	    		Cars vehicle5 =  new Cars("White", 1500, 0, "Tesla", "Model X luxury SUV electric car with open falcon wing doors",
    	    				0, "white-tesla-x-luxury-suv.png", Attributes.MOTOR_ELETRIC, Attributes.GEARS_MANUAL, Attributes.ROOF_CLOSED);
    	    		Cars vehicle6 =  new Cars("Gray", 5000, 110000, "Universal Studios", "Back To The Future Car Model",
    	    				0, "backToTheFutureCar.png", Attributes.MOTOR_ELETRIC, Attributes.GEARS_MANUAL, Attributes.ROOF_CLOSED);
    	    		Cars vehicle7 =  new Cars("Black", 4500, 100000, "DC comics", "Batmobile",
    	    				0, "batmobile.png", Attributes.MOTOR_ELETRIC, Attributes.GEARS_MANUAL, Attributes.ROOF_CLOSED);
    	    		System.out.println(vehicle4.get_id());
    	    		System.out.println(vehicle5.get_id());
    	    		ArrayList<Vehicles> _all_vehicles = new ArrayList<Vehicles> ();
    	    		_all_vehicles.add(vehicle1);
    	    		_all_vehicles.add(vehicle2);
    	    		_all_vehicles.add(vehicle3);
    	    		_all_vehicles.add(vehicle4);
    	    		_all_vehicles.add(vehicle5);
    	    		_all_vehicles.add(vehicle6);
    	    		_all_vehicles.add(vehicle7);
    	    		//Client Clientsample = new Client(my_patio.get_all_vehicles());
    	    		ClientMainPage Clientsample = new ClientMainPage();
    	    		//ClientMainPage b = new ClientMainPage();
    	    		String[] val =Clientsample.start(_all_vehicles);
    	    		} 
    	    	
    	    	else if (userType==Attributes.WORKER) {
    	    		// TODO show WorkerWindow();
    	    		f.dispose();
    	    		WorkerMainPage workerMainPage = new WorkerMainPage();
    	    		}
    	        }
    	    else {//try again 
    	    	// TODO show window of "Wrong username or password. Please try again.");
    	    	f.dispose();
    	    	LoginPage loginPage = new LoginPage(0);
    	        }
    	    
    		// $$$$$$$$$ sign in end $$$$$$$$$             
    	    // login~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~  
    	    
            
        });
        
        //f.add(signIn);

        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
		f.setVisible(true);		//must set as true to see the window

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == signUp) {
			
			f.dispose();
			SignUpPage signUpPage = new SignUpPage();
		}
		
	}


}
	