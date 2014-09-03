package com.camp.item;

import com.camp.creativetabs.CreativeTabsManager;
import com.camp.main.StringLibrary;

import net.minecraft.item.Item;

public class CobaltIngot extends Item {
	
	public CobaltIngot() {
		this.setUnlocalizedName("CobaltIngot");
		this.setCreativeTab(CreativeTabsManager.tabSE_Item);
		this.setMaxStackSize(64);
		this.setTextureName(StringLibrary.MODID + ":cobalt_ingot");
	}
	
}
