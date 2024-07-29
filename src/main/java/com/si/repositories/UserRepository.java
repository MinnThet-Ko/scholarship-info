package com.si.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.si.models.User;

@Repository
public interface UserRepository extends CrudRepository<User, String>{
	
	public User findByEmail(String email);
	public User findByUsername(String username);

}
