package com.camp.creativetabs;

import net.minecraft.creativetab.CreativeTabs;

public class CreativeTabsManager {
	
	public static void mainRegistry() {
		initializeTabs();
	}
	public static CreativeTabs tabSE_Block;
	public static CreativeTabs tabSE_Item;
	
	public static void initializeTabs() {
		tabSE_Block = new BlockTab("SEBlocks");
		tabSE_Item = new ItemTab("SEItems");
	}
	
}
