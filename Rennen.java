package Schneckenrennen;

import java.util.*;

public class Rennen {

	private String name;
	private int anzahlteilnehmer;
	private ArrayList<Rennschnecke> teilnehmendeSchnecken;
	private double rennstreckeLaenge;

	public Rennen(String name, int anzahlteilnehmer, double rennstreckeLaenge) {
		this.name = name;
		this.anzahlteilnehmer = anzahlteilnehmer;
		this.teilnehmendeSchnecken = new ArrayList<Rennschnecke>();
		this.rennstreckeLaenge = rennstreckeLaenge;
	}

	public void addRennschnecke(Rennschnecke neueSchnecke) {
		if (teilnehmendeSchnecken.size() < anzahlteilnehmer) {
			teilnehmendeSchnecken.add(neueSchnecke);
		}
	}

	public void removeRennschnecke(String name) {
		for (int i = 0; i < teilnehmendeSchnecken.size(); i++) {
			if (teilnehmendeSchnecken.get(i).getName().equals(name)) {
				teilnehmendeSchnecken.remove(i);
			}
		}
	}

	public String toString() {
		String result = name + "\n" + "Anzahl Teilnehmer: " + anzahlteilnehmer + "\n" + "Teilnehmende Schnecken:\n";
		for (Rennschnecke schnecke : teilnehmendeSchnecken) {
			result += schnecke.toString() + "\n";
		}
		return result += "Rennstrecke Länge: " + rennstreckeLaenge + "\n";
	}

	public Rennschnecke ermittleGewinner(){
		Rennschnecke gewinner = null;
		for (Rennschnecke schnecke : teilnehmendeSchnecken) {
			if (schnecke.getZurueckstrecke() >= rennstreckeLaenge) {
				if (gewinner == null) {
					gewinner = schnecke;
				} else if (schnecke.getZurueckstrecke() > gewinner.getZurueckstrecke()) {
					gewinner = schnecke;
				}
			}
		}
		return gewinner;
	}
	
	public String getName() {
		return name;
	}

	public int getAnzahlteilnehmer() {
		return anzahlteilnehmer;
	}

	public ArrayList<Rennschnecke> getTeilnehmendeSchnecken() {
		return teilnehmendeSchnecken;
	}

	public double getRennstreckeLaenge() {
		return rennstreckeLaenge;
	}

	public void lasseSchneckeKriechen() { 
		for(Rennschnecke schnecke : teilnehmendeSchnecken) {
			schnecke.krieche();
		}
	}
	
	public void durchfuehren(){
		Rennschnecke gewinner = null;
		while (gewinner == null) {
			lasseSchneckeKriechen();
			gewinner = ermittleGewinner();
		}
		System.out.println("Der Gewinner ist: " + gewinner.getName());
	}
	
}
