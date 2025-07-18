package employee;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "company")
public class Company {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String name;
    private Integer vechime;

    private Double fiscalValue;

    private Integer nrEmployees;

    @OneToMany(
            mappedBy = "company",
            cascade = CascadeType.ALL,
            orphanRemoval = true
    )
    private List<Employee> lEmployee = new ArrayList<>();

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "adress_id")
    private Address address;


    public Company() {

    }

    public Company(String name, Integer vechime, Double fiscalValue, Integer nrEmployees) {
        this.name = name;
        this.vechime = vechime;
        this.fiscalValue = fiscalValue;
        this.nrEmployees = nrEmployees;
    }

    public List<Employee> getlEmployee() {
        return lEmployee;
    }

    public void setlEmployee(List<Employee> lEmployee) {
        this.lEmployee = lEmployee;
    }

    public Integer getVechime() {
        return vechime;
    }

    public void setVechime(Integer vechime) {
        this.vechime = vechime;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getFiscalValue() {
        return fiscalValue;
    }

    public void setFiscalValue(Double fiscalValue) {
        this.fiscalValue = fiscalValue;
    }

    public Integer getNrEmployees() {
        return nrEmployees;
    }

    public void setNrEmployees(Integer nrEmployees) {
        this.nrEmployees = nrEmployees;
    }
}
