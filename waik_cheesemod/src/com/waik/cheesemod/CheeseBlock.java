package com.waik.cheesemod;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;

public class CheeseBlock extends Block {

	protected CheeseBlock() {
		super(Material.cake);
	}

	@Override
	public void registerBlockIcons(IIconRegister reg) {
		this.blockIcon = reg.registerIcon("cheesemod:cheese_block");
	}

	/*
	 * @SubscribeEvent public void onBlockClicked(PlayerInteractEvent event) {
	 * System.out.println("cheese clicked"); EntityPlayer player =
	 * event.entityPlayer; player.addChatMessage(new ChatComponentText(
	 * "Attention! Someone somewhere clicked a cheese!!!")); }
	 */
}