package pkgPokerBLL;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class Table implements Serializable {

	private UUID TableID;

	private HashMap<UUID, Player> TablePlayers = new HashMap<UUID, Player>();

	public Table() {
		super();
		TableID = UUID.randomUUID();
	}

	public Table AddPlayerToTable(Player p) {
		TablePlayers.put(p.getPlayerID(), p);
		return this;
	}

	public Table RemovePlayerFromTable(Player p) {
		TablePlayers.remove(p.getPlayerID());
		return this;
	}
	
	public ArrayList<Player> getPlayersInTable()
	{
		ArrayList<Player> playerlist = new ArrayList<Player>();
		for (UUID key : TablePlayers.keySet()){
			playerlist.add(TablePlayers.get(key));
		}
		return playerlist;
	}

}