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
		Scanner inp = new Scanner(System.in);
	}
	public static void metod8() {
		Scanner inp = new Scanner(System.in);
		double tal1 = inp.nextDouble();
		double tal2 = inp.nextDouble();
		System.out.println(Fysiklib.delta(tal1, tal2));
	}
	public static void metod9() {
		Scanner inp = new Scanner(System.in);
		double vol = inp.nextDouble();
		String vatska = inp.nextLine();
		String vatska1 = vatska.toLowerCase();
		String renvatska = vatska1.substring(0,1).toUpperCase() + vatska1.substring(1, vatska1.length());
		System.out.println(Fysiklib.volumeToMass(Fysikform.valueOf(renvatska), vol));
	}
	public static void metod10() {
		Scanner inp = new Scanner(System.in);
		double vol = inp.nextDouble();
		String gas = inp.nextLine();
		String gas1 = gas.toLowerCase();
		String rengas = gas1.substring(0,1).toUpperCase() + gas1.substring(1, gas1.length());
		System.out.println(Fysiklib.volumeToMass(Fysikformgas.valueOf(rengas), vol));
	}
	public static void metod11() {
		Scanner inp = new Scanner(System.in);
		double vol = inp.nextDouble();
		String solid = inp.nextLine();
		String solid1 = solid.toLowerCase();
		String solidren = solid1.substring(0,1).toUpperCase() + solid1.substring(1, solid1.length());
		System.out.println(Fysiklib.volumeToMass(Fysikformsolid.valueOf(solidren), vol));
	}
	public static void metod12() {
		Scanner inp = new Scanner(System.in);
		double dist = inp.nextDouble();
		double time = inp.nextDouble();
		System.out.println(Fysiklib.svtVelocity(dist, time));
	}
	public static void metod13() {
		Scanner inp = new Scanner(System.in);
		double velo = inp.nextDouble();
		double time = inp.nextDouble();
		System.out.println(Fysiklib.svtDistance(velo, time));
	}
	public static void metod14() {
		Scanner inp = new Scanner(System.in);
		double dist = inp.nextDouble();
		double velo = inp.nextDouble();
		System.out.println(Fysiklib.svtTime(dist, velo));
	}
	public static void metod15() {
		Scanner inp = new Scanner(System.in);
		double kraft = inp.nextDouble();
		double dist = inp.nextDouble();
		System.out.println(Fysiklib.work(kraft, dist));
	}
	public static void metod16() {
		Scanner inp = new Scanner(System.in);
		double work = inp.nextDouble();
		double tid = inp.nextDouble();
		System.out.println(Fysiklib.power(work, tid));
	}
	public static void metod17() {
		Scanner inp = new Scanner(System.in);
		double mass = inp.nextDouble();
		double deltat = inp.nextDouble();
		String solid = inp.nextLine();
		String solid1 = solid.toLowerCase();
		String solidren = solid1.substring(0,1).toUpperCase() + solid1.substring(1, solid1.length());
		System.out.println(Fysiklib.heat(Fysikformsolid.valueOf(solidren), mass, deltat));
	}
	public static void metod18() {
		Scanner inp = new Scanner(System.in);
		double volume = inp.nextDouble();
		double deltat = inp.nextDouble();
		String vatska = inp.nextLine();
		String vatska1 = vatska.toLowerCase();
		String renvatska = vatska1.substring(0,1).toUpperCase() + vatska1.substring(1, vatska1.length());
		System.out.println(Fysiklib.heat(Fysikform.valueOf(renvatska), volume, deltat));
	}
	public static void metod19() {
		Scanner inp = new Scanner(System.in);
		double volume = inp.nextDouble();
		double deltat = inp.nextDouble();
		String gas = inp.nextLine();
		String gas1 = gas.toLowerCase();
		String rengas = gas1.substring(0,1).toUpperCase() + gas1.substring(1, gas1.length());
		System.out.println(Fysiklib.heat(Fysikformgas.valueOf(rengas), volume, deltat));
				
	}
	public static void metod20() {
		Scanner inp = new Scanner(System.in);
		double velo = inp.nextDouble();
		System.out.println(Fysiklib.velocityToHeight(velo));
	}
		
	
	}





