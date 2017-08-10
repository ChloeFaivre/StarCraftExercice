package src.StarCraft.base;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import src.StarCraft.base.Barack;
import src.StarCraft.base.Marine;


public class Main {

	public static void main(String[] args){
		System.out.println("Bienvenue dans myStarcraft : " + args[0]);

	    /*Marine gibbs = new Marine("Gibbs");*/
		Barack barack = new Barack();
		
		Map<Integer, String> namesMarine = new HashMap<>();	
		
		namesMarine.put(1, "Raynor");
		namesMarine.put(2, "Jim");
		namesMarine.put(3, "Tychus");
		namesMarine.put(4, "Cortana");
				
		List<Marine> marines = barack.train(namesMarine);
		Marine martin = barack.train("Martin");
		//attaquer liste Marine 
		marines.add(martin);
		
		//System.out.println(marines);
		//System.out.println(marines.get(1));
		
		for(int i = 0; i< marines.size() ; i++){
			if(marines.get(i) == marines.get(1)){
				continue;
				}
			marines.get(1).attack(marines.get(i));
			while (marines.get(i).getHealthPoint() > 0){
				marines.get(1).attack(marines.get(i));
			}
		}
	}
}
