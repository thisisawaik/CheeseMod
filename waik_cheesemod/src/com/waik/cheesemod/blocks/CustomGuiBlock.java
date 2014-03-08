package com.waik.cheesemod.blocks;

import java.util.Random;

import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.IIcon;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;

import com.waik.cheesemod.CheeseMod;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class CustomGuiBlock extends BlockContainer
{
	private final boolean isActive;
	
	@SideOnly(Side.CLIENT)
	private IIcon iconFront;
	
	public CustomGuiBlock(boolean isActive)
	{
		super(Material.rock);
		
		this.isActive = isActive;
		
		if (isActive == true)
		{
			this.setBlockName("CoustomGuiBlockActive");
			this.setLightLevel(0.9f);
		}
		
		else
		{
			this.setBlockName("CoustomGuiBlockIdle");
		}
		
		this.setHardness(3.5f);
	}
	
	public void registerIcons(IIconRegister reg)
	{
		this.blockIcon = reg.registerIcon("cheesemod:cheese_lamp");
		this.iconFront = reg.registerIcon("cheesemod:"
				+ (this.isActive ? "cheese_block" : "custom_gui"));
	}
	
	public IIcon getIcons(int side, int metadata)
	{
		return side == metadata ? this.iconFront : this.blockIcon;
	}
	
	public int idDropped(int par1, Random random, int par3)
	{
		return getIdFromBlock(CheeseMod.customGuiIdle);
	}
	
	public void onBlockAdded(World world, int x, int y, int z)
	{
		super.onBlockAdded(world, x, y, z);
		this.setDefaultDirection(world, x, y, z);
	}
	
	private void setDefaultDirection(World world, int x, int y, int z)
	{
		if (!world.isRemote)
		{
			int a = getIdFromBlock(world.getBlock(x, y, z - 1));
			int b = getIdFromBlock(world.getBlock(x, y, z + 1));
			int c = getIdFromBlock(world.getBlock(x - 1, y, z));
			int d = getIdFromBlock(world.getBlock(x + 1, y, z));
			byte b0 = 3;
			
			if (getBlockById(a).isBlockNormalCube() && !getBlockById(b).isBlockNormalCube())
			{
				b0 = 3;
			}
			
			else if (getBlockById(b).isBlockNormalCube() && !getBlockById(a).isBlockNormalCube())
			{
				b0 = 2;
			}
			
			else if (getBlockById(d).isBlockNormalCube() && !getBlockById(c).isBlockNormalCube())
			{
				b0 = 5;
			}
			
			else if (getBlockById(c).isBlockNormalCube() && !getBlockById(d).isBlockNormalCube())
			{
				b0 = 4;
			}
			
			world.setBlockMetadataWithNotify(x, y, z, b0, z);
		}
	}
	
	@Override
	public TileEntity createNewTileEntity(World var1, int var2)
	{
		return new TileEntityCustomGui();
	}
	
	@Override
	public void onBlockPlacedBy(World world, int x, int y, int z,
			EntityLivingBase entityLivingBase, ItemStack itemStack)
	{
		int a = MathHelper
				.floor_double((double) (entityLivingBase.rotationYaw * 4.0f / 360.0f) + 0.5D) & 3;
		
		if (a == 0)
		{
			world.setBlockMetadataWithNotify(x, y, z, 2, 2);
		}
		
		else if (a == 1)
		{
			world.setBlockMetadataWithNotify(x, y, z, 5, 2);
		}
		
		else if (a == 2)
		{
			world.setBlockMetadataWithNotify(x, y, z, 3, 2);
		}
		
		else if (a == 3)
		{
			world.setBlockMetadataWithNotify(x, y, z, 4, 2);
		}
		
		else if (itemStack.hasDisplayName())
		{
			((TileEntityCustomGui) world.getTileEntity(x, y, z)).setGuiDisplayName(itemStack
					.getDisplayName());
		}
	}
}
