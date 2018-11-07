package uppgiftprog;

import java.util.Scanner;

public class Fysik {
	
public static void main(String[] args) {
		
		metod1();
		metod2();
		metod3();
		metod4();
		metod5();
		
	}
	public static void metod1(){
		Scanner inp = new Scanner(System.in);
		double farhen = inp.nextDouble();
		System.out.println(Fysiklib.farhentocels(farhen));
	}
	public static void metod2() {
		Scanner inp = new Scanner(System.in);
		double kelvin = inp.nextDouble();
		System.out.println(Fysiklib.kelvtocels(kelvin));
	}
	public static void metod3() {
		Scanner inp = new Scanner(System.in);
		String vatska = inp.nextLine();
		String vatska1 = vatska.toLowerCase();
		String renvatska = vatska1.substring(0, 1).toUpperCase() + vatska1.substring(1, vatska1.length());
		double djup = inp.nextDouble();
		System.out.println(Fysiklib.fluidpressure(Fysikform.valueOf(renvatska), djup));
	}
	public static void metod4() {
		Scanner inp = new Scanner(System.in);
		double djup = inp.nextDouble();
		System.out.println(Fysiklib.waterpress(djup));
	}
	public static void metod5() {
		Scanner inp = new Scanner(System.in);
		double hastighet = inp.nextDouble();
		double massa = inp.nextDouble();
		System.out.println(Fysiklib.kineticEnergy(massa, hastighet));
	}
	public static void metod6() {
		Scanner inp = new Scanner(System.in);
		double massa = inp.nextDouble();
		double hojd = inp.nextDouble();
		System.out.println(Fysiklib.potentialEnergy(massa, hojd));
	}
	public static void metod7() {
		Scanner inp = new Scanner()
	}
		
	
	}





