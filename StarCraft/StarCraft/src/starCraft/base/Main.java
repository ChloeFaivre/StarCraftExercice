package starCraft.base;

public class Main {

	public static void main(String[] args){
		
	    System.out.println("Bienvenue dans chlocraft : " + args[0] );

	    Marine gibbs = new Marine("Gibbs");
	    Marine raynor = new Marine("Raynor");
	    
	    gibbs.attack(raynor);
	    raynor.attack(raynor);
	    raynor.remove(null);
	}
}