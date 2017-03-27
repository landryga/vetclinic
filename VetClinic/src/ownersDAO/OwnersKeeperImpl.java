/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ownersDAO;

import java.util.Map;
import main.HibernateConfigurator;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import ownersDTO.OwnersMaintainer;

/**
 *
 * @author Kuba
 */
public class OwnersKeeperImpl implements OwnersKeeper {

    @Override
    public void saveOwner(Map<String, String> fields) {
        
        
        String Name = fields.get("Name");
        String Surname = fields.get("Surname");
        String Address = fields.get("Address");
        String Telephone = fields.get("Telephone");
                
        
        OwnersMaintainer ownMain = new OwnersMaintainer();
         ownMain.setOwnerName(Name);
         ownMain.setOwnerSurName(Surname);
         ownMain.setOwnerAddress(Address);
         ownMain.setOwnerTelephone(Telephone);
         
         SessionFactory sessionFactory = HibernateConfigurator.getSessionFactory();
         Session session = sessionFactory.openSession();
         session.beginTransaction();
         session.save(ownMain);
         session.getTransaction().commit();
         session.close();
         sessionFactory.close();
    }

    @Override
    public void deriveOwners(Map<String, String> fields) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
