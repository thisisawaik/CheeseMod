package com.waik.cheesemod;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemFood;

public class CheeseSandwich extends ItemFood {
	public CheeseSandwich(int i, int j, boolean b) {
		super(j, b);
		this.setUnlocalizedName("Cheese Sandwich");
		this.setTextureName("cheesemod:cheeseSandwich");
	}
}