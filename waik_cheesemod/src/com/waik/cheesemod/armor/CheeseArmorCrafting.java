package com.waik.cheesemod.armor;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

import com.waik.cheesemod.CheeseMod;

import cpw.mods.fml.common.registry.GameRegistry;

public class CheeseArmorCrafting
{
	private String[][] recipePatterns = new String[][]
	{
	{ "XXX", "X X" },
	{ "X X", "XXX", "XXX" },
	{ "XXX", "X X", "X X" },
	{ "X X", "X X" } };
	private Object[][] recipeItems;
	
	public CheeseArmorCrafting()
	{
		this.recipeItems = new Object[][]
		{
		{ CheeseMod.cheese_block },
		{ CheeseMod.cheese_helmet },
		{ CheeseMod.cheese_chestplate },
		{ CheeseMod.cheese_leggings },
		{ CheeseMod.cheese_boots } };
	}
	
	/**
	 * Adds the armor recipes to the CraftingManager.
	 */
	public void addRecipes()
	{
		for (int i = 0; i < this.recipeItems[0].length; ++i)
		{
			Object object = this.recipeItems[0][i];
			
			for (int j = 0; j < this.recipeItems.length - 1; ++j)
			{
				Item item = (Item) this.recipeItems[j + 1][i];
				GameRegistry.addRecipe(new ItemStack(item), new Object[]
				{ this.recipePatterns[j], 'X', object });
			}
		}
	}
}
