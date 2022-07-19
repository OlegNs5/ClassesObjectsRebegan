package ro.ctrln.Star;

import java.math.BigDecimal;


public class StarsUsege {


        public static void main(String[] args) {


            Star star = new Star();
            star.setStarDiscription("Aceasta este steaua Kepler ");
            star.setDiameter(1000);
            star.setSatellites(15);
            star.setMass(new BigDecimal(2500));
            star.setSmallPlanet(new SmallPlanet());

            System.out.println(star);

            Star mars = new Star("ACEAST ESTE STEAUA MARS ",2000,20,new BigDecimal(5000));
            mars.setSmallPlanet(new SmallPlanet());
            mars.setplaneteMici(new planeteMici());
            System.out.println(mars);

            SmallPlanet starPlanet = new SmallPlanet();
            starPlanet.setPlanetName("numele planetei din jurul stelei este! ");

            SmallPlanet marsPlanet = new  SmallPlanet();
            marsPlanet.setPlanetName("numele planetei din jurul planetei Marte este! ");

            planeteMici numelePlanetei = new planeteMici();
            numelePlanetei.setPlaneteMari("the name of big planes is ");

            star.setSmallPlanet(starPlanet);
            mars.setSmallPlanet(marsPlanet);

            System.out.println(starPlanet.computePlanetLocation(star, 20));
            System.out.println(marsPlanet.computePlanetLocation(mars,30));
            System.out.println(numelePlanetei.computePlanetLocation(mars,40));
        }
    }

