package starCraft.base;

import java.util.ArrayList;
import java.util.List;

public class Baracks {
	
	public void train(List<String> listNom){
		List<String> listeNom = new ArrayList<String>();
		
		//ajoute nom du Marine
		listeNom.add("");
		
		for(int i = 0; i < listeNom.size(); i++){
			System.out.println("Creation du Marine " + listeNom.get(i));
		}
		
	}

}
