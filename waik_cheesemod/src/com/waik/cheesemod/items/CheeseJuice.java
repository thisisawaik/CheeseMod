package com.waik.cheesemod.items;

import net.minecraft.item.EnumAction;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;

public class CheeseJuice extends ItemFood
{
	public CheeseJuice()
	{
		super(1, 1F, false);
		this.setUnlocalizedName("cheeseJuice");
		this.setTextureName("cheesemod:cheese_juice");
		this.setPotionEffect(1, 20, 2, 1F);
	}
	
	@Override
	public EnumAction getItemUseAction(ItemStack par1ItemStack)
	{
		return EnumAction.drink;
	}
	
}
