package Schneckenrennen;

public class Wette {
    
    private Rennschnecke schnecke;
    private int einsatz;
    private String spieler;
    private boolean gewonnen;
    
    public Wette(Rennschnecke schnecke, int einsatz, String spieler) {
        this.schnecke = schnecke;
        this.einsatz = einsatz;
        this.spieler = spieler;
    }
    
    public void auswerten(double faktor) {
        gewonnen = true;
        einsatz *= faktor;
    }
    
    public String toString() {
        String output = spieler + " wettet " + einsatz + " auf Schnecke " + schnecke.getName();
        if (gewonnen) {
            output += " und gewinnt";
        } else {
            output += " und verliert";
        }
        return output;
    }
    
    public Rennschnecke getSchnecke() {
        return schnecke;
    }
    
}