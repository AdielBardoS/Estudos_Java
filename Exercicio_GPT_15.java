/*

Exercício 15 – Vetores + condição (nível produção)

Você vai usar:

Vetores (int[])

Laço for

Condicionais (if)

Contadores

Métodos static

Desafio:
Crie um programa em Java que:

--Leia 8 números inteiros e armazene em um vetor

--Tenha um método chamado contarMaioresQueZero

Recebe o vetor

Percorre todos os elementos

Conta quantos números são maiores que zero

Retorna essa quantidade

No main:

Leia os números

Chame o método

Imprima o total retornado

Detalhe importante (intencional):
O método não sabe quantos números existem, ele só confia no length.

*/

package estudos;

public class Exercicio_GPT_15 {
	
	//o parametro desse metodo tem o tipo vetor porque ele vai receber e processar o vetor recebido da main.
	public static int contarMaioresQueZero(int[] vetor) {
		
		int contador = 0;
		
		//
		for(int i = 0; i < vetor.length; i++) {
			
			if(vetor[i] > 0) {
				
				contador++;
				
			}
			
		}
		
		return contador;
		
	}

	public static void main(String[] args) {
		
		int[] vetor = {-1,0,1,2,3,4,5,6};
		
		System.out.println(contarMaioresQueZero(vetor));
		
	}

}
