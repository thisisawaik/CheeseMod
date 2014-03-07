package com.waik.cheesemod.items;

import net.minecraft.item.ItemFood;

public class CheeseSlice extends ItemFood
{
	static int foodPoints = 2;
	static float saturation = 0.4f;
	
	public CheeseSlice()
	{
		super(foodPoints, saturation, false);
		this.setUnlocalizedName("cheeseSlice");
		this.setTextureName("cheesemod:cheese_slice");
	}
	
	public CheeseSlice(int foodPoints, float saturation)
	{
		super(foodPoints, saturation, false);
	}
}
