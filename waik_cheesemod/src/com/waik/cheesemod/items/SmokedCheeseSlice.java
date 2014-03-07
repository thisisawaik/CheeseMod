package com.waik.cheesemod.items;

public class SmokedCheeseSlice extends CheeseSlice
{
	static int foodPoints = 3;
	
	public SmokedCheeseSlice()
	{
		super(foodPoints);
		this.setUnlocalizedName("smokedCheeseSlice");
		this.setTextureName("cheesemod:smoked_cheese_slice");
	}
}
