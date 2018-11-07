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
	 *  Metod som tar in en v�tska som �r i v�tsketabellen och ett djup och ger tillbaka v�tsketrycket
	 * @param Fluid Skriv en v�tska ur v�tsketabellen(vatten,etanol,metanol,aceton,bensen)
	 * @param Deep Skriv ett djup i meter
	 * @return Ger tillbaka v�tsketrycket fr�n den valda v�tskan i pascal
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
	 *  Metod som tar in en massa och hastighet och ger r�relseenergi i joule
	 * @param mass Skriv massa i kilogram
	 * @param velocity Skriv en hastighet i m/s
	 * @return Ger tillbaka r�relseenrgi i joule
	 */
	public static double kineticEnergy(double mass, double velocity) {
		double KinetiskE = 0;
		KinetiskE = (mass * velocity * velocity) / 2;
		return KinetiskE;
	}
	/**
	 *  Metod som tar in massa och h�jd och ger l�gesenergi (potentiell energi) i joule
	 * @param mass Skriv massa i kilogram
	 * @param height Skriv en h�jd i meter
	 * @return Ger tillbaka l�gesenergin i joule
	 */
	public static double potentialEnergy(double mass, double height) {
		double potE = 0;
		potE = mass * 9.82 * height;
		return potE;
	}
	/**
	 *  Metod som tar en h�jd och ger hastighet i meter per sekunder efter fritt fall
	 * @param height Skriv en h�jd i meter
	 * @return Ger tillbaka hastigheten efter fritt fall fr�n angett h�jd
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
	 *  Metod som tar in en volym och v�tska och ger tillbaka massan
	 * @param fluid Skriv en v�tska
	 * @param volume Skriv ett volym i liter
	 * @return Ger tillbaka volymen p� v�tskan i kilogram
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
	 *  Metod som tar in ett fast �mne och volym och ger tillbaka massa
	 * @param solid Skriv ett fast �mne
	 * @param volume Skriv en volym i liter
	 * @return Ger tillbaka massa i kilogram fr�n volymet av �mnet
	 */
	public static double volumeToMass(Fysikformsolid solid, double volume) {
		double volmass = solid.Density * volume;
		return volmass;
	}
	/**
	 *  Metod som tar in str�cka och tid och ger hastighet
	 * @param distance Skriv en str�cka i meter
	 * @param time Skriv tid i sekunder
	 * @return Ger tillbaka hastighet i m/s
	 */
	public static double svtVelocity(double distance, double time) {
		double speed = distance / time;
		return speed;
	}
	/**
	 *  Metod som tar in hastighet och tid och ger tillbaka str�cka 
	 * @param velocity Skriv hastighet i m/s
	 * @param time Skriv tid i sekunder
	 * @return Ger tillbaka str�cka i meter
	 */
	public static double svtDistance(double velocity, double time) {
		double stracka = velocity / time;
		return stracka;
	}
	/**
	 *  Metod som tar in str�cka och hastighet och ger tillbaka tid
	 * @param distance Skriv str�cka i meter
	 * @param velocity Skriv hastighet i m/s
	 * @return Ger tillbaka tid i sekunder
	 */
	public static double svtTime(double distance, double velocity) {
		double time = distance * velocity;
		return time;
	}
	/**
	 *  Metod som tar in kraft och str�cka och ger tillbaka arbete
	 * @param force Skriv kraft i Newton
	 * @param distance Skriv str�cka i meter
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
	 *  Metod som tar ett fast �mne, massa och skillnad i temperatur och ger tillbaka energi
	 * @param solid Skriv ett fast �mne (J�rn, silver, is, kol , zink)
	 * @param mass Skriv en massa i kilogram
	 * @param deltaT Skriv skillnad i temperatur i celsius/kelvin
	 * @return Ger tillbaka den kr�vda energi f�r att v�rma upp �mnet
	 */
	public static double heat(Fysikformsolid solid, double mass, double deltaT) {
		double energy = solid.Heatcapacity * mass * deltaT;
		return energy;
	}
	/**
	 * Metod som tar in v�tska, volym och skillnad i temperatur och ger tillbaka energi
	 * @param fluid Skriv en v�tska (Vatten, bensen, aceton, metanol, etanol)
	 * @param volume Skriv en volym i liter
	 * @param deltaT Skriv skillnad i temperatur i celsius/kelvin
	 * @return Ger tillbaka kr�vd energi f�r att v�rma v�tskan
	 */
	public static double heat(Fysikform fluid, double volume, double deltaT) {
		double energy = fluid.Heatcapacity * volume * deltaT;
		return energy;
	}
	/**
	 *  Metod som tar in gas, volum och skillnad i temperatur och ger tillbaka energi
	 * @param gas Skriv en gas (Luft, klor, koldioxid, syre, v�te)
	 * @param volume Skriv en volym i liter
	 * @param deltaT Skriv skillnad i temperatur i celsius/kelvin
	 * @return Ger tillbaka kr�vd energi f�r att v�rma gasen
	 */
	public static double heat(Fysikformgas gas, double volume, double deltaT) {
		double energy = gas.Heatcapacity * volume * deltaT;
		return energy;
	}
	/**
	 *  Metod som tar in en hastighet och ger tillbaka h�jd
	 * @param velocity Skriv en hastighet i m/s
	 * @return Ger tillbaka h�jd i meter
	 */
	public static double velocityToHeight(double velocity) {
		double height = velocity / 2;
		return height;
	}


}
