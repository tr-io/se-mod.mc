package com.camp.item;

import net.minecraft.entity.Entity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

import com.camp.main.StringLibrary;

public class CobaltArmor extends ItemArmor {

	public CobaltArmor(ArmorMaterial p_i45325_1_, int p_i45325_2_,
			int p_i45325_3_) {
		super(p_i45325_1_, p_i45325_2_, p_i45325_3_);
		// TODO Auto-generated constructor stub
	}
	
	public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type) {
		
		if (slot == 0 || slot == 1 || slot == 3) {
			return StringLibrary.MODID + ":textures/models/armor/cobalt_armor_layer_1.png";
		}
		else if (slot == 2) {
			return StringLibrary.MODID + ":textures/models/armor/cobalt_armor_layer_2.png";
		}
		else {
			return null;
		}
		
	}

}
