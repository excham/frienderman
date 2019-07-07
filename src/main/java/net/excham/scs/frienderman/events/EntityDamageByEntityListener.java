package net.excham.scs.frienderman.events;

import org.bukkit.entity.Enderman;
import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.inventory.ItemStack;

public class EntityDamageByEntityListener implements Listener {

	@EventHandler
	public void onEntityDamageByEntity(EntityDamageByEntityEvent e) {
		if(e.getEntityType().equals(EntityType.ENDERMAN)) {
			
			// find out the scumbag who hurt him
			Entity damager = e.getDamager();
			Enderman ender = (Enderman) e.getEntity();
			
			if(damager.getType() == EntityType.PLAYER) {
				
				if(ender.getHealth() < e.getDamage()) {
					// alexa this is so sad
					damager.sendMessage("<Mr. Enderman> tell my " + (Math.random() <= 0.8 ? "wife" : "husband") + " i lo-");
				} else {
					if(ender.getCarriedBlock() != null) {
						// oh man i hope they leave me alone
						damager.sendMessage("<Mr. Enderman> please. just take this. i dont want any trouble.");
						// drop the flower
						ender.getWorld().dropItem(ender.getLocation(), new ItemStack(ender.getCarriedBlock().getMaterial(), 1));
						ender.setCarriedBlock(null);
					} else if(Math.random() < 0.2) {
						// g u i l t
						damager.sendMessage("<Mr. Enderman> please don't hurt me :(");	
					}
				}
			}
		}
	}
	
}
