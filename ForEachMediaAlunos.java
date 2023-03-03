import java.util.Scanner;

public class ForEachMediaAlunos {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Valor Media
        System.out.println("Digite a média para aprovação: ");
        double mediaAprov = sc.nextDouble();

        int[][] notas = new int[2][3]; // Prova e Atividade nessa sequencia

        for (int i = 0; i < notas.length; i++) {
            for (int j = 0; j < notas[i].length; j++) {
                if (i == 0) {
                    System.out.println("Digite a nota da " + (j + 1) + "° prova:");
                    notas[i][j] = sc.nextInt();
                }
                if (i == 1) {
                    System.out.println("Digite a nota da " + (j + 1) + "° atividade:");
                    notas[i][j] = sc.nextInt();
                }
            }
        }

        System.out.println("");

        // Contas

        double somaProvas = 0;
        double somaAtividades = 0;

        for (int i = 0; i < notas.length; i++) {
            for (int j = 0; j < notas[i].length; j++) {
                if (i == 0) {
                    somaProvas = notas[i][j] + somaProvas;
                }
                if (i == 1) {
                    somaAtividades = notas[i][j] + somaAtividades;
                }
            }
        }

        System.out.println("");

        // Exibição das soma das notas

        System.out.println("A soma das provas é: " + somaProvas);
        System.out.println("A soma das atividades é: " + somaAtividades);

        System.out.println("");

        // Média

        double media = ((somaProvas / 3) + (somaAtividades / 3)) / 2;
        System.out.println("A média final do aluno é de: " + media);

        if (media >= mediaAprov) {
            System.out.println("Aluno aprovado");
        } 
        else {
            System.out.println("Aluno reprovado");
        }

        sc.close();
    }

}