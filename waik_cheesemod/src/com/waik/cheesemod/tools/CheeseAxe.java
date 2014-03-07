package com.waik.cheesemod.tools;

import net.minecraft.item.ItemAxe;

public class CheeseAxe extends ItemAxe
{
	
	public CheeseAxe(ToolMaterial cheese)
	{
		super(cheese);
		this.setUnlocalizedName("cheeseAxe");
		this.setTextureName("cheesemod:cheese_axe");
	}
}
