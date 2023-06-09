package curso_programacao;

import java.util.Scanner;

public class Conversao_medidas {

	public void Converter_medidas() {
		
		boolean repeatConversao = true;
		int opcao = 0;
		
		Scanner scn = new Scanner(System.in);
		Scanner pause = new Scanner(System.in);
		
		while(repeatConversao) {
			System.out.println("Você deseja converter:");
			System.out.println("1 - km em metros");
			System.out.println("2 - metros em km;");
			System.out.println("3 - litros em ml");
			System.out.println("4 - ml em litros");
			System.out.println("5 - Sair");
			System.out.println(" ");
			System.out.println("Sua opção: ");
			System.out.println("=> ");
			opcao = lerNumeroValido(scn);
			System.out.println(" ");
			switch(opcao) {
				case 1:
					Double kmUm;
					Double metrosUm;
					Scanner kmScn = new Scanner(System.in);
					
					System.out.println("Digite os kilômetros a serem convertidos:");
					System.out.println("=> ");
					kmUm = kmScn.nextDouble();
					metrosUm = kmUm * 1000;
					System.out.println(" ");
					System.out.print("Resultado:");
					System.out.printf("%.2f",metrosUm);
					System.out.println(" metros");
					System.out.println(" ");
					System.out.println("Pressione Enter para continuar . . .");
					pause.nextLine();
					System.out.println(" ");
					break;
					
				case 2:
					Double metrosDois;
					Double kmDois;
					Scanner metrosScn = new Scanner(System.in);
					
					System.out.println("Digite os metros a serem convertidos:");
					System.out.println("=> ");
					metrosDois = metrosScn.nextDouble();
					kmDois = metrosDois / 1000;
					System.out.println(" ");
					System.out.print("Resultado:");
					System.out.printf("%.2f",kmDois);
					System.out.println(" km's.");
					System.out.println(" ");
					System.out.println("Pressione Enter para continuar . . .");
					pause.nextLine();
					System.out.println(" ");
					break;
					
				case 3:
					Double litrosUm;
					Double mlUm;
					Scanner litrosScn = new Scanner(System.in);
					
					System.out.println("Digite os litros a serem convertidos:");
					System.out.println("=> ");
					litrosUm = litrosScn.nextDouble();
					mlUm = litrosUm * 1000;
					System.out.println(" ");
					System.out.print("Resultado:");
					System.out.printf("%.2f",mlUm);
					System.out.println(" ml.");
					System.out.println("Pressione Enter para continuar . . .");
					pause.nextLine();
					System.out.println(" ");
					break;
					
				case 4:
					Double mlDois;
					Double litrosDois;
					Scanner mlScn = new Scanner(System.in);
					
					System.out.println("Digite os ml a serem convertidos:");
					System.out.println("=> ");
					mlDois = mlScn.nextDouble();
					litrosDois = mlDois / 1000;
					System.out.println(" ");
					System.out.print("Resultado:");
					System.out.printf("%.2f",litrosDois);
					System.out.println(" litros.");
					System.out.println("Pressione Enter para continuar . . .");
					pause.nextLine();
					System.out.println(" ");
					break;
					
				case 5:
					System.out.println("Encerrando . . .");
					System.out.println(" ");
					repeatConversao = false;
					break;
					
				default:
					System.out.println("Opção inválida!");
					System.out.println(" ");
					System.out.println("Pressione Enter para continuar . . .");
					pause.nextLine();
					System.out.println(" ");
					repeatConversao = false;
					break;
					
			}
		}
		pause.close();

	}
	
	private static int lerNumeroValido(Scanner scanner) {
        while (true) {
            int numero = scanner.nextInt();
            if (numero >= 0 && numero <= 10) {
                return numero;
            } else {
            	System.out.println(" ");
                System.out.println("Digite um número válido!");
                System.out.println(" ");
            }
        }
    }

}
