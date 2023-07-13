package packLeasing;

import java.awt.*;
import java.util.ArrayList;
import java.util.Vector;

import javax.swing.*;

public class AvailableCarsPage {

    JFrame frame;
    JPanel panel;
    JScrollPane scrollPane;
    JButton goBackButton;

    AvailableCarsPage(ArrayList<Vehicles> cars) {
        frame = new JFrame("Available Cars");
        frame.setSize(600, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);

        panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

        for (Vehicles car : cars) {
            JPanel carPanel = new JPanel();
            carPanel.setLayout(new BorderLayout());

            JLabel carImageLabel = new JLabel(new ImageIcon(car.get_image_path()));
            carPanel.add(carImageLabel, BorderLayout.WEST);

            JPanel carInfoPanel = new JPanel();
            carInfoPanel.setLayout(new GridLayout(7, 1));

            carInfoPanel.add(new JLabel("Brand: " + car.get_brand()));
            carInfoPanel.add(new JLabel("Model: " + car.get_model()));
            carInfoPanel.add(new JLabel("Color: " + car.get_color()));
            if (car.get_renting_price()!= 0 ){ //checking if it is for rent
            carInfoPanel.add(new JLabel("Rent Price: " + car.get_renting_price()));}
            if (car.get_buying_price()!=0 ){//checking if it is for buying
            carInfoPanel.add(new JLabel("Buy Price: " + car.get_buying_price()));}
            carInfoPanel.add(new JLabel("Age: " + car.get_age()));
            //carInfoPanel.add(new JLabel("ID: " + car.getID()));

            carPanel.add(carInfoPanel, BorderLayout.CENTER);

            panel.add(carPanel);
        }

        scrollPane = new JScrollPane(panel);
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);

        goBackButton = new JButton("Exit");
        goBackButton.addActionListener(e -> {
            frame.dispose();
            //AdminMainPage adminMainPage = new AdminMainPage();
        });

        frame.add(scrollPane, BorderLayout.CENTER);
        frame.add(goBackButton, BorderLayout.SOUTH);
        frame.setVisible(true);
    }

}