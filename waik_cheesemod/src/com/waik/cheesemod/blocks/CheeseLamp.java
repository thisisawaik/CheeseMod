package com.waik.cheesemod.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;

import com.waik.cheesemod.CheeseMod;

public class CheeseLamp extends Block
{
	public CheeseLamp()
	{
		super(Material.rock);
		this.setLightLevel(1f);
		this.setBlockName("cheeseBlock");
		this.setCreativeTab(CheeseMod.tabCheese);
	}
	
	public void registerBlockIcons(IIconRegister reg)
	{
		this.blockIcon = reg.registerIcon("cheesemod:cheese_lamp");
	}
}
