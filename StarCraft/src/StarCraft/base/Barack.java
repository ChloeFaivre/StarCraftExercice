package src.StarCraft.base;

import java.util.ArrayList;
import java.util.List;

public class Barack {
	
	public List<Marine> train(List<String> namesMarine){
		List<Marine> marines = new ArrayList<>();
		for(String name : namesMarine){
			Marine myMarine = new Marine(name);
			marines.add(myMarine);
		}
		return marines;	
	}
	
	public Marine train(String namesMarine){
		Marine myMarine = new Marine(namesMarine);
		
		return myMarine;
	}
}