package com.therick.ffl.data.model;

import javax.persistence.*;
import java.util.Collection;

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
	@ManyToOne(targetEntity = Position.class)
	private Position position;
	@ManyToOne(targetEntity = NflTeam.class)
	private NflTeam nflTeam;
	@ManyToMany(targetEntity = FantasyTeam.class)
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

	public Collection<FantasyTeam> getFantasyTeams() {
		return fantasyTeams;
	}

	public void setFantasyTeams(Collection<FantasyTeam> fantasyTeams) {
		this.fantasyTeams = fantasyTeams;
	}
}