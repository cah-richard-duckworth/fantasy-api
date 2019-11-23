package com.therick.fantasy.data.model;

import javax.persistence.*;
import java.util.Objects;
import java.util.Set;

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
	private Set<FantasyTeam> fantasyTeams;

	public User() {}

	public User(String name, String email, String username, String password) {
		this.name = name;
		this.email = email;
		this.username = username;
		this.password = password;
	}

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

	public Set<FantasyTeam> getFantasyTeams() {
		return fantasyTeams;
	}

	public void setFantasyTeams(Set<FantasyTeam> fantasyTeams) {
		this.fantasyTeams = fantasyTeams;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		User user = (User) o;
		return name.equals(user.name) &&
				email.equals(user.email) &&
				username.equals(user.username) &&
				password.equals(user.password);
	}

	@Override
	public int hashCode() {
		return Objects.hash(name, email, username, password);
	}
}
