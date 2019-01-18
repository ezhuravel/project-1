package Project1;

public class RocketLauncher extends WeaponDecorator {
	private Player player;
	
	public RocketLauncher(Player p) {
		player = p;
	}
	
	public String getDescription() {
		return player.getDescription() + " has a Rocket Launcher!!";
	}
	
	public int attack() {
		return player.attack() + 150;
	}

}
