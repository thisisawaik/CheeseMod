package com.waik.cheesemod.blocks;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.inventory.ISidedInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;

public class TileEntityCustomGui extends TileEntity implements ISidedInventory
{
	private String localizedName;
	
	private ItemStack[] slots = new ItemStack[3];
	
	public int getSizeInventory()
	{
		return this.slots.length;
	}
	
	public boolean isInvNameLocalized()
	{
		return this.localizedName != null && this.localizedName.length() > 0;
	}
	
	public String getInvName()
	{
		return this.isInvNameLocalized() ? this.localizedName : "container.customGuiBlock";
	}
	
	public void setGuiDisplayName(String displayName)
	{
		this.localizedName = displayName;
	}
	
	public ItemStack getStackInSlot(int var1)
	{
		return null;
	}
	
	public ItemStack decrStackSize(int var1, int var2)
	{
		return null;
	}
	
	public ItemStack getStackInSlotOnClosing(int var1)
	{
		return null;
	}
	
	public void setInventorySlotContents(int var1, ItemStack var2)
	{
	}
	
	public String getInventoryName()
	{
		return null;
	}
	
	public boolean hasCustomInventoryName()
	{
		return false;
	}
	
	public int getInventoryStackLimit()
	{
		return 0;
	}
	
	public boolean isUseableByPlayer(EntityPlayer var1)
	{
		return false;
	}
	
	public void openInventory()
	{
	}
	
	public void closeInventory()
	{
	}
	
	public boolean isItemValidForSlot(int var1, ItemStack var2)
	{
		return false;
	}
	
	public int[] getAccessibleSlotsFromSide(int var1)
	{
		return null;
	}
	
	public boolean canInsertItem(int var1, ItemStack itemStack, int var3)
	{
		return this.isItemValidForSlot(var1, itemStack);
	}
	
	public boolean canExtractItem(int var1, ItemStack itemStack, int var3)
	{
		return var3 != 0 || var1 != 1 || itemStack.getItem() == Items.bucket;
	}
}
