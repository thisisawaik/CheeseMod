package com.waik.cheesemod.tools;

import net.minecraft.item.ItemSpade;

import com.waik.cheesemod.CheeseMod;

public class CheeseSpade extends ItemSpade
{
	public CheeseSpade(ToolMaterial cheese)
	{
		super(cheese);
		this.setUnlocalizedName("cheeseSpade");
		this.setTextureName("cheesemod:cheese_spade");
		this.setCreativeTab(CheeseMod.tabCheese);
	}
}
