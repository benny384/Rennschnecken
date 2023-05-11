package Schneckenrennen;


public class Test {

    public static void main(String[] args) {

        Rennschnecke schnellerSchnecke = new Rennschnecke("Turbo", "Nacktschnecke", 10);
        Rennschnecke langsameSchnecke = new Rennschnecke("Schnecki", "Haus", 10);

        Rennen rennen = new Rennen("Hausrennen", 2, 20);
        rennen.addRennschnecke(schnellerSchnecke);
        rennen.addRennschnecke(langsameSchnecke);

        System.out.println(rennen.toString());

        rennen.durchfuehren();

        Rennschnecke gewinner = rennen.ermittleGewinner();
        System.out.println("Gewinner: " + gewinner.getName());

        Wettb�ro wettb�ro = new Wettb�ro(rennen, 2.0);

        wettb�ro.wetteAnnehmen(schnellerSchnecke.getName(), 20, "Paul");
        wettb�ro.wetteAnnehmen(langsameSchnecke.getName(), 20, "Henrik");


        System.out.println(wettb�ro.toString());

        rennen.durchfuehren();

        gewinner = rennen.ermittleGewinner();
        System.out.println("Gewinner: " + gewinner.getName());
        System.out.println(wettb�ro.toString());
    }

}
