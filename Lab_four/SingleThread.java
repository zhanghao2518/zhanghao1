package Lab_four;
//���м������˷�
public class SingleThread {
	private double[][] sum;
    public SingleThread(double[][] sum) {
		// TODO Auto-generated constructor stub
    	this.sum = sum;
	}
    
    public void startDemo() {
    	double[][] sum1 = new double[sum.length][sum.length];
    	long startTime = System.currentTimeMillis();
    	for(int i=0;i<sum1.length;i++) {
    		for(int j=0;j<sum1[i].length;j++) {
    			sum1[i][j] = unitNumber(i, j, sum);
    		}
    	}
    	long endTime = System.currentTimeMillis();
    	System.out.println("�������");
    	System.out.println("ʹ�ã�" + (endTime - startTime));
    }
    
    public double unitNumber(int i,int j, double[][] sum) {
    	double total = 0;
    	for(int k = 0;k<sum.length;k++) {
    		total += sum[i][k] * sum[k][j];
    	}
    	return total;
    }
}
