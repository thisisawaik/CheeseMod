package com.waik.cheesemod.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.ChatComponentText;
import net.minecraft.world.World;

import com.waik.cheesemod.CheeseMod;

public class CheeseBlock extends Block
{
	public CheeseBlock()
	{
		super(Material.cake);
		this.setBlockName("cheeseBlock");
		this.setCreativeTab(CheeseMod.tabCheese);
	}
	
	@Override
	public void registerBlockIcons(IIconRegister reg)
	{
		this.blockIcon = reg.registerIcon("cheesemod:cheese_block");
	}
	
	@Override
	public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer player,
			int par6, float par7, float par8, float par9)
	{
		
		player.addChatMessage(new ChatComponentText(
				"Attention! Someone somewhere right clicked a cheese!!!"));
		
		return true;
	}
}
