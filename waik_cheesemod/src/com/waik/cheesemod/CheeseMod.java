package com.waik.cheesemod;

import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.util.EnumHelper;

import com.waik.cheesemod.armor.CheeseArmorCrafting;
import com.waik.cheesemod.armor.CheeseBoots;
import com.waik.cheesemod.armor.CheeseChestplate;
import com.waik.cheesemod.armor.CheeseHelmet;
import com.waik.cheesemod.armor.CheeseLeggings;
import com.waik.cheesemod.blocks.CheeseBlock;
import com.waik.cheesemod.blocks.CheeseLamp;
import com.waik.cheesemod.blocks.CustomGuiBlock;
import com.waik.cheesemod.items.CheeseJuice;
import com.waik.cheesemod.items.CheesePowder;
import com.waik.cheesemod.items.CheeseSandwich;
import com.waik.cheesemod.items.CheeseSlice;
import com.waik.cheesemod.items.SmokedCheeseSlice;
import com.waik.cheesemod.items.Toast;
import com.waik.cheesemod.tools.CheeseAxe;
import com.waik.cheesemod.tools.CheeseHoe;
import com.waik.cheesemod.tools.CheesePickaxe;
import com.waik.cheesemod.tools.CheeseSpade;
import com.waik.cheesemod.tools.CheeseSword;
import com.waik.cheesemod.tools.CheeseToolsCrafting;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;

@Mod(modid = CheeseMod.MODID, version = CheeseMod.VERSION)
public class CheeseMod
{
	// Mod properties
	public static final String MODID = "cheesemod";
	public static final String VERSION = "0.1.0";
	
	// Creative pabs
	public static CreativeTabs tabCheese = new CreativeTabs("CheeseModTab")
	{
		public Item getTabIconItem()
		{
			return cheese_slice;
		}
	};
	
	@Instance(MODID)
	public static CheeseMod instance;
	public static final int guiIdCustomGuiBlock = 0;
	
	// Blocks
	public final static Block cheese_lamp = new CheeseLamp();
	
	public final static Block cheese_block = new CheeseBlock();
	public final static Block customGuiIdle = new CustomGuiBlock(false);
	public final static Block customGuiActive = new CustomGuiBlock(true);
	
	// Items
	public static Item cheese_powder = new CheesePowder();
	public static Item cheese_juice = new CheeseJuice();
	
	// Food
	public static Item cheese_slice = new CheeseSlice();
	public static Item smoked_cheese_slice = new SmokedCheeseSlice();
	public static Item cheese_sandwich = new CheeseSandwich();
	public static Item toast = new Toast();
	
	// Tool materials
	public static ToolMaterial cheese = EnumHelper.addToolMaterial("Cheese", 3, 32, 2.0f, 0.0f, 40);
	
	// Armor materials
	public static ArmorMaterial cheeseArmor = EnumHelper.addArmorMaterial("Cheese2", 3, new int[]
	{ 2, 3, 2, 1 }, 12);
	
	// Tools
	public final static Item cheese_pickaxe = new CheesePickaxe(cheese);
	public final static Item cheese_sword = new CheeseSword(cheese);
	public final static Item cheese_hoe = new CheeseHoe(cheese);
	public final static Item cheese_axe = new CheeseAxe(cheese);
	public final static Item cheese_spade = new CheeseSpade(cheese);
	
	// Armor
	public final static Item cheese_helmet = new CheeseHelmet(cheeseArmor);
	
	public final static Item cheese_chestplate = new CheeseChestplate(cheeseArmor);
	
	public final static Item cheese_leggings = new CheeseLeggings(cheeseArmor);
	
	public final static Item cheese_boots = new CheeseBoots(cheeseArmor);
	
	// Pre-initialization
	@EventHandler
	public void preInit(FMLPreInitializationEvent event)
	{
		// Registering blocks
		GameRegistry.registerBlock(cheese_block, "cheese_block");
		GameRegistry.registerBlock(cheese_lamp, "cheese_lamp");
		GameRegistry.registerBlock(customGuiIdle, "customGuiIdle");
		GameRegistry.registerBlock(customGuiActive, "customGuiActive");
		
		// Registering tools
		GameRegistry.registerItem(cheese_pickaxe, "cheese_pickaxe");
		GameRegistry.registerItem(cheese_sword, "cheese_sword");
		GameRegistry.registerItem(cheese_hoe, "cheese_hoe");
		GameRegistry.registerItem(cheese_axe, "cheese_axe");
		GameRegistry.registerItem(cheese_spade, "cheese_spade");
		
		// Registering armor
		GameRegistry.registerItem(cheese_helmet, "cheese_helmet");
		GameRegistry.registerItem(cheese_chestplate, "cheese_chestplate");
		GameRegistry.registerItem(cheese_leggings, "cheese_leggings");
		GameRegistry.registerItem(cheese_boots, "cheese_boots");
		
		// Registering food
		GameRegistry.registerItem(cheese_slice, "cheese_slice");
		GameRegistry.registerItem(smoked_cheese_slice, "smoked_cheese_slice");
		GameRegistry.registerItem(cheese_sandwich, "cheese_sandwich");
		GameRegistry.registerItem(toast, "toast");
		GameRegistry.registerItem(cheese_powder, "cheese_powder");
		
		// Registering potion
		GameRegistry.registerItem(cheese_juice, "cheese_juice");
	}
	
	// Initialization
	@EventHandler
	public void init(FMLInitializationEvent event)
	{
		// Shapeless recipes
		GameRegistry.addShapelessRecipe(new ItemStack(cheese_block, 3), Items.milk_bucket,
				Items.milk_bucket, Items.milk_bucket);
		GameRegistry.addShapelessRecipe(new ItemStack(cheese_powder, 9), cheese_block);
		
		// Shaped recipes
		GameRegistry.addRecipe(new ItemStack(cheese_slice, 6), "AAA", 'A', cheese_block);
		
		GameRegistry.addRecipe(new ItemStack(cheese_sandwich, 2), "A", "B", "A", 'A', Items.bread,
				'B', cheese_slice);
		
		GameRegistry.addRecipe(new ItemStack(cheese_sandwich, 2), "A", "B", "A", 'A', Items.bread,
				'B', smoked_cheese_slice);
		
		GameRegistry.addRecipe(new ItemStack(cheese_lamp, 1), "A", "B", 'A', cheese_block, 'B',
				Blocks.torch);
		
		GameRegistry.addRecipe(new ItemStack(cheese_juice, 1), "A", "A", "B", 'A', cheese_powder,
				'B', Items.potionitem);
		
		(new CheeseArmorCrafting()).addRecipes();
		
		(new CheeseToolsCrafting()).addRecipes();
		
		// Smelting recipes
		GameRegistry.addSmelting(new ItemStack(cheese_slice), new ItemStack(smoked_cheese_slice),
				0.25f);
		GameRegistry.addSmelting(new ItemStack(cheese_sandwich), new ItemStack(toast), 0.35f);
		
		MinecraftForge.EVENT_BUS.register(new CheeseBlock());
	}
}
