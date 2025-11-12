public class Person {
    
    private String lastname;
    private String firstname;
    private int age;
    private String adress;
    private City city;
    private String bornCountry;

    public Person(String lastname, String firstname, int age, String adress, City city, String bornCountry) {
        this.lastname = lastname;
        this.firstname = firstname;
        this.age = age;
        this.adress = adress;
        this.city = city;
        this.bornCountry = bornCountry;
    }

    public Person(String lastname, String firstname, int age) {
        this.lastname = lastname;
        this.firstname = firstname;
        this.age = age;
        this.adress = "unkown";
    }

    public Person(String lastname, String firstname) {
        this.lastname = lastname;
        this.firstname = firstname;
        this.age = 0;
        this.adress = "unkown";

    }

     public String getBornCountry() {
        return this.bornCountry;
    }

    public City getCity() {
        return this.city;
    }

    public String toString() {
        return "[lastname: " + this.lastname + "]" + " [firstname: " + this.firstname + "]"+ " [age: " + this.age + "]" + " [adress:" + this.adress + "]" + " [city: " + this.city + "]" + " [" + this.bornCountry + "]";
    }
}
