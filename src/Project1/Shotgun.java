package Project1;

public class Shotgun extends WeaponDecorator{
	private Player player;
	
	public Shotgun(Player p) {
		player = p;
	}
	
	public String getDescription() {
		return player.getDescription() + " has shotgun";
	}
	
	public int attack() {
		return player.attack() + 50;
	}
}
