package atividadeDiaSete;

import java.util.Scanner;

public class Exercicio2If {

	public static void main(String[] args) {
	 
		//Variaveis
		float numero;
		
		Scanner leia = new Scanner(System.in);
		
		//Entrada
		System.out.println("Digite o número: ");
		numero = leia.nextFloat();
		
		//Saida
		if (numero % 2 == 0 && numero > 0) {
			System.out.println("O numero é par e positivo");
		}
		else if (numero % 2 == 0 && numero < 0) {
			System.out.println("O número é par e negativo");
		}
		else if (numero % 2 != 0 && numero < 0){
			System.out.println("O número é impar e negativo");
		}
		else{
			System.out.println("O número é impar e positivo");
		}
					
		
			
			
		}
		

	}
