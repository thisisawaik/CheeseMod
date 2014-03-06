package com.waik.cheesemod;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;

@Mod(modid = CheeseMod.MODID, version = CheeseMod.VERSION)
public class CheeseMod {
	public static final String MODID = "cheesemod";
	public static final String VERSION = "0.0.1";

	public static CreativeTabs tabCheese = new CreativeTabs("CheeseModTab") {
		public Item getTabIconItem() {
			return cheeseSlice;
		}
	};

	public static Item cheeseSlice = new CheeseSlice(501, 3, true)
			.setCreativeTab(tabCheese);

	public static Item cheeseSandwich = new CheeseSandwich(500, 5, true)
			.setCreativeTab(tabCheese);

	public final static Block cheeseLamp = new CheeseLamp(Material.rock)
			.setBlockName("cheeseLamp").setCreativeTab(tabCheese);

	public final static Block cheeseBlock = new CheeseBlock().setBlockName(
			"cheeseBlock").setCreativeTab(tabCheese);

	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {

		GameRegistry.registerBlock(cheeseBlock, "cheeseBlock");
		GameRegistry.registerItem(cheeseSlice, "cheeseSlice");
		GameRegistry.registerBlock(cheeseLamp, "cheeseLamp");
		GameRegistry.registerItem(cheeseSandwich, "cheeseSandwich");

		cheeseLamp.setLightLevel(1F);

		GameRegistry.addRecipe(new ItemStack(cheeseSlice, 6), new Object[] {
				"AAA", 'A', cheeseBlock });

		GameRegistry.addShapedRecipe(new ItemStack(cheeseSandwich, 3), "A",
				"B", "A", 'A', Items.bread, 'B', cheeseSlice);

		GameRegistry.addRecipe(new ItemStack(cheeseLamp, 1), new Object[] {
				"A", "B", 'A', cheeseBlock, 'B', Blocks.torch });
	}

	@EventHandler
	public void init(FMLInitializationEvent event) {
		GameRegistry.addShapelessRecipe(new ItemStack(cheeseBlock, 3),
				Items.milk_bucket, Items.milk_bucket, Items.milk_bucket);

		MinecraftForge.EVENT_BUS.register(new CheeseBlock());
	}
}
