package com.waik.cheesemod.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;

public class CheeseLamp extends Block
{
	
	public CheeseLamp()
	{
		super(Material.rock);
		this.setLightLevel(1f);
		this.setBlockName("cheeseBlock");
	}
	
	public void registerBlockIcons(IIconRegister reg)
	{
		this.blockIcon = reg.registerIcon("cheesemod:cheese_lamp");
	}
}
