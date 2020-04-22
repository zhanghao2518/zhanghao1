package Lab_four;
//Ëæ»úÉú³É¾ØÕó
public class MatrixGenerator {
    private double sum[][];

    public MatrixGenerator() {
		// TODO Auto-generated constructor stub
	}
    
    public double[][] randomGeneration(){
    	int point = (int)(Math.random() * 1999) + 1;
    	sum = new double[point][point];
    	for(int i=0;i<sum.length;i++) {
    		for(int j=0;j<sum[i].length;j++) {
    			sum[i][j] = (int)(Math.random() * 2000);
    		}
    	}
    	return sum;
    }
}
