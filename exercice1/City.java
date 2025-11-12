public class City {


    // public String name;
    // public String country;
    // public int population;

    private String name;
    private String country;
    private int population;

    private static int nbInstances = 0;

    public City(String name, String country, int population) {
        this.name = name;
        this.country = country;
        this.population = population;
        nbInstances++;
    }

    public City(String name, int population) {
        this.name = name;
        this.country = "unkown";
        this.population = population;
        nbInstances++;
    }

    public City(String name, String country) {
        this.name = name;
        this.country = country;
        nbInstances++;
    }

    public void addPopulation(int more) {
        this.population += more;
    }

    public void subPopulation(int less) {
        this.population -= less;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void getAttributs() {
        System.out.println(this.name);
        System.out.println(this.country);
        System.out.println(this.population);
    }

    public String getName() {
        return this.name;
    }

    public String toString() {
        return "[city: " + this.name + "]" + " [country: " + this.country + "]"+ " [population: " + this.population + "]";
    }

    public String display() {
        return "ville de " + this.name + " en " + this.country + " ayant " + population + " habitants";
    }

    public static int getNbInstances() {
        return nbInstances;
    }

}
