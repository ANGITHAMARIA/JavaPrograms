package abstraction;

public class Circle extends Shape {

	@Override
	void display() {
		System.out.println("This is circle");
		
	}
	public static void main(String[] args) {
		Circle d=new Circle();
		d.display();
	}

}
