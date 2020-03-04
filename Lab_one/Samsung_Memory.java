package Lab_one;

public class Samsung_Memory extends Memory{
    
    public Samsung_Memory() {
    	setName("Samsung_Memory");
		setVolume("xGB");
		setPrice(123);
    }
	public Samsung_Memory(String name, String volume, double price) {
		super(name,volume,price);
	}
 
}
