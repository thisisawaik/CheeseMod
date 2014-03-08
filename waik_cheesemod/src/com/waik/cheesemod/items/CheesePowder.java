package com.waik.cheesemod.items;

import net.minecraft.item.Item;

import com.waik.cheesemod.CheeseMod;

public class CheesePowder extends Item
{
	public CheesePowder()
	{
		this.setUnlocalizedName("cheesePowder");
		this.setTextureName("cheesemod:cheese_powder");
		this.setCreativeTab(CheeseMod.tabCheese);
	}
}
