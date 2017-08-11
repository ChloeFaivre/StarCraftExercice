package src.StarCraft.base;

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

		System.out.println(this.getName() + " : go go go!");
	}

	private void speak(String txtToSay) {
		System.out.println(this.getName() + " : " + txtToSay);
	}

	public void attack(Marine target) {
		this.speak("Firing at: " + target.getName());
		target.removeHealthPoint(this.attaqueSpeed * this.damage);
	}

	private void status() {
		if (this.healthPoint > 0) {
			this.speak("Il me reste : " + this.healthPoint + " HP.");
		} else {
			this.speak("Dead");
		}
	}

	public void removeHealthPoint(Integer damageTaken) {
		this.healthPoint -= damageTaken;
		this.speak(" a perdu " + damageTaken + " points de vie");
		this.status();
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
