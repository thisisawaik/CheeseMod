package com.waik.cheesemod.blocks;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.IIcon;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

import com.waik.cheesemod.CheeseMod;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockCheese extends Block
{
	@SideOnly(Side.CLIENT)
	private IIcon[] blockIcons;
	
	public BlockCheese()
	{
		super(Material.cake);
		this.setBlockName("blockCheese");
		this.setCreativeTab(CheeseMod.tabCheese);
		
		this.setTickRandomly(true);
	}
	
	@Override
	public void setBlockBoundsBasedOnState(IBlockAccess p_149719_1_, int p_149719_2_,
			int p_149719_3_, int p_149719_4_)
	{
		this.setBlockBounds(1 / 16F, 0 / 16F, 1 / 16F, 15 / 16F, 14 / 16F, 15 / 16F);
	}
	
	@Override
	public void setBlockBoundsForItemRender()
	{
		this.setBlockBounds(1 / 16F, 0 / 16F, 1 / 16F, 15 / 16F, 14 / 16F, 15 / 16F);
	}
	
	@Override
	public boolean isOpaqueCube()
	{
		return false;
	}
	
	@Override
	public void onEntityWalking(World world, int x, int y, int z, Entity entity)
	{
		world.setBlockMetadataWithNotify(x, y, z, 1, 3);
	}
	
	public void updateTick(World world, int x, int y, int z, Random random)
	{
		if (random.nextInt(5) == 0)
		{
			world.setBlockMetadataWithNotify(x, y, z, 1, 3);
		}
	}
	
	@Override
	public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer player,
			int par6, float par7, float par8, float par9)
	{
		
		player.addChatMessage(new ChatComponentText(
				"Attention! Someone somewhere right clicked a cheese!!!"));
		
		return true;
	}
	
	@SideOnly(Side.CLIENT)
	@Override
	public IIcon getIcon(int p_149691_1_, int p_149691_2_)
	{
		if (p_149691_2_ == 0)
		{
			return this.blockIcons[0];
		}
		
		else
		{
			return this.blockIcons[1];
		}
	}
	
	@SideOnly(Side.CLIENT)
	@Override
	public void registerBlockIcons(IIconRegister reg)
	{
		this.blockIcons = new IIcon[2];
		
		this.blockIcons[0] = reg.registerIcon("cheesemod:cheese_block");
		this.blockIcons[1] = reg.registerIcon("cheesemod:cheese_block_rotten");
	}
}
