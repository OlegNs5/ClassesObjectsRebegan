package Star;

import java.math.BigDecimal;


public class Star {
        private String StarDiscription;
        private int diameter;
        private int satellites;
        private BigDecimal mass;
        private String PlanetName;

        public Star(){
        }


        public Star(String StarDiscription, int diameter, int satellites, BigDecimal mass,String PlanetName) {
            this.StarDiscription = StarDiscription;
            this.diameter = diameter;
            this.satellites = satellites;
            this.mass = mass;
            this.PlanetName = PlanetName;
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

        public String getPlanetName() {
            return PlanetName;
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

        public void setPlanetName(String planetName) {
            PlanetName = planetName;
        }

        public String computePlanetLocation(Smallplanet smallPlanet, int location){
            String planetLocation = this.StarDiscription + smallPlanet.getPlanetName() + location ;
            return planetLocation;
        }

        class Smallplanet{
            public String PlanetName;

            Smallplanet(String PlanetName) {
                this.PlanetName = PlanetName;
            }

            public String getPlanetName() {
                return PlanetName;
            }
        }
    }





