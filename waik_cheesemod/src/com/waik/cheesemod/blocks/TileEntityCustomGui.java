package com.waik.cheesemod.blocks;

import net.minecraft.tileentity.TileEntity;

public class TileEntityCustomGui extends TileEntity
{
	private String localizedName;
	
	public void setGuiDisplayName(String displayName)
	{
		this.localizedName = displayName;
	}
}
