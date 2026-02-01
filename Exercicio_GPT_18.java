/*

Exercício 18 (métodos + vetor + decisão)

Você vai usar:

Vetores (int[])

Métodos static

Laço for

Condicionais

Retorno de valor

Desafio:
Crie um programa em Java que tenha:

1️⃣ calcularMaior

Recebe um vetor de inteiros

Retorna o maior valor do vetor

2️⃣ calcularMenor

Recebe o mesmo vetor

Retorna o menor valor

3️⃣ main

Cria um vetor de inteiros fixo

Chama os dois métodos

Imprime maior e menor valor

*/

package estudos;

public class Exercicio_GPT_18 {
	
	public static int calcularMaior(int[] numeros) {
		
		int aux = numeros[0];
		
		for(int i = 0; i < numeros.length; i++) {
			
			if(aux < numeros[i]) {
				
				aux = numeros[i];
				
			}
			
		}
		
		return aux;
		
	}
	
	public static int calcularMenor(int[] numeros) {
		
		int aux = numeros[0];
		
		for(int i = 0; i < numeros.length; i++) {
			
			if(numeros[i] < aux) {
				
				aux = numeros[i];
				
			}
			
		}
		
		return aux;
		
	}

	public static void main(String[] args) {
		
		int[] vetorInt = {-1,-2,-3,-4,-5,-6};
		
		System.out.println(calcularMaior((vetorInt)));
		System.out.println(calcularMenor((vetorInt)));
						
	}

}
