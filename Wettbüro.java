package Schneckenrennen;

import java.util.*;

public class Wettbüro {

	private Rennen rennen;
	private ArrayList<Wette> wetten;
	private double faktor;

	public Wettbüro(Rennen rennen, double faktor) {
		this.rennen = rennen;
		this.faktor = faktor;
		this.wetten = new ArrayList<Wette>();
	}

	public void wetteAnnehmen(String schneckenName, int wettEinsatz, String spieler) {
		Rennschnecke schnecke = null;
		for (Rennschnecke s : rennen.getTeilnehmendeSchnecken()) {
			if (s.getName().equals(schneckenName)) {
				schnecke = s;
				break;
			}
		}
		Wette wette = new Wette(schnecke, wettEinsatz, spieler);
		wetten.add(wette);
	}

	public void rennenDurchfuehren() {
		while (rennen.ermittleGewinner() == null) {
			rennen.lasseSchneckeKriechen();
		}
		for (Wette wette : wetten) {
			if (wette.getSchnecke() == rennen.ermittleGewinner()) {
				wette.auswerten(faktor);
			} else {

			}
		}
	}

	public String toString() {
		String output = "Wettbuero: " + "\n";
		output += "Rennen: " + rennen.getName() + "\n";
		output += "Teilnehmende Schnecken: " + rennen.getTeilnehmendeSchnecken().toString() + "\n";
		output += "Wettfaktor: " + faktor + "\n";
		output += "Wetten: " + "\n";
		for (Wette wette : wetten) {
			output += wette.toString() + "\n";
		}
		return output;
	}

}
