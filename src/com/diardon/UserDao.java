package com.diardon;
import java.sql.*;
import java.util.ArrayList;

// Capa de persistencia que conecta con la capa de datos
public class UserDao
{
	private Connection connection;

	public UserDao(Connection connection)
	{
		this.connection = connection;
	}
	public ArrayList<String> getAllUsers() throws SQLException
	{
		ArrayList<String> users = new ArrayList<>();
		String query = "SELECT name FROM users";
		try(Statement stmt = connection.createStatement(); ResultSet rs = stmt.executeQuery(query))
		{
			while(rs.next())
			{
				users.add(rs.getString("name"));
			}
		}
		return users;
	}
}
