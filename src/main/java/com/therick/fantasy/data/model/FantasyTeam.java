package com.therick.fantasy.data.model;

import javax.persistence.*;
import java.util.Objects;
import java.util.Set;

/**
 * @author Richard W. Duckworth
 * @created 11/21/2019
 */
@Entity
public class FantasyTeam {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;

	@ManyToOne
	@JoinColumn(name = "user_id", nullable = false)
	private User user;

	@OneToMany(
			mappedBy = "fantasyTeam",
			cascade = CascadeType.ALL,
			orphanRemoval = true
	)
	private Set<FantasyTeamPlayer> players;

	public FantasyTeam() {}

	public FantasyTeam(String name) {
		this.name = name;
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

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Set<FantasyTeamPlayer> getPlayers() {
		return players;
	}

	public void setPlayers(Set<FantasyTeamPlayer> players) {
		this.players = players;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		FantasyTeam that = (FantasyTeam) o;
		return name.equals(that.name);
	}

	@Override
	public int hashCode() {
		return Objects.hash(name);
	}
}
