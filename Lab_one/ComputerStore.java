package Lab_one;

public class ComputerStore {
    private Computer cp1 = null;
    private Computer cp2 = null;
    private Computer cp3 = null;
    
    public Computer getCp1() {
		return cp1;
	}
	public void setCp1(Computer cp1) {
		this.cp1 = cp1;
	}
	public Computer getCp2() {
		return cp2;
	}
	public void setCp2(Computer cp2) {
		this.cp2 = cp2;
	}
	public Computer getCp3() {
		return cp3;
	}
	public void setCp3(Computer cp3) {
		this.cp3 = cp3;
	}
	public void showIntroduce(Computer cp) {
		System.out.println(cp.toString());
    }
    public void showPrice(Computer cp) {
    	System.out.println("TotalPrice: " + cp.getTotalprice());
    }
    public void showWork(Computer cp) {
    	cp.printWork();
    }
    
    public static void main(String[] args) {
    	//组装第一台电脑
    	Computer cp = new Computer("Dell",new Intel_CPU(),new Samsung_Memory(),new Seagate_HardDisk(),new Asus_MainBoard());
    	ComputerStore cps = new ComputerStore();
    	cps.setCp1(cp);
    	cps.showIntroduce(cps.getCp1());
    	System.out.println();
    	cps.showPrice(cps.getCp1());
    	System.out.println();
    	cps.showWork(cps.getCp1());
    }
}
