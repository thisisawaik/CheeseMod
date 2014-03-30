package com.waik.cheesemod.items;

import net.minecraft.item.ItemBucketMilk;

import com.waik.cheesemod.CheeseMod;

public class GoatMilk extends ItemBucketMilk
{
	public GoatMilk()
	{
		
		this.setMaxStackSize(1);
		this.setCreativeTab(CheeseMod.tabCheese);
		this.setUnlocalizedName("goatMilk");
		this.setTextureName("cheesemod:goat_milk");
		
	}
	
}
