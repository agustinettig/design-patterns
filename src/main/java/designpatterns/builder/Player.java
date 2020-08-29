package designpatterns.builder;

public class Player {

	private String name;
	private int healthPoints;
	private int strength;
	private int dexterity;
	private int charisma;
	private int constitution;
	private int intelligence;
	private int wisdom;
	
	public Player(String name, int healthPoints, int strength, int dexterity, int charisma, int constitution,
			int intelligence, int wisdom) {
		this.name = name;
		this.healthPoints = healthPoints;
		this.strength = strength;
		this.dexterity = dexterity;
		this.charisma = charisma;
		this.constitution = constitution;
		this.intelligence = intelligence;
		this.wisdom = wisdom;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getHealthPoints() {
		return healthPoints;
	}

	public void setHealthPoints(int healthPoints) {
		this.healthPoints = healthPoints;
	}

	public int getStrength() {
		return strength;
	}

	public void setStrength(int strength) {
		this.strength = strength;
	}

	public int getDexterity() {
		return dexterity;
	}

	public void setDexterity(int dexterity) {
		this.dexterity = dexterity;
	}

	public int getCharisma() {
		return charisma;
	}

	public void setCharisma(int charisma) {
		this.charisma = charisma;
	}

	public int getConstitution() {
		return constitution;
	}

	public void setConstitution(int constitution) {
		this.constitution = constitution;
	}

	public int getIntelligence() {
		return intelligence;
	}

	public void setIntelligence(int intelligence) {
		this.intelligence = intelligence;
	}

	public int getWisdom() {
		return wisdom;
	}

	public void setWisdom(int wisdom) {
		this.wisdom = wisdom;
	}

}
