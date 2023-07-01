/*Escreva um programa em Java que verifique se uma palavra ou frase é um palíndromo. Um palíndromo é uma palavra, frase, número ou 
sequência de caracteres que permanece igual quando lido de trás para frente, desconsiderando espaços e pontuação.*/

/*O programa deve solicitar ao usuário que digite uma palavra ou frase e, em seguida, verificar se ela é um palíndromo. O resultado deve 
ser exibido no console, indicando se a entrada é um palíndromo ou não.*/

import java.util.Scanner; //importar a biblioteca de leitura de dados de entrada inseridos pelo usuário.

public class Palindromo {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.println ("Digite uma palavra ou frase.");
        String frase = input.nextLine();

        // Remover espaços e pontuação da entrada
        String texto = frase.replaceAll("[^a-zA-Z]", "").toLowerCase();

        boolean palindromo = true;
        int inicio = 0;
        int fim = texto.length() - 1;

        while (inicio < fim) {
            if (texto.charAt(inicio) != texto.charAt(fim)) {
                palindromo = false;
                break;
            }
            inicio++;
            fim--;
        }

        // Exibir o resultado
        if (palindromo) {
            System.out.println("É um palíndromo.");
        } else {
            System.out.println("Não é um palíndromo.");
        }

        // Fechar o objeto Scanner
        input.close();

    }//fim do método main
}//fim da classe