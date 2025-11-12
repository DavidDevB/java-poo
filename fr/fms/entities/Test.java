package java_poo.fr.fms.entities;

public class Test {

    public static void main(String[] args) {

        City cestas = new City("Cestas", "France", 16700);
        Capital paris = new Capital("Paris", "France", 2000000, "Tour Eiffel");

        System.out.println(cestas);
        System.out.println(paris);

        Employee bill = new Employee("Gates", "Bill", 65, "120 wash road", new Capital("Washington", "USA", 700000, "W-M"), "USA", "Microsoft", 100000);
        Employee elon = new Employee("Musk", "Elon", 49, "210 la road", new City("Palo Alto", "USA", 66000), "South-Africa", "Tesla", 150000);

        System.out.println(bill);
        System.out.println(elon);
    }
}
