/*

Exercício 8 – Nível intermediário (reforço)

Você vai usar:

Estruturas sequenciais

Condicionais (if, else)

Laço de repetição (for)

Acumuladores (soma)

Desafio:
Crie um programa em Java que:

Leia um número inteiro N

Use um for para percorrer de 1 até N

Some apenas os números ímpares

Imprima o valor final da soma

*/
package estudos;

public class Exercicio_GPT_08 {

	public static void main(String[] args) {
		
		int N = 10;
		int soma = 0;
		
		for(int i = 0; N > i ; i++) {
			
			if(i % 2 != 0) {
				
				soma += + i;
				
			}
			
		}
		
		System.out.println(soma);
		
	}

}
