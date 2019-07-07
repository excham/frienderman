package net.excham.scs.frienderman.util;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.block.data.BlockData;

public class BlockUtil {

	public static BlockData randomFlower() {
		// pick a number, any number
		double rand = Math.random();
		
		// decide what flower we want
		Material material;
		
		if(rand < 0.1)
			material = Material.DANDELION;
		else if(rand < 0.2)
			material = Material.POPPY;
		else if(rand < 0.3)
			material = Material.ALLIUM;
		else if(rand < 0.4)
			material = Material.ORANGE_TULIP;
		else if(rand < 0.5)
			material = Material.RED_TULIP;
		else if(rand < 0.6)
			material = Material.PINK_TULIP;
		else if(rand < 0.7)
			material = Material.WHITE_TULIP;
		else if(rand < 0.8)
			material = Material.OXEYE_DAISY;
		else if(rand < 0.9)
			material = Material.SUNFLOWER;
		else
			material = Material.LILAC;
		
		
		// create the flower
		BlockData flower = Bukkit.createBlockData(material);
		
		return flower;
	}
	
}
