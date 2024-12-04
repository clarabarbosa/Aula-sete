package atividadeDiaSete;

import java.util.Scanner;

public class Exercicio1If {

	public static void main(String[] args) {
		
		//Variaveis 
		int A;
		int B;
		int C;
		int soma;
		
		Scanner leia = new Scanner (System.in);
				
	    //Entrada
		System.out.println("Digite o primeiro número:");
		A = leia.nextInt();
		System.out.println("Digite o segundo número:");
		B = leia.nextInt();
		System.out.println("Digite o terceiro número:");
		C = leia.nextInt();
		
		soma = A + B;
		
		//Saida
		if(A + B > C) {
			System.out.println("A soma do primeiro número mais o segundo número é maior que o terceiro número.");
		}
		else if (A + B < C) {
			System.out.println("A soma do primeiro número mais o segundo número é menor que o terceiro número.");
		}
		else {
			System.out.println("A soma do primeiro número mais o segundo número é igual ao terceiro número.");
		}
	}

}

