package Lab_one;

public class Intel_CPU extends CPU{
    
    public Intel_CPU() {
    	setName("Intel_CPU");
		setCoreNum("xxxxxx");
		setPrice(123);
    }
    public Intel_CPU(String name,String coreNum,double price) {
    	super(name,coreNum,price);
    }
    
}
