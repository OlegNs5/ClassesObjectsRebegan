package ro.ctrln.Star;

public class PlanetUsege {
    public static void main(String[] args) {
        Planet mercury = new Planet();
        System.out.println(mercury.getNameOfPlanet());
        System.out.println(mercury.getNumberOfMoons());
        System.out.println(mercury.getNumberOfOceanes());
        System.out.println(mercury.getMass());

        mercury.setNameOfPlanet("Mercur");
        mercury.setNumberOfMoons((short) 10);
        mercury.setNumberOfOceanes(5);
        mercury.setMass(330);

       /* System.out.print(mercury.getNameOfPlanet() + " are ");
        System.out.print(mercury.getNumberOfMoons() + " luni ");
        System.out.print(mercury.getNumberOfOceanes() + " Oceane si grutatea ei este de ");
        System.out.println(mercury.getMass() + " de tone");*/

        System.out.println(mercury.getNameOfPlanet());
        System.out.println(mercury.getNumberOfMoons());
        System.out.println(mercury.getNumberOfOceanes());
        System.out.println(mercury.getMass());

        System.out.println(mercury);

                                    //***** Create a new object with construction *****//

        Planet venus = new Planet("venus",3,488,(short)20);
        System.out.println(venus);

        System.out.println("hashcode mercury: " + mercury.hashCode());
        System.out.println("hashcode venus: " + venus.hashCode());

//        mercury.setNameOfPlanet(venus.getNameOfPlanet());
//        mercury.setMass(venus.getMass());
//        mercury.setNumberOfOceanes(venus.getNumberOfOceanes());
//        mercury.setNumberOfMoons(venus.getNumberOfMoons());

//     (sau asa)   mercury = venus; //*** Un obiect copie alt obiect *** cu tot cu locatia din momoria calculatorului

        System.out.println( "mercury.equals(venus)" + mercury.equals(venus)); //(boolean) returned true or false

        System.out.println("mercury computeMass " + mercury.computeOfMass(22));
        System.out.println("venus computeMass " +venus.computeOfMass(22));
    }
}
