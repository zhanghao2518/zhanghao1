package Lab_four;
//测试
public class test {
    public static void main(String[] args) {
		double[][] sum = new MatrixGenerator().randomGeneration();
		System.out.println("开始串行计算");
		new SingleThread(sum).startDemo();
		
		System.out.println("开始并行计算");
		double[][] result = new double[sum.length][sum.length];
		new MultiThread().startDemo(sum, result);
	}
}
