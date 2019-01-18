package Project1;

public class Pistol extends WeaponDecorator{
	private Player player;
	
	public Pistol(Player p) {
		player = p;
	}
	
	public String getDescription() {
		return player.getDescription() + " has a pistol";
	}
	
	public int attack() {
		return player.attack() + 20;
	}
}
