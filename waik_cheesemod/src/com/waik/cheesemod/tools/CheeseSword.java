package com.waik.cheesemod.tools;

import net.minecraft.item.ItemSword;

import com.waik.cheesemod.CheeseMod;

public class CheeseSword extends ItemSword
{
	public CheeseSword(ToolMaterial cheese)
	{
		super(cheese);
		this.setUnlocalizedName("cheeseSword");
		this.setTextureName("cheesemod:cheese_sword");
		this.setCreativeTab(CheeseMod.tabCheese);
	}
}
