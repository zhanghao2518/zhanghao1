package Lab_four;
//����
public class test {
    public static void main(String[] args) {
		double[][] sum = new MatrixGenerator().randomGeneration();
		System.out.println("��ʼ���м���");
		new SingleThread(sum).startDemo();
		
		System.out.println("��ʼ���м���");
		double[][] result = new double[sum.length][sum.length];
		new MultiThread().startDemo(sum, result);
	}
}
