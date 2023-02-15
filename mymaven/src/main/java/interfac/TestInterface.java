package interfac;

public class TestInterface implements Printable1, Printable2 {

	public void draw() {
		System.out.println("Multiple inheritance achieved");

	}
	public static void main(String[] args) {
		TestInterface i=new TestInterface();
		i.draw();
	}
}
