package starCraft.base;

public class Marine {

	private Integer damage;
	private Integer attaqueSpeed;
	private Integer healthPoint;
	private String name;
	
	public Marine(String name) {
		this.name = name;
		this.damage = 1;
		this.attaqueSpeed = 2;
		this.healthPoint = 10;
		
		System.out.println( this.getName() + " : go go go!");
	}
	
	private void speak(String txtToSay){
		System.out.println( this.getName() + " : " + txtToSay);
	}
	
	public void attack(Marine target){
		this.speak("Firing at: " + target.getName());
	}
	
	private void status(){
		System.out.println(this.getName() + " : il me reste " + this.getHealthPoint() + " HP. Si ses points de vie sont >0 sinon " + this.getName() + " : Dead ");
	}
	
	public void remove(Integer removeHealthpoint){
		removeHealthpoint = this.healthPoint - (this.attaqueSpeed * this.damage);
		System.out.println( this.getName() + " a perdu " + removeHealthpoint + " points de vie");
	}
	
	public Integer getDamage() {
		return damage;
	}

	public void setDamage(Integer damage) {
		this.damage = damage;
	}

	public Integer getAttaqueSpeed() {
		return attaqueSpeed;
	}

	public void setAttaqueSpeed(Integer attaqueSpeed) {
		this.attaqueSpeed = attaqueSpeed;
	}

	public Integer getHealthPoint() {
		return healthPoint;
	}

	public void setHealthPoint(Integer healthPoint) {
		this.healthPoint = healthPoint;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
