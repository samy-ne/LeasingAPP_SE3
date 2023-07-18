package packLeasing;

import javax.swing.*;
import java.awt.*;

public class AddVehiclePage {
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

    public AddVehiclePage() {
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

        JLabel rentPriceLabel = new JLabel("Rent Price:");
        rentPriceLabel.setBounds(labelX, y, labelWidth, height);
        panel.add(rentPriceLabel);

        rentPriceField = new JTextField();
        rentPriceField.setBounds(fieldX, y, fieldWidth, height);
        panel.add(rentPriceField);

        y += verticalGap;

        JLabel buyPriceLabel = new JLabel("Buy Price:");
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

        JLabel passengersLabel = new JLabel("Number of Passengers (Motorcycle Only):");
        passengersLabel.setBounds(labelX, y, labelWidth, height);
        panel.add(passengersLabel);

        passengersField = new JTextField();
        passengersField.setBounds(fieldX, y, fieldWidth, height);
        panel.add(passengersField);

        y += verticalGap;

        JLabel gearLabel = new JLabel("Gear (Manual/Automatic):");
        gearLabel.setBounds(labelX, y, labelWidth, height);
        panel.add(gearLabel);

        gearField = new JTextField();
        gearField.setBounds(fieldX, y, fieldWidth, height);
        panel.add(gearField);

        y += verticalGap;

        JLabel sizeLabel = new JLabel("Size (1/2):");
        sizeLabel.setBounds(labelX, y, labelWidth, height);
        panel.add(sizeLabel);

        sizeComboBox = new JComboBox<>(new String[]{"1", "2"});
        sizeComboBox.setBounds(fieldX, y, fieldWidth, height);
        panel.add(sizeComboBox);

        y += verticalGap;

        JLabel baggageLabel = new JLabel("Baggage (Yes/No):");
        baggageLabel.setBounds(labelX, y, labelWidth, height);
        panel.add(baggageLabel);

        baggageCheckBox = new JCheckBox();
        baggageCheckBox.setBounds(fieldX, y, fieldWidth, height);
        panel.add(baggageCheckBox);

        y += verticalGap;

        addButton = new JButton("Add Vehicle");
        addButton.setBounds(200, y, 150, height);
        panel.add(addButton);

        frame.add(panel);
        frame.setVisible(true);

        addButton.addActionListener(e -> {
            String type = (String) typeComboBox.getSelectedItem();
            String color = colorField.getText().trim().isEmpty() ? null : colorField.getText();
            String rentingPrice = rentPriceField.getText().trim().isEmpty() ? null : rentPriceField.getText();
            String buyingPrice = buyPriceField.getText().trim().isEmpty() ? null : buyPriceField.getText();
            String brand = brandField.getText().trim().isEmpty() ? null : brandField.getText();
            String model = modelField.getText().trim().isEmpty() ? null : modelField.getText();
            String age = ageField.getText().trim().isEmpty() ? null : ageField.getText();
            String id = idField.getText().trim().isEmpty() ? null : idField.getText();
            String imagePath = imagePathField.getText().trim().isEmpty() ? null : imagePathField.getText();
            String passengers = passengersField.getText().trim().isEmpty() ? null : passengersField.getText();
            String gear = gearField.getText().trim().isEmpty() ? null : gearField.getText();
            String size = (String) sizeComboBox.getSelectedItem();
            boolean baggage = baggageCheckBox.isSelected();

            System.out.println("Type: " + type);
            System.out.println("Color: " + color);
            System.out.println("Rent Price: " + rentingPrice);
            System.out.println("Buy Price: " + buyingPrice);
            System.out.println("Brand: " + brand);
            System.out.println("Model: " + model);
            System.out.println("Age: " + age);
            System.out.println("ID: " + id);
            System.out.println("Image Path: " + imagePath);
            System.out.println("Number of Passengers: " + passengers);
            System.out.println("Gear: " + gear);
            System.out.println("Size: " + size);
            System.out.println("Baggage: " + baggage);
            
            frame.dispose();
            AdminMainPage openAdminPage = new AdminMainPage();
        });
    }
}
