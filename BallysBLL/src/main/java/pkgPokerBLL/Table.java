package pkgPokerBLL;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.UUID;

public class Table {

	private static UUID TableID;
	
	public static UUID getTableID() {
		return TableID;
	}

	public void setTableID(UUID tableID) {
		TableID = tableID;
	}

	//	Change this from ArrayList to HashMap.
	private ArrayList<Player> TablePlayers = new ArrayList<Player>();
	HashMap<UUID, Player> TablePlayersHash = new HashMap<UUID, Player>();{
	for (Player player:TablePlayers){
		TablePlayersHash.put(player.getPlayerID(), player);
	}
	}
	
	public Table() {
		super();
		TableID = UUID.randomUUID();
	}
	
	public Table AddPlayerToTable(Player p)
	{
		TablePlayers.add(p);		
		return this;
	}
	
	public Table RemovePlayerFromTable(Player p)
	{
		TablePlayers.remove(p);
		return this;
	}
	
}
