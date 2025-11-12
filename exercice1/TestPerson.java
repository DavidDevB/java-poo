import java.util.List;
import java.util.ArrayList;

public class TestPerson {


    public static void main(String[] args) {
        Person victor = new Person("Hugo", "Victor", 83, "Place des Vosges", new City("Paris", 2000000), "France");
        Person marion = new Person("Cotillard", "Marion", 47, "Rue de Rivoli", new City("Paris", 2000000), "France");
        Person albert = new Person("Einstein", "Albert", 76, "Princeton, NJ", new City("Paris", 2000000), "Allemagne");
        Person mandella = new Person("Mandela", "Nelson", 95, "Johannesburg", new City("Pretoria", 2800000), "Afrique du Sud");
        Person marie = new Person("Curie", "Marie", 66, "Rue Pierre et Marie Curie", new City("Paris", 2000000), "Pologne");
        Person kylian = new Person("Mbappé", "Kylian", 25, "Boulogne-Billancourt", new City("Paris", 2000000), "France");
        Person leonardo = new Person("DiCaprio", "Leonardo", 48, "Los Angeles, CA", new City("Los angeles", 3880000), "USA");
        Person ada = new Person("Lovelace", "Ada", 36, "London", new City("London", 9000000), "Angleterre");
        Person frida = new Person("Lovelace", "Ada", 36, "London", new City("London", 9000000), "Angleterre");
        Person charles = new Person("Aznavour", "Charles", 94, "Montmartre", new City("Paris", 2000000), "France");

        List<Person> personsList = new ArrayList<>();

        personsList.add(victor);
        personsList.add(marion);
        personsList.add(albert);
        personsList.add(mandella);
        personsList.add(marie);
        personsList.add(kylian);
        personsList.add(leonardo);
        personsList.add(ada);
        personsList.add(frida);
        personsList.add(charles);

        for (Person person : personsList) {
            if (person.getBornCountry().equals("France") || person.getCity().getName().equals("Paris")) {
                System.out.println(person.toString());
            }
        }
    }
}
