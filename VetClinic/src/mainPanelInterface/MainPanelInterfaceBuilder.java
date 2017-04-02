/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainPanelInterface;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Kuba
 */
public class MainPanelInterfaceBuilder extends JFrame {
    
    private JFrame mainFrame;
    private static JLabel headerLabel;
    private static JLabel statusLabel;
    private static JPanel controlPanel;
    protected static JButton addPatientButton;
    protected static JButton continuationButton;
    
    public void PrepareGUI(String name) {
        
        mainFrame = new JFrame(name);
        mainFrame = new JFrame(name);
        mainFrame.setSize(250,200);
        mainFrame.setLayout(new BorderLayout());
        
        
        
        addPatientButton = new JButton("Nowy pacjent");
        continuationButton = new JButton("Kontynuacja");
        
        addPatientButton.addActionListener(new MainPanelActionListener());
        
        addPatientButton.setSize(250, 300);
        continuationButton.setSize(250, 300);
        
        mainFrame.add(addPatientButton, BorderLayout.LINE_START);
        mainFrame.add(continuationButton, BorderLayout.LINE_END);
        
        mainFrame.setVisible(true);
        
        
    }
    
    public MainPanelInterfaceBuilder() {
        PrepareGUI("Panel główny");
    }
}
