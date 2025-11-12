package java_poo.fr.fms.entities;

public class City {

    private String name;
    private String country;
    private int population;

    public City(String name, String country, int population) {
        this.name = name;
        this.country = country;
        this.population = population;
    }

    public String getName() {
        return this.name;
    }

    public String getCountry() {
        return this.country;
    }

    public int getPopulation() {
        return this.population;
    }
 
    public String toString(){
        return "[city: " + this.name + "]" + " [country: " + this.country + "]"+ " [population: " + this.population + " habitants]";
    }
 }
