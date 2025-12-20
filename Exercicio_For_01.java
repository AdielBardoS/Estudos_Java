/*Peça um número inteiro positivo N.

Use um laço for para imprimir os números de 1 até N.

Para cada número:

Se for múltiplo de 3, imprima "Fizz".

Se for múltiplo de 5, imprima "Buzz".

Se for múltiplo de 3 e 5, imprima "FizzBuzz".

Caso contrário, imprima o número.


---------------------------------------------------------------------------------------------------------------------------------------------

*/

package estudos;

public class Exercicio_For_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int N = 15;
		
		for(int i = 1; i <= N; i++) {
			
			
			if(i % 3 == 0 && i % 5 == 0) {
				
				System.out.println("FizzBuzz");
				
			} else if(i % 3 == 0) {
				
				System.out.println("Fizz");
				
			} else if(i % 5 == 0 ) {
				
				System.out.println("Buzz");
				
			} else{
			
				System.out.println(i);
				
			}
			
		}
		
		
	}

}
