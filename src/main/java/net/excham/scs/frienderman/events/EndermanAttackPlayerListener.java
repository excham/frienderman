package net.excham.scs.frienderman.events;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;

import com.destroystokyo.paper.event.entity.EndermanAttackPlayerEvent;

public class EndermanAttackPlayerListener implements Listener {

	@EventHandler
	public void onEndermanAttackPlayer(EndermanAttackPlayerEvent e) {
		// cancel any enderman damage because they didn't mean it
		e.setCancelled(true);
	}
	
}
