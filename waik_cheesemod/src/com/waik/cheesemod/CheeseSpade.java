package com.waik.cheesemod;

import net.minecraft.item.ItemSpade;

public class CheeseSpade extends ItemSpade {

	public CheeseSpade(ToolMaterial cheese) {
		super(cheese);
		this.setUnlocalizedName("cheeseSpade");
		this.setTextureName("cheesemod:cheese_spade");
	}
}