package ro.ctrln.Star;

import java.util.Objects;

public class SmallPlanet {
    private String planetName;

    public SmallPlanet() {}

    public SmallPlanet(String planetName) {
        this.planetName = planetName;
    }

        public String getPlanetName () {
            return this.planetName;
        }

        public void setPlanetName (String planetName){
            this.planetName = planetName;
        }

    /* public String computePlanetLocation(Star star, int location) {
         String planetLocation = star.getStarDiscription() + this.planetName + location;
         return planetLocation;
     }*/
        public String computePlanetLocation (Star star,int location){
            return star.getStarDiscription() + this.planetName + location; //aceasta metoda este refacturizata

        }

        @Override
        public boolean equals (Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            SmallPlanet that = (SmallPlanet) o;
            return planetName.equals(that.planetName);
        }

        @Override
        public int hashCode () {
            return Objects.hash(planetName);
        }

        @Override
        public String toString () {
            return "SmallPlanet{" +
                    "planetName='" + planetName + '\'' +
                    '}';
        }
    }

class planeteMici {
    private String planeteMari;

   // public planeteMici(){}

   public planeteMici(String planeteMari) {
        this.planeteMari=planeteMari;
   }



    public void setPlaneteMari(String planeteMari) {
        this.planeteMari = planeteMari;

    }

    public String computePlanetLocation(Star planeteMari, int location) {
        return planeteMari.getStarDiscription() + this.planeteMari + location;
    }

    @Override
    public String toString() {
        return "planeteMici{" +
                "planeteMari='" + planeteMari + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        planeteMici that = (planeteMici) o;
        return planeteMari.equals(that.planeteMari);
    }

    @Override
    public int hashCode() {
        return Objects.hash(planeteMari);
    }
}
