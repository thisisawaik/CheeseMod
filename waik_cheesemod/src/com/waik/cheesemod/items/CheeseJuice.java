package com.waik.cheesemod.items;

import java.util.List;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumAction;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;

import com.waik.cheesemod.CheeseMod;

public class CheeseJuice extends ItemFood
{
	public CheeseJuice()
	{
		super(0, 0.0F, false);
		this.setAlwaysEdible();
		this.setUnlocalizedName("cheeseJuice");
		this.setTextureName("cheesemod:cheese_juice");
		this.setPotionEffect(1, 20, 2, 1F);
		this.setCreativeTab(CheeseMod.tabCheese);
	}
	
	@Override
	public EnumAction getItemUseAction(ItemStack par1ItemStack)
	{
		return EnumAction.drink;
	}
	
	public void addInformation(ItemStack item, EntityPlayer player, List list, boolean par4)
	{
		list.add("The Cheese Effect!");
	}
}
