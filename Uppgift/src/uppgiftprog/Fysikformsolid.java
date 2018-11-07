package uppgiftprog;

public enum Fysikformsolid {
	Is(0.92, 2200, 0),
	Jarn(7.87, 450, 1538),
	Kol(2.2, 710, 3652),
	Zink(7.13, 390, 420),
	Silver(10.5, 240, 962)
	;
	
	double Density;
	double Heatcapacity;
	double smelt;
	
	
	Fysikformsolid(double d, double h, double s){
		
				 Density = d * 1000;
				 Heatcapacity = h;
				 smelt = s;
				 
				 
		
	}

}
