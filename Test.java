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

        Wettbüro wettbüro = new Wettbüro(rennen, 2.0);

        wettbüro.wetteAnnehmen(schnellerSchnecke.getName(), 20, "Paul");
        wettbüro.wetteAnnehmen(langsameSchnecke.getName(), 20, "Henrik");


        System.out.println(wettbüro.toString());

        rennen.durchfuehren();

        gewinner = rennen.ermittleGewinner();
        System.out.println("Gewinner: " + gewinner.getName());
        System.out.println(wettbüro.toString());
    }

}
