/*Exercício 1 – Nível básico
Você vai usar:
Estruturas sequenciais
Entrada e saída (Scanner, System.out.println)
Variáveis
Operadores aritméticos

Desafio:
	Crie um programa em Java que:
		Leia dois números inteiros;
		Calcule:
			soma
			subtração
			multiplicação
		Imprima os três resultados na tela 

*/

package estudos;

public class Exercicio_GPT_01 {

	public static void main(String[] args) {
		
		int n1 = 5;
		int n2 = 2;
		
		int soma = n1 + n2;
		int subtracao = n1 - n2;
		int multiplicacao = n1 * n2;
		
		System.out.printf("A soma dos numeros %d e %d é %d %n", n1 , n2, soma);
		System.out.printf("A subtração dos numeros %d e %d é %d %n", n1 , n2, subtracao);
		System.out.printf("A multiplicação dos numeros %d e %d é %d", n1 , n2, multiplicacao);

	}

}
