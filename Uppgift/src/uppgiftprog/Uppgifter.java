package uppgiftprog;

import java.util.Scanner;

public class Uppgifter {
	public static void main(String[] args) {
		q1();
		q2();
	}
	public static void q1() {
			double volym = 80;
			String Jarn = "Jarn";
			System.out.println(Fysiklib.volumeToMass(Fysikformsolid.valueOf(Jarn), volym));
	}
	public static void q2() {
		double velo = 2.8;
		double time = 1;
		System.out.println(Fysiklib.svtDistance(velo, time));
	}
	public static void q3() {
		
	}

}
