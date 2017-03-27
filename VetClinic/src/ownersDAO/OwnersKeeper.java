/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ownersDAO;

import java.util.Map;

/**
 *
 * @author Kuba
 */
public interface OwnersKeeper {
    public void saveOwner (Map<String, String> fields);
    
    public void deriveOwners (Map<String, String> fields);
    
}
