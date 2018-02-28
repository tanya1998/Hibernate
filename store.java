package mypackage;
import org.hibernate.Session;  
import org.hibernate.SessionFactory;  
import org.hibernate.Transaction;  
import org.hibernate.cfg.Configuration;  
  
public class store {  
public static void main(String[] args) {  
      
    //creating configuration object  
    Configuration config=new Configuration();  
    config.configure("hibernate.cfg.xml");//populates the data of the configuration file  
      
    //creating session factory object  
    SessionFactory f=config.buildSessionFactory();  
    //creating session object  
    Session s=f.openSession();        
    //creating transaction object  
    Transaction t=s.beginTransaction();  
          
    students stu=new students("abc@kmail.com","30abcd","student");  
    s.persist(stu);//persisting the object  
      
    t.commit();//transaction is committed  
    s.close();  
      
    System.out.println("successfully saved");  
      
}  
}  