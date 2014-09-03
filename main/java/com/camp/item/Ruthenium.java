package com.camp.item;

import com.camp.creativetabs.CreativeTabsManager;
import com.camp.main.StringLibrary;

import net.minecraft.item.Item;

public class Ruthenium extends Item {
	
	public Ruthenium() {
		this.setUnlocalizedName("Ruthenium");
		this.setCreativeTab(CreativeTabsManager.tabSE_Item);
		this.setMaxStackSize(24);
		this.setTextureName(StringLibrary.MODID + ":ruthenium");
	}
	
}
