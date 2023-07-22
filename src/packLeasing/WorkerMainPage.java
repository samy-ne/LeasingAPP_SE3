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
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Iterator;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.ImageIcon;

public class WorkerMainPage implements ActionListener {
    JFrame f = new JFrame("Worker Page"); // set a topic
    // creates the buttons
    JButton carsButton = new JButton("Cars details");
    JButton cleintsButton = new JButton("My employment terms");
    //JButton mySalary = new JButton("Salary"); ???????
    Object[] options = { "< Quit >", "< Next >"};

    WorkerMainPage() {
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
        carsButton.setBounds(50, 5, 300, 550);
        carsButton.addActionListener(this);
        panel.add(carsButton);

        cleintsButton.setFont(new Font("Arial", Font.BOLD, 20));
        cleintsButton.setBounds(450,5,300,550);
        cleintsButton.addActionListener(this);
        panel.add(cleintsButton);


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
			worker_print();
			//f.dispose();
			//ClientDataPage clientDataPage = new ClientDataPage
		}
		if (e.getSource()==cleintsButton) {
			JOptionPane.showMessageDialog(null,"Employment Terms\r\n"
					+ "The Employee agrees that he or she will faithfully and to the best of their ability to carry out the duties and responsibilities communicated to them by the Employer. The Employee shall comply with all company policies, rules and procedures at all times.\r\n"
					+ "\r\n"
					+ "Position\r\n"
					+ "As a worker in LeaseWise, it is the duty of the Employee to perform all essential job functions and duties. From time to time, the Employer may also add other duties within the reasonable scope of the Employee’s work.\r\n"
					+ "\r\n"
					+ "Benefits\r\n"
					+ "The Employee has the right to participate in any benefits plans offered by the Employer. Access to these benefits will only be possible after the probationary period has passed.\r\n"
					+ "\r\n"
					+ "Probationary Period\r\n"
					+ "During this time, the Employee is not eligible for paid time off or other benefits. During this time, the Employer also exercises the right to terminate employment at any time without advanced notice.\r\n"
					+ "\r\n"
					+ "Paid Time Off\r\n"
					+ "Following the probationary period, the Employee shall be eligible for the following paid time off: • 7 days for vacation • 5 days for illness • Bereavement leave may be granted if necessary.\r\n"
					+ "\r\n"
					+ "The employer reserves the right to modify any the policies.");
			//ClientBuyPage clientBuyPage = new ClientBuyPage
		}

		
	}
    public void worker_print() {
    	try{for (Iterator iterator = Main.my_patio._all_vehicles.iterator(); iterator.hasNext();) {
			Vehicles vehicle = (Vehicles) iterator.next();;
			if(vehicle==null) {vehicle = (Vehicles) iterator.next();}
			System.out.println(Main.my_patio._all_vehicles.size());
			System.out.println(vehicle.toString());
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
    	}
    }
    
}
