package HelloApp;

public class Program {

	public static void main(String[] args) {
		double x = 0.4 * Math.pow(10, 4);
		double y = 0.875;
		double z = - 0.475 *Math.pow(10, -3);
		double s = (Math.pow(Math.abs(Math.cos(x) - Math.cos(y)), 
				1 + (2 * Math.pow(Math.sin(y) , 2)))) * (1 + z + (Math.pow(z, 2) / 2) + (Math.pow(z, 3) / 3) + (Math.pow(z, 4) / 4) );
		
		System.out.print(s);
	}

}
