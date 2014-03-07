package com.waik.cheesemod;

import net.minecraft.item.ItemPickaxe;

public class CheesePickaxe extends ItemPickaxe {

	public CheesePickaxe(ToolMaterial cheese) {
		super(cheese);
		this.setUnlocalizedName("cheesePickaxe");
		this.setTextureName("cheesemod:cheese_pickaxe");
	}
}