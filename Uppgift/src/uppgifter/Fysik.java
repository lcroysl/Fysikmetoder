package Uppgifter;

import java.util.Scanner;

public class Fysik {
	
	
	public static void main(String[] args) {
		
		metod1();
		metod2();
		
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
		
		
	}



