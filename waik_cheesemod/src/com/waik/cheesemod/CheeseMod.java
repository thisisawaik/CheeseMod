package com.waik.cheesemod;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.common.MinecraftForge;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

@Mod(modid = CheeseMod.MODID, version = CheeseMod.VERSION)
public class CheeseMod {
	public static final String MODID = "testmod";
	public static final String VERSION = "1.0";

	public final static Block cheeseBlock = new CheeseBlock(Material.cake)
			.setBlockName("cheeseBlock").setCreativeTab(CreativeTabs.tabFood);

	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		GameRegistry.registerBlock(cheeseBlock, "cheeseBlock");
	}
}
