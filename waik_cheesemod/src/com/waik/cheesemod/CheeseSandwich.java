package com.waik.cheesemod;

import net.minecraft.item.ItemFood;

public class CheeseSandwich extends ItemFood {
	static int foodPoints = 5;

	public CheeseSandwich() {
		super(foodPoints, true);
		this.setUnlocalizedName("cheeseSandwich");
		this.setTextureName("cheesemod:cheese_sandwich");
	}
}