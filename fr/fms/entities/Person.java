package java_poo.fr.fms.entities;

public abstract class Person {

    private String lastName;
    private String firstName;
    private int age;
    private String adress;
    private City city;
    private String bornCountry;

    public Person(String lastName, String firstName, int age, String adress, City city, String bornCountry) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.age = age;
        this.adress = adress;
        this.city = city;
        this.bornCountry = bornCountry;
    }

    public String getLastName(){
        return this.lastName;
    }

    public String getFirstName(){
        return this.firstName;
    }

    public int getAge(){
        return this.age;
    }

    public String getAdress(){
        return this.adress;
    }

    public City getCity(){
        return this.city;
    }

    public String getBornCountry(){
        return this.bornCountry;
    }

    public abstract int compensation();
}
