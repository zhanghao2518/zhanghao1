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
    public void showList() {
    	showIntroduce(cp1);
    	showWork(cp1);
    	showIntroduce(cp2);
    	showWork(cp2);
    	showIntroduce(cp3);
    	showWork(cp3);
    }
    
    public static void main(String[] args) {
    	ComputerStore cps = new ComputerStore();
    	//组装第一台电脑
    	Computer Cp1 = new Computer("Dell1",new Intel_CPU(),new Samsung_Memory(),new Seagate_HardDisk(),new Asus_MainBoard());
    	cps.setCp1(Cp1);
    	//组装第二台电脑
    	Computer Cp2 = new Computer("Dell2",new Intel_CPU(),new Samsung_Memory(),new Seagate_HardDisk(),new Asus_MainBoard());
    	cps.setCp2(Cp2);
    	//组装第三台电脑
    	Computer Cp3 = new Computer("Dell3",new Intel_CPU(),new Samsung_Memory(),new Seagate_HardDisk(),new Asus_MainBoard());
    	cps.setCp3(Cp3);
    	//展示一览表
    	cps.showList();
    	
    }
}
