package packLeasing;

import java.awt.*;
import javax.swing.*;

public class AvailableCarsPage {

    JFrame frame;
    JPanel panel;
    JScrollPane scrollPane;
    JButton goBackButton;

//    AvailableCarsPage(Vector<Car> cars) {
//        frame = new JFrame("Available Cars");
//        frame.setSize(600, 600);
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        frame.setLocationRelativeTo(null);
//
//        panel = new JPanel();
//        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
//
//        for (Car car : cars) {
//            JPanel carPanel = new JPanel();
//            carPanel.setLayout(new BorderLayout());
//
//            JLabel carImageLabel = new JLabel(new ImageIcon(car.getImagePath()));
//            carPanel.add(carImageLabel, BorderLayout.WEST);
//
//            JPanel carInfoPanel = new JPanel();
//            carInfoPanel.setLayout(new GridLayout(7, 1));
//
//            carInfoPanel.add(new JLabel("Brand: " + car.getBrand()));
//            carInfoPanel.add(new JLabel("Model: " + car.getModel()));
//            carInfoPanel.add(new JLabel("Color: " + car.getColor()));
//            carInfoPanel.add(new JLabel("Rent Price: " + car.getRentPrice()));
//            carInfoPanel.add(new JLabel("Buy Price: " + car.getBuyPrice()));
//            carInfoPanel.add(new JLabel("Age: " + car.getAge()));
//            carInfoPanel.add(new JLabel("ID: " + car.getID()));
//
//            carPanel.add(carInfoPanel, BorderLayout.CENTER);
//
//            panel.add(carPanel);
//        }
//
//        scrollPane = new JScrollPane(panel);
//        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
//
//        goBackButton = new JButton("Go Back");
//        goBackButton.addActionListener(e -> {
//            frame.dispose();
//            AdminMainPage adminMainPage = new AdminMainPage();
//        });
//
//        frame.add(scrollPane, BorderLayout.CENTER);
//        frame.add(goBackButton, BorderLayout.SOUTH);
//        frame.setVisible(true);
//    }

}
