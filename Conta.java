package com.taxabaixa;

public class Conta {
	private int id;
	private int agencia;
	private float saldo;
	private boolean habilitada = false;
	
	Conta(int id, int agencia, float saldo){
		this.id = id;
		this.agencia = agencia;
		this.saldo = saldo;
		this.setHabilitada(true);
	}
	Conta(int id, int agencia){
		this.id=id;
		this.agencia = agencia;
	}
	
	public int getId(){
		return this.id;
	}
	public int getAgencia(){
		return this.agencia;
	}
	public float getSaldo(){
		return saldo;
	}
		
	public void deposito(float valor){
		this.saldo += valor;
	}
	public void saque(float valor){
		this.saldo-=valor;
	}

	protected boolean isHabilitada() {
		return habilitada;
	}

	protected void setHabilitada(boolean habilitada) {
		this.habilitada = habilitada;
	}	
}