package abstraction;

public class Circle extends Shape {

	@Override
	void display() {
		System.out.println("This is Circle");
		
	}
	public static void main(String[] args) {
		Circle c=new Circle();
		c.display();
	}

}
