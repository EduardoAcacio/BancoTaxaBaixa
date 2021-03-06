package com.taxabaixa.DB;

import java.sql.*;

public class CriaTabela
{
	public static void main( String args[] )
	{
		Connection c = null;
		Statement stmt = null;
		try {
			Class.forName("org.sqlite.JDBC");
			c = DriverManager.getConnection("jdbc:sqlite:taxabaixa.db");
			System.out.println("Opened database successfully\n");

			stmt = c.createStatement();
			System.out.println("Create Tables...\n");

			String sql = "CREATE TABLE cliente" +
					"(clienteID INT PRIMARY KEY     NOT NULL," +
					" clienteNAME           TEXT    NOT NULL, ";

			String sql1 = "CREATE TABLE gerente" +
					"(ID INT PRIMARY KEY     NOT NULL," +
					" NAME           TEXT    NOT NULL, " + 
					" AGE            INT     NOT NULL, " + 
					" ADDRESS        CHAR(50), " + 
					" SALARY         REAL)"; 

			String sql2 = "CREATE TABLE agencia" +
					"(agenciaID 			INT PRIMARY KEY     NOT NULL," +
					" agenciaNAME           TEXT    			NOT NULL, " +  
					" numContas         	INT					NOT NULL)"; 

			stmt.executeUpdate(sql);
			stmt.executeUpdate(sql1);
			stmt.executeUpdate(sql2);
			stmt.close();
			c.close();

		} catch ( Exception e ) {
			System.err.println( e.getClass().getName() + ": " + e.getMessage() );
			System.exit(0);
		}
		System.out.println("Table created successfully");
	}
}