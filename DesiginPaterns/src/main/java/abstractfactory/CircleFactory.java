package abstractfactory;

public class CircleFactory implements ShapeAbstarctFactory {

	@Override
	public Shape createShape() {
		return new Circle();
	}

}
