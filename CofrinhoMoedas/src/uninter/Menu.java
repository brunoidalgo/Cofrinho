package uninter;

import java.util.Scanner;

public class Menu {
	
	private Scanner sc;
	private Cofrinho cofrinho;
	
	public Menu() {
		sc = new Scanner(System.in);
		cofrinho = new Cofrinho();
	}
	
	
	public void exibirMenuPrincipal() {
		System.out.println("COFRINHO: ");
		System.out.println("1-Adicionar moeda:");
		System.out.println("2-Remover  moeda:");
		System.out.println("3-Listar moeda:");
		System.out.println("4-Calcular valor total convertido em real:");
		System.out.println("0-Encerrar Programa");
		
		String opcaoSelecionada = sc.next();
		
		
		switch (opcaoSelecionada) {
			case "0":
				System.out.println("Encerrando o programa...");
				break;
			case "1":
				exibirMiniMenuAdicionarMoedas();
				exibirMenuPrincipal();
				break;
				
			case "2":
				exibirMiniMenuRemoverMoedas();
				exibirMenuPrincipal();
				break;
				
				
			case "3":
				cofrinho.listagemMoedas();
				exibirMenuPrincipal();
				break;
				
			case "4":
				double valorTotalConvertido = cofrinho.totalConvertido();
				System.out.println(" O valor total convertido para real ?  " + valorTotalConvertido);
				exibirMenuPrincipal();
				break;
				
			default:
				System.out.println("Opção Iválida!");
				exibirMenuPrincipal();
				break;
		}
	}
	private void exibirMiniMenuAdicionarMoedas() { 
		System.out.println("Escolha a Moeda:");
		System.out.println("1- Real:");
		System.out.println("2- Dólar:");
		System.out.println("3- Euro:");
		System.out.println("4- Libra:");
		
		int opcaoMoeda = sc.nextInt();
		
		System.out.println("Digite o Valor:");
		
		String valorTxtMoeda = sc.next();
		
		valorTxtMoeda = valorTxtMoeda.replace(",", ".");
		double valorMoeda = Double.parseDouble(valorTxtMoeda);
		
		Moeda moeda = null;
		
		if (opcaoMoeda == 1) {
			moeda = new Real(valorMoeda);					
		} else if (opcaoMoeda == 2) {
			moeda = new Dolar(valorMoeda);					
		} else if (opcaoMoeda == 3) {
			moeda = new Euro(valorMoeda);					
		} else if (opcaoMoeda == 4) {
			moeda = new Libra(valorMoeda);					
		} else {
			System.out.println("Não existe essa moeda!");
			exibirMenuPrincipal();
		}
			
		cofrinho.adicionar(moeda);
		System.out.println("Moeda adicionada!");	
	}
	
	private void exibirMiniMenuRemoverMoedas() { 
		System.out.println("Escolha a Moeda:");
		System.out.println("1- Real:");
		System.out.println("2- Dólar:");
		System.out.println("3- Euro:");
		System.out.println("4- Libra:");
		
		int opcaoMoeda = sc.nextInt();
		
		System.out.println("Digite o Valor:");
		
		String valorTxtMoeda = sc.next();
		
		valorTxtMoeda = valorTxtMoeda.replace(",", ".");
		double valorMoeda = Double.parseDouble(valorTxtMoeda);
		
		Moeda moeda = null;
		
		if (opcaoMoeda == 1) {
			moeda = new Real(valorMoeda);					
		} else if (opcaoMoeda == 2) {
			moeda = new Dolar(valorMoeda);					
		} else if (opcaoMoeda == 3) {
			moeda = new Euro(valorMoeda);					
		} else if (opcaoMoeda == 4) {
			moeda = new Libra(valorMoeda);					
		} else {
			System.out.println("Não existe essa moeda!");
			exibirMenuPrincipal();
		}
			
		if (cofrinho.remover(moeda)) {
		System.out.println("Moeda removida com sucesso!");
		}else {
			System.out.println("Não existe essa moeda!");
	} 
	}
		
	
		
}	
	



