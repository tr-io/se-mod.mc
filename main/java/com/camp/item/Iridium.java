package com.camp.item;

import com.camp.creativetabs.CreativeTabsManager;
import com.camp.main.StringLibrary;

import net.minecraft.item.Item;

public class Iridium extends Item {
	
	public Iridium() {
		this.setUnlocalizedName("Iridium");
		this.setCreativeTab(CreativeTabsManager.tabSE_Item);
		this.setMaxStackSize(24);
		this.setTextureName(StringLibrary.MODID + ":iridium");
	}
	
}
