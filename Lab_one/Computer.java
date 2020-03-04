package Lab_one;

public class Computer {
	private String name = "未设置";
    private CPU cpu = null;
    private Memory memory = null;
    private HardDisk harddisk = null;
    private MainBoard mainboard = null;
    private double totalprice = -1;
    
    public Computer() {
    }
    //未设置总价默认为组件价格总和
    public Computer(String name, CPU cpu, Memory memory, HardDisk harddisk, MainBoard mainboard) {
		this.name = name;
		this.cpu = cpu;
		this.memory = memory;
		this.harddisk = harddisk;
		this.mainboard = mainboard;
		this.totalprice = cpu.getPrice()+memory.getPrice()+harddisk.getPrice()+mainboard.getPrice();
	}
    //构造时可自行设置总价
	public Computer(String name, CPU cpu, Memory memory, HardDisk harddisk, MainBoard mainboard, double totalprice) {
		this.name = name;
		this.cpu = cpu;
		this.memory = memory;
		this.harddisk = harddisk;
		this.mainboard = mainboard;
		this.totalprice = totalprice;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public CPU getCpu() {
		return cpu;
	}
	public void setCpu(CPU cpu) {
		this.cpu = cpu;
	}
	public Memory getMemory() {
		return memory;
	}
	public void setMemory(Memory memory) {
		this.memory = memory;
	}
	public HardDisk getHarddisk() {
		return harddisk;
	}
	public void setHarddisk(HardDisk harddisk) {
		this.harddisk = harddisk;
	}
	public MainBoard getMainboard() {
		return mainboard;
	}
	public void setMainboard(MainBoard mainboard) {
		this.mainboard = mainboard;
	}
	public double getTotalprice() {
		return totalprice;
	}
	public void setTotalprice(double totalprice) {
		this.totalprice = totalprice;
	}
	public void printWork() {
		System.out.println("Computer work");
	}
	@Override
	public String toString() {
		return "Computer [name=" + name + ", \ncpu=" + cpu + ", \nmemory=" + memory + ", \nharddisk=" + harddisk
				+ ", \nmainboard=" + mainboard + ", \ntotalprice=" + totalprice + "]";
	}
	
}
