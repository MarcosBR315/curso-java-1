package curso_programacao;

import java.util.Scanner;

public class Media_tres_numeros {

    public void calcularMedia() {
        Double x1;
        Double x2;
        Double x3;
        Double media;

        Scanner scn = new Scanner(System.in);

        System.out.println("Digite um número de 0 a 10:");
        x1 = lerNumeroValido(scn);
        System.out.println(" ");
        System.out.println("Digite um segundo número de 0 a 10:");
        x2 = lerNumeroValido(scn);
        System.out.println(" ");
        System.out.println("Digite um terceiro número de 0 a 10:");
        x3 = lerNumeroValido(scn);
        System.out.println(" ");
        System.out.println("Obrigado! A média entre os números é:");
        media = (x1 + x2 + x3) / 3;
        System.out.printf("%.2f%n", media);
        System.out.println(" ");
        System.out.println("Pressione Enter para continuar . . .");
        scn.nextLine();
        System.out.println(" ");

        scn.close();
    }

    private Double lerNumeroValido(Scanner scanner) {
        while (true) {
            Double numero = scanner.nextDouble();
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