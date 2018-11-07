package uppgiftprog;

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
	
	
	/**
	 *  Metod som tar in en vätska som är i vätsketabellen och ett djup och ger tillbaka vätsketrycket
	 * @param Fluid Skriv en vätska ur vätsketabellen(vatten,etanol,metanol,aceton,bensen)
	 * @param Deep Skriv ett djup i meter
	 * @return Ger tillbaka vätsketrycket från den valda vätskan i pascal
	 */
	public static double fluidpressure(Fysikform fluid, double deep) {
		double P = 0;
		P = fluid.Density * deep * 9.82;
		return P;
}
	/**
	 *  Metod som tar in djup och ger vattentryck i pascal
	 * @param depth Skriv ett djup i meter
	 * @return Ger tillbaka vattentrycket i pascal
	 */
	public static double waterpress(double depth) {
		double press = 0;
		press = Fysikform.Vatten.Density * depth * 9.82;
		return press;
	}
	/**
	 *  Metod som tar in en massa och hastighet och ger rörelseenergi i joule
	 * @param mass Skriv massa i kilogram
	 * @param velocity Skriv en hastighet i m/s
	 * @return Ger tillbaka rörelseenrgi i joule
	 */
	public static double kineticEnergy(double mass, double velocity) {
		double KinetiskE = 0;
		KinetiskE = (mass * velocity * velocity) / 2;
		return KinetiskE;
	}
	/**
	 *  Metod som tar in massa och höjd och ger lägesenergi (potentiell energi) i joule
	 * @param mass Skriv massa i kilogram
	 * @param height Skriv en höjd i meter
	 * @return Ger tillbaka lägesenergin i joule
	 */
	public static double potentialEnergy(double mass, double height) {
		double potE = 0;
		potE = mass * 9.82 * height;
		return potE;
	}
	/**
	 *  Metod som tar en höjd och ger hastighet i meter per sekunder efter fritt fall
	 * @param height Skriv en höjd i meter
	 * @return Ger tillbaka hastigheten efter fritt fall från angett höjd
	 */
	public static double fallSpeed(double height) {
		double h = 0;
		h = height / 9.82;
		return h;
	}


}
