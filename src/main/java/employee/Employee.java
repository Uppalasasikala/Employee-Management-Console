package employee;

import jakarta.persistence.*;

@Entity
@Table(name = "employee")
public class Employee extends Persoana {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    //private String name;
    private int age;
    private Departament department;
    private double salary;

    @ManyToOne(fetch = FetchType.LAZY)
    private Company company;


    public Employee() {

    }

    public Employee(int age, Departament department, double salary) {
        this.age = age;
        this.department = department;
        this.salary = salary;
    }

    public Employee(String firstName, String lastName, String phone, int age, Departament department, double salary) {
        super(firstName, lastName, phone);
        this.age = age;
        this.department = department;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Departament getDepartment() {
        return department;
    }

    public void setDepartment(Departament department) {
        this.department = department;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

}
