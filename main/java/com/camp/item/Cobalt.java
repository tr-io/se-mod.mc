package com.camp.item;

import com.camp.creativetabs.CreativeTabsManager;
import com.camp.main.StringLibrary;

import net.minecraft.item.Item;

public class Cobalt extends Item {
	
	public Cobalt() {
		this.setUnlocalizedName("Cobalt");
		this.setCreativeTab(CreativeTabsManager.tabSE_Item);
		this.setMaxStackSize(24);
		this.setTextureName(StringLibrary.MODID + ":cobalt");
	}
	
}
