/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dvdRental;

import java.util.ArrayList;
import java.util.List;
import net.sf.ehcache.hibernate.HibernateUtil;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

/**
 *
 * @author Alumno_2DAW
 */
public class Ayudante {
    Session session=null;
    public Ayudante(){
        SessionFactory sessionFactory=NewHibernateUtil.getSessionFactory();
        this.session=sessionFactory.openSession();
        org.hibernate.Transaction tx=session.beginTransaction();
    }
    
    public List<Store> getListaVideoclub(){
        List<Store>lista=new ArrayList<>();
        
        Query q = session.createQuery("from Store");
        lista=(List<Store>)q.list();
        return lista;
    }
}
