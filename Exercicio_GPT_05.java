/*

Exercício 5 – Nível intermediário

Você vai usar:

Estruturas sequenciais

Condicionais (if)

Laço de repetição (for)

Operadores aritméticos

Desafio:
Crie um programa em Java que:

Leia um número inteiro N

Use um for para percorrer de 1 até N

Conte quantos números são múltiplos de 3

Imprima a quantidade encontrada

Quando concluir, diga “próximo”.

*/

package estudos;

public class Exercicio_GPT_05 {

	public static void main(String[] args) {
		
		int N = 10;
		
		for(int i = 1; N >= i; i++ ) {
			
			if(i % 3 == 0){
				
				System.out.println(i);
				
			}
						
		}
		
	}

}
