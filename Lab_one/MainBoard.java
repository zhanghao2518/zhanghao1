package Lab_one;

public abstract class MainBoard {
	private String name,speed;
    private double price;
    
    public MainBoard() {
    }
	public MainBoard(String name, String speed, double price) {
		setName(name);
		setSpeed(speed);
		setPrice(price);
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSpeed() {
		return speed;
	}

	public void setSpeed(String speed) {
		this.speed = speed;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	public void printWork() {
    	System.out.println("MainBoard work");
    }
	@Override
	public String toString() {
		return "MainBoard [name=" + name + ", speed=" + speed + ", price=" + price + "]";
	}
	
}
