package src.StarCraft.base;

import java.util.ArrayList;
import java.util.List;

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
				
		List<Marine> marines = barack.train(namesMarine);
		Marine martin = barack.train("Martin");
		
//	    gibbs.attack(raynor);
//		while (raynor.getHealthPoint() > 0) {
//			gibbs.attack(raynor);
//		}
	}
}
