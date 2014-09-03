package com.camp.item;

import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.common.util.EnumHelper;

import com.camp.creativetabs.CreativeTabsManager;
import com.camp.main.MainRegistry;
import com.camp.main.StringLibrary;

import cpw.mods.fml.common.registry.GameRegistry;

public class ItemManager {
	
	public static void MainRegistry() {
		initializeItem();
		registerItem();
	}
	public static Item cobaltItem;
	public static Item iridiumItem;
	public static Item rutheniumItem;
	
	public static Item cobaltIngot;
	public static Item iridiumIngot;
	public static Item rutheniumIngot;
	
	//Item sets
	public static ToolMaterial cobaltMaterial = EnumHelper.addToolMaterial("Cobalt", 3, 2500, 12.0F, 2.0F, 10);
	public static Item CobaltPickaxe;
	public static Item CobaltSword;
	public static Item CobaltShovel;
	public static Item CobaltAxe;
	
	public static ToolMaterial iridiumMaterial = EnumHelper.addToolMaterial("Iridium", 3, 2000, 10.0F, 1.5F, 10);
	public static Item IridiumPickaxe;
	public static Item IridiumSword;
	public static Item IridiumShovel;
	public static Item IridiumAxe;
	
	public static ToolMaterial rutheniumMaterial = EnumHelper.addToolMaterial("Ruthenium", 3, 3000, 14.0F, 3.0F, 15);
	public static Item RutheniumPickaxe;
	public static Item RutheniumSword;
	public static Item RutheniumShovel;
	public static Item RutheniumAxe;
	
	//Armor sets
	public static ArmorMaterial cobaltArmorMat = EnumHelper.addArmorMaterial("CobaltArmor", 45, new int[]{4, 10, 8, 5}, 15);
	public static Item cobaltHelmet;
	public static Item cobaltChestplate;
	public static Item cobaltLeggings;
	public static Item cobaltBoots;
	
	public static ArmorMaterial iridiumArmorMat = EnumHelper.addArmorMaterial("IridiumArmor", 35, new int[]{3, 8, 6, 3}, 10);
	public static Item iridiumHelmet;
	public static Item iridiumChestplate;
	public static Item iridiumLeggings;
	public static Item iridiumBoots;
	
	public static ArmorMaterial rutheniumArmorMat = EnumHelper.addArmorMaterial("RutheniumArmor", 60, new int[]{6, 14, 10, 8}, 25);
	public static Item rutheniumHelmet;
	public static Item rutheniumChestplate;
	public static Item rutheniumLeggings;
	public static Item rutheniumBoots;
	
	public static void initializeItem() {
		cobaltItem = new Cobalt();
		iridiumItem = new Iridium();
		rutheniumItem = new Ruthenium();
		
		cobaltIngot = new CobaltIngot();
		iridiumIngot = new IridiumIngot();
		rutheniumIngot = new RutheniumIngot();
		
		CobaltPickaxe = new CobaltPickaxe(cobaltMaterial).setUnlocalizedName("CobaltPickaxe").setCreativeTab(CreativeTabsManager.tabSE_Item).setTextureName(StringLibrary.MODID + ":cobalt_pickaxe");
		CobaltSword = new CobaltSword(cobaltMaterial).setUnlocalizedName("CobaltSword").setCreativeTab(CreativeTabsManager.tabSE_Item).setTextureName(StringLibrary.MODID + ":cobalt_sword");
		CobaltShovel = new CobaltShovel(cobaltMaterial).setUnlocalizedName("CobaltShovel").setCreativeTab(CreativeTabsManager.tabSE_Item).setTextureName(StringLibrary.MODID + ":cobalt_shovel");
		CobaltAxe = new CobaltAxe(cobaltMaterial).setUnlocalizedName("CobaltAxe").setCreativeTab(CreativeTabsManager.tabSE_Item).setTextureName(StringLibrary.MODID + ":cobalt_axe");
		
		IridiumPickaxe = new IridiumPickaxe(iridiumMaterial).setUnlocalizedName("IridiumPickaxe").setCreativeTab(CreativeTabsManager.tabSE_Item).setTextureName(StringLibrary.MODID + ":iridium_pickaxe");
		IridiumSword = new IridiumSword(iridiumMaterial).setUnlocalizedName("IridiumSword").setCreativeTab(CreativeTabsManager.tabSE_Item).setTextureName(StringLibrary.MODID + ":iridium_sword");
		IridiumShovel = new IridiumShovel(iridiumMaterial).setUnlocalizedName("IridiumShovel").setCreativeTab(CreativeTabsManager.tabSE_Item).setTextureName(StringLibrary.MODID + ":iridium_shovel");
		IridiumAxe = new IridiumAxe(iridiumMaterial).setUnlocalizedName("IridiumAxe").setCreativeTab(CreativeTabsManager.tabSE_Item).setTextureName(StringLibrary.MODID + ":iridium_axe");
		
		RutheniumPickaxe = new RutheniumPickaxe(rutheniumMaterial).setUnlocalizedName("RutheniumPickaxe").setCreativeTab(CreativeTabsManager.tabSE_Item).setTextureName(StringLibrary.MODID + ":ruthenium_pickaxe");
		RutheniumSword = new RutheniumSword(rutheniumMaterial).setUnlocalizedName("RutheniumSword").setCreativeTab(CreativeTabsManager.tabSE_Item).setTextureName(StringLibrary.MODID + ":ruthenium_sword");
		RutheniumShovel = new RutheniumShovel(rutheniumMaterial).setUnlocalizedName("RutheniumShovel").setCreativeTab(CreativeTabsManager.tabSE_Item).setTextureName(StringLibrary.MODID + ":ruthenium_shovel");
		RutheniumAxe = new RutheniumAxe(rutheniumMaterial).setUnlocalizedName("RutheniumAxe").setCreativeTab(CreativeTabsManager.tabSE_Item).setTextureName(StringLibrary.MODID + ":ruthenium_axe");
		
		cobaltHelmet = new CobaltArmor(cobaltArmorMat, MainRegistry.proxy.addArmor("CobaltHelmet"), 0).setUnlocalizedName("CobaltHelmet").setCreativeTab(CreativeTabsManager.tabSE_Item).setTextureName(StringLibrary.MODID + ":cobalt_helmet");
		cobaltChestplate = new CobaltArmor(cobaltArmorMat, MainRegistry.proxy.addArmor("CobaltChestplate"), 1).setUnlocalizedName("CobaltChestplate").setCreativeTab(CreativeTabsManager.tabSE_Item).setTextureName(StringLibrary.MODID + ":cobalt_chestplate");
		cobaltLeggings = new CobaltArmor(cobaltArmorMat, MainRegistry.proxy.addArmor("CobaltLeggings"), 2).setUnlocalizedName("CobaltLeggings").setCreativeTab(CreativeTabsManager.tabSE_Item).setTextureName(StringLibrary.MODID + ":cobalt_leggings");
		cobaltBoots = new CobaltArmor(cobaltArmorMat, MainRegistry.proxy.addArmor("CobaltBoots"), 3).setUnlocalizedName("CobaltBoots").setCreativeTab(CreativeTabsManager.tabSE_Item).setTextureName(StringLibrary.MODID + ":cobalt_boots");
		
		iridiumHelmet = new IridiumArmor(iridiumArmorMat, MainRegistry.proxy.addArmor("IridiumHelmet"), 0).setUnlocalizedName("IridiumHelmet").setCreativeTab(CreativeTabsManager.tabSE_Item).setTextureName(StringLibrary.MODID + ":iridium_helmet");
		iridiumChestplate = new IridiumArmor(iridiumArmorMat, MainRegistry.proxy.addArmor("IridiumChestplate"), 1).setUnlocalizedName("IridiumChestplate").setCreativeTab(CreativeTabsManager.tabSE_Item).setTextureName(StringLibrary.MODID + ":iridium_chestplate");
		iridiumLeggings = new IridiumArmor(iridiumArmorMat, MainRegistry.proxy.addArmor("IridiumLeggings"), 2).setUnlocalizedName("IridiumLeggings").setCreativeTab(CreativeTabsManager.tabSE_Item).setTextureName(StringLibrary.MODID + ":iridium_leggings");
		iridiumBoots = new IridiumArmor(iridiumArmorMat, MainRegistry.proxy.addArmor("IridiumBoots"), 3).setUnlocalizedName("IridiumBoots").setCreativeTab(CreativeTabsManager.tabSE_Item).setTextureName(StringLibrary.MODID + ":iridium_boots");
		
		rutheniumHelmet = new RutheniumArmor(rutheniumArmorMat, MainRegistry.proxy.addArmor("RutheniumHelmet"), 0).setUnlocalizedName("RutheniumHelmet").setCreativeTab(CreativeTabsManager.tabSE_Item).setTextureName(StringLibrary.MODID + ":ruthenium_helmet");
		rutheniumChestplate = new RutheniumArmor(rutheniumArmorMat, MainRegistry.proxy.addArmor("RutheniumChestplate"), 1).setUnlocalizedName("RutheniumChestplate").setCreativeTab(CreativeTabsManager.tabSE_Item).setTextureName(StringLibrary.MODID + ":ruthenium_chestplate");
		rutheniumLeggings = new RutheniumArmor(rutheniumArmorMat, MainRegistry.proxy.addArmor("RutheniumChestplate"), 2).setUnlocalizedName("RutheniumLeggings").setCreativeTab(CreativeTabsManager.tabSE_Item).setTextureName(StringLibrary.MODID + ":ruthenium_leggings");
		rutheniumBoots = new RutheniumArmor(rutheniumArmorMat, MainRegistry.proxy.addArmor("RutheniumChestplate"), 3).setUnlocalizedName("RutheniumBoots").setCreativeTab(CreativeTabsManager.tabSE_Item).setTextureName(StringLibrary.MODID + ":ruthenium_boots");
		
	}
	
	public static void registerItem() {
		GameRegistry.registerItem(cobaltItem, cobaltItem.getUnlocalizedName());
		GameRegistry.registerItem(iridiumItem, iridiumItem.getUnlocalizedName());
		GameRegistry.registerItem(rutheniumItem, rutheniumItem.getUnlocalizedName());
		
		GameRegistry.registerItem(cobaltIngot, cobaltIngot.getUnlocalizedName());
		GameRegistry.registerItem(iridiumIngot, iridiumIngot.getUnlocalizedName());
		GameRegistry.registerItem(rutheniumIngot, rutheniumIngot.getUnlocalizedName());
		
		GameRegistry.registerItem(CobaltPickaxe, CobaltPickaxe.getUnlocalizedName());
		GameRegistry.registerItem(CobaltSword, CobaltSword.getUnlocalizedName());
		GameRegistry.registerItem(CobaltShovel, CobaltShovel.getUnlocalizedName());
		GameRegistry.registerItem(CobaltAxe, CobaltAxe.getUnlocalizedName());
		
		GameRegistry.registerItem(IridiumPickaxe, IridiumPickaxe.getUnlocalizedName());
		GameRegistry.registerItem(IridiumSword, IridiumSword.getUnlocalizedName());
		GameRegistry.registerItem(IridiumShovel, IridiumShovel.getUnlocalizedName());
		GameRegistry.registerItem(IridiumAxe, IridiumAxe.getUnlocalizedName());
		
		GameRegistry.registerItem(RutheniumPickaxe, RutheniumPickaxe.getUnlocalizedName());
		GameRegistry.registerItem(RutheniumSword, RutheniumSword.getUnlocalizedName());
		GameRegistry.registerItem(RutheniumShovel, RutheniumShovel.getUnlocalizedName());
		GameRegistry.registerItem(RutheniumAxe, RutheniumAxe.getUnlocalizedName());
		
		GameRegistry.registerItem(cobaltHelmet, cobaltHelmet.getUnlocalizedName());
		GameRegistry.registerItem(cobaltChestplate, cobaltChestplate.getUnlocalizedName());
		GameRegistry.registerItem(cobaltLeggings, cobaltLeggings.getUnlocalizedName());
		GameRegistry.registerItem(cobaltBoots, cobaltBoots.getUnlocalizedName());
		
		GameRegistry.registerItem(iridiumHelmet, iridiumHelmet.getUnlocalizedName());
		GameRegistry.registerItem(iridiumChestplate, iridiumChestplate.getUnlocalizedName());
		GameRegistry.registerItem(iridiumLeggings, iridiumLeggings.getUnlocalizedName());
		GameRegistry.registerItem(iridiumBoots, iridiumBoots.getUnlocalizedName());
		
		GameRegistry.registerItem(rutheniumHelmet, rutheniumHelmet.getUnlocalizedName());
		GameRegistry.registerItem(rutheniumChestplate, rutheniumChestplate.getUnlocalizedName());
		GameRegistry.registerItem(rutheniumLeggings, rutheniumLeggings.getUnlocalizedName());
		GameRegistry.registerItem(rutheniumBoots, rutheniumBoots.getUnlocalizedName());
	}
	
}
