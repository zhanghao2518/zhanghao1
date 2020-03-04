package Lab_one;

public class Gigabyte_MainBoard extends MainBoard{
	
	public Gigabyte_MainBoard() {
		setName("WestDigitals_HardDisk");
		setSpeed("xMB/s");
		setPrice(123);
    }
	public Gigabyte_MainBoard(String name, String speed, double price) {
		super(name,speed,price);
	}
	
}
