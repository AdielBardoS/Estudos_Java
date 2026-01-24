/*Crie um programa que:

Peça um número inteiro N.

Use um laço for para calcular o fatorial de N.

Mostre o resultado final.*/


package estudos;

public class Exercicio_For_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int N = 10;
		int Rep = 1;
		
		for(int i = 1; i <= N; i++) {
			
			Rep *= i;
			
		}
		
		System.out.println(Rep);
		
	}

}
