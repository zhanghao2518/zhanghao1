package Lab_one;

public abstract class HardDisk {
	private String name,volume;
    private double price;
    
    public HardDisk() {
    }
	public HardDisk(String name, String volume, double price) {
		setName(name);
		setVolume(volume);
		setPrice(price);
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getVolume() {
		return volume;
	}
	public void setVolume(String volume) {
		this.volume = volume;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public void printWork() {
    	System.out.println("HardDisk work");
    }
	@Override
	public String toString() {
		return "HardDisk [name=" + name + ", volume=" + volume + ", price=" + price + "]";
	}
    
}
