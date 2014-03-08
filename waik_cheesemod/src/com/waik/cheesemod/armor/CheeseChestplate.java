package com.waik.cheesemod.armor;

import net.minecraft.item.ItemArmor;

import com.waik.cheesemod.CheeseMod;

public class CheeseChestplate extends ItemArmor
{
	public CheeseChestplate(ArmorMaterial cheeseArmor)
	{
		super(cheeseArmor, 0, 1);
		this.setUnlocalizedName("cheeseChestplate");
		this.setTextureName("cheesemod:cheese_chestplate");
		this.setCreativeTab(CheeseMod.tabCheese);
	}
}
