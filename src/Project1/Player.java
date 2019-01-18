package Project1;

public abstract class Player {
	protected String description = "Base Player";
	
	public String getDescription()
	{
		return description;
	}
	
	public abstract int attack();
}
