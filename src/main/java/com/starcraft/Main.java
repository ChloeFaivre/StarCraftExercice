package com.starcraft;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
				
		Map<Integer, Marine> marines = new HashMap<>();
		//Map<Integer, Marine> marines = new HashMap<Integer, barack.train(namesMarine)>();
		//marines.put(key, barack.train(namesMarine));
		//marines.put(Index, namesMarine);
		Marine martin = barack.train("Martin");
		//attaquer liste Marine 
		marines.put(1, martin);
		
		
		namesMarine[10];// ==> ceci est un tableau d'une taille 10 c'est pas bien on fait des list

		for (i = 0; i < 10; i++) {
			Marine marine = New Marine(nameList[i]);
			myMap.put(nameList[i], marine);
		}
		
		
		
		//Tout d'abord j'instancie une map qui va prendre comme cle (==key, ==k) une string (== nom du marine) et comme valeur un objet de type marine
		//Ensuite comme j'ai une liste avec tout les noms des marines, je vais boucler sur tous ces marines.
		//pour chacun de ses nom de marines je vais :
		// 			créer un marine
		// 			et l'ajouter à ma map (avec pour clé le nom du marine et pour valeur le marine nouvellement créer)
		
		
		
		
		//List<Marine> marines = barack.train(namesMarine);
		System.out.println(marines);
		//System.out.println(marines.get(1));
		//Revoir le tout pour modifier en map
		for(int i = 0; i< marines.size() ; i++){
			if(marines.get(i) == marines.get(1)){
				continue;
				}
			marines.get(1).attack(marines.get(i));
			while (marines.get(i).getHealthPoint() > 0){
				marines.get(1).attack(marines.get(i));
			}
		}
		
		//une solution ou raynor est le champion
		for(int i = 1; i< marines.size() ; i++){
			while (marines.get(i).getHealthPoint() > 0){
				marines.get(0).attack(marines.get(i));
			}
		}
		
	}
}
