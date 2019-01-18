package Project1;

public class Project1 {

	public static void main(String[] args) {
		System.out.println("*** Decorator Pattern Demo ***");

		Player npcPlayer1 = new Npc();
		Player npcPlayer2 = new Npc();
		Player human = new HumanPlayer();

		System.out.println("Instantiating players:");
		
		System.out.println(npcPlayer1.getDescription());
		System.out.println(npcPlayer2.getDescription());
		System.out.println(human.getDescription());
		
		npcPlayer1 = new Pistol(npcPlayer1);
		npcPlayer2 = new Shotgun(npcPlayer2);
		human = new RocketLauncher(human);
		
		System.out.println("Arming players:");
		System.out.println(npcPlayer1.getDescription() + " Attack Points: " + npcPlayer1.attack());
		System.out.println(npcPlayer2.getDescription()  + " Attack Points: " + npcPlayer2.attack());
		System.out.println(human.getDescription() + " Attack Points: " + human.attack());
		

	}

}
