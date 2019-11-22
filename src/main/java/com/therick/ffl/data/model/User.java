package com.therick.ffl.data.model;

import javax.persistence.*;
import java.util.Collection;

/**
 * @author Richard W. Duckworth
 * @created 11/21/2019
 */
@Entity
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private String email;
	private String username;
	private String password;

	@OneToMany(mappedBy = "user")
	private Collection<FantasyTeam> fantasyTeams;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Collection<FantasyTeam> getFantasyTeams() {
		return fantasyTeams;
	}

	public void setFantasyTeams(Collection<FantasyTeam> fantasyTeams) {
		this.fantasyTeams = fantasyTeams;
	}
}
