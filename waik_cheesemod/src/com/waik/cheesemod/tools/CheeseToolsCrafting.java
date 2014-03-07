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
	{ "AAA", " B ", " B " },
	{ "A", "B", "B" },
	{ "AA", "AB", " B" },
	{ "AA", " B", " B" } };
	private Object[] recipeItems;
	
	public CheeseToolsCrafting()
	{
		this.recipeItems = new Object[]
		{ CheeseMod.cheese_pickaxe, CheeseMod.cheese_spade, CheeseMod.cheese_axe,
				CheeseMod.cheese_hoe };
	}
	
	public void addRecipes()
	{
		
		for (int j = 0; j < this.recipeItems.length - 1; ++j)
		{
			Item item = (Item) this.recipeItems[j];
			GameRegistry.addRecipe(new ItemStack(item), new Object[]
			{ this.recipePatterns[j], 'B', Items.stick, 'A', CheeseMod.cheese_block });
		}
		
	}
}
