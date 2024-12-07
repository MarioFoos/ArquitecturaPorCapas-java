package com.diardon;
import java.sql.*;
import java.util.ArrayList;

//Capa de Negocio. Servicio que usa el DAO
public class UserService
{
	private UserDao userDao;

	public UserService(Connection connection)
	{
		this.userDao = new UserDao(connection);
	}

	public ArrayList<String> fetchAllUsers()
	{
		try
		{
			return userDao.getAllUsers();
		}
		catch(Exception e)
		{
			throw new RuntimeException("Error fetching users", e);
		}
	}
}
