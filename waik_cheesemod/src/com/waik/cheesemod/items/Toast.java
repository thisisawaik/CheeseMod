package com.waik.cheesemod.items;

import net.minecraft.item.ItemFood;

public class Toast extends ItemFood
{
	static int foodPoints = 7;
	static float saturation = 6.2f;
	
	public Toast()
	{
		super(foodPoints, false);
		this.setUnlocalizedName("toast");
		this.setTextureName("cheesemod:toast");
	}
}
