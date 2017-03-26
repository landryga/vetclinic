/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patientInterface;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JButton;
import javax.swing.JEditorPane;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Kuba
 */
public class InterfaceBuilder {
    private JFrame mainFrame;
    private JLabel headerLabel;
    private JLabel statusLabel;
    private JPanel controlPanel;
    private JButton addButton;
    private JEditorPane ownerName;
    private JEditorPane ownerSurname;
    private JEditorPane ownerAddress;
    private JEditorPane ownerTelephone;
    
    private Map<String, String> prepareGUI() {
        mainFrame = new JFrame("PLEPLEPLE");
        mainFrame.setSize(400,400);
        mainFrame.setLayout(new GridLayout(3,1));
        
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
        
        ownerName = new JEditorPane();
        ownerName.setSize(50, 10);
        ownerName.setName("Name");
        
        ownerSurname = new JEditorPane();
        ownerSurname.setSize(50, 10);
        ownerSurname.setName("Surname");
        
        ownerAddress = new JEditorPane();
        ownerAddress.setSize(50, 10);
        ownerAddress.setName("Address");
        
        ownerTelephone = new JEditorPane();
        ownerTelephone.setSize(50, 10);
        ownerTelephone.setName("Telephone");
        
        //Controls
        addButton = new JButton();
        addButton.setActionCommand("add");
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
        
        Map<String, String> fieldsContainer = new HashMap<String, String>();
        fieldsContainer.put(ownerName.getName(), ownerName.getText());
        fieldsContainer.put(ownerSurname.getName(), ownerSurname.getText());
        fieldsContainer.put(ownerAddress.getName(), ownerAddress.getText());
        fieldsContainer.put(ownerTelephone.getName(), ownerTelephone.getText());
        
        return fieldsContainer;
    }
    
    public InterfaceBuilder() {
        prepareGUI();
    }
    
}
