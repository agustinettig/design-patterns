package designpatterns.builder;

public class BuilderDemo {
	
	public static void main(String[] args) {
		PlayerBuilder builder = new PlayerBuilder()
				.withName("Lack of creativity")
				.withHealthPoints(15)
				.withCharisma(10)
				.withConstitution(13)
				.withDexterity(16)
				.withIntelligence(11)
				.withStrength(8)
				.withWisdom(10);
		
		Player player = builder.build();
		System.out.println("Name" + player.getName());
		System.out.println("HP: " + player.getHealthPoints());
		System.out.println("CHA: " + player.getCharisma());
		System.out.println("CON: " + player.getConstitution());
		System.out.println("DEX: " + player.getDexterity());
		System.out.println("INT: " + player.getIntelligence());
		System.out.println("STR: " + player.getStrength());
		System.out.println("WIS: " + player.getWisdom());
		
	}

}
