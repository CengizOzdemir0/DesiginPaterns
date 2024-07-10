package abstractfactory;
/**
 * <h1>ShapeFactory</h1>
 * 
 *  Bı factory classı {@link Shape} Interfacesinden kalıtım almış nesnelerin oluşturulması için kullanılır
 * 
 * @author Cengiz

 */
public class ShapeFactory {
	
	/**
	 * Kendisine pamametre olarak gelen {@code ShapeAbstarctFactory} interfacenin createShape methodunu çalıştırır
	 * @param factory 
	 * @return
	 * @apiNote testapinote
	 */
	public static Shape getShape(ShapeAbstarctFactory factory) {
		return factory.createShape();
	}
}
