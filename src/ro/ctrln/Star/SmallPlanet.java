package ro.ctrln.Star;

public class SmallPlanet {
    private String planetName;
    private String planeteMari;

    public String getPlanetName() {
        return this.planetName;
    }

    public void setPlanetName(String planetName) {
        this.planetName = planetName;
    }

    /* public String computePlanetLocation(Star star, int location) {
         String planetLocation = star.getStarDiscription() + this.planetName + location;
         return planetLocation;
     }*/
    public String computePlanetLocation(Star star, int location) {
        return star.getStarDiscription() + this.planetName + location; //aceasta metoda este refacturizata

    }

}

class planeteMici {
    private String planeteMari;

    public void setPlaneteMari(String planeteMari) {
        this.planeteMari = planeteMari;

    }

    public String computePlanetLocation(Star planeteMari, int location) {
        return planeteMari.getStarDiscription() + this.planeteMari + location;
    }
}