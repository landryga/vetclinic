/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import com.fasterxml.classmate.AnnotationConfiguration;
import com.fasterxml.classmate.AnnotationInclusion;
import java.lang.annotation.Annotation;
import javax.imageio.spi.ServiceRegistry;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.internal.SessionFactoryImpl;
import ownersDTO.OwnersMaintainer;

/**
 *
 * @author Kuba
 */

public class Main {
    public static void main(String[] args) {
        
        
        
         OwnersMaintainer ownMain = new OwnersMaintainer();
         ownMain.setOwnerName("Jan");
         ownMain.setOwnerSurName("Kowalski");
         ownMain.setOwnerAddress("Marszalkowska 15/5");
         ownMain.setOwnerTelephone("554347777");
         
         SessionFactory sessionFactory = HibernateConfigurator.getSessionFactory();
         Session session = sessionFactory.openSession();
         session.beginTransaction();
         session.save(ownMain);
         session.getTransaction().commit();
         session.close();
         sessionFactory.close();
         
    }
}
