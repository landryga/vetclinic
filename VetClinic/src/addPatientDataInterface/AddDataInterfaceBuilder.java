/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package addPatientDataInterface;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;
import javafx.util.Pair;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Kuba
 */
public abstract class AddDataInterfaceBuilder {
    
    private static JFrame mainFrame;
    private static JLabel headerLabel;
    private static JLabel statusLabel;
    private static JPanel controlPanel;
    protected static JButton addButton;
    protected static JButton ownersButton;
    private static Map<String, String> labelsContainer;
    
    
    
    protected void addPopupMaintainer(String userinformation) {
        
    }
    
    
    
    //uses Map container that contains data about size of the field (limit of characters), name of the field and name of the label. "name" argument is the name of the
    //frame that appears on the top
    protected void prepareGUI (Map<Pair<String, String>, Integer> fields, String name) {
        
        
        
        mainFrame = new JFrame(name);
        mainFrame.setSize(400,400);
        mainFrame.setLayout(new GridLayout(10,5));
        mainFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        
        headerLabel = new JLabel("",JLabel.CENTER);
        headerLabel.setText("Dodaj dane");
        statusLabel = new JLabel("",JLabel.CENTER);
        statusLabel.setSize(350,100);
        
        
        
        controlPanel = new JPanel();
        controlPanel.setLayout(new FlowLayout());
        
        for(Map.Entry<Pair<String,String>,Integer> entry : fields.entrySet()) {
            JTextField temp_container = new JTextField(entry.getValue());
            temp_container.setSize(5,1);
            Pair<String, String> internal_pair = entry.getKey();
            temp_container.setName(internal_pair.getKey());
            
            mainFrame.add(new JLabel(internal_pair.getValue()));
            mainFrame.add(temp_container);
            
        }
        
        mainFrame.setVisible(true);
        
        //Controls
        addButton = new JButton("Dodaj");
        addButton.setActionCommand("add");
        addButton.setAlignmentX(-20);
        addButton.setAlignmentY(-40);
        
        ownersButton = new JButton("Dane wlasciciela");
        ownersButton.setActionCommand("owner");
        ownersButton.setVisible(false);
        
        addButton.addActionListener(new EventController());
        ownersButton.addActionListener(new EventController());
        
        
        mainFrame.add(ownersButton);
        mainFrame.add(addButton);
        
        if(this instanceof PatientInterfaceBuilder) {
            ownersButton.setVisible(true);
        }
    }
}
