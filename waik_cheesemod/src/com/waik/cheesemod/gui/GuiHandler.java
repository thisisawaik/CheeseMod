/*
package com.waik.cheesemod.gui;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

import com.waik.cheesemod.CheeseMod;
import com.waik.cheesemod.blocks.TileEntityCustomGui;

import cpw.mods.fml.common.network.IGuiHandler;

public class GuiHandler implements IGuiHandler
{
	@Override
	public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z)
	{
		TileEntity entity = world.getTileEntity(x, y, z);
		
		if (entity != null)
		{
			switch (ID)
			{
			case CheeseMod.guiIdCustomGuiBlock:
				if (entity instanceof TileEntityCustomGui)
				{
					return new ContainerCustomGuiBlock(player.inventory,
							(TileEntityCustomGui) entity);
				}
			}
		}
		
		return null;
	}
	
	@Override
	public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z)
	{
		TileEntity entity = world.getTileEntity(x, y, z);
		
		if (entity != null)
		{
			switch (ID)
			{
			case CheeseMod.guiIdCustomGuiBlock:
				if (entity instanceof TileEntityCustomGui)
				{
					return new GuiCustomGuiBlock(player.inventory, (TileEntityCustomGui) entity);
				}
			}
		}
		
		return null;
	}
}
 */
