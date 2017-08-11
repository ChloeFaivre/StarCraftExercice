package base;

import java.util.ArrayList;
import java.util.List;

public class Barack {
	
	public List<src.StarCraft.base.Marine> train(List<String> namesMarine){
		List<src.StarCraft.base.Marine> marines = new ArrayList<>();
		for(String name : namesMarine){
			src.StarCraft.base.Marine myMarine = new src.StarCraft.base.Marine(name);
			marines.add(myMarine);
		}
		return marines;	
	}
	
	public src.StarCraft.base.Marine train(String namesMarine){
		src.StarCraft.base.Marine myMarine = new src.StarCraft.base.Marine(namesMarine);
		
		return myMarine;
	}
}