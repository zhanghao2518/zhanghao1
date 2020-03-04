package Lab_one;

public abstract class CPU {
	private String name,coreNum;
    private double price = -1;
    
    public CPU() {
    }
    public CPU(String name,String coreNum,double price) {
    	setName(name);
    	setCoreNum(coreNum);
    	setPrice(price);
    }
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCoreNum() {
		return coreNum;
	}
	public void setCoreNum(String coreNum) {
		this.coreNum = coreNum;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public void printWork() {
    	System.out.println("CPU work");
    }
	@Override
	public String toString() {
		return "CPU [name=" + name + ", coreNum=" + coreNum + ", price=" + price + "]";
	} 
	
}
