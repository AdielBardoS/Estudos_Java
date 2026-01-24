/*

Exercício 10 – Métodos (fixação)

Você vai usar:

Estruturas sequenciais

Métodos static

Parâmetros

Retorno de valor

Entrada de dados (Scanner)

Desafio:

Crie um programa em Java que:

Tenha um método chamado calcularMedia

Recebe 3 números inteiros

Retorna a média desses números

No main:

Leia os 3 números do usuário

Chame o método calcularMedia

Imprima o valor retornado

Regra:
A lógica da média não pode ficar no main.

*/


package estudos;

public class Exercicio_GPT_10 {
	
	//metodo calcular media
	public static int calcularMedia(int a, int b, int c) {
		
		return (a + b + c) / 3;
		
	}
	
	//metodo main
	public static void main(String[] args) {
		
		System.out.println(calcularMedia(2,5,5));
		
	}

}
