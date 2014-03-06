package com.waik.cheesemod;

import net.minecraft.item.ItemFood;

public class CheeseSandwich extends ItemFood {
	public CheeseSandwich(int i, int j, boolean b) {
		super(j, b);
		this.setUnlocalizedName("cheeseSandwich");
		this.setTextureName("cheesemod:cheese_sandwich");
	}
}