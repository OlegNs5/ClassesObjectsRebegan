package ro.ctrln.Star;

import java.math.BigDecimal;


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

    public void setplaneteMici( planeteMici PlaneteMici) {
        this.PlaneteMici = PlaneteMici;
    }
        public planeteMici getPlaneteMici() {
            return this.PlaneteMici;
        }

        public void setSmallPlanet( SmallPlanet smallPlanet) {
            this.smallPlanet = smallPlanet;
        }
        public SmallPlanet getSmallPlanet(){
           return this.smallPlanet;
}


        public String computePlanetLocation(SmallPlanet smallPlanet, int location){
            String planetLocation = this.StarDiscription + smallPlanet.getPlanetName() + location ;
            return planetLocation;
        }

}

    class SmallPlanet{
            private String planetName;

                public String getPlanetName() {
        return this.planetName;
    }

        public void setPlanetName(String planetName) {
                    this.planetName = planetName;
        }
    }


class planeteMici{
    private String planeteMari;
}
