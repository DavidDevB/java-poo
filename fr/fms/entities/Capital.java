package java_poo.fr.fms.entities;

public class Capital extends City{

    private String monument;

    public Capital(String name, String country, int population, String monument) {
        super(name, country, population);
        this.monument = monument;
    }

    public String toString() {
       return "[city: " + super.getName() + "]" + " [country: " + getCountry() + "]"+ " [population: " + getPopulation() + " habitants]" + "[monument: " + this.monument +"]";
    }
}
