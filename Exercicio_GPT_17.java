/*

Exercício 17 – Separação de responsabilidades (padrão mercado)

Você vai usar:

Vetores (float[])

Laço for

Métodos static

Retorno de valor

Reuso de métodos

Desafio

Crie um programa em Java que tenha 3 métodos:

1️⃣ calcularMedia

Recebe um vetor de float

Calcula e retorna a média

2️⃣ definirSituacao

Recebe a média

Retorna:

"APROVADO" se média ≥ 7

"RECUPERACAO" se média ≥ 5 e < 7

"REPROVADO" se média < 5

3️⃣ main

Cria um vetor de notas (fixo, sem Scanner)

Chama calcularMedia

Passa o resultado para definirSituacao

Imprime a situação final

*/

package estudos;

public class Exercicio_GPT_17 {

	public static float calcularMedia(float[] vetorNotas) {
		
		float somaNotas = 0;
		
		for(int i = 0; i < vetorNotas.length; i++) {
			
			somaNotas += vetorNotas[i];
			
		}
		
		return somaNotas / vetorNotas.length;
				
	}
	
	public static String definirSituacao(float media) {
		
		if(media < 5) {
			
			return "REPROVADO";
			
		} else if(media >= 5 && media < 7) {
			
			return "RECUPERACAO";
			
		} else {
			
			return "APROVADO";
			
		}
		
	}
	
	
	public static void main(String[] args) {
		
		float[] vetorNotas = {2,2,2,2,2};
		
		System.out.println(definirSituacao((calcularMedia(vetorNotas))));
		
	}

}
