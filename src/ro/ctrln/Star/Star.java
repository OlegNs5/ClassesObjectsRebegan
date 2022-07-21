package ro.ctrln.Star;

import java.math.BigDecimal;
import java.util.Objects;


public class Star {
        private String StarDiscription;
        private int diameter;
        private int satellites;
        private BigDecimal mass;
        private SmallPlanet smallPlanet; //variabile de instanta
        private  planeteMici PlaneteMici;

        public static final boolean MILKYWAYSTAR = true; // variabila de clasa

        public Star(){
        }


        public Star(String StarDiscription, int diameter, int satellites, BigDecimal mass) {
            this.StarDiscription = StarDiscription;
            this.diameter = diameter;
            this.satellites = satellites;
            this.mass = mass;


        }

        String getStarDiscription() {
            return StarDiscription;
        }

        int getDiameter() {
            return diameter;
        }

        public int getSatellites() {
            return satellites;
        }

        public BigDecimal getMass() {
            return mass;
        }

        public void setStarDiscription(String starDiscription) {
            StarDiscription = starDiscription;
        }

        public void setDiameter(int diameter) {
            this.diameter = diameter;
        }

        public void setSatellites(int satellites) {
            this.satellites = satellites;
        }

        public void setMass(BigDecimal mass) {
            this.mass = mass;
        }


        public planeteMici getPlaneteMici() {
            return this.PlaneteMici;
        }
    public void setplaneteMici(planeteMici planeteMici) {
            this.PlaneteMici = planeteMici;

    }

        public void setSmallPlanet( SmallPlanet smallPlanet) {
            this.smallPlanet = smallPlanet;
        }
        public SmallPlanet getSmallPlanet(){
           return this.smallPlanet;
}


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Star star = (Star) o;
        return this.diameter == star.diameter &&
                this.satellites == star.satellites &&
                this.StarDiscription.equals(star.StarDiscription) &&
                this.mass.equals(star.mass) &&
                this.smallPlanet.equals(star.smallPlanet) &&
                this.PlaneteMici.equals(star.PlaneteMici);
    }

    @Override
    public int hashCode() {
        return Objects.hash(StarDiscription, diameter, satellites, mass, smallPlanet, PlaneteMici);
    }

    @Override
    public String toString() {
        return "Star{" +
                "StarDiscription='" + StarDiscription + '\'' +
                ", diameter=" + diameter +
                ", satellites=" + satellites +
                ", mass=" + mass +
                ", smallPlanet=" + smallPlanet +
                ", PlaneteMici=" + PlaneteMici +
                '}';
    }


    public void setplaneteMici(String numPlaneteiMici) {
    }
}


