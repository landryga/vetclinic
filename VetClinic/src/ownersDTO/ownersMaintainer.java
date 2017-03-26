/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ownersDTO;

import javax.sql.DataSource;

/**
 *
 * @author Kuba
 */
public class ownersMaintainer {
    
    //private JdbcTemplate jdbcTemplate;
    protected String OwnerName;
    protected String OwnerSurname;
    protected String OwnerAddress;
    protected String OwnerTelephone;
    
    public void setDataSource(DataSource dataSource) {
        //this.jdbcTemplate = new JdbcTemplate(dataSource);
    }
}
