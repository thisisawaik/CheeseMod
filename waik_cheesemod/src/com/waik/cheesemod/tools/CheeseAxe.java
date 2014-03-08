package com.waik.cheesemod.tools;

import net.minecraft.item.ItemAxe;

import com.waik.cheesemod.CheeseMod;

public class CheeseAxe extends ItemAxe
{
	public CheeseAxe(ToolMaterial cheese)
	{
		super(cheese);
		this.setUnlocalizedName("cheeseAxe");
		this.setTextureName("cheesemod:cheese_axe");
		this.setCreativeTab(CheeseMod.tabCheese);
	}
}
