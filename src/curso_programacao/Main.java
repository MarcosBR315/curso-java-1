package curso_programacao;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		int opcao;
		boolean continuar = true;

		System.out.println("Bem-vindo ao programa de funções!");

		while (continuar) {
			System.out.println("Qual das funções a seguir você deseja usar?");
			System.out.println("1 - Média entre dois números");
			System.out.println("2 - Média entre três números");
			System.out.println("3 - Conversão de medidas");
			System.out.println("4 - Encerrar");
			System.out.println(" ");
			System.out.print("Sua opção: ");
			System.out.println(" ");

			Scanner scn = new Scanner(System.in);

			if (scn.hasNextInt()) {
				opcao = scn.nextInt();

				switch (opcao) {
					case 1:
						System.out.println(" ");
						System.out.println("Iniciando . . .");
						System.out.println(" ");
						Media_dois_numeros mdn = new Media_dois_numeros();
						mdn.calcularMedia();
						continuar = false;
						break;
					case 2:
						System.out.println(" ");
						System.out.println("Iniciando . . .");
						System.out.println(" ");
						Media_tres_numeros mtn = new Media_tres_numeros();
						mtn.calcularMedia();
						continuar = false;
						break;
					case 3:
						System.out.println("Indisponível");
						continuar = false;
						break;
					case 4:
						System.out.println("Encerrando o programa...");
						continuar = false;
						break;
					default:
						System.out.println("Opção inválida.");
						continuar = false;
						break;
				}
			} else {
				System.out.println("Opção inválida. Tente novamente.");
			}

			continuar = false;
			scn.close();
		}
	}

}