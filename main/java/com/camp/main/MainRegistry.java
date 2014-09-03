package com.camp.main;

import com.camp.block.BlockManager;
import com.camp.creativetabs.CreativeTabsManager;
import com.camp.item.ItemManager;
import com.camp.recipe.RecipeManager;
import com.camp.world.OreManager;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;

@Mod(modid = StringLibrary.MODID, name = StringLibrary.name, version = StringLibrary.version)
public class MainRegistry {
	
	@SidedProxy(clientSide = "com.camp.main.ClientProxy", serverSide = "com.camp.main.ServerProxy")
	public static ClientProxy proxy;
	public static OreManager generator = new OreManager();
	
	@EventHandler
	public static void PreLoad(FMLPreInitializationEvent PreEvent) {
		CreativeTabsManager.mainRegistry();
		ItemManager.MainRegistry();
		BlockManager.mainRegistry();
		RecipeManager.mainRegistry();
		proxy.registerRenderThings();
	}
	
	@EventHandler
	public static void Load(FMLInitializationEvent Event) {
		GameRegistry.registerWorldGenerator(generator, 1);
		System.out.println("SE Mod Successfully Loaded!");
	}
	
	@EventHandler
	public static void PostLoad(FMLPostInitializationEvent PostEvent) {
		
	}
	
}
