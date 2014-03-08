package com.waik.cheesemod.tools;

import net.minecraft.item.ItemHoe;

import com.waik.cheesemod.CheeseMod;

public class CheeseHoe extends ItemHoe
{
	public CheeseHoe(ToolMaterial cheese)
	{
		super(cheese);
		this.setUnlocalizedName("cheeseHoe");
		this.setTextureName("cheesemod:cheese_hoe");
		this.setCreativeTab(CheeseMod.tabCheese);
	}
}
