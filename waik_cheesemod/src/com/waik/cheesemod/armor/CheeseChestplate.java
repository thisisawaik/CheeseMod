package com.waik.cheesemod.armor;

import net.minecraft.item.ItemArmor;

public class CheeseChestplate extends ItemArmor
{
	public CheeseChestplate(ArmorMaterial cheeseArmor)
	{
		super(cheeseArmor, 1, 0);
		this.setUnlocalizedName("cheeseHelmet");
		this.setTextureName("cheesemod:cheese_helmet");
	}
}
