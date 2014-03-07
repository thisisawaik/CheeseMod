package com.waik.cheesemod.tools;

import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

import com.waik.cheesemod.CheeseMod;

import cpw.mods.fml.common.registry.GameRegistry;

public class CheeseToolsCrafting
{
	private String[][] recipePatterns = new String[][]
	{
	{ "XXX", " # ", " # " },
	{ "X", "#", "#" },
	{ "XX", "X#", " #" },
	{ "XX", " #", " #" } };
	private Object[][] recipeItems;
	
	public CheeseToolsCrafting()
	{
		this.recipeItems = new Object[][]
		{
		{ CheeseMod.cheese_block },
		{ CheeseMod.cheese_pickaxe },
		{ CheeseMod.cheese_spade },
		{ CheeseMod.cheese_axe },
		{ CheeseMod.cheese_hoe } };
	}
	
	public void addRecipes()
	{
		for (int i = 0; i < this.recipeItems[0].length; ++i)
		{
			Object object = this.recipeItems[0][i];
			
			for (int j = 0; j < this.recipeItems.length - 1; ++j)
			{
				Item item = (Item) this.recipeItems[j + 1][i];
				GameRegistry.addRecipe(new ItemStack(item), new Object[]
				{ this.recipePatterns[j], '#', Items.stick, 'X', object });
			}
		}
	}
}
