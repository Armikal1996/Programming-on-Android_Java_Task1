package HelloApp;

public class Practice3 {

	public static void main(String[] args) {
		int x = 1;
		double a = 0.1;
		double b = 1;
		double h = (b-a) /10;
		double y = 1;
		int n = 100;
		double s = 0;
		for(int i = 0; i<n; i++) {
			int q = 1;
			for( int j = 1; j<i; j++) { //factoriel
				q *= j;
			}
			s= Math.pow(2*x, i) / q;
			y = Math.exp(2 * x);
		}
		System.out.println("Result is= " + s); 
		System.out.println("Y is= " + y);
	}

}
