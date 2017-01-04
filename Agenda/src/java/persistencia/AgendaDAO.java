/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia;

import java.util.List;
import model.Agenda;
import org.hibernate.Query;
import org.hibernate.Session;
import presentacion.HibernateUtil;

/**
 *
 * @author hamil
 */
public class AgendaDAO {
    
    private Session session;
    
    public Agenda save(Agenda objt){
        session = HibernateUtil.getSessionFactory().openSession();
        session.save(objt);
        session.flush();
        session.close();
        return objt;
        
    }
    
    public Agenda update(Agenda objt){
        session = HibernateUtil.getSessionFactory().openSession();
        session.update(objt);
        session.flush();
        session.close();
        return objt;
        
    }
    
    public List<Agenda> getAll(){
        session = HibernateUtil.getSessionFactory().openSession();
        Query query = session.createQuery("select a from Agenda a");
        List<Agenda> list = query.list();
        session.close();
        return list;
                
    }
}
