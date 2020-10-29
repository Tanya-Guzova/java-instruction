package ui;

import java.util.ArrayList;
import java.util.List;

import business.Pirate;

public class PirateFightApp {
	private static List<Pirate> pirates = new ArrayList<>();
	
	public static void main(String[] args) {
		System.out.println("Welcome to the Pirate Fight App");
		//create some pirates and store in the list
		pirates.add(new Pirate("BlackBeard"));
		pirates.add(new Pirate("Jack Sparrow"));
		pirates.add(new Pirate("Captain Hook"));
		pirates.add(new Pirate("Long John Silver"));
		pirates.add(new Pirate("Willy Stargill"));
		printPirateStats();
		//simulate a fight by generating a random index
		//pick a pirate, then lose a limb
		//total of 10 times 
		for (int i=0; i<10; i++) {
			int pirateIdx = genRandomIndex();
			Pirate p = pirates.get(pirateIdx);
			p.loseALimb();
			if (p.isDead()) {
				pirates.remove(pirateIdx);
			}
		}
		System.out.println("Bye, Matey!");
	}

	private static int genRandomIndex() {
		int r = (int)Math.random() * pirates.size();
		return r;
	}
	
	private static void printPirateStats() {
		System.out.println("****Pirate Stats****");
		System.out.println("Total Pirates: " + Pirate.numPirates);
		System.out.println("Total Limbs Lost: " + Pirate.totalLimbsLost);
		for (Pirate p: pirates) {
			System.out.println(p);
		}
	}
}
