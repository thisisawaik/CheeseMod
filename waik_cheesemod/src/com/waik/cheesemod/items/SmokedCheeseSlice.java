package com.waik.cheesemod.items;

public class SmokedCheeseSlice extends CheeseSlice
{
	static int foodPoints = 3;
	static float saturation = 2.2f;
	
	public SmokedCheeseSlice()
	{
		super(foodPoints, saturation);
		this.setUnlocalizedName("smokedCheeseSlice");
		this.setTextureName("cheesemod:smoked_cheese_slice");
	}
}
