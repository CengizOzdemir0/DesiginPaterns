package abstractfactory;

public class RectangleFactory implements ShapeAbstarctFactory {

	@Override
	public Shape createShape() {
		return new Rectangle();
	}

}
