package com.camp.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

import com.camp.creativetabs.CreativeTabsManager;
import com.camp.main.StringLibrary;

public class MeteoriteBlock extends Block {

	protected MeteoriteBlock(Material p_i45394_1_) {
		super(p_i45394_1_);
		// TODO Auto-generated constructor stub
		this.setBlockName("MeteoriteBlock");
		this.setCreativeTab(CreativeTabsManager.tabSE_Block);
		this.setHardness(2.0F);
		this.setResistance(12.0F);
		this.setBlockTextureName(StringLibrary.MODID + ":meteorite");
	}
	
}
