package com.waik.cheesemod;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.ChatComponentText;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;

public class CheeseBlock extends Block {

	protected CheeseBlock() {
		super(Material.cake);
	}

	@Override
	public void registerBlockIcons(IIconRegister reg) {
		this.blockIcon = reg.registerIcon("cheesemod:cheese_block");
	}

	@SubscribeEvent
<<<<<<< HEAD
	public void onBlockClicked(PlayerInteractEvent event) {
		System.out.println("cheese clicked");
		EntityPlayer player = event.entityPlayer;
		player.addChatMessage(new ChatComponentText(
				"Attention! Someone somewhere clicked a cheese!!!"));
=======
	//public void onBlockClicked(PlayerInteractEvent event) {
		//System.out.println("cheese clicked");
		//EntityPlayer player = event.entityPlayer;
		//player.addChatMessage(new ChatComponentText("Attention! Someone somewhere clicked a cheese!!!"));
	//}

	@Override
	public void registerBlockIcons(IIconRegister reg) {
		this.blockIcon = reg.registerIcon("cheesemod:cheese_block");
>>>>>>> e5870ef021209531c1bb762c35448428593eaeb6
	}

}