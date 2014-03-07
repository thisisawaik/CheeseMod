package com.waik.cheesemod.armor;

import net.minecraft.item.ItemArmor;

public class CheeseLeggings extends ItemArmor
{
	public CheeseLeggings(ArmorMaterial cheeseArmor)
	{
		super(cheeseArmor, 0, 2);
		this.setUnlocalizedName("cheeseLeggings");
		this.setTextureName("cheesemod:cheese_leggings");
	}
}
