package com.therick.fantasy.data.model;

import javax.persistence.*;
import java.util.Objects;
import java.util.Set;

/**
 * @author Richard W. Duckworth
 * @created 11/21/2019
 */
@Entity
public class NflTeam {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;

	@OneToMany(mappedBy = "nflTeam")
	private Set<Player> players;

	public NflTeam() {}

	public NflTeam(String name) {
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

	public Set<Player> getPlayers() {
		return players;
	}

	public void setPlayers(Set<Player> players) {
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
		NflTeam nflTeam = (NflTeam) o;
		return name.equals(nflTeam.name);
	}

	@Override
	public int hashCode() {
		return Objects.hash(name);
	}
}
