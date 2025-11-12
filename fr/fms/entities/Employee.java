package java_poo.fr.fms.entities;

public class Employee extends Person{
    
    private String company;
    private int salary;

    public Employee (String lastName, String firstname, int age, String adress, City city, String bornCountry, String company, int salary) {
        super(lastName, firstname, age, adress, city, bornCountry);
        this.company = company;
        this.salary = salary;
    }

    public String toString() {
        return super.getLastName() + ", " +  super.getFirstName() + "' " + super.getAge() + " ans, adresse: " + super.getAdress() + ", habitant à: " + super.getCity() + ", pays de naissance: " + super.getBornCountry() + ", travaillant pour: " + this.company + ", salaire: " + this.salary;
    }
}
