package Chapter9_6;

public class TestCiecle9_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Before creating objects");
		System.out.println("The number of Circle object is" + Circle.numberOfObjects);
		
		Circle c1 = new Circle();
		
		System.out.println("\nAfter creating c1");
		System.out.println("c1 :radius(" + c1.radius + ") and number of Circle object(" + c1.numberOfObjects + ")");
		
		Circle c2 =new Circle(5);
		
		c1.radius = 9;
		
		System.out.println("\nAfter creating c2");
		System.out.println("c1 :radius(" + c1.radius + ") and number of Circle object(" + c1.numberOfObjects + ")");
		System.out.println("c2 :radius(" + c2.radius + ") and number of Circle object(" + c2.numberOfObjects + ")");

		
		
	}

}
