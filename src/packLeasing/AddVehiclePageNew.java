package packLeasing;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class AddVehiclePageNew {
	String type;
    String color;
    Integer rentingPrice=0;
    Integer buyingPrice=0;
    String brand;
    String model;
    Integer age=0;
    String id;
    String imagePath;
    ArrayList<Vehicles> vehicles;
    private JFrame frame;
    private JComboBox<String> typeComboBox;
    private JTextField colorField;
    private JTextField rentPriceField;
    private JTextField buyPriceField;
    private JTextField brandField;
    private JTextField modelField;
    private JTextField ageField;
    private JTextField idField;
    private JTextField imagePathField;
    private JTextField passengersField;
    private JTextField gearField;
    private JComboBox<String> sizeComboBox;
    private JCheckBox baggageCheckBox;
    private JButton addButton;
    private JButton goBackButton;

    public AddVehiclePageNew() {
        frame = new JFrame("Add Vehicle");
        frame.setSize(600, 700);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        panel.setLayout(null);
        panel.setBounds(0, 0, 600, 600);

        int labelX = 10;
        int fieldX = 350;
        int y = 25;
        int labelWidth = 300;
        int fieldWidth = 200;
        int height = 30;
        int verticalGap = 40;

        JLabel typeLabel = new JLabel("Type (Car or Motorcycle):");
        typeLabel.setBounds(labelX, y, labelWidth, height);
        panel.add(typeLabel);

        typeComboBox = new JComboBox<>(new String[]{"Car", "Motorcycle"});
        typeComboBox.setBounds(fieldX, y, fieldWidth, height);
        panel.add(typeComboBox);

        y += verticalGap;

        JLabel colorLabel = new JLabel("Color:");
        colorLabel.setBounds(labelX, y, labelWidth, height);
        panel.add(colorLabel);

        colorField = new JTextField();
        colorField.setBounds(fieldX, y, fieldWidth, height);
        panel.add(colorField);

        y += verticalGap;

        JLabel rentPriceLabel = new JLabel("Rent Price: (enter 0 if not for rent) ");
        rentPriceLabel.setBounds(labelX, y, labelWidth, height);
        panel.add(rentPriceLabel);

        rentPriceField = new JTextField();
        rentPriceField.setBounds(fieldX, y, fieldWidth, height);
        panel.add(rentPriceField);

        y += verticalGap;

        JLabel buyPriceLabel = new JLabel("Buy Price: (enter 0 if not for buying) ");
        buyPriceLabel.setBounds(labelX, y, labelWidth, height);
        panel.add(buyPriceLabel);

        buyPriceField = new JTextField();
        buyPriceField.setBounds(fieldX, y, fieldWidth, height);
        panel.add(buyPriceField);

        y += verticalGap;

        JLabel brandLabel = new JLabel("Brand:");
        brandLabel.setBounds(labelX, y, labelWidth, height);
        panel.add(brandLabel);

        brandField = new JTextField();
        brandField.setBounds(fieldX, y, fieldWidth, height);
        panel.add(brandField);

        y += verticalGap;

        JLabel modelLabel = new JLabel("Model:");
        modelLabel.setBounds(labelX, y, labelWidth, height);
        panel.add(modelLabel);

        modelField = new JTextField();
        modelField.setBounds(fieldX, y, fieldWidth, height);
        panel.add(modelField);

        y += verticalGap;

        JLabel ageLabel = new JLabel("Age:");
        ageLabel.setBounds(labelX, y, labelWidth, height);
        panel.add(ageLabel);

        ageField = new JTextField();
        ageField.setBounds(fieldX, y, fieldWidth, height);
        panel.add(ageField);

        y += verticalGap;

        JLabel idLabel = new JLabel("ID:");
        idLabel.setBounds(labelX, y, labelWidth, height);
        panel.add(idLabel);

        idField = new JTextField();
        idField.setBounds(fieldX, y, fieldWidth, height);
        panel.add(idField);

        y += verticalGap;

        JLabel imagePathLabel = new JLabel("Image Path:");
        imagePathLabel.setBounds(labelX, y, labelWidth, height);
        panel.add(imagePathLabel);

        imagePathField = new JTextField();
        imagePathField.setBounds(fieldX, y, fieldWidth, height);
        panel.add(imagePathField);

        y += verticalGap;

       

        addButton = new JButton("Add Vehicle");
        addButton.setBounds(120, y, 150, height);
        panel.add(addButton);
        
        goBackButton = new JButton("Go back");
        goBackButton.setBounds(300, y, 150, height);
        panel.add(goBackButton);

        frame.add(panel);
        //frame.setVisible(true);

        goBackButton.addActionListener(e -> {
        	frame.dispose();
            AdminMainPage openAdminPage = new AdminMainPage();
        });
        
        
        addButton.addActionListener(e -> {
            this.type = (String) typeComboBox.getSelectedItem();
            this.color = colorField.getText().trim().isEmpty() ? null : colorField.getText();
            this.rentingPrice = rentPriceField.getText().trim().isEmpty() ? null : Integer.parseInt(rentPriceField.getText());
            this.buyingPrice = buyPriceField.getText().trim().isEmpty() ? null : Integer.parseInt(buyPriceField.getText());
            this.brand = brandField.getText().trim().isEmpty() ? null : brandField.getText();
            this.model = modelField.getText().trim().isEmpty() ? null : modelField.getText();
            this.age = ageField.getText().trim().isEmpty() ? null : Integer.parseInt(ageField.getText());
            this.id = idField.getText().trim().isEmpty() ? null : idField.getText();
            this.imagePath = imagePathField.getText().trim().isEmpty() ? null : imagePathField.getText();
            

            System.out.println("Type: " + type);
            System.out.println("Color: " + color);
            System.out.println("Rent Price: " + rentingPrice);
            System.out.println("Buy Price: " + buyingPrice);
            System.out.println("Brand: " + brand);
            System.out.println("Model: " + model);
            System.out.println("Age: " + age);
            System.out.println("ID: " + id);
            System.out.println("Image Path: " + imagePath);

            
            frame.dispose();
            try{
            	Vehicles vehicle;
            	if (type=="Car") {vehicle = new Cars(color, rentingPrice, buyingPrice, brand, model,
        			age, imagePath, Attributes.MOTOR_ELETRIC, Attributes.GEARS_MANUAL, Attributes.ROOF_CLOSED);
            }else {vehicle = new Motorcycle(color, rentingPrice, buyingPrice, brand, model,
        			age, imagePath);}
            System.out.println(Main.my_patio._all_vehicles.size());
            
			Main.my_patio._all_vehicles.add(vehicle);
            System.out.println(vehicle.toString());
            System.out.println(Main.my_patio._all_vehicles.size());
            System.out.println("mmmmmmmmmmmmm");
            System.out.println(Main.my_patio._all_vehicles.get(9).toString());
            System.out.println("mmmmmmmmmmmmm2");}
            catch(NullPointerException er) {
            	JOptionPane.showMessageDialog(null,"One or more fields are invalid. Please notice that the age, renting and buying price must be numbers, and the rest are strings.");
            	System.out.println(e);
            	}
            AdminMainPage openAdminPage = new AdminMainPage();
        });
    }
    public Vehicles getNewVehicle() {
    	Vehicles vehicle = new Cars(color, rentingPrice, buyingPrice, brand, model,
    			age, imagePath, Attributes.MOTOR_ELETRIC, Attributes.GEARS_MANUAL, Attributes.ROOF_CLOSED);
    	return vehicle;
    }
	public void start(ArrayList<Vehicles> _all_vehicles) {
		// TODO Auto-generated method stub
		
		//this.vehicles=_all_vehicles;
		frame.setVisible(true);
	}
}
