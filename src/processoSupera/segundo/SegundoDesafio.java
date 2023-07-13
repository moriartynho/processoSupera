package processoSupera.segundo;

import java.util.Locale;
import java.util.Scanner;

public class SegundoDesafio {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);

		int notasDeCem = 0, notasDeCinquenta = 0, notasDeVinte = 0, notasDeDez = 0, notasDeCinco = 0, notasDeDois = 0,
				moedasDeUmReal, moedasDeCinquenta, moedasDeVinteECinco, moedasDeDez, moedasDeCinco, moedasDeUmCentavo;

		// double valor = scanner.nextDouble();
		Double valor = 576.73;

		while (valor >= 100) {
			notasDeCem++;
			valor -= 100;
		}
		while (valor >= 50) {
			notasDeCinquenta++;
			valor -= 50;
		}
		while (valor >= 20) {
			notasDeVinte++;
			valor -= 20;
		}
		while (valor >= 10) {
			notasDeDez++;
			valor -= 10;
		}
		while (valor >= 5) {
			notasDeCinco++;
			valor -= 5;
		}
		while (valor >= 2) {
			notasDeDois++;
			valor -= 2;
		}
		
		moedasDeUmReal = valor.intValue();
		valor -= moedasDeUmReal;

		moedasDeCinquenta = (int) (valor / 0.50);
		valor -= moedasDeCinquenta * 0.50;

		moedasDeVinteECinco = (int) (valor / 0.25);
		valor -= moedasDeVinteECinco * 0.25;

		moedasDeDez = (int) (valor / 0.10);
		valor -= moedasDeDez * 0.10;

		moedasDeCinco = (int) (valor / 0.05);
		valor -= moedasDeCinco * 0.05;

		moedasDeUmCentavo = (int) Math.round(valor / 0.01);
		
		System.out.println("NOTAS: ");
		System.out.println(notasDeCem + " nota(s) de R$ 100.00");
		System.out.println(notasDeCinquenta + " nota(s) de R$ 50.00");
		System.out.println(notasDeVinte + " nota(s) de R$ 20.00");
		System.out.println(notasDeDez + " nota(s) de R$ 10.00");
		System.out.println(notasDeCinco + " nota(s) de R$ 5.00");
		System.out.println(notasDeDois + " nota(s) de R$ 2.00\n");
		
		System.out.println("MOEDAS:");
		System.out.println(moedasDeUmReal + " moeda(s) de R$ 1.00");
		System.out.println(moedasDeCinquenta + " moeda(s) de R$ 0.50");
		System.out.println(moedasDeVinteECinco + " moeda(s) de R$ 0.25");
		System.out.println(moedasDeDez + " moeda(s) de R$ 0.10");
		System.out.println(moedasDeCinco + " moeda(s) de R$ 0.05");
		System.out.println(moedasDeUmCentavo + " moeda(s) de R$ 0.01");
		scanner.close();

	}

}
