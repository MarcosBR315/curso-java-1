package curso_programacao;

import java.util.Scanner;

public class Media_dois_numeros {

	public void calcularMedia() {
		Double x1;
		Double x2;
		Double media;

		Scanner scn = new Scanner(System.in);

		System.out.println("Olá, mundo!");
		System.out.println("Realizarei agora alguns testes de funcionalidades");
		System.out.println("Me diga um número de 0 a 10:");
		x1 = lerNumeroValido(scn);
		System.out.println("Agora me diga um segundo número de 0 a 10:");
		x2 = lerNumeroValido(scn);
		System.out.println("Obrigado! A média entre os números citados é:");
		media = (x1 + x2) / 2;
		System.out.println(media);
		
		scn.close();
	}

	private Double lerNumeroValido(Scanner scanner) {
		while (true) {
			Double numero = scanner.nextDouble();
			if (numero >= 0 && numero <= 10) {
				return numero;
			} else {
				System.out.println("Digite um número válido!");
				System.out.println(" ");
			}
		}
	}
}