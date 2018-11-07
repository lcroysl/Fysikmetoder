package uppgiftprog;

public enum Fysikform {
	
	Vatten(0.998, 4190, 0, 100),
	Etanol(0.789, 2430, -117, 78.2),
	Metanol(0.791, 2500, -98, 65),
	Aceton(0.790, 2200, -95, 56),
	Bensen(0.879, 1710, 6, 80)
	;
	
	double Density;
	double Heatcapacity;
	double smelt;
	double boil;
	
	Fysikform(double d, double h, double s, double b){
		
				 Density = d * 1000;
				 Heatcapacity = h;
				 smelt = s;
				 boil = b;
				 
		
	}

}



