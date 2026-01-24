/*
Exercício 3 – Nível intermediário

Você vai usar:

Estruturas sequenciais

Condicionais (if, else)

Laço de repetição (for)

Operadores aritméticos

Desafio:
Crie um programa em Java que:

Leia um número inteiro N

Use um for para imprimir todos os números pares de 1 até N


*/

package estudos;

public class Exercicio_GPT_03 {

	public static void main(String[] args) {
		
		int N = 10;
		
				
		for(int i = 1; i <= N; i++  ) {
			
			if(i % 2 == 0) {
				
				System.out.println(i);
				
			}
			
		}

	}

}
