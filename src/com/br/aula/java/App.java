package com.br.aula.java;

import java.text.MessageFormat;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		// CALCULADORA DE EMPRESTIMOS

		Scanner scan = new Scanner(System.in);

		// Idade minima permitida
		int idadeMinimaPermitida = 25;

		// Idade maximo permitida
		int idadeMaximaPermitida = 60;

		// --------------

		// Perguntar o nome
		System.out.println("Nome");
		String nome = scan.next();

		// Perguntar a idade
		System.out.println("Qual a sua idade?");
		int idade = scan.nextInt();

		// --------------

		// Avalia a idade do usuário
		if (idade >= idadeMinimaPermitida && idade < idadeMaximaPermitida) {

			// Pergunta a renda
			System.out.println("Qual a sua renda?");
			double renda = scan.nextDouble();

			// Avalia a renda
			if (renda > 1500) {

				// Pergunta o valor solicitado
				System.out.println("Qual valor quer solicitar?");
				double valorSolicitado = scan.nextDouble();

				// Avalia o valor solicitado
				if (valorSolicitado >= 1000 && valorSolicitado <= 10 * renda) {
					
					int juros = 3;
					double taxa = (((valorSolicitado * juros) / 100)*12);
					double total = valorSolicitado + taxa;

					// Finaliza
					System.out.println(
							nome + " seu empréstimo foi aprovado, o valor final a ser pago será de: R$ " + total);

				} else {

					System.out
							.println("O valor solicitado é maior ou menor que o permitido, seu empréstimo foi negado.");

				}

			} else {

				System.out.println("Sua renda é menor que o permitido, seu empréstimo foi negado.");

			}

		} else {

			System.out.println("Sua idade não é permitida, seu empréstimo foi negado.");

		}

	}

}
