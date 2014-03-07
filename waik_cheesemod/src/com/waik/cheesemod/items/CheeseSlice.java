package com.waik.cheesemod.items;

import net.minecraft.item.ItemFood;

public class CheeseSlice extends ItemFood {
	static int foodPoints = 2;

	public CheeseSlice() {
		super(foodPoints, false);
		this.setUnlocalizedName("cheeseSlice");
		this.setTextureName("cheesemod:cheese_slice");
	}

	public CheeseSlice(int foodPoints) {
		super(foodPoints, true);
	}
}