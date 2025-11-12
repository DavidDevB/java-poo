package java_poo.fr.fms.entities;

public class Test {

    public static void main(String[] args) {

        City cestas = new City("Cestas", "France", 16700);
        Capital paris = new Capital("Paris", "France", 2000000, "Tour Eiffel");

        System.out.println(cestas);
        System.out.println(paris);
    }
}
