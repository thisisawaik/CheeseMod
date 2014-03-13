/*
package com.waik.cheesemod.gui;

import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.client.resources.I18n;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.util.ResourceLocation;

import com.waik.cheesemod.CheeseMod;
import com.waik.cheesemod.blocks.TileEntityCustomGui;

public class GuiCustomGuiBlock extends GuiContainer
{
	public static final ResourceLocation texture = new ResourceLocation(CheeseMod.MODID,
			"textures/gui/custom_gui.png");
	
	public TileEntityCustomGui customGuiBlock;
	
	public GuiCustomGuiBlock(InventoryPlayer inventoryPLayer, TileEntityCustomGui entity)
	{
		super(new ContainerCustomGuiBlock(inverntoryPlayer, entity));
		
		this.customGuiBlock = entity;
		
		this.xSize = 176;
		this.ySize = 166;
	}
	
	public void drawGuiContainerForegroudLayer(int par1, int par2)
	{
		String name = this.customGuiBlock.isInvNameLocalized() ? this.customGuiBlock.getInvName()
				: I18n.format(this.customGuiBlock.getInvName());
		
		this.fontRendererObj.drawString(name,
				this.xSize / 2 - this.fontRendererObj.getStringWidth(name) / 2, 6, 4210752);
		this.fontRendererObj.drawString(I18n.format("container.inventory"), 8, this.ySize - 96 + 2,
				4210752);
	}
	
	@Override
	protected void drawGuiContainerBackgroundLayer(float var1, int var2, int var3)
	{
	}
}
 */
