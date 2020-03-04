package Lab_one;

public class Seagate_HardDisk extends HardDisk{
    
    public Seagate_HardDisk() {
    	setName("Seagate_HardDisk");
		setVolume("xGB");
		setPrice(123);
    }
	public Seagate_HardDisk(String name, String volume, double price) {
		super(name,volume,price);
	}
    
}
