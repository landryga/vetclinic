/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package addPatientDataInterface;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import javafx.util.Pair;


/**
 *
 * @author Kuba
 */
public class PatientInterfaceBuilder extends AddDataInterfaceBuilder{
   
    private static Map<Pair<String, String>, Integer> fieldsContainer;
    
     public PatientInterfaceBuilder() {
        
        fieldsContainer = new LinkedHashMap<Pair<String, String>, Integer>();
        
        
        //Map value is the length of the input text field
        fieldsContainer.put(new Pair("race", "rasa"), 34);
        fieldsContainer.put(new Pair("sex", "płeć"), 45);
        fieldsContainer.put(new Pair("weight", "waga"), 56);
        fieldsContainer.put(new Pair("species", "gatunek"), 67);
        fieldsContainer.put(new Pair("xxxf", "vcvcv"), 17);
        
        
        prepareGUI(fieldsContainer, "Dodaj pacjenta");
                
    }
    
}
