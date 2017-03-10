package com.taxabaixa.DB;

import java.sql.*;

public class DeletaTabela
{
	public static void main( String args[] )
	{
		Connection c = null;
		Statement stmt = null;
		try {
			Class.forName("org.sqlite.JDBC");
			c = DriverManager.getConnection("jdbc:sqlite:taxabaixa.db");
			c.setAutoCommit(false);
			System.out.println("Opened database successfully\n");

			stmt = c.createStatement();
			String sql = "DELETE from cliente where ID=2;";
			stmt.executeUpdate(sql);
			c.commit();

			ResultSet rs = stmt.executeQuery( "SELECT * FROM COMPANY;" );
			while ( rs.next() ) {
				int id = rs.getInt("id");
				String  name = rs.getString("name");
				int age  = rs.getInt("age");
				String  address = rs.getString("address");
				float salary = rs.getFloat("salary");
				System.out.println( "ID = " + id );
				System.out.println( "NAME = " + name );
				System.out.println( "AGE = " + age );
				System.out.println( "ADDRESS = " + address );
				System.out.println( "SALARY = " + salary );
				System.out.println();
			}
			rs.close();
			stmt.close();
			c.close();
		} catch ( Exception e ) {
			System.err.println( e.getClass().getName() + ": " + e.getMessage() );
			System.exit(0);
		}
		System.out.println("Operation done successfully");
	}
}