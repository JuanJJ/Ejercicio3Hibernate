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
    
    public List<Customer> getListaClientes(){
        List<Customer>lista=new ArrayList<>();
        
        Query q = session.createQuery("from Customer");
        lista=(List<Customer>)q.list();
        return lista;
    }
    
    public List<Rental> getPeliculasAlquiladas(int idVideoClub, int idCliente, int tramo){
        List<Rental>lista=new ArrayList<>();
        
        Query q = session.createQuery("from Rental as rental where rental.customer = "+idCliente+" and rental.inventory in (select inventario.inventoryId from Inventory as inventario where inventario.store = "+idVideoClub+")");
        q.setFirstResult(tramo);
        q.setMaxResults(10);
        lista=(List<Rental>)q.list();
        return lista;
    }
    
    public List<Payment> getTotalGastado(int idVideoClub, int idCliente, String mesDesde, String mesHasta){
        List<Payment>lista=new ArrayList<>();
        
        Query q = session.createQuery("from Payment as pagos where pagos.customer = "+idCliente+" and pagos.paymentDate BETWEEN \""+mesDesde+"\" and \""+mesHasta+"\" and pagos.staff in (select empleado.staffId from Staff as empleado where empleado.store="+idVideoClub+" )");

        lista=(List<Payment>)q.list();
        return lista;
    }
    
    public List<Object[]> getTotalGastadoVideoclub(int idVideoClub, int tramo){
        List<Object[]>lista=new ArrayList<>();
        
        Query q = session.createQuery("select sum(pagos.amount), pagos.customer.firstName,pagos.customer.lastName from Payment as pagos where pagos.staff in (select empleado.staffId from Staff as empleado where empleado.store="+idVideoClub+" ) group by pagos.customer");
        q.setFirstResult(tramo);
        q.setMaxResults(10);
        lista=(List<Object[]>)q.list();
        return lista;
    }
    
    public List<Object[]> getVecesAlquiladas(int idVideoClub, int tramo){
        List<Object[]>lista=new ArrayList<>();
        
        Query q = session.createQuery("SELECT rental.inventory.film.title, count(rental.inventory) FROM Rental as rental WHERE rental.inventory.store = "+idVideoClub+" GROUP BY rental.inventory.film");
        q.setFirstResult(tramo);
        q.setMaxResults(10);
        lista=(List<Object[]>)q.list();
        return lista;
    }
    
    public List<Film> getPeliculas(){
        List<Film>lista=new ArrayList<>();
        
        Query q = session.createQuery("from Film");

        lista=(List<Film>)q.list();
        return lista;
    }
    
    public List<FilmActor> getActores(int idPelicula){
        List<FilmActor>lista=new ArrayList<>();
        
        Query q = session.createQuery("from FilmActor as actores where actores.film="+idPelicula);

        lista=(List<FilmActor>)q.list();
        return lista;
    }
    
    public Film getPelicula(int idPelicula){
        
        
        Query q = session.createQuery("from Film as pelicula where pelicula.filmId="+idPelicula);

        Film pelicula=(Film)q.uniqueResult();
        return pelicula;
    }
    
}
