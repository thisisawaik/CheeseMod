package com.waik.cheesemod.items;

import net.minecraft.item.ItemFood;

public class Toast extends ItemFood {
	static int foodPoints = 7;

	public Toast() {
		super(foodPoints, true);
		this.setUnlocalizedName("toast");
		this.setTextureName("cheesemod:toast");
	}
}