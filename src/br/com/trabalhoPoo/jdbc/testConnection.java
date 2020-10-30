package br.com.trabalhoPoo.jdbc;

import java.sql.Connection;

public class testConnection {
	public static void main(String[] args) {
		Connection conn = ConnectionMysql.getConnectionMysql();
		System.out.println(ConnectionMysql.status);
	}
}
