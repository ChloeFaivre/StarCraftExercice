package com.starcraft;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class Main {

	public static void main(String[] args){
		System.out.println("Bienvenue dans myStarcraft : " + args[0]);

	    /*Marine gibbs = new Marine("Gibbs");*/
		Barack barack = new Barack();
		
		List<String> namesMarine = new ArrayList<>();	
		namesMarine.add("Raynor");
		namesMarine.add("Jim");
		namesMarine.add("Tychus");
		namesMarine.add("Cortana");
		namesMarine.add("Martin");
		
		Map<String, Marine> marines = new HashMap<>();
		
		for (Integer i = 0; i < namesMarine.size(); i++) {
			Marine marine = new Marine(namesMarine.get(i));
			marines.put(namesMarine.get(i), marine);
		}
		
		String champion = "Raynor";
		
		for (Entry<String, Marine> entry : marines.entrySet()) {
			String myName = entry.getKey();
			Marine myMarine = entry.getValue();
			if (myName != champion) {
				while (myMarine.getHealthPoint() > 0){
					marines.get(champion).attack(myMarine);
				}
			}
		}		
	}
}
