/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patientsDAO;

import java.util.Map;

/**
 *
 * @author Kuba
 */
public interface PatientsKeeper {
    public void savePatient (Map<String, String> fields);
    
    public void derivePatients (Map<String, String> fields);
    
    public String[] getPatientsColumnNames();
    
}
