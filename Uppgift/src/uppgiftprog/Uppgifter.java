package uppgiftprog;

import java.util.Scanner;

public class Uppgifter {
	public static void main(String[] args) {
		q1();
		q2();
		q3();
		q4();
		q5();
		q6();
		q7();
		q8();
		q9();
		q10();
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
		double volume = 5;
		double deltat = 1;
		String vatska = "Vatten";
		System.out.println(Fysiklib.heat(Fysikform.valueOf(vatska), volume, deltat));
	}
	public static void q4() {
		String vatska = "Vatten";
		double djup = 100;
		System.out.println(Fysiklib.fluidpressure(Fysikform.valueOf(vatska), djup) + 101300);
	}
	public static void q5() {
		double velo = 13.88888888;
		System.out.println(Fysiklib.velocityToHeight(velo));
	}
	public static void q6() {
		double tid = 4.4;
		double work = (740 * 9.82 * 100) / tid;
		System.out.println(Fysiklib.power(work, tid));
	}
	public static void q7() {
		
	}
	public static void q8() {
		double kraft = 50 * 9.82;
		double dist = 210 * 3;
		System.out.println(Fysiklib.work(kraft, dist));
	}
	public static void q9() {
		double deep = 327;
		System.out.println(Fysiklib.waterpress(deep));
	}
	public static void q10() {
		
	}

}
