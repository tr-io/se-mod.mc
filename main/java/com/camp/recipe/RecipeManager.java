package com.camp.recipe;

import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

import com.camp.item.ItemManager;

import cpw.mods.fml.common.registry.GameRegistry;

public class RecipeManager {
	
	public static void mainRegistry() {
		addCraftingRecipes();
		addSmeltingRecipes();
	}
	
	public static void addCraftingRecipes() {
		GameRegistry.addShapedRecipe(new ItemStack(ItemManager.CobaltPickaxe), "xxx", " y ", " y ", 'x', ItemManager.cobaltIngot, 'y', Items.stick);
		GameRegistry.addShapedRecipe(new ItemStack(ItemManager.CobaltAxe), "xx ", "xy ", " y ", 'x', ItemManager.cobaltIngot, 'y', Items.stick);
		GameRegistry.addShapedRecipe(new ItemStack(ItemManager.CobaltSword), " x ", " x ", " y ", 'x', ItemManager.cobaltIngot, 'y', Items.stick);
		GameRegistry.addShapedRecipe(new ItemStack(ItemManager.CobaltShovel), " x ", " y ", " y ", 'x', ItemManager.cobaltIngot, 'y', Items.stick);
		
		GameRegistry.addShapedRecipe(new ItemStack(ItemManager.cobaltHelmet), "xxx", "x x", 'x', ItemManager.cobaltIngot);
		GameRegistry.addShapedRecipe(new ItemStack(ItemManager.cobaltChestplate), "x x", "xxx", "xxx", 'x', ItemManager.cobaltIngot);
		GameRegistry.addShapedRecipe(new ItemStack(ItemManager.cobaltLeggings), "xxx", "x x", "x x", 'x', ItemManager.cobaltIngot);
		GameRegistry.addShapedRecipe(new ItemStack(ItemManager.cobaltBoots), "x x", "x x", 'x', ItemManager.cobaltIngot);
		
		GameRegistry.addShapedRecipe(new ItemStack(ItemManager.IridiumPickaxe), "xxx", " y ", " y ", 'x', ItemManager.iridiumIngot, 'y', Items.stick);
		GameRegistry.addShapedRecipe(new ItemStack(ItemManager.IridiumAxe), "xx ", "xy ", " y ", 'x', ItemManager.iridiumIngot, 'y', Items.stick);
		GameRegistry.addShapedRecipe(new ItemStack(ItemManager.IridiumSword), " x ", " x ", " y ", 'x', ItemManager.iridiumIngot, 'y', Items.stick);
		GameRegistry.addShapedRecipe(new ItemStack(ItemManager.IridiumShovel), " x ", " y ", " y ", 'x', ItemManager.iridiumIngot, 'y', Items.stick);
		
		GameRegistry.addShapedRecipe(new ItemStack(ItemManager.iridiumHelmet), "xxx", "x x", 'x', ItemManager.iridiumIngot);
		GameRegistry.addShapedRecipe(new ItemStack(ItemManager.iridiumChestplate), "x x", "xxx", "xxx", 'x', ItemManager.iridiumIngot);
		GameRegistry.addShapedRecipe(new ItemStack(ItemManager.iridiumLeggings), "xxx", "x x", "x x", 'x', ItemManager.iridiumIngot);
		GameRegistry.addShapedRecipe(new ItemStack(ItemManager.iridiumBoots), "x x", "x x", 'x', ItemManager.iridiumIngot);
		
		GameRegistry.addShapedRecipe(new ItemStack(ItemManager.RutheniumPickaxe), "xxx", " y ", " y ", 'x', ItemManager.rutheniumIngot, 'y', Items.stick);
		GameRegistry.addShapedRecipe(new ItemStack(ItemManager.RutheniumPickaxe), "xxx", " y ", " y ", 'x', ItemManager.rutheniumIngot, 'y', Items.stick);
		GameRegistry.addShapedRecipe(new ItemStack(ItemManager.RutheniumAxe), "xx ", "xy ", " y ", 'x', ItemManager.rutheniumIngot, 'y', Items.stick);
		GameRegistry.addShapedRecipe(new ItemStack(ItemManager.RutheniumSword), " x ", " x ", " y ", 'x', ItemManager.rutheniumIngot, 'y', Items.stick);
		GameRegistry.addShapedRecipe(new ItemStack(ItemManager.RutheniumShovel), " x ", " y ", " y ", 'x', ItemManager.rutheniumIngot, 'y', Items.stick);
		
		GameRegistry.addShapedRecipe(new ItemStack(ItemManager.rutheniumHelmet), "xxx", "x x", 'x', ItemManager.rutheniumIngot);
		GameRegistry.addShapedRecipe(new ItemStack(ItemManager.rutheniumChestplate), "x x", "xxx", "xxx", 'x', ItemManager.rutheniumIngot);
		GameRegistry.addShapedRecipe(new ItemStack(ItemManager.rutheniumLeggings), "xxx", "x x", "x x", 'x', ItemManager.rutheniumIngot);
		GameRegistry.addShapedRecipe(new ItemStack(ItemManager.rutheniumBoots), "x x", "x x", 'x', ItemManager.rutheniumIngot);
	}
	
	public static void addSmeltingRecipes() {
		GameRegistry.addSmelting(new ItemStack(ItemManager.cobaltItem, 1), new ItemStack(ItemManager.cobaltIngot, 1), 0.5F);
		GameRegistry.addSmelting(new ItemStack(ItemManager.iridiumItem, 1), new ItemStack(ItemManager.iridiumIngot, 1), 0.2F);
		GameRegistry.addSmelting(new ItemStack(ItemManager.rutheniumItem, 1), new ItemStack(ItemManager.rutheniumIngot, 1), 1.0F);
	}
	
}
