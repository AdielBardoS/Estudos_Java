/* 
Exercício 2 – Nível básico → intermediário

Você vai usar:

Estruturas sequenciais

Condicionais (if, else)

Operadores relacionais

Entrada e saída (Scanner)

Desafio:
Crie um programa em Java que:

Leia um número inteiro

Verifique se ele é:

positivo, negativo ou zero

Imprima o resultado na tela 

*/



package estudos;

public class Exercicio_GPT_02 {

	public static void main(String[] args) {
	
		int N = 0;
		
		if( N > 0) {
			
			System.out.println("Positivo");
			
		} else if(N < 0) {
			
			System.out.println("Negativo");
			
		} else {
			
			System.out.println("Zero");
			
		}

	}

}
