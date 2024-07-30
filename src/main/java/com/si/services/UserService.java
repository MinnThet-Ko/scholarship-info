package com.si.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.si.models.User;
import com.si.repositories.UserRepository;

@Service
public class UserService implements UserDetailsService{

	@Autowired
	private UserRepository userRepository;
	
	public void saveUser(User user) {
		user.setPassword(new BCryptPasswordEncoder().encode(user.getPassword()));
		this.userRepository.save(user);
	}

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		User resultUser = this.userRepository.findByUsername(username);
		if(resultUser != null) {
			return resultUser;
		}
		throw new UsernameNotFoundException("User: "+username+" was not found." );
	}
}
