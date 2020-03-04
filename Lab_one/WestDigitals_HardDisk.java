package Lab_one;

public class WestDigitals_HardDisk extends HardDisk{
	
	public WestDigitals_HardDisk() {
		setName("WestDigitals_HardDisk");
		setVolume("xGB");
		setPrice(123);
	}
	public WestDigitals_HardDisk(String name, String volume, double price) {
		super(name,volume,price);
	}
}
