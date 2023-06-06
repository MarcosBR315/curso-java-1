package curso_programacao;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		int opcao;
		
		Media_dois_numeros mdn = new Media_dois_numeros();
		Media_tres_numeros mtn = new Media_tres_numeros();
		Conversao_medidas cm = new Conversao_medidas();
		Scanner scn = new Scanner(System.in);

		System.out.println("Bem-vindo ao programa de funções!");

			System.out.println("Qual das funções a seguir você deseja usar?");
			System.out.println("1 - Média entre dois números");
			System.out.println("2 - Média entre três números");
			System.out.println("3 - Conversão de medidas");
			System.out.println("4 - Encerrar");
			System.out.println(" ");
			System.out.println("Sua opção: ");
			System.out.print("=> ");
			opcao = lerNumeroValido(scn);

				switch (opcao) {
					case 1:
						System.out.println(" ");
						System.out.println("Iniciando . . .");
						System.out.println(" ");
						mdn.calcularMedia();				
						break;
						
					case 2:
						System.out.println(" ");
						System.out.println("Iniciando . . .");
						System.out.println(" ");
						mtn.calcularMedia();			
						break;
						
					case 3:
						System.out.println(" ");
						System.out.println("Iniciando . . .");
						System.out.println(" ");
						cm.Converter_medidas();
						break;
						
					case 4:
						System.out.println("Encerrando o programa...");
						break;
						
				}

		scn.close();
	}
	
	private static int lerNumeroValido(Scanner scanner) {
		while (true) {
			int numero = scanner.nextInt();
			if (numero > 0 && numero <= 4) {
				return numero;
			} else {
				System.out.println("Digite um número válido!");
				System.out.println(" ");
			}
		}
	}

}