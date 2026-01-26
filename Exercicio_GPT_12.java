/*

Exercício 12 – Métodos + laço (fixação importante)

Você vai usar:

Métodos static

Parâmetros

Retorno de valor

Laço de repetição (for)

Operadores aritméticos

Desafio:
Crie um programa em Java que:

Tenha um método chamado somarAteN

Recebe um número inteiro N

Retorna a soma de 1 até N

No main:

Leia o valor de N

Chame o método

Imprima o valor retornado

Regra:
Toda a lógica do for deve ficar dentro do método.

*/

package estudos;

public class Exercicio_GPT_12 {

	public static int somarAteN(int N) {
		
		int acumulador = 0;
		
		for(int i = 1; i <= N; i++ ) {
			
			acumulador += i;
			
		}

		return acumulador;
		
	}
	
	public static void main(String[] args) {
		
		System.out.println(somarAteN(10));
		
	}

}
