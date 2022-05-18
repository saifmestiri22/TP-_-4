package Beans;

public class RandomBean {
	public double X;
	
	public RandomBean() {
		X = 0.0;
	}
	public  double getX() {
		return X;
	}
	public void setX( double x) {
		X = x;
	}
	
	public double calculRandom(double X) {
		return Math.random()*X ;
	}
}
