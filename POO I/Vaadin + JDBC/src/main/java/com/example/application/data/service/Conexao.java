package com.example.application.data.service;

import java.sql.Connection;

import java.sql.DriverManager;

import java.sql.SQLException;

public class Conexao{

// Informamos qual o Driver que está sendo utilizado

private static final String DRIVER = "com.mysql.cj.jdbc.Driver";

private static final String URL = "jdbc:mysql://localhost:3306/aplicacao";

private static final String USER = "root";

private static final String PASSWORD = "root";

public static Connection getConnection() throws SQLException, ClassNotFoundException {

try{

 // O método forName carrega e inicia o driver passado por parâmetro

Class.forName(DRIVER);

 // Estabelecendo a conexão

return DriverManager.getConnection(URL, USER, PASSWORD);

}catch(ClassNotFoundException | SQLException ex){ // Tratamento de Exceções

System.out.println(ex);

return null;

}

}

}