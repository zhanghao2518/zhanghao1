package Lab_one;

public class Asus_MainBoard extends MainBoard{
    
    public Asus_MainBoard() {
    	setName("Asus_MainBoard");
		setSpeed("xMB/s");
		setPrice(123);
    }
	public Asus_MainBoard(String name, String speed, double price) {
		super(name,speed,price);
	}
	
}
