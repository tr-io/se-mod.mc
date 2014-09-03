package com.camp.block;

import java.util.Random;

import com.camp.creativetabs.CreativeTabsManager;
import com.camp.item.ItemManager;
import com.camp.main.StringLibrary;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;

public class IridiumOre extends Block {

	protected IridiumOre(Material p_i45394_1_) {
		super(p_i45394_1_);
		// TODO Auto-generated constructor stub
		this.setBlockName("IridiumOre");
		this.setCreativeTab(CreativeTabsManager.tabSE_Block);
		this.setHardness(14.0F);
		this.setBlockTextureName(StringLibrary.MODID + ":iridium_ore");
	}
	
	@Override
	public int quantityDropped(Random p_149745_1_)
    {
        return 1;
    }
	
	@Override
    public Item getItemDropped(int p_149650_1_, Random p_149650_2_, int p_149650_3_)
    {
        return ItemManager.iridiumItem;
    }
	
}
