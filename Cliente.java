package com.taxabaixa;

import java.util.Dictionary;
import java.util.Enumeration;
import java.util.Hashtable;


public class Cliente {
	String nome;
	int id;
	Dictionary<Integer, Conta>contas;
	
	Cliente(String nome, int id){
		this.nome = nome;
		this.id = id;
		contas = new Hashtable<Integer,Conta>();
	}
	
	public String getNome(){
		return this.nome;
	}
	
	public int getId(){
		return this.id;
	}
	
	public Dictionary<Integer, Conta> getContas(){
		return this.contas;
	}
	
	public float getSaldo(int idConta){
		Conta conta = contas.get(idConta);
		return conta.getSaldo();
	}
	
	public float getSaldoTotal(){
		float total = 0;
		for(Enumeration<Conta> e = contas.elements(); e.hasMoreElements();){
			Conta cc = e.nextElement();
			total += cc.getSaldo();
		}
		return total;		
	}
	
	public void addConta(int id, Conta conta){
		contas.put(id, conta);
	}
	
	public void depositar(int cc, float valor){
		Conta conta = contas.get(cc);
		conta.deposito(valor);
	}
}

