package net.excham.scs.frienderman;

import org.bukkit.plugin.java.JavaPlugin;

import net.excham.scs.frienderman.events.CreatureSpawnListener;
import net.excham.scs.frienderman.events.EndermanAttackPlayerListener;
import net.excham.scs.frienderman.events.EntityDamageByEntityListener;
import net.excham.scs.frienderman.events.EntityTargetLivingEntityListener;

public class Frienderman extends JavaPlugin {
	
	@Override
	public void onEnable() {
		this.getLogger().info("Frienderman starting...");

		// listen for mr. endermans spawning
		this.getServer().getPluginManager().registerEvents(new CreatureSpawnListener(), this);
		// make sure they dont hurt anyone
		this.getServer().getPluginManager().registerEvents(new EndermanAttackPlayerListener(), this);
		// don't let them get mad
		this.getServer().getPluginManager().registerEvents(new EntityTargetLivingEntityListener(), this);
		// tell players off for hitting them
		this.getServer().getPluginManager().registerEvents(new EntityDamageByEntityListener(), this);
	}
	
	@Override
	public void onDisable() {
		this.getLogger().info("Mr. Friendermens says bye bye");
	}
}
