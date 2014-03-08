package com.waik.cheesemod.armor;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

import com.waik.cheesemod.CheeseMod;

import cpw.mods.fml.common.registry.GameRegistry;

public class CheeseArmorCrafting
{
	private String[][] recipePatterns = new String[][]
	{
	{ "AAA", "A A" },
	{ "A A", "AAA", "AAA" },
	{ "AAA", "A A", "A A" },
	{ "A A", "A A" } };
	
	private Object[] recipeItems;
	
	public CheeseArmorCrafting()
	{
		this.recipeItems = new Object[]
		{ CheeseMod.cheese_helmet, CheeseMod.cheese_chestplate, CheeseMod.cheese_leggings,
				CheeseMod.cheese_boots };
	}
	
	public void addRecipes()
	{
		
		for (int i = 0; i < this.recipeItems.length - 1; ++i)
		{
			Item item = (Item) this.recipeItems[i];
			GameRegistry.addRecipe(new ItemStack(item), new Object[]
			{ this.recipePatterns[i], 'A', CheeseMod.cheese_block });
		}
	}
}
