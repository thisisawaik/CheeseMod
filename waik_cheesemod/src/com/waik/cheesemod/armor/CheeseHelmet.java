package com.waik.cheesemod.armor;

import net.minecraft.item.ItemArmor;

public class CheeseHelmet extends ItemArmor
{
	public CheeseHelmet(ArmorMaterial cheeseArmor)
	{
		super(cheeseArmor, 0, 0);
		this.setUnlocalizedName("cheeseLeggings");
		this.setTextureName("cheesemod:cheese_leggings");
	}
}
