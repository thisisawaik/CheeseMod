package com.waik.cheesemod.tools;

import net.minecraft.item.ItemSpade;

public class CheeseShovel extends ItemSpade {

	public CheeseShovel(ToolMaterial cheese) {
		super(cheese);
		this.setUnlocalizedName("cheeseSpade");
		this.setTextureName("cheesemod:cheese_spade");
	}
}