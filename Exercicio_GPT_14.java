/*

Exercício 14 – Processamento de dados (padrão comum em produção)

Você vai usar:

Vetores (int[])

Laço de repetição (for)

Acumulador

Métodos static

Retorno de valor

Desafio:
Crie um programa em Java que:

Leia 5 números inteiros e armazene em um vetor

Tenha um método chamado calcularMedia

Recebe o vetor

Usa um for para somar todos os valores

Calcula e retorna a média

No main:

Leia os valores

Chame o método

Imprima a média retornada

Por que isso é mercado:
Esse padrão (receber coleção → iterar → acumular → retornar resultado) aparece o tempo todo em serviços, relatórios, validações e regras de negócio.

*/


package estudos;

public class Exercicio_GPT_14 {	
	
	
	public static int calcularMedia(int n1, int n2, int n3, int n4, int n5) {
		
		int[] vetor = {n1,n2,n3,n4,n5};
		
		int acumulador = 0;
		
		int media;
		
		for(int i = 0; i < vetor.length; i++) {
			
			acumulador += vetor[i];
			
		}
		
		media = acumulador / vetor.length;
		
		return media;
		
	}
	

	public static void main(String[] args) {
		
		System.out.println(calcularMedia(12,27,34,8,19));
		
	}
	
}
