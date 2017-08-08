package starCraft.base;

import java.util.ArrayList;
import java.util.List;

public class Barack {
		
	public List<Marine> train(List<String> namesMarine){
		List<Marine> marines = new ArrayList<Marine>();
		
		for(String name : namesMarine){
			Marine myMarine = new Marine(name);
			namesMarine.add(myMarine.getName());
			marines.add(myMarine);
		}

		return marines;	
	}
}