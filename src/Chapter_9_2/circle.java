package Chapter_9_2;

public class circle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		circle circle1 = new circle();
		System.out.println("The area of the circle of radius "+circle1.radius + " is " +circle1.getArea());
		circle circle2 = new circle();
		System.out.println("The area of the circle of radius "+circle2.radius + " is " +circle2.getArea());
		circle circle3 = new circle();
		System.out.println("The area of the circle of radius "+circle3.radius + " is " +circle3.getArea());
		circle2.radius = 100;
		System.out.println("The area of the circle of radius "+circle2.radius + " is " +circle2.getArea());

	}
	double radius;
	circle(){
		radius = 1;
	}
	circle(double newRadius){
		radius = newRadius;
	}
	double getArea() {
		return radius*radius *Math.PI;

	}
	double getPerimeter() {
		return 2 * radius * Math.PI;
	}

	void setRadius(double newRadius) {
		radius = newRadius;
	}
}
