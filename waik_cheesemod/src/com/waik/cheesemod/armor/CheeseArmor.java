package com.waik.cheesemod.armor;

import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;

import com.waik.cheesemod.CheeseMod;

import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class CheeseArmor extends ItemArmor
{
	private IIcon[] icons;
	
	public CheeseArmor(int type)
	{
		super(CheeseMod.cheeseArmor, CheeseMod.armorRender, type);
		this.setCreativeTab(CheeseMod.tabCheese);
		GameRegistry.registerItem(this, "cheese_" + CheeseMod.armorType.get(type));
		
	}
	
	@Override
	public String getArmorTexture(ItemStack itemStack, Entity entity, int slot, String type)
	{
		if (this.armorType == 2)
		{
			return "cheesemod:textures/models/armor/cheese_layer_2.png";
		}
		else
		{
			return "cheesemod:textures/models/armor/cheese_layer_1.png";
		}
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public String getUnlocalizedName(ItemStack itemStack)
	{
		return "cheese_" + CheeseMod.armorType.get(this.armorType);
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public void registerIcons(IIconRegister iconRegister)
	{
		this.itemIcon = iconRegister.registerIcon("cheesemod:cheese_"
				+ CheeseMod.armorType.get(this.armorType));
	}
	
}
