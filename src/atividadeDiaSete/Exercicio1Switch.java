package atividadeDiaSete;

import java.util.Scanner;

public class Exercicio1Switch {

	public static void main(String[] args) {

		//Variaveis
		int produto;
		int quantidade = 0;
		int valor;
		
		Scanner leia = new Scanner (System.in);
		
		//Entrada de dados
		System.out.println("Seja bem vindo!");
		System.out.println("MENU");
		System.out.println("Digite 1 para cachorro quente.");
		System.out.println("Digite 2 para x-salada.");
		System.out.println("Digite 3 para x-bacon.");
		System.out.println("Digite 4 para bauru.");
		System.out.println("Digite 5 para refrigerante.");
		System.out.println("Digite 6 para suco de laranja.");
		produto = leia.nextInt();
		
		
		switch (produto) {
		case 1: 
			produto = (10);
			System.out.println("R$10,00");
			valor = (produto * quantidade);
			break;
		case 2:
			produto = (15);
			System.out.println("R$15,00");
			valor = (produto * quantidade);
			break;
		case 3:
			produto = (18);
			System.out.println("R$18,00");
			valor = (produto * quantidade);
			break;
		case 4:
			produto = 18;
			System.out.println("R$12,00");
			valor = (produto * quantidade);
			break;
		case 5: 
			produto = 8;
			System.out.println("R$8,00");
			valor = (produto * quantidade);
			break;
		case 6: 
			produto = 13;
			System.out.println("R$13,00");
			valor = (produto * quantidade);
			break;
		}
	
		    System.out.println("Digite a quantidade: ");
			quantidade = leia.nextInt();
			
			valor = (quantidade * produto);
			
			System.out.println("Valor dos itens: " + valor + " reais");
			valor = leia.nextInt();
			
		}
	
		
		
		
				
		
		
		
		

	}