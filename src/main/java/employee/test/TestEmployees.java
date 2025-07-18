package employee.test;

import employee.Address;
import employee.Company;
import employee.Departament;
import employee.Employee;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class TestEmployees {
    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("default");
        EntityManager em = emf.createEntityManager();

        //  clear
//        em.getTransaction().begin();
//        em.createQuery("DELETE FROM Employee ").executeUpdate();
//        em.createQuery("DELETE FROM Company ").executeUpdate();
//        em.createQuery("DELETE FROM Address").executeUpdate();
//        em.getTransaction().commit();

        Employee e1 = new Employee("Costel", "Daniel", "0742929245", 21, Departament.Marketing, 2100.0);
        Employee e2 = new Employee("Daniel", "Costin", "0742929345", 26, Departament.IT, 4100.0);
        Employee e3 = new Employee("Codrin", "Daniel", "0742929245", 41, Departament.HumanResource, 3100.0);
        Company c1 = new Company("RedPoint", 10, 1000000.34, 200);
        Address address = new Address("Romania", "Carol", "Moldova", "4679");
        em.getTransaction().begin();
        em.persist(e1);
        em.persist(e2);
        em.persist(e3);
        em.persist(c1);
        em.persist(address);
        em.getTransaction().commit();

        System.out.println("End");
    }
}
