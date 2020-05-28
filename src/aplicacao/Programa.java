package aplicacao;

import java.util.Locale;
import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		String nome;
		char sexo, resposta;
		double altura, peso;

		do {
		System.out.print("NOME: ");
		nome = sc.nextLine();
		System.out.print("Sexo: ");
		sexo = sc.next().charAt(0);
			if (sexo !='F' || sexo !='M') {
				System.out.print("Informe o sexo no formato F ou M: ");
				sexo = sc.next().charAt(0);	
			}
		System.out.print("Altura: ");
		altura = sc.nextDouble();
			while (altura < 1.0) {
				System.out.print("Informe altura valida: ");
				altura = sc.nextDouble();
			}
		System.out.print("Peso: ");
		peso = sc.nextDouble();
			while (peso < 30.0) {
				System.out.print("Informe peso valido: ");
				peso = sc.nextDouble();
			}
		System.out.print("Digitar outro atleta (S/N)?: ");
		resposta = sc.next().charAt(0);
		if (resposta == 'S') {
			sc.nextLine(); 
		}
		
		
		} while (resposta == 'S' );
			 		
		sc.close();
	
	}
}

