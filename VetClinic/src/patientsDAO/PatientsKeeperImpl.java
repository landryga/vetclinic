/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patientsDAO;

import java.util.Map;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import main.HibernateConfigurator;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.metadata.ClassMetadata;
import patientsDTO.PatientsMaintainer;

/**
 *
 * @author Kuba
 */
public class PatientsKeeperImpl implements PatientsKeeper{

    @Override
    public void savePatient(Map<String, String> fields) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void derivePatients(Map<String, String> fields) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String[] getPatientsColumnNames() {
        PatientsMaintainer patMain = new PatientsMaintainer();
        patMain.getId();
        patMain.getRace();
        patMain.getSpecies();
        patMain.getSex();
        patMain.getName();
        patMain.getOwnerId();
        patMain.getBirthDate();
        patMain.getDeathDate();
        patMain.getWeight();
        patMain.getMicrochipId();
        patMain.getColor();
        patMain.getAlive();
        
        
    }
    
}
