/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package addPatientDataInterface;

import static addPatientDataInterface.AddDataInterfaceBuilder.addButton;
import static addPatientDataInterface.AddDataInterfaceBuilder.ownersButton;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.util.Map;
import javax.swing.JFrame;
import ownersDAO.OwnersKeeperImpl;

/**
 *
 * @author Kuba
 */
public class EventController implements WindowListener, ActionListener {
    
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
        
        
        
        
        switch (e.getActionCommand()) {
            case "add":
                System.out.println("Puzsdszd");
                break;
            case "owner":
                System.out.println("Piszhh");
                OwnerInterfaceBuilder ownerInt = new OwnerInterfaceBuilder();
                break;
        }
        
        
        
    }
    
    @Override
    public void windowOpened(WindowEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void windowClosing(WindowEvent e) {
        
    }

    @Override
    public void windowClosed(WindowEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void windowIconified(WindowEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void windowDeiconified(WindowEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void windowActivated(WindowEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void windowDeactivated(WindowEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
