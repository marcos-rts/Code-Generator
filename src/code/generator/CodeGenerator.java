/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package code.generator;

import java.util.Scanner;

/**
 *
 * @author admin_hachiman
 */
public class CodeGenerator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Declaração da variável para armazenar a palavra inserida pelo usuário
        String palavra;
        // Solicitação da entrada do usuário
        System.out.print("Insira uma palavra: ");
        // Leitura da entrada do usuário e armazenamento na variável 'palavra'
        Scanner scanner = new Scanner(System.in);
        palavra = scanner.nextLine();
        // Variáveis para calcular a soma dos valores ASCII e contar as letras
        int soma = 0;
        int count = 0;
        // Loop para percorrer cada caractere da palavra inserida
        for (int i = 0; i < palavra.length(); i++) {
            // Verifica se o caractere não é um espaço em branco
            if (palavra.charAt(i) != ' ') {
                // Imprime o caractere seguido do seu valor ASCII
                System.out.printf("%c%03d\n", palavra.charAt(i), (int) palavra.charAt(i));
                // Adiciona o valor ASCII do caractere à soma
                soma += (int) palavra.charAt(i);
                // Incrementa o contador de letras
                count++;
            }
        }
        // Verifica se foram encontradas letras para calcular a média
        if (count > 0) {
            // Calcula a média dos valores ASCII
            double media = (double) soma / count;
            // Arredonda a média para o número inteiro mais próximo
            int media_arredondada = (int) Math.round(media);
            // Imprime a média arredondada e a letra correspondente ao valor arredondado
            System.out.printf("Média arredondada dos valores ASCII: %d - Letra correspondente: %c\n", media_arredondada, (char) media_arredondada);
        } else {
            // Caso nenhuma letra seja encontrada na palavra inserida
            System.out.println("Nenhuma letra encontrada para calcular a média.");
        }
    }
    
}
