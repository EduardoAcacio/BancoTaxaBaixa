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

	//Regras...
	public void adicionarCliente(int idAgencia, int id){
		
	}
	
	public void abrirConta(){
		
	}
	
	public void vincularConta(){
		
	}
	
	public void getCliente(){
		
	}
	
	public void getConta(){
		
	}

}