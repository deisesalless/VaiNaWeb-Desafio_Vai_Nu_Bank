package br.com.desafio.menu;

import java.util.Scanner;

public class Menu {
	
	public void menuPrincipal() {
		int opcao = 0;
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("BEM VINDO AO MENU DO VAI NU BANK");
		System.out.println("Por favor escolha uma das opções abaixo: ");
		System.out.println("1 - Acessar conta corrente");
		opcao = entrada.nextInt();
		System.out.println("2 - Acessar conta poupança");
		opcao = entrada.nextInt();
		
		if(opcao == 1) {
			System.out.println("Por favor digite o número da sua agência: ");
			int agencia = entrada.nextInt();
			System.out.println("Por favor digite o número da sua conta corrente: ");
			int conta = entrada.nextInt();
		
		} else {
			System.out.println("Por favor digite o número da sua agência: ");
			int agencia = entrada.nextInt();
			System.out.println("Por favor digite o número da sua conta poupança: ");
			int conta = entrada.nextInt();
		}
		
		entrada.close();
		
	}

}
