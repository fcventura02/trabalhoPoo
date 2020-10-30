package br.com.trabalhoPoo.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionMysql {
	public static String status = "não conectou..";
	public ConnectionMysql() {}
	public static Connection getConnectionMysql() {
		Connection connection = null;
		try {
			String url = "jdbc:mysql://localhost/trabalhoPoo";
			String u_name = "root";
			String pass = "123456";
			connection = DriverManager.getConnection(url, u_name, pass);
			if(connection != null) {
				status  = ("Conectado com sucesso!");
			}else {
				status = ("Não Conectou");
			}
			return connection;
		} catch (Exception e) {
			System.out.println(e);
			return null;
		}
	}
}