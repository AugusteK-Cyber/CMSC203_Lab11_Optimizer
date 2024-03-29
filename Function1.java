package application;

import java.text.DecimalFormat;

public class Function1 extends Function {

	@Override
	public String answerString(double optVal, double x, double y, double z) {
		DecimalFormat format = new DecimalFormat("#,###,###.##");
		return "Minimum cost is $" + format.format(optVal) + " with height = " 
				+ format.format(y) + "cm and radius = " + format.format(x) + "cm";
	}

	@Override
	public double fnValue(double x) {
		if (x <= 0.0) 
			return Double.MAX_VALUE;
		else 
			return Math.abs(0.8*Math.PI*Math.pow(x, 2) + (800/x));
	}

	@Override
	public double getXVal(double x) {
		return x;
	}

	@Override
	public double getYVal(double x) {
		if (x <= 0.0) 
			return Double.MAX_VALUE;
		else 
			return 2000/(Math.PI*Math.pow(x, 2));
	}

	@Override
	public double getZVal(double x) {
		return -1.0;
	}
	
	@Override
	public String toString() {
		return "Minimize the cost of a can that will hold 2 liters of liquid";
	}
}
