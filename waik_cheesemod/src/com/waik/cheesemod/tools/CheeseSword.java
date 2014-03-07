package com.waik.cheesemod.tools;

import net.minecraft.item.ItemSword;

public class CheeseSword extends ItemSword {

	public CheeseSword(ToolMaterial cheese) {
		super(cheese);
		this.setUnlocalizedName("cheeseSword");
		this.setTextureName("cheesemod:cheese_sword");

	}
}