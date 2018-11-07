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
	/** 
	 *  Metod som tar in 2 tal och ger tillbaka skillnaden
	 * @param first Skriv ett tal
	 * @param last Skriv ett andra tal
	 * @return Ger tillbaka skillnaden mellan angivna tal
	 */
	public static double delta(double first, double last) {
		double delta = first - last;
		return delta;
	}
	/** 
	 *  Metod som tar in en volym och vätska och ger tillbaka massan
	 * @param fluid Skriv en vätska
	 * @param volume Skriv ett volym i liter
	 * @return Ger tillbaka volymen på vätskan i kilogram
	 */
	public static double volumeToMass(Fysikform fluid, double volume) {
		double volmass = fluid.Density * volume;
		return volmass;
	}
	/**
	 *  metod som tar in en gas och en volym och ger tillbaka massa
	 * @param gas Skriv en gas
	 * @param volume Skriv en volym i liter
	 * @return Ger tillbaka massa av gasens volym
	 */
	public static double volumeToMass(Fysikformgas gas, double volume) {
		double volmass = gas.Density * volume;
		return volmass;
	}
	/** 
	 *  Metod som tar in ett fast ämne och volym och ger tillbaka massa
	 * @param solid Skriv ett fast ämne
	 * @param volume Skriv en volym i liter
	 * @return Ger tillbaka massa i kilogram från volymet av ämnet
	 */
	public static double volumeToMass(Fysikformsolid solid, double volume) {
		double volmass = solid.Density * volume;
		return volmass;
	}
	/**
	 *  Metod som tar in sträcka och tid och ger hastighet
	 * @param distance Skriv en sträcka i meter
	 * @param time Skriv tid i sekunder
	 * @return Ger tillbaka hastighet i m/s
	 */
	public static double svtVelocity(double distance, double time) {
		double speed = distance / time;
		return speed;
	}
	/**
	 *  Metod som tar in hastighet och tid och ger tillbaka sträcka 
	 * @param velocity Skriv hastighet i m/s
	 * @param time Skriv tid i sekunder
	 * @return Ger tillbaka sträcka i meter
	 */
	public static double svtDistance(double velocity, double time) {
		double stracka = velocity / time;
		return stracka;
	}
	/**
	 *  Metod som tar in sträcka och hastighet och ger tillbaka tid
	 * @param distance Skriv sträcka i meter
	 * @param velocity Skriv hastighet i m/s
	 * @return Ger tillbaka tid i sekunder
	 */
	public static double svtTime(double distance, double velocity) {
		double time = distance * velocity;
		return time;
	}
	/**
	 *  Metod som tar in kraft och sträcka och ger tillbaka arbete
	 * @param force Skriv kraft i Newton
	 * @param distance Skriv sträcka i meter
	 * @return Ger tillbaka arbete i N/m
	 */
	public static double work(double force, double distance) {
		double work = force * distance;
		return work;
	}
	/**
	 *  Metod som tar in arbete och tid och ger tillbaka effekt
	 * @param work Skriv arbete i N/m
	 * @param time Skriv tid i sekunder
	 * @return Ger tillbaka effekt i Joule
	 */
	public static double power(double work, double time) {
		double power = work / time;
		return power;
	}
	/**
	 *  Metod som tar ett fast ämne, massa och skillnad i temperatur och ger tillbaka energi
	 * @param solid Skriv ett fast ämne (Järn, silver, is, kol , zink)
	 * @param mass Skriv en massa i kilogram
	 * @param deltaT Skriv skillnad i temperatur i celsius/kelvin
	 * @return Ger tillbaka den krävda energi för att värma upp ämnet
	 */
	public static double heat(Fysikformsolid solid, double mass, double deltaT) {
		double energy = solid.Heatcapacity * mass * deltaT;
		return energy;
	}
	/**
	 * Metod som tar in vätska, volym och skillnad i temperatur och ger tillbaka energi
	 * @param fluid Skriv en vätska (Vatten, bensen, aceton, metanol, etanol)
	 * @param volume Skriv en volym i liter
	 * @param deltaT Skriv skillnad i temperatur i celsius/kelvin
	 * @return Ger tillbaka krävd energi för att värma vätskan
	 */
	public static double heat(Fysikform fluid, double volume, double deltaT) {
		double energy = fluid.Heatcapacity * volume * deltaT;
		return energy;
	}
	/**
	 *  Metod som tar in gas, volum och skillnad i temperatur och ger tillbaka energi
	 * @param gas Skriv en gas (Luft, klor, koldioxid, syre, väte)
	 * @param volume Skriv en volym i liter
	 * @param deltaT Skriv skillnad i temperatur i celsius/kelvin
	 * @return Ger tillbaka krävd energi för att värma gasen
	 */
	public static double heat(Fysikformgas gas, double volume, double deltaT) {
		double energy = gas.Heatcapacity * volume * deltaT;
		return energy;
	}
	/**
	 *  Metod som tar in en hastighet och ger tillbaka höjd
	 * @param velocity Skriv en hastighet i m/s
	 * @return Ger tillbaka höjd i meter
	 */
	public static double velocityToHeight(double velocity) {
		double height = velocity / 2;
		return height;
	}


}
