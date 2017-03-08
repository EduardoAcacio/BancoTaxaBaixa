package com.taxabaixa;

import java.util.ArrayList;

public class Agencia {
	
	
	int idAgencia;
	int numClientes;
	int numContas;
	
	ArrayList<Cliente> clientes;
	ArrayList<Conta> contas;
	
	Agencia(int numclientes, int numcontas){
		idAgencia = 0;
		numClientes = numclientes;
		numContas = numcontas;
		
		clientes = new ArrayList<Cliente>();
		contas = new ArrayList<Conta>();
	}
	
	//Regras.....
	
	
	

	public static void main(String args[]){
		Agencia ag = new Agencia(2,1);		
	}
	
}
