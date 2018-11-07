package uppgiftprog;

public enum Fysikformgas {
	
	Luft(1.29, 1010, -193),
	Klor(3.21, 500, -34),
	Koldioxid(1.98, 820, -78.3),
	Syre(1.43, 920, -183),
	Väte(0.090, 14200, -253)
	;
	
	double Density;
	double Heatcapacity;
	double boil;
	
	
	Fysikformgas(double d, double h, double s){
		
				 Density = d * 1000;
				 Heatcapacity = h;
				 boil = s;
				 
				 
		
	}
}
