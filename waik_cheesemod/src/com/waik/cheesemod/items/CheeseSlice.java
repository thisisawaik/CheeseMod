package com.waik.cheesemod.items;

import net.minecraft.item.ItemFood;

import com.waik.cheesemod.CheeseMod;

public class CheeseSlice extends ItemFood
{
	static int foodPoints = 2;
	static float saturation = 0.4f;
	
	public CheeseSlice()
	{
		super(foodPoints, saturation, false);
		this.setUnlocalizedName("cheeseSlice");
		this.setTextureName("cheesemod:cheese_slice");
		this.setCreativeTab(CheeseMod.tabCheese);
	}
	
	public CheeseSlice(int foodPoints, float saturation)
	{
		super(foodPoints, saturation, false);
	}
}
