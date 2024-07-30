package com.si;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

import com.si.services.UserService;

@Configuration
@EnableWebSecurity
public class SecurityConfiguration {
	
	@Autowired
	private UserService userService;

    //Create security filter chain
    @Bean
    SecurityFilterChain createSecurityFilterChain(HttpSecurity http) throws Exception {
		http.authorizeHttpRequests((auth) -> 
		auth.requestMatchers("/","/user/registration").permitAll().anyRequest().authenticated())
		.formLogin((form) -> form.loginPage("/user/login").permitAll());
		return http.build();
	}

	@Bean
	PasswordEncoder generatePasswordEncoder() {
		return new BCryptPasswordEncoder();
	}
	
	@Autowired
	public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
		auth.userDetailsService(this.userService).passwordEncoder(new BCryptPasswordEncoder());		
	}
}
