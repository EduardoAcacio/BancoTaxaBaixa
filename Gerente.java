package com.taxabaixa;

import java.util.Dictionary;
import java.util.Hashtable;

public class Gerente{
	String nome;
	int id;
	Dictionary<Integer, Conta>contas;
	
	Gerente(String nome, int id, int id_gr) {
		this.nome = nome;
		this.id = id;
		contas = new Hashtable<Integer,Conta>();
	}
	

}
