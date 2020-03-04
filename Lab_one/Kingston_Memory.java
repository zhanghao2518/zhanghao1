package Lab_one;

public class Kingston_Memory extends Memory{
	
	public Kingston_Memory() {
		setName("Kingston_Memory");
		setVolume("xGB");
		setPrice(123);
    }
	public Kingston_Memory(String name, String volume, double price) {
		super(name,volume,price);
	}
	
}
