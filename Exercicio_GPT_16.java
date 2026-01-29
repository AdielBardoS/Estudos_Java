/*

Exercício 16 – Vetores + regra de negócio (bem próximo de produção)

Você vai usar:

Vetores (int[])

Laço for

Condicionais (if, else)

Métodos static

Retorno de valor

Desafio:
Crie um programa em Java que:

Leia 10 notas (valores de 0 a 10) e armazene em um vetor

Tenha um método chamado calcularSituacao

Recebe o vetor de notas

Calcula a média

Retorna:

"APROVADO" se média ≥ 7

"RECUPERACAO" se média ≥ 5 e < 7

"REPROVADO" se média < 5

No main:

Leia as notas

Chame o método

Imprima a situação retornada

*/

package estudos;

public class Exercicio_GPT_16 {
	
	public static String calcularSituacao(float [] vetor) {
		
		float acumulador = 0;
		
		String resultado;
		
		
		for(int i = 0; i < vetor.length; i++) {
			
			acumulador += vetor[i];
			
		}
		
		float media = acumulador/vetor.length;
		
		
		if (vetor.length == 0) {
			
		    return "SEM NOTAS";
		    
		} else if(media < 5.0) {
				
			resultado = "REPROVADO";
				
		} else if(media >= 5.0 && media < 7.0) {
				
				resultado = "RECUPERACAO";
				
		} else {
			
			resultado = "APROVADO";
			
		}
		
		return resultado;
		
	}

	
	public static void main(String[] args) {
		
		float[] vetor = {0,0,0,0,0,0,0,0,0,0};
		
		System.out.println(calcularSituacao(vetor));
		
	}

}
