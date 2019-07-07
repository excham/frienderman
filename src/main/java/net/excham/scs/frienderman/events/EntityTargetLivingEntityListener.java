package net.excham.scs.frienderman.events;

import org.bukkit.entity.EntityType;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityTargetLivingEntityEvent;

public class EntityTargetLivingEntityListener implements Listener {

	@EventHandler
	public void onEntityTargetLivingEntity(EntityTargetLivingEntityEvent e) {
		// if mr. endermans gets angery at a player...
		if(e.getEntity().getType() == EntityType.ENDERMAN
		&& e.getTarget().getType() == EntityType.PLAYER) {
			
			// *heavy new-york accent* ...fuggedaboutit!
			e.setCancelled(true);
		}
	}
	
}
