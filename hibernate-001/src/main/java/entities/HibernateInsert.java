package entities;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import entities.Employee;

public class HibernateInsert {
    public static void main(String[] args) {
        // Step 1: Create Configuration object
        Configuration config = new Configuration();

        // Step 2: Load Hibernate configuration file
        config.configure("resources/hibernate.cfg.xml");

        // Step 3: Build SessionFactory
        SessionFactory sessionFactory = config.buildSessionFactory();

        // Step 4: Open session and begin transaction
        Session session = sessionFactory.openSession();
        Transaction t = session.beginTransaction();

        // Step 5: Create Employee object and save it
        Employee emp = new Employee(101, "John");
        session.save(emp);

        // Step 6: Commit transaction and close session
        t.commit();
        session.close();
        sessionFactory.close();

        System.out.println("Employee record inserted successfully!");
    }
}
