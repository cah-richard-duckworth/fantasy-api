package com.therick.fantasy.data.model;

import javax.persistence.*;
import java.util.Objects;

/**
 * @author Richard W. Duckworth
 * @created 11/22/2019
 */
@Entity
public class FantasyTeamPlayer {
	@EmbeddedId
	private FantasyTeamPlayerID fantasyTeamPlayerID;

	@ManyToOne(fetch = FetchType.LAZY)
	@MapsId(value = "fantasyTeamID")
	private FantasyTeam fantasyTeam;

	@ManyToOne(fetch = FetchType.LAZY)
	@MapsId(value = "playerID")
	private Player player;

	private boolean start;

	public FantasyTeamPlayer() {}

	public FantasyTeamPlayer(FantasyTeam fantasyTeam, Player player, boolean start) {
		this.fantasyTeam = fantasyTeam;
		this.player = player;
		this.start = start;
	}

	public FantasyTeamPlayerID getFantasyTeamPlayerID() {
		return fantasyTeamPlayerID;
	}

	public void setFantasyTeamPlayerID(FantasyTeamPlayerID fantasyTeamPlayerID) {
		this.fantasyTeamPlayerID = fantasyTeamPlayerID;
	}

	public FantasyTeam getFantasyTeam() {
		return fantasyTeam;
	}

	public void setFantasyTeam(FantasyTeam fantasyTeam) {
		this.fantasyTeam = fantasyTeam;
	}

	public Player getPlayer() {
		return player;
	}

	public void setPlayer(Player player) {
		this.player = player;
	}

	public boolean isStart() {
		return start;
	}

	public void setStart(boolean start) {
		this.start = start;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		FantasyTeamPlayer that = (FantasyTeamPlayer) o;
		return fantasyTeam.equals(that.fantasyTeam) &&
				player.equals(that.player);
	}

	@Override
	public int hashCode() {
		return Objects.hash(fantasyTeam, player);
	}
}
