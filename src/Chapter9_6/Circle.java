package Chapter9_6;


public class Circle {
	
	double radius;
	static int numberOfObjects = 0;
	
	Circle(){
		radius = 1;
		numberOfObjects++;
	}
	Circle(double newradius){
		radius = newradius;
		numberOfObjects ++;
	}
	static int getNumberOfObjects() {
		return numberOfObjects;
	}
	double getArea() {
		return radius * radius * Math.PI;
	}


	public static void main(String[] args) {
	// TODO Auto-generated method stub
		System.out.println("Before creating objects");
		System.out.println("The number of Circle objects is "+ Circle.numberOfObjects);
	
		Circle c1 = new Circle();
	
		System.out.println("\nAfter creating c1");
		System.out.println("c1: radius (" + c1.radius + ") and number of Circle objects (" + c1.numberOfObjects + ")");
	
		Circle c2 = new Circle();
		c1.radius = 9;
	
		System.out.println("\n After creating c2 and modifying c1");
		System.out.println("c1: radius (" + c1.radius + ") and number of Circle objects (" + c2.numberOfObjects + ")");
		System.out.println("c2: radius (" + c2.radius + ") and number of Circle objects (" + c2.numberOfObjects + ")");	

 	}
}



