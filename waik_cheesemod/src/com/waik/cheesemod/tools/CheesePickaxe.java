package com.waik.cheesemod.tools;

import net.minecraft.item.ItemPickaxe;

import com.waik.cheesemod.CheeseMod;

public class CheesePickaxe extends ItemPickaxe
{
	public CheesePickaxe(ToolMaterial cheese)
	{
		super(cheese);
		this.setUnlocalizedName("cheesePickaxe");
		this.setTextureName("cheesemod:cheese_pickaxe");
		this.setCreativeTab(CheeseMod.tabCheese);
	}
}
