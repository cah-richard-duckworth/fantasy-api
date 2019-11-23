package com.therick.fantasy.web.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/**
 * @author Richard W. Duckworth
 * @created 11/22/2019
 */
@EnableWebSecurity
public class FantasySecurityConfig extends WebSecurityConfigurerAdapter {
	@Autowired
	private FantasyUserDetailsService fantasyUserDetailsService;

	@Autowired
	public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
		auth.userDetailsService(fantasyUserDetailsService);
	}
}
