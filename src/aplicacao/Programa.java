package aplicacao;

import java.util.Locale;
import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		String nome, sexo, resposta;
		double altura, peso;

		do {
		System.out.print("NOME: ");
		nome = sc.nextLine();
		System.out.print("Sexo: ");
		sexo = sc.next();
			if (!"F".equals(sexo) || !"M".equals(sexo)) {
				System.out.print("Informe o sexo no formato F ou M: ");
				sexo = sc.next();	
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
		resposta = sc.next();
		if ("S".equals(resposta)) {
			sc.nextLine();
			sc.nextLine();
		}
		
		
		} while ("S".equals(resposta));
			 		
		sc.close();
		System.out.println();
		System.out.println();
		System.out.println("RELATÓRIO: ");
		System.out.printf("Peso médio dos atletas: %.2f%n", peso);
		System.out.println("O Atleta mais alto é: " + nome);
		System.out.println("A porcentagem de homens é: %.1f%n");
		System.out.println("A altura média das mulheres é: ");
		System.out.println();
		System.out.println("FIM DO PROGRAMA!");
		
		
	
	}
}

