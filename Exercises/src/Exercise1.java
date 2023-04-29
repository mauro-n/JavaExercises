/*
	Faça um algoritmo que receba “N” números e mostre positivo,
	negativo ou zero para cada número.
*/
import java.util.Scanner;
public class Exercise1 {
	public static void checaNumero() {
		
		Scanner input = new Scanner(System.in);
		int num;
		
		do {
		System.out.println("Digite um número inteiro: ");
		System.out.println("Digite 999 para sair.");
		num = input.nextInt();
		if (num > 0) {System.out.printf("O numero %d e Positivo%n", num);}
		if (num < 0) {System.out.printf("O numero %d e Negativo%n", num);}
		if (num == 0) {System.out.println("Zero");}
		} while ( num!= 999);
		System.out.println("Encerrando programa.");
	}
	
	
}
