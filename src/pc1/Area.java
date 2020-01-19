package pc1;

public class Area {

	public static double AreaCalculate(double r) {
		return r*r*Math.PI;
	}

	public static double AreaCalculate(int w, int l) {
		return w*l;
	}

	public static double AreaCalculate(double r, double h) {
		return Math.PI*r*r*h;
	}

}
