/*

Exercício 9 – Nível intermediário → avançando

Você vai usar:

Estruturas sequenciais

Laço de repetição (for)

Vetores (int[])

Entrada de dados (Scanner)

Desafio:
Crie um programa em Java que:

Leia 10 números inteiros e armazene em um vetor

Use um for para:

encontrar o maior número

encontrar o menor número

Imprima o maior e o menor valor no final

*/
package estudos;

import java.util.Scanner;

public class Exercicio_GPT_09 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//declaração do vetor
		int[] numeros = new int[10];
		
		//variavel para armazenar o numero maior, inicia pelo primeiro indice mesmo.
		int maior = numeros[0];
		
		
		//ler e armazena valores no vetor
		for(int i = 0; i < numeros.length; i++) {
			
			numeros[i] = sc.nextInt();
			
		}
		
		//mostra os numeros do vetor
		for(int i = 0; i < numeros.length; i++) {
			
			if(numeros[i] > maior) {
				
				maior = numeros[i];
				
			}
			
		}
		
		System.out.println(maior);
		
	}

}
