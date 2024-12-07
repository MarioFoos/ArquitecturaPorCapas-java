package com.diardon;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.ArrayList;

public class AppTest
{
	// Clase del controlador de la base de datos
	private static final String DRIVER = "com.mysql.cj.jdbc.Driver";
	// URL de la base de datos
	private static final String URL = "jdbc:mysql://localhost:3306/diardon";
	// Usuario de la base de datos
	private static final String USER = "root";
	// Contraseña de la base de datos
	private static final String PASS = "password";

	public static void main(String[] args)
	{
		// Capa de Aplicación. Controlador que coordina las solicitudes
		Connection connection = null;
		UserService userService = null;
		ArrayList<String> users = null;
		try
		{
			Class.forName(DRIVER);
			connection = DriverManager.getConnection(URL, USER, PASS);
			userService = new UserService(connection);
		}
		catch(Exception e)
		{
			System.err.println("Error init " + e.getMessage());
			return;
		}
		users = userService.fetchAllUsers();

		// Capa de Presentación. En este caso, la consola actúa como interfaz:
		System.out.println(users);
	}
}
