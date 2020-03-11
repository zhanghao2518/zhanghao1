package Homework;

public class Homework_1 {
	public static void main(String[] args) {
		Singleton sing1,sing2;
		sing1 = Singleton.getSingleton();
		sing2 = Singleton.getSingleton();
		System.out.println("改变前：sing1 " + sing1.getTest() + " sing2 " + sing2.getTest());
//		sing1.setTest(123);
		sing2.setTest(123);
		System.out.println("改变后：sing1 " + sing1.getTest() + " sing2 " + sing2.getTest());
	}

}
class Singleton{
	private int test = 0;
	private static final Singleton sing = new Singleton();
	private Singleton() {
		
	}
	public static Singleton getSingleton() {
		return sing;
	}
	public int getTest() {
		return test;
	}
	public void setTest(int test) {
		this.test = test;
	}
}
