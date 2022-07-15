package Star;

import java.math.BigDecimal;


public class StarsUsege {


        public static void main(String[] args) {


            Star star = new Star();

            star.setStarDiscription("ACEASTA ESTE STEAUA");
            star.setDiameter(1000);
            star.setSatellites(15);
            star.setMass(new BigDecimal(2500));
            star.setPlanetName("marte");

            System.out.println(star);

        }
    }

