package com.waik.cheesemod;

import net.minecraft.item.ItemFood;

public class CheeseSlice extends ItemFood {
	public CheeseSlice(int j, boolean b) {
		super(j, b);
		this.setUnlocalizedName("cheeseSlice");
		this.setTextureName("cheesemod:cheese_slice");
	}
}