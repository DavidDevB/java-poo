package java_poo.fr.fms.entities;

public class SalesPerson extends Person{

    private String company;
    private double salary = 1.0;

    public SalesPerson(String lastName, String firstName, int age, String adress, City city, String bornCountry, String company, int salary) {
        super(lastName, firstName, age, adress, city, bornCountry);
        this.company = company;
        if (salary < 0) {
            throw new RuntimeException("Le salaire ne peut pas être négatif!");
        }
        this.salary = salary;
    }

    public String toString() {
        return super.getLastName() + ", " +  super.getFirstName() + "' " + super.getAge() + " ans, adresse: " + super.getAdress() + ", habitant à: " + super.getCity() + ", pays de naissance: " + super.getBornCountry() + ", travaillant pour: " + this.company + ", %CA: " + this.salary;
    }

    @Override
    public int compensation(){
        return (int)Math.round(this.salary * 50000);
    }

    public String getFirstName() {
        return super.getFirstName();
    }

    public String getLastName() {
        return super.getLastName();
    }
}
