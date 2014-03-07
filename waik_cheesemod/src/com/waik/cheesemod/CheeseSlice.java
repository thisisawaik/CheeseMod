package com.waik.cheesemod;

import net.minecraft.item.ItemFood;

public class CheeseSlice extends ItemFood {
	static int foodPoints = 2;

	public CheeseSlice() {
		super(foodPoints, true);
		this.setUnlocalizedName("cheeseSlice");
		this.setTextureName("cheesemod:cheese_slice");
	}
}