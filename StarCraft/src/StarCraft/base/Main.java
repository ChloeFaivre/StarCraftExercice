package StarCraft.base;

public class Main {

	public static void main(String[] args){
		System.out.println("Bienvenue dans myStarcraft : " + args[0]);

	    Marine gibbs = new Marine("Gibbs");
	    Marine raynor = new Marine("Raynor");
	    
	    gibbs.attack(raynor);
		while (raynor.getHealthPoint() > 0) {
			gibbs.attack(raynor);
		}
	}
}
