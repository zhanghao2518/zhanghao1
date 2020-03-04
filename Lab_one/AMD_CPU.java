package Lab_one;

public class AMD_CPU extends CPU{
	
	public AMD_CPU() {
		setName("AMD_CPU");
		setCoreNum("xxxxxx");
		setPrice(123);
	 }
	 public AMD_CPU(String name, String coreNum, double price) {
		 super(name,coreNum,price);
	 }
	 
}
