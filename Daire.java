package daire;

import java.util.Scanner;

public class Daire {

	public static void main(String[] args) {
		
		Scanner cap = new Scanner(System.in);
		
		System.out.print("Yarı Çap Değerini Giriniz : ");
		
		double r = cap.nextDouble();
		
		Scanner aci = new Scanner(System.in);
		
		System.out.print("Merkez Açısının Ölçüsünü Giriniz : ");
		
		double a = aci.nextDouble();
		
		double pi = 3.14;
		
		double rKare = r*r;
		
		double alan = (pi*rKare*a)/360;
		
		System.out.println("Dairenin Alanı : " + alan);
		
		
		
		
		
		
		
		

	}

}
