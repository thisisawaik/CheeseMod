package com.waik.cheesemod.armor;

import net.minecraft.item.ItemArmor;

public class CheeseBoots extends ItemArmor
{
	public CheeseBoots(ArmorMaterial cheeseArmor)
	{
		super(cheeseArmor, 3, 0);
		this.setUnlocalizedName("cheeseBoots");
		this.setTextureName("cheesemod:cheese_boots");
	}
}
