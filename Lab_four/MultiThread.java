package Lab_four;
//并行计算矩阵乘法
public class MultiThread extends Thread{
	private int line;
    private double[][] sum;
    private double[][] sum1;
    
    public MultiThread() {
		// TODO Auto-generated constructor stub
	}
    
    public MultiThread(int line,double[][] sum,double[][] sum1) {
		// TODO Auto-generated constructor stub
    	this.line = line;
    	this.sum = sum;
    	this.sum1 = sum;
	}
    
    public double unitNumber(int i,int j, double[][] sum1) {
    	double total = 0;
    	for(int k = 0;k<sum1.length;k++) {
    		total += sum1[i][k] * sum1[k][j];
    	}
    	return total;
    }
    
    public void run() {
    	for(int i=0;i<sum[line].length;i++) {
    		sum1[line][i] = unitNumber(line, i, sum);
    	}
    }
    
    public void startDemo(double[][] sum,double[][] sum1) {
    	long startTime = System.currentTimeMillis();
    	for(int i=0;i<sum.length;i++) {
    		new MultiThread(i,sum,sum1).start();
    	}
    	long endTime = System.currentTimeMillis();
    	System.out.println("计算完成");
    	System.out.println("使用：" + (endTime - startTime));
    }
}
