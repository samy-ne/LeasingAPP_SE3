package packLeasing;
import java.awt.*;
import java.util.Vector;

import javax.swing.*;

public class ListOfClientsPage {

    JFrame frame;
    JPanel panel;
    JScrollPane scrollPane;

    ListOfClientsPage(Vector<Client> clients) {

        frame = new JFrame("List of Clients");
        frame.setSize(600, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);

        panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

        /*
        for (Client client : clients) {
            JPanel clientPanel = new JPanel();
            clientPanel.setLayout(new BorderLayout());

            JLabel nameLabel = new JLabel("Client name: " + client.getName());
            clientPanel.add(nameLabel, BorderLayout.NORTH);

            JPanel carPanel = new JPanel();
            carPanel.setLayout(new BoxLayout(carPanel, BoxLayout.Y_AXIS));

            for (Contract contract : client.getContracts()) {
                JLabel carLabel = new JLabel("Car: " + contract.getCar());
                carPanel.add(carLabel);
            }

            JScrollPane carScrollPane = new JScrollPane(carPanel);
            carScrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);

            clientPanel.add(carScrollPane, BorderLayout.CENTER);

            panel.add(clientPanel);
        }
*/
        
        scrollPane = new JScrollPane(panel);
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);

        frame.add(scrollPane);
        frame.setVisible(true);
    }


}
