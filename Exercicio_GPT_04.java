/*

Exercício 4 – Nível intermediário

Você vai usar:

Estruturas sequenciais

Laço de repetição (for)

Acumuladores (variável para soma)

Operadores aritméticos

Desafio:
Crie um programa em Java que:

Leia um número inteiro N

Use um for para somar todos os números de 1 até N

Imprima o valor total da soma 

*/

package estudos;

public class Exercicio_GPT_04 {

	public static void main(String[] args) {
		
		int N = 10;
		
		int acumulador = 0;
		
		for(int i = 1; N >= i; i++ ) {

			acumulador = acumulador + i;
			
		}
		
		System.out.println(acumulador);

	}

}
