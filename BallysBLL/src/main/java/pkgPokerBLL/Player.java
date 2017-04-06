package pkgPokerBLL;

import java.util.UUID;

public class Player {

	private static UUID PlayerID;
	private String PlayerName;
	
	public Player(String playerName) {
		super();
		PlayerID = UUID.randomUUID();
		PlayerName = playerName;
	}
	
	public static UUID getPlayerID() {
		return PlayerID;
	}

	public void setPlayerID(UUID playerID) {
		PlayerID = playerID;
	}

}
