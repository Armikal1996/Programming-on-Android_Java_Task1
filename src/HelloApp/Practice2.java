package HelloApp;

public class Practice2 {

	public static void main(String[] args) {
		int k = 1;
		double x = -5;
		double y = 3;
		double f = 0;
		double s;
		switch(k) {
		case 1: f = Math.sinh(x);
		case 2: f = Math.pow(x, 2);
		case 3: f = Math.exp(x);
		}
		if(Math.pow(x, 3) > 0) s = Math.log(Math.pow(f, 3));
		else if(Math.pow(x, 3) < 0) s = Math.tan(Math.pow(x, 3) + f);
		else s = Math.cbrt(Math.abs(Math.pow(y, 3) - Math.pow(x, 2)));
		
		System.out.println(s);
	}

}
