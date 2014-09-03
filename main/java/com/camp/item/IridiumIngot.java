package com.camp.item;

import com.camp.creativetabs.CreativeTabsManager;
import com.camp.main.StringLibrary;

import net.minecraft.item.Item;

public class IridiumIngot extends Item {
	
	public IridiumIngot() {
		this.setUnlocalizedName("IridiumIngot");
		this.setCreativeTab(CreativeTabsManager.tabSE_Item);
		this.setMaxStackSize(64);
		this.setTextureName(StringLibrary.MODID + ":iridium_ingot");
	}
	
}
