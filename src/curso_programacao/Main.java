package curso_programacao;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Double x1;
		Double x2;
		Double media;
		
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Olá, mundo!");
		System.out.println("Realizarei agora alguns testes de funcionalidades");
		System.out.println("Me diga um número de 0 a 10:");
		x1 = lerNumeroValido(scn);
		if(x1 >= 0 && x1 <= 10) {
			System.out.println("Agora me diga um segundo número de 0 a 10:");
			x2 = lerNumeroValido(scn);
			if(x2 >= 0 && x2 <=10) {
				System.out.println("Obrigado! A média entre os números citados é:");
				media = (x1 + x2) / 2;
				System.out.println(media);
			} else {
				System.out.println("Digite um número válido!");
			}
		}else {
			System.out.println("Digite um número válido!");
		}
		
		scn.close();   
		
	}
	
	private static Double lerNumeroValido(Scanner scanner) {
        while (true) {
            Double numero = scanner.nextDouble();
            if (numero >= 0 && numero <= 10) {
                return numero;
            } else {
                System.out.println("Digite um número válido!");
            }
        }
	}

}
