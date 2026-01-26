/*

Exercício 11 – Métodos (fixação com variação)

Você vai usar:

Estruturas sequenciais

Métodos static

Parâmetros

Retorno de valor

Condicionais (if, else)

Desafio:
Crie um programa em Java que:

Tenha um método chamado maiorNumero

Recebe dois números inteiros

Retorna o maior deles

No main:

Leia dois números do usuário

Chame o método

Imprima o valor retornado

Regra:
A decisão de qual número é maior deve estar dentro do método, não no main.

*/
package estudos;

public class Exercicio_GPT_11 {
	
	//metodo que verifica o maior numero entre dois inteiros
	public static int maiorNumero(int n1, int n2) {
		
		int maiorN = 0;
		
		if (n1 > n2) {
			
			maiorN = n1;
			
		} else {
			
			maiorN = n2;
		}
		
		return maiorN;
		
	}
	
	
	//metodo main
	public static void main(String[] args) {
		
		System.out.println("O maior numero é " + maiorNumero(100,50));

	}

}
