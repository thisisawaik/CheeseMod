package com.waik.cheesemod.items;

import net.minecraft.item.ItemFood;

import com.waik.cheesemod.CheeseMod;

public class CheeseSandwich extends ItemFood
{
	static int foodPoints = 6;
	static float saturation = 6.0f;
	
	public CheeseSandwich()
	{
		super(foodPoints, saturation, false);
		this.setUnlocalizedName("cheeseSandwich");
		this.setTextureName("cheesemod:cheese_sandwich");
		this.setCreativeTab(CheeseMod.tabCheese);
	}
}
