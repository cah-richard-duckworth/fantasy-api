package com.therick.ffl.data.model;

import javax.persistence.*;
import java.util.Set;

/**
 * @author Richard W. Duckworth
 * @created 11/21/2019
 */
@Entity
public class Position {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private String abbreviation;

	@OneToMany(mappedBy = "position")
	private Set<Player> players;

	public Position() {}

	public Position(String name, String abbreviation) {
		this.name = name;
		this.abbreviation = abbreviation;
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

	public String getAbbreviation() {
		return abbreviation;
	}

	public void setAbbreviation(String abbreviation) {
		this.abbreviation = abbreviation;
	}

	public Set<Player> getPlayers() {
		return players;
	}

	public void setPlayers(Set<Player> players) {
		this.players = players;
	}
}
