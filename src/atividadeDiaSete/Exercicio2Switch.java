package atividadeDiaSete;

import java.util.Scanner;

public class Exercicio2Switch {

	public static void main(String[] args) {
		String nome;
		String cargo;
		int reajuste = 0;
		float salario = 0;
		float novosalario = 0;
		
		Scanner leia = new Scanner (System.in);
		
		System.out.println("Digite seu nome: ");
		nome = leia.nextLine();
		
		System.out.println("Digite 1 para Gerente.");
		System.out.println("Digite 2 para Vendedor.");
		System.out.println("Digite 3 para Supervisor.");
		System.out.println("Digite 4 para Motorista.");
		System.out.println("Digite 5 para Estoquista.");
		System.out.println("Digite 6 para Técnico de TI.");
		cargo = leia.nextLine();
		
		switch (reajuste) {
		case 1: reajuste = (10/100);
		novosalario = (salario * reajuste);
		break;
		case 2: reajuste = (7/100);
		novosalario = (salario * reajuste);
		break;
		case 3: reajuste = (9/100);
		novosalario = (salario * reajuste);
		break;
		case 4: reajuste = (6/100);
		novosalario = (salario * reajuste);
		break;
		case 5: reajuste = (5/100);
		novosalario = (salario * reajuste);
		break;
		case 6: reajuste = (8/100);
		novosalario = (salario * reajuste);
		break;
		
		System.out.println("Olá" + nome + "Seu novo salário é: " + novosalario);
		
		
		}
		
		
		
		

	}

}
