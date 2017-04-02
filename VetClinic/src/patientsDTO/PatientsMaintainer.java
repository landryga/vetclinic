/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patientsDTO;

import java.io.Serializable;
import java.lang.reflect.Field;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import org.hibernate.metadata.ClassMetadata;

/**
 *
 * @author Kuba
 */
@Entity
@Table(name = "patients")
public class PatientsMaintainer implements Serializable {
    
    @Id
    @Column(name = "id")
    private int id;
    
    @Column(name = "race")
    private String race;
    
    @Column(name = "species")
    private String species;
    
    @Column(name = "sex")
    private boolean sex;
    
    @Column(name = "name")
    private String name;
    
    @Column(name = "owner_id")
    private int owner_id;
    
    @Column(name = "birth_date")
    private String birth_date;
    
    @Column(name = "death_date")
    private String death_date;
    
    @Column(name = "weight")
    private int weight;
    
    @Column(name = "microchip_id")
    private int microchip_id;
    
    @Column(name = "color")
    private String color;
    
    @Column(name = "alive")
    private boolean alive;
    
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }
    
    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }
    
    public boolean getSex() {
        return sex;
    }

    public void setsex(boolean sex) {
        this.sex = sex;
    }
    
    public String getName() {
        return name;
    }

    public void setname(String name) {
        this.name = name;
    }
    
    public int getOwnerId() {
        return owner_id;
    }

    public void setOwnerId(int owner_id) {
        this.owner_id = owner_id;
    }
    
    public String getBirthDate() {
        return birth_date;
    }

    public void setBirthDate(String birth_date) {
        this.birth_date = birth_date;
    }
    
    public String getDeathDate() {
        return death_date;
    }

    public void setDeathDate(String death_date) {
        this.death_date = death_date;
    }
    
    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
    
    public int getMicrochipId() {
        return microchip_id;
    }

    public void setMicroChipid(int microchip_id) {
        this.microchip_id = microchip_id;
    }
    
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
    public boolean getAlive() {
        return alive;
    }

    public void setAlive(boolean alive) {
        this.alive = alive;
    }
    
    
}
