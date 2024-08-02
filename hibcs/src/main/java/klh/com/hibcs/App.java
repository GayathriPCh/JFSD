package klh.com.hibcs;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    Dept d=new Dept();
    d.setDid(2);
    d.setDname("CSE");
     
    Emp e=new Emp();
     e.setEid(1);
     e.setEname("madhu");
     e.setD(d);
     
        Configuration con=new Configuration().configure().addAnnotatedClass(Emp.class).addAnnotatedClass(Dept.class);
        SessionFactory sf=con.buildSessionFactory();
        Session se=sf.openSession();
        Transaction tx=se.beginTransaction();
        se.persist(e);
        se.persist(d);
        tx.commit();
       // System.out.println(e);
        
    }
}