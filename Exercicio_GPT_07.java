/*
 
 Exercício 7 – Nível intermediário (reforço de lógica)

Você vai usar:

Estruturas sequenciais

Condicionais (if, else)

Laço de repetição (for)

Contadores

Desafio:
Crie um programa em Java que:

Leia um número inteiro N

Use um for para percorrer de 1 até N

Conte:

quantos números são pares

quantos números são ímpares

Imprima os dois totais no final
  
 */
package estudos;
import java.util.Scanner;

public class Exercicio_GPT_07 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int pares = 0;
		int impares = 0;
		
		for(int i = 0; N >= i ; i++) {
			
			if(i % 2 == 0) {
				
				pares += 1;
				
			} else {
				
				impares += 1;
				
			}
			
		}
		
		System.out.println(pares + " Números são pares");
		System.out.println(impares + " Números são ímpares");
		
		sc.close();

	}

}
