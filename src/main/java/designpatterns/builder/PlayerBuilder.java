package designpatterns.builder;

public class PlayerBuilder {

	private String name;
	private int healthPoints;
	private int strength;
	private int dexterity;
	private int charisma;
	private int constitution;
	private int intelligence;
	private int wisdom;

	public PlayerBuilder withName(String name) {
		this.name = name;
		return this;
	}

	public PlayerBuilder withHealthPoints(int healthPoints) {
		this.healthPoints = healthPoints;
		return this;
	}

	public PlayerBuilder withStrength(int strength) {
		this.strength = strength;
		return this;
	}

	public PlayerBuilder withDexterity(int dexterity) {
		this.dexterity = dexterity;
		return this;
	}

	public PlayerBuilder withCharisma(int charisma) {
		this.charisma = charisma;
		return this;
	}

	public PlayerBuilder withConstitution(int constitution) {
		this.constitution = constitution;
		return this;
	}

	public PlayerBuilder withIntelligence(int intelligence) {
		this.intelligence = intelligence;
		return this;
	}

	public PlayerBuilder withWisdom(int wisdom) {
		this.wisdom = wisdom;
		return this;
	}
	
	public Player build() {
		return new Player(name, healthPoints, strength, dexterity, charisma, constitution, intelligence, wisdom);
	}

}
