package com.waik.cheesemod;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;

public class CheeseBlock extends Block {

	protected CheeseBlock(Material arg0) {
		super(arg0);
	}

	public void registerBlockIcons(IIconRegister reg) {
		this.blockIcon = reg.registerIcon("cheesemod:cheese_block");
	}

}