package factory;
/**
 * <h1>Computer Interface</h1>
 * @author Cengiz

 */

public interface Computer {
	/**
	 * this method get fiyat as a param or return param
	 * @param fiyat
	 * @return
	 */
	double price(double fiyat);
	/**
	 * for computers name
	 * @param name computer name
	 * @return  computer name
	 */
	String name(String name);
}
