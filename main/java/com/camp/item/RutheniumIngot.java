package com.camp.item;

import com.camp.creativetabs.CreativeTabsManager;
import com.camp.main.StringLibrary;

import net.minecraft.item.Item;

public class RutheniumIngot extends Item {
	
	public RutheniumIngot() {
		this.setUnlocalizedName("RutheniumIngot");
		this.setCreativeTab(CreativeTabsManager.tabSE_Item);
		this.setMaxStackSize(64);
		this.setTextureName(StringLibrary.MODID + ":ruthenium_ingot");
	}
	
}
