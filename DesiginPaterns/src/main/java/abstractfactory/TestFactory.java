package abstractfactory;

public class TestFactory {
	public static void main(String[] args) {
		Circle s = (Circle) ShapeFactory.getShape(new CircleFactory());
		s.setRadius(5);
		System.out.println(s.getArea());
	}
}
