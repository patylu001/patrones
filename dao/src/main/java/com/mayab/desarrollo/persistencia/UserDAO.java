package com.mayab.desarrollo.persistencia;

import java.util.List;

import com.mayab.desarrollo.entities.User;


public interface UserDAO {
	
	
	public int delete(int id);

	
	public List<User> findAll();

	
	public User findById(int id);
	
	
	public User findByName(String name);

	public int insert(User user);

	
	public int update(User user);
	
}