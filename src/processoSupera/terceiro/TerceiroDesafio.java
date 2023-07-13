package processoSupera.terceiro;

import java.util.Scanner;

public class TerceiroDesafio {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Tamanho do array: ");
		int n = scanner.nextInt();

		System.out.print("Valor alvo: ");
		int k = scanner.nextInt();

		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			System.out.print("Digite um valor inteiro: ");
			arr[i] = scanner.nextInt();
		}

		int count = 0;

		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				if (Math.abs(arr[i] - arr[j]) == k) {
					count++;
				}
			}
		}

		System.out.println("Resultado: " + count);
	}
}
