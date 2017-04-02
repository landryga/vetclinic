/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package addPatientDataInterface;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import javafx.util.Pair;
import javax.swing.JButton;
import javax.swing.JEditorPane;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JTextPane;

/**
 *
 * @author Kuba
 */
public class OwnerInterfaceBuilder extends AddDataInterfaceBuilder {
    
    
    private static JFrame mainFrame;
    private static JLabel headerLabel;
    private static JLabel statusLabel;
    private static JPanel controlPanel;
    private static JButton addButton;
    private static JTextField ownerName;
    private static JTextField ownerSurname;
    private static JTextField ownerAddress;
    private static JTextField ownerTelephone;
    private static Map<Pair<String, String>, Integer> fieldsContainer;
    
    private static void popupMaintainer(String command) {
        
    }
    
    public OwnerInterfaceBuilder() {
        
        fieldsContainer = new LinkedHashMap<Pair<String, String>, Integer>();
        
        fieldsContainer.put(new Pair("name", "imię"), 1);
        fieldsContainer.put(new Pair("surname", "nazwisko"), 1);
        fieldsContainer.put(new Pair("address", "adres"), 1);
        fieldsContainer.put(new Pair("telephone", "telefon"), 1);
        
        prepareGUI(fieldsContainer, "Dodaj właściciela");
                
    }
    
    
    /*private void prepareGUI(String name) {
        mainFrame = new JFrame(name);
        mainFrame.setSize(400,400);
        mainFrame.setLayout(new GridLayout(10,5));
        
        headerLabel = new JLabel("",JLabel.CENTER);
        headerLabel.setText("Dodaj Właściciela");
        statusLabel = new JLabel("",JLabel.CENTER);
        statusLabel.setSize(350,100);
        
        mainFrame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent windowEvent) {
                System.exit(0);
            }
        });
        
        controlPanel = new JPanel();
        controlPanel.setLayout(new FlowLayout());
        
        ownerName = new JTextField(20);
        ownerName.setSize(5, 1);
        ownerName.setName("Name");
        
        ownerSurname = new JTextField(20);
        ownerSurname.setSize(5, 1);
        ownerSurname.setName("Surname");
        
        ownerAddress = new JTextField(100);
        ownerAddress.setSize(5, 1);
        ownerAddress.setName("Address");
        
        ownerTelephone = new JTextField(20);
        ownerTelephone.setSize(5, 1);
        ownerTelephone.setName("Telephone");
        
        //Controls
        addButton = new JButton();
        addButton.setActionCommand("add");
        addButton.setText("Dodaj");
        addButton.setAlignmentX(-20);
        addButton.setAlignmentY(-40);
        
        addButton.addActionListener(new InterfaceController());
        
        
        mainFrame.add(headerLabel);
        mainFrame.add(controlPanel);
        mainFrame.add(statusLabel);
        mainFrame.add(ownerName);
        mainFrame.add(ownerSurname);
        mainFrame.add(ownerAddress);
        mainFrame.add(ownerTelephone);
        mainFrame.add(addButton);
        mainFrame.setVisible(true);

    }*/
    
    public static Map<String, String> getFields() {
        
        String Name = ownerName.getText();
        String Surname = ownerSurname.getText();
        String Address = ownerAddress.getText();
        String Telephone = ownerTelephone.getText();
        
        Map<String, String> fieldsContainer = new HashMap<String, String>();
        fieldsContainer.put(ownerName.getName(), Name);
        fieldsContainer.put(ownerSurname.getName(), Surname);
        fieldsContainer.put(ownerAddress.getName(), Address);
        fieldsContainer.put(ownerTelephone.getName(), Telephone);
        
        
        
        return fieldsContainer;
    }
    
    
    
}
