/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ownersDTO;

//import com.mysql.jdbc.JDBC4Connection;
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.sql.DataSource;

/**
 *
 * @author Kuba
 */

@Entity
@Table(name="owner")
public class OwnersMaintainer implements Serializable {
    
    //private JdbcTemplate 
    @Id
    @Column(name="id")
    private int owner_id;
    
    @Column(name="name")
    private String OwnerName;
    @Column(name="surname")
    private String OwnerSurname;
    @Column(name="address")
    private String OwnerAddress;
    @Column(name="telephone_number")
    private String OwnerTelephone;
    
    public int getOwnerId() {
        return owner_id;
    }
    
    public String getOwnerName() {
        return OwnerName;
    }
    
    public void setOwnerName(String Name) {
        this.OwnerName = Name;
    }
    
    public String getOwnerSurName() {
        return OwnerSurname;
    }
    
    public void setOwnerSurName(String SurName) {
        this.OwnerSurname = SurName;
    }
    
    public String getOwnerAddress() {
        return OwnerAddress;
    }
    
    public void setOwnerAddress(String Address) {
        this.OwnerAddress = Address;
    }
    
    public String getOwnerTelephone() {
        return OwnerTelephone;
    }
    
    public void setOwnerTelephone(String Telephone) {
        this.OwnerTelephone = Telephone;
    }
    
    
    
}
