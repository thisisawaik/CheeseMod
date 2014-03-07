package com.waik.cheesemod.tools;

import net.minecraft.item.ItemHoe;

public class CheeseHoe extends ItemHoe {

	public CheeseHoe(ToolMaterial cheese) {
		super(cheese);
		this.setUnlocalizedName("cheeseHoe");
		this.setTextureName("cheesemod:cheese_hoe");
	}
}