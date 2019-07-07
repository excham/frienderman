package net.excham.scs.frienderman.events;

import org.bukkit.entity.Enderman;
import org.bukkit.entity.EntityType;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.CreatureSpawnEvent;

import net.excham.scs.frienderman.util.BlockUtil;

public class CreatureSpawnListener implements Listener {

	@EventHandler
	public void onCreatureSpawn(CreatureSpawnEvent e) {
		// we only care about mr. endermans
		if(!e.getEntityType().equals(EntityType.ENDERMAN)) return;
		
		// get mr. endermans
		Enderman ender = (Enderman) e.getEntity();
		
		// griefing = bad
		ender.setCanPickupItems(false);
		
		// give 'em flowies uwu
		ender.setCarriedBlock(BlockUtil.randomFlower());
	}
	
}
