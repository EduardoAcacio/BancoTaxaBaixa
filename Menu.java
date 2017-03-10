package com.taxabaixa;

import java.util.Scanner;

public class Menu extends Agencia {
	Menu(int numclientes, int numcontas) {
		super(numclientes, numcontas);
		
	}

	Scanner entrada = new Scanner(System.in);
	
	public void iniciar(){
        int opcao;
        do{
        	escolheMenu();
        	opcao = entrada.nextInt();
        	switch (opcao){
        		case 1: 
        			exibeMenuGerente();
        			break;
        		case 2: 
        			exibeMenuCliente();
        			break;
        		default:
        			System.out.println("Opcao invalida!");
        	}
        }while(opcao!=3);
    }
	
	public void escolheMenu(){
        System.out.println("\t Opcao de menu:");
        System.out.println("1 - Gerente");
        System.out.println("2 - Cliente");
        System.out.println("3 - Sair\n");
        System.out.print("Opção: ");        
    }
	
	public void exibeMenuCliente(){
        System.out.println("\t Escolha a opção desejada");
        System.out.println("1 - Depositar");
        System.out.println("2 - Consultar Saldo");
        System.out.println("3 - Sacar");
        System.out.println("4 - Sair\n");
        System.out.print("Opção: ");        
    }
	
	public void exibeMenuGerente(){
        System.out.println("\t Escolha a opÃ§Ã£o desejada");
        System.out.println("1 - Adicionar cliente");
        System.out.println("2 - Abrir uma conta");
        System.out.println("3 - Vincular conta");
        System.out.println("4 - Informacoes do cliente");
        System.out.println("5 - Informacoes da conta");
        System.out.println("6 - Sair\n");
        System.out.print("Opção: ");        
    }

}