package Schneckenrennen;

import java.util.*;

public class Rennschnecke {

	private String name;
	private String rasse;
	private double maxGeschw;
	private double zurueckstrecke;
	
	public Rennschnecke(String name, String rasse, double maxGeschw){
		this.name = name;
		this.rasse = rasse;
		this.maxGeschw = maxGeschw;
		this.zurueckstrecke = zurueckstrecke;
	}
	
	public void krieche(){
		Random rand = new Random();
		int strecke = rand.nextInt((int) maxGeschw) +1;
		zurueckstrecke += strecke;
	}

	@Override
	public String toString() {
		return "Rennschnecke [name=" + name + ", rasse=" + rasse + ", maxGeschw=" + maxGeschw + ", zurueckstrecke="
				+ zurueckstrecke + "]";
	}
	
	public static void main(String[] args) {
		Rennschnecke schnecke = new Rennschnecke("Paul", "Keine Ahnung", 5);
		for (int i = 0; i< 10; i++){
			schnecke.krieche();
			System.out.println(schnecke);
		}
	}

	public String getName() {
		return name;
	}

	public String getRasse() {
		return rasse;
	}

	public double getMaxGeschw() {
		return maxGeschw;
	}

	public double getZurueckstrecke() {
		return zurueckstrecke;
	}
	
	
}
