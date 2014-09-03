package com.camp.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import cpw.mods.fml.common.registry.GameRegistry;

public class BlockManager {
	
	public static void mainRegistry() {
		initializeBlock();
		registerBlock();
	}
	
	public static Block MeteoriteBlock;
	public static Block AsteroidBlock;
	public static Block CobaltOre;
	public static Block IridiumOre;
	public static Block RutheniumOre;
	public static Block MegaTNT;
	
	public static void initializeBlock() {
		MeteoriteBlock = new MeteoriteBlock(Material.rock);
		AsteroidBlock = new AsteroidBlock(Material.rock);
		CobaltOre = new CobaltOre(Material.rock);
		IridiumOre = new IridiumOre(Material.rock);
		RutheniumOre = new RutheniumOre(Material.rock);
	}
	
	public static void registerBlock() {
		GameRegistry.registerBlock(MeteoriteBlock, MeteoriteBlock.getUnlocalizedName());
		GameRegistry.registerBlock(AsteroidBlock, AsteroidBlock.getUnlocalizedName());
		GameRegistry.registerBlock(CobaltOre, CobaltOre.getUnlocalizedName());
		GameRegistry.registerBlock(IridiumOre, IridiumOre.getUnlocalizedName());
		GameRegistry.registerBlock(RutheniumOre, RutheniumOre.getUnlocalizedName());
	}
	
}
