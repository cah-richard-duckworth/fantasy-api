package com.therick.fantasy.api.data.model;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;
import java.util.Objects;

/**
 * @author Richard W. Duckworth
 * @created 11/22/2019
 */
@Embeddable
public class FantasyTeamPlayerID implements Serializable {
	@Column(name = "fantasy_team_id")
	private int fantasyTeamID;

	@Column(name = "player_id")
	private int playerID;

	public FantasyTeamPlayerID() {}

	public FantasyTeamPlayerID(int fantasyTeamID, int playerID) {
		this.fantasyTeamID = fantasyTeamID;
		this.playerID = playerID;
	}

	public int getFantasyTeamID() {
		return fantasyTeamID;
	}

	public void setFantasyTeamID(int fantasyTeamID) {
		this.fantasyTeamID = fantasyTeamID;
	}

	public int getPlayerID() {
		return playerID;
	}

	public void setPlayerID(int playerID) {
		this.playerID = playerID;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		FantasyTeamPlayerID that = (FantasyTeamPlayerID) o;
		return fantasyTeamID == that.fantasyTeamID &&
				playerID == that.playerID;
	}

	@Override
	public int hashCode() {
		return Objects.hash(fantasyTeamID, playerID);
	}
}
