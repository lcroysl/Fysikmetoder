package Uppgifter;

public class Fysiklib {
	/**
	 *  Metod som tar in grader farhenheit och ger tillbaka det i grader celsius
	 * @param f Skriv grader farhenheit i nummer
	 * @return Ger tillbaka grader celsius
	 */
	public static double farhentocels(double f) {
		double c = 0;
				c += (f - 32) * 0.55555555555555555556;
				

return c;
	}
	/**
	 *  Metod som tar in grader kelvin och ger tillbaka grader celsius
	 * @param k Skriv grader kelvin i nummer
	 * @return Ger tillbaka grader celsius 
	 */
	
	public static double kelvtocels(double k) {
		k += -273.15;
		return k;
	}

}
