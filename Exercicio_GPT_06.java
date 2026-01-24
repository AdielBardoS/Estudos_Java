/*

Exercício 6 – Nível intermediário → avançando

Você vai usar:

Estruturas sequenciais

Condicionais (if, else)

Laço de repetição (while)

Controle de loop

Desafio:
Crie um programa em Java que:

Leia números inteiros até que o usuário digite 0

Para cada número:

Se for par, some em um contador de pares

Se for ímpar, some em um contador de ímpares

Ao final, imprima:

total de números pares

total de números ímpares

*/

package estudos;

import java.util.Scanner;

public class Exercicio_GPT_06 {

	public static void main(String[] args) {
		
		
		
		Scanner sc = new Scanner(System.in);
		
		int N;
		
		int p = 0;
		int i = 0;
		
		while(true) {
			
			N = sc.nextInt();
			
			if(N == 0) {
				
				break;
				
			}
			
			
			if(N % 2 == 0) {
				
				p += N;
			
			} else {
				
				i += N;
			
			}
			
		}
		
		System.out.println("impar é " + i);
		System.out.println("par é " + p);
		
		
		sc.close();
		
	}

}
