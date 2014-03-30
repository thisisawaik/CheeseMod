package com.waik.cheesemod.goat;

import net.minecraft.entity.EntityAgeable;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIFollowParent;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAIMate;
import net.minecraft.entity.ai.EntityAIPanic;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAITempt;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.passive.EntityAnimal;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

import com.waik.cheesemod.CheeseMod;

public class EntityGoat extends EntityAnimal
{
	public EntityGoat(World world)
	{
		super(world);
		
		this.setSize(0.9F, 1.3F);
		this.getNavigator().setAvoidsWater(true);
		this.tasks.addTask(0, new EntityAISwimming(this));
		this.tasks.addTask(1, new EntityAIPanic(this, 2.0D));
		this.tasks.addTask(2, new EntityAIMate(this, 1.0D));
		this.tasks.addTask(3, new EntityAITempt(this, 1.25D, Items.wheat, false));
		this.tasks.addTask(4, new EntityAIFollowParent(this, 1.25D));
		this.tasks.addTask(5, new EntityAIWander(this, 1.0D));
		this.tasks.addTask(6, new EntityAIWatchClosest(this, EntityPlayer.class, 6.0F));
		this.tasks.addTask(7, new EntityAILookIdle(this));
	}
	
	@Override
	public boolean isAIEnabled()
	{
		return true;
	}
	
	@Override
	protected void applyEntityAttributes()
	{
		super.applyEntityAttributes();
		getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(9.0);
		getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(0.20);
		
	}
	
	@Override
	protected String getLivingSound()
	{
		return "mob.cow.say";
	}
	
	@Override
	protected String getHurtSound()
	{
		return "mob.cow.hurt";
	}
	
	@Override
	protected String getDeathSound()
	{
		return "mob.cow.hurt";
	}
	
	@Override
	protected float getSoundVolume()
	{
		return 0.4F;
	}
	
	@Override
	protected Item getDropItem()
	{
		return Items.leather;
	}
	
	@Override
	protected void dropFewItems(boolean par1, int par2)
	{
		int j = this.rand.nextInt(2) + this.rand.nextInt(1 + par2);
		int k;
		
		for (k = 0; k < j; ++k)
		{
			this.dropItem(Items.leather, 1);
		}
		
		j = this.rand.nextInt(2) + 1 + this.rand.nextInt(1 + par2);
		
		for (k = 0; k < j; ++k)
		{
			if (this.isBurning())
			{
				this.dropItem(Items.cooked_beef, 1);
			}
			else
			{
				this.dropItem(Items.beef, 1);
			}
		}
	}
	
	@Override
	public boolean interact(EntityPlayer par1EntityPlayer)
	{
		ItemStack itemstack = par1EntityPlayer.inventory.getCurrentItem();
		
		if (itemstack != null && itemstack.getItem() == Items.bucket
				&& !par1EntityPlayer.capabilities.isCreativeMode)
		{
			if (itemstack.stackSize-- == 1)
			{
				par1EntityPlayer.inventory.setInventorySlotContents(
						par1EntityPlayer.inventory.currentItem, new ItemStack(CheeseMod.goat_milk));
			}
			else if (!par1EntityPlayer.inventory.addItemStackToInventory(new ItemStack(
					CheeseMod.goat_milk)))
			{
				par1EntityPlayer.dropPlayerItemWithRandomChoice(new ItemStack(CheeseMod.goat_milk,
						1, 0), false);
			}
			
			return true;
		}
		else
		{
			return super.interact(par1EntityPlayer);
		}
	}
	
	@Override
	public EntityGoat createChild(EntityAgeable par1EntityAgeable)
	{
		return new EntityGoat(this.worldObj);
	}
}
