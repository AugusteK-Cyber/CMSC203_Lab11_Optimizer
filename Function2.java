package application;

import java.text.DecimalFormat;

public class Function2 extends Function {

	@Override
	public String answerString(double optVal, double x, double y, double z) {
		DecimalFormat format = new DecimalFormat("#,###,###.##");
		return "Minimum time is " + format.format(optVal) + " seconds if the dog jumps in the ocean " 
				+ "at point "+ format.format(x) + " meters from the starting point A.";
	}

	@Override
	public double fnValue(double x) {
		if (x < 0.0 || x > 4.0) 
			return Double.MAX_VALUE;
		else 
			return Math.abs((x/3)+(2*(Math.sqrt(Math.pow(x, 2) - (8*x) + 25))));
	}

	@Override
	public double getXVal(double x) {
		return x;
	}

	@Override
	public double getYVal(double x) {
		return -1;
	}

	@Override
	public double getZVal(double x) {
		return -1;
	}
	
	@Override
	public String toString() {
		return "Minimize the distance a dog will run and swim to retrieve a ball in the ocean";
	}
}
