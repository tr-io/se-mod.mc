package com.camp.block;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;

import com.camp.creativetabs.CreativeTabsManager;
import com.camp.item.ItemManager;
import com.camp.main.StringLibrary;

public class CobaltOre extends Block {

	protected CobaltOre(Material p_i45394_1_) {
		super(p_i45394_1_);
		// TODO Auto-generated constructor stub
		this.setBlockName("CobaltOre");
		this.setCreativeTab(CreativeTabsManager.tabSE_Block);
		this.setHardness(20.0F);
		this.setBlockTextureName(StringLibrary.MODID + ":cobalt_ore");
	}
	
	@Override
	public int quantityDropped(Random p_149745_1_)
    {
        return 1;
    }
	
	@Override
    public Item getItemDropped(int p_149650_1_, Random p_149650_2_, int p_149650_3_)
    {
        return ItemManager.cobaltItem;
    }
	
}
