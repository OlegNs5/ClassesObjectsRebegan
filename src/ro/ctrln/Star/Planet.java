package ro.ctrln.Star;

import java.util.Objects;

public class Planet {
    private String nameOfPlanet;
    private int numberOfOceanes;
    private double mass;
    private short numberOfMoons;
                                //***** CONSTRUCTOR *****//

    public Planet() {} //Constructorul implicit

    public Planet(String nameOfPlanet, int numberOfOceanes, double mass, short numberOfMoons) {
        super(); // Refera classa parinte sau cheama classa parinte. Si trebuie sa fie in prima linie
        this.nameOfPlanet = nameOfPlanet;
        this.numberOfOceanes = numberOfOceanes;
        this.mass = mass;
        this.numberOfMoons = numberOfMoons;
    }
                                 //***** SETTERS *****//

    public void setNameOfPlanet(String nameOfPlanet) {
        this.nameOfPlanet = nameOfPlanet;
    }

    public void setNumberOfOceanes(int numberOfOceanes) {
        this.numberOfOceanes = numberOfOceanes;
    }

    public void setMass(double mass) {
        this.mass = mass;
    }

    public void setNumberOfMoons(short numberOfMoons) {
        this.numberOfMoons = numberOfMoons;
    }
                                //***** GETTERS *****//

    public String getNameOfPlanet() {
        return nameOfPlanet;
    }

    public int getNumberOfOceanes() {
        return numberOfOceanes;
    }

    public double getMass() {
        return mass;
    }

    public short getNumberOfMoons() {
        return numberOfMoons;
    }

    @Override
    public String toString() {
        return "Planet{" +
                "nameOfPlanet='" + nameOfPlanet + '\'' +
                ", numberOfOceanes=" + numberOfOceanes +
                ", mass=" + mass +
                ", numberOfMoons=" + numberOfMoons +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Planet planet = (Planet) o;
        return numberOfOceanes == planet.numberOfOceanes &&
                Double.compare(planet.mass, mass) == 0 &&
                numberOfMoons == planet.numberOfMoons &&
                nameOfPlanet.equals(planet.nameOfPlanet);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameOfPlanet, numberOfOceanes, mass, numberOfMoons);
    }

    public double computeOfMass (int powerOfTen){
        return this.mass * Math.pow(10,powerOfTen); //motoda calcularii mesei planetei
    }
}
