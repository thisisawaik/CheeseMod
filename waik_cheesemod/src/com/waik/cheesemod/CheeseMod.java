package com.waik.cheesemod;

import net.minecraft.block.Block;
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
	// Mod Properties
	public static final String MODID = "cheesemod";
	public static final String VERSION = "0.0.1";

	// Creative Tabs
	public static CreativeTabs tabCheese = new CreativeTabs("CheeseModTab") {
		public Item getTabIconItem() {
			return cheeseSlice;
		}
	};

	// Blocks
	public final static Block cheeseLamp = new CheeseLamp().setBlockName(
			"cheeseLamp").setCreativeTab(tabCheese);

	public final static Block cheeseBlock = new CheeseBlock().setBlockName(
			"cheeseBlock").setCreativeTab(tabCheese);

	// Items
	public static Item cheesePowder = new CheesePowder()
			.setCreativeTab(tabCheese);

	// Food
	public static Item cheeseSlice = new CheeseSlice()
			.setCreativeTab(tabCheese);

	public static Item cheeseSandwich = new CheeseSandwich()
			.setCreativeTab(tabCheese);

	public static Item toast = new Toast().setCreativeTab(tabCheese);

	// Pre-initialization
	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {

		// Registering items and blocks
		GameRegistry.registerBlock(cheeseBlock, "cheeseBlock");
		GameRegistry.registerItem(cheeseSlice, "cheeseSlice");
		GameRegistry.registerBlock(cheeseLamp, "cheeseLamp");
		GameRegistry.registerItem(cheeseSandwich, "cheeseSandwich");
		GameRegistry.registerItem(toast, "toast");
		GameRegistry.registerItem(cheesePowder, "cheesePowder");

		// Shapeless recipes
		GameRegistry.addShapelessRecipe(new ItemStack(cheeseBlock, 3),
				Items.milk_bucket, Items.milk_bucket, Items.milk_bucket);
		GameRegistry.addShapelessRecipe(new ItemStack(cheesePowder, 9),
				cheeseBlock);

		// Shaped recipes
		GameRegistry.addRecipe(new ItemStack(cheeseSlice, 6), "AAA", 'A',
				cheeseBlock);

		GameRegistry.addRecipe(new ItemStack(cheeseSandwich, 3), "A", "B", "A",
				'A', Items.bread, 'B', cheeseSlice);

		GameRegistry.addRecipe(new ItemStack(cheeseLamp, 1), "A", "B", 'A',
				cheeseBlock, 'B', Blocks.torch);

		// Smeltings
		GameRegistry.addSmelting(new ItemStack(cheeseSandwich), new ItemStack(
				toast), 0.35f);

	}

	// Initialization
	@EventHandler
	public void init(FMLInitializationEvent event) {
		MinecraftForge.EVENT_BUS.register(new CheeseBlock());
	}
}
