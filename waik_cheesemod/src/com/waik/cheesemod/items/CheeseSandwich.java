package com.waik.cheesemod.items;

import net.minecraft.item.ItemFood;

public class CheeseSandwich extends ItemFood {
	static int foodPoints = 6;

	public CheeseSandwich() {
		super(foodPoints, false);
		this.setUnlocalizedName("cheeseSandwich");
		this.setTextureName("cheesemod:cheese_sandwich");
	}
}