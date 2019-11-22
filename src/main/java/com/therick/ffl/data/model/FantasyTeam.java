package com.therick.ffl.data.model;

import javax.persistence.*;
import java.util.Collection;

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

	@ManyToMany
	@JoinTable(
			name = "fantasy_team_player",
			joinColumns = @JoinColumn(name = "fantasy_team_id"),
			inverseJoinColumns = @JoinColumn(name = "player_id")
	)
	private Collection<Player> players;

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

	public Collection<Player> getPlayers() {
		return players;
	}

	public void setPlayers(Collection<Player> players) {
		this.players = players;
	}
}
