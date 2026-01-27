/*

Exercício 13 – Laço for + acumulador (reforço pontual)

Você vai usar:

Métodos static

Laço de repetição (for)

Acumulador

Retorno de valor

Desafio:
Crie um programa em Java que:

Tenha um método chamado calcularSomaPares

Recebe um número inteiro N

Usa um for para somar apenas os números pares de 1 até N

Retorna o valor da soma

No main:

Leia N

Chame o método

Imprima o resultado

Dica mental (não é código):

acumulador começa fora do for, cresce dentro dele.

*/


package estudos;

public class Exercicio_GPT_13 {
	
	public static int calcularSomaPares(int N) {
		
		int acumulador = 0;
		
		for(int i = 1; i <= N; i++) {
			
			if(i % 2 == 0) {
				
				acumulador += i;
				
			}
			
		}
		
		return acumulador;
		
	}

	public static void main(String[] args) {
		
		System.out.println(calcularSomaPares(350));
		
	}

}
