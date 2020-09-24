package Main;

public class Tank extends Vehicle{
	
	public boolean hasTurret;
	public boolean fullTracks;
	public float shellCapacity;
	
	public Tank() {
		super();
	}

	public Tank(String model, String colour, String condition, float value, boolean hasTurret, boolean fullTracks, float shellCapacity) {
		super(model, colour, condition, value);
		this.hasTurret = hasTurret;
		this.fullTracks = fullTracks;
		this.shellCapacity = shellCapacity;
	}
	
	

}
