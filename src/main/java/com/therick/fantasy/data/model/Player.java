package com.therick.fantasy.data.model;

import javax.persistence.*;
import java.util.Objects;
import java.util.Set;

/**
 * @author Richard W. Duckworth
 * @created 11/21/2019
 */
@Entity
public class Player {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;

	@ManyToOne
	@JoinColumn(name = "position_id", nullable = false)
	private Position position;

	@ManyToOne
	@JoinColumn(name = "nfl_team_id", nullable = false)
	private NflTeam nflTeam;

	@OneToMany(
			mappedBy = "player",
			cascade = CascadeType.ALL,
			orphanRemoval = true
	)
	private Set<FantasyTeamPlayer> fantasyTeams;

	public Player() {}

	public Player(String name) {
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

	public Position getPosition() {
		return position;
	}

	public void setPosition(Position position) {
		this.position = position;
	}

	public NflTeam getNflTeam() {
		return nflTeam;
	}

	public void setNflTeam(NflTeam nflTeam) {
		this.nflTeam = nflTeam;
	}

	public Set<FantasyTeamPlayer> getFantasyTeams() {
		return fantasyTeams;
	}

	public void setFantasyTeams(Set<FantasyTeamPlayer> fantasyTeams) {
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
		Player player = (Player) o;
		return name.equals(player.name);
	}

	@Override
	public int hashCode() {
		return Objects.hash(name);
	}
}
