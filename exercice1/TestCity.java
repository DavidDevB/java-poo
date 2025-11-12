public class TestCity {

    public static void main(String [] args)  {
        City toulouse = new City("Toulouse", 450000);
        City bordeaux = new City("Bordeaux", "France", 265000);
        City lyon = new City("Lyon", "France", 520000);
        City paris = new City("Paris", "France", 2000000);

        // toulouse.population += 20000;
        // System.out.println(toulouse.population);

        // toulouse.getAttributs();
        // toulouse.addPopulation(20000);
        // toulouse.getAttributs();
        // bordeaux.getAttributs();
        // bordeaux.addPopulation(40000);
        // bordeaux.getAttributs();
        // lyon.getAttributs();
        // lyon.addPopulation(10000);
        // lyon.getAttributs();

        System.out.println(toulouse.toString());

        toulouse.setCountry("France");

        System.out.println(toulouse.toString());

        System.out.println(bordeaux.display());

        System.out.println(bordeaux);

        System.out.println(City.getNbInstances());
    }
}
