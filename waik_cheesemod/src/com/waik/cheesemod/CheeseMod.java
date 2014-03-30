package com.waik.cheesemod;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.item.ItemStack;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.common.BiomeDictionary.Type;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.util.EnumHelper;

import com.waik.cheesemod.armor.CheeseArmor;
import com.waik.cheesemod.armor.CheeseArmorCrafting;
import com.waik.cheesemod.blocks.CheeseBlock;
import com.waik.cheesemod.blocks.CheeseLamp;
import com.waik.cheesemod.blocks.CustomGuiBlock;
import com.waik.cheesemod.goat.EntityGoat;
//import com.waik.cheesemod.gui.GuiHandler;
import com.waik.cheesemod.items.CheeseJuice;
import com.waik.cheesemod.items.CheesePowder;
import com.waik.cheesemod.items.CheeseSandwich;
import com.waik.cheesemod.items.CheeseSlice;
import com.waik.cheesemod.items.GoatMilk;
import com.waik.cheesemod.items.SmokedCheeseSlice;
import com.waik.cheesemod.items.Toast;
import com.waik.cheesemod.lib.ProxyCommon;
import com.waik.cheesemod.lib.References;
import com.waik.cheesemod.tools.CheeseAxe;
import com.waik.cheesemod.tools.CheeseHoe;
import com.waik.cheesemod.tools.CheesePickaxe;
import com.waik.cheesemod.tools.CheeseSpade;
import com.waik.cheesemod.tools.CheeseSword;
import com.waik.cheesemod.tools.CheeseToolsCrafting;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.EntityRegistry;
import cpw.mods.fml.common.registry.GameRegistry;

@Mod(modid = References.MODID, version = References.VERSION)
public class CheeseMod
{
	@SidedProxy(clientSide = References.Client, serverSide = References.Common)
	public static ProxyCommon proxy;
	
	// Creative tabs
	public static CreativeTabs tabCheese = new CreativeTabs("CheeseModTab")
	{
		public Item getTabIconItem()
		{
			return cheese_slice;
		}
	};
	
	@Instance(value = References.MODID)
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
	public static Item goat_milk = new GoatMilk();
	
	// Tool materials
	public static ToolMaterial cheese = EnumHelper.addToolMaterial("Cheese", 3, 32, 2.0f, 0.0f, 40);
	
	// Armor materials and types
	public static ArmorMaterial cheeseArmor = EnumHelper.addArmorMaterial("Cheese2", 3, new int[]
	{ 2, 3, 2, 1 }, 12);
	public static final Map<Integer, String> armorType = new HashMap<Integer, String>();
	public static int armorRender;
	
	// Tools
	public final static Item cheese_pickaxe = new CheesePickaxe(cheese);
	public final static Item cheese_sword = new CheeseSword(cheese);
	public final static Item cheese_hoe = new CheeseHoe(cheese);
	public final static Item cheese_axe = new CheeseAxe(cheese);
	public final static Item cheese_spade = new CheeseSpade(cheese);
	
	// Armor
	public static Item cheese_helmet;
	public static Item cheese_chestplate;
	public static Item cheese_leggings;
	public static Item cheese_boots;
	
	// Pre-initialization
	@EventHandler
	public void preInit(FMLPreInitializationEvent event)
	{
		// Pairing armor types
		armorType.put(0, "helmet");
		armorType.put(1, "chestplate");
		armorType.put(2, "leggings");
		armorType.put(3, "boots");
		
		// Creating Armor
		cheese_helmet = new CheeseArmor(0);
		cheese_chestplate = new CheeseArmor(1);
		cheese_leggings = new CheeseArmor(2);
		cheese_boots = new CheeseArmor(3);
		
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
		
		// Registering food
		GameRegistry.registerItem(cheese_slice, "cheese_slice");
		GameRegistry.registerItem(smoked_cheese_slice, "smoked_cheese_slice");
		GameRegistry.registerItem(cheese_sandwich, "cheese_sandwich");
		GameRegistry.registerItem(toast, "toast");
		GameRegistry.registerItem(cheese_powder, "cheese_powder");
		GameRegistry.registerItem(goat_milk, "goat_milk");
		
		// Registering potion
		GameRegistry.registerItem(cheese_juice, "cheese_juice");
		
		// Registering entities
		EntityRegistry.registerGlobalEntityID(EntityGoat.class, "goat",
				EntityRegistry.findGlobalUniqueEntityId());
		
		proxy.registerRenderInformation();
		
	}
	
	// Initialization
	@EventHandler
	public void init(FMLInitializationEvent event)
	{
		
		// NetworkRegistry.INSTANCE.registerGuiHandler(this, new GuiHandler());
		
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
	
	// Post Initialization
	@EventHandler
	public void PostInit(FMLPostInitializationEvent event)
	{
		
		// Adding custom entity spawns
		BiomeDictionary.registerAllBiomesAndGenerateEvents();
		BiomeGenBase[] goatBiomes = getBiomes(Type.FOREST, Type.JUNGLE, Type.BEACH, Type.PLAINS,
				Type.HILLS);
		EntityRegistry.addSpawn(EntityGoat.class, 6, 3, 4, EnumCreatureType.creature, goatBiomes);
		
	}
	
	// Gathering biome types
	public BiomeGenBase[] getBiomes(Type... types)
	{
		LinkedList<BiomeGenBase> list = new LinkedList<BiomeGenBase>();
		for (Type t : types)
		{
			BiomeGenBase[] biomes = BiomeDictionary.getBiomesForType(t);
			for (BiomeGenBase x : biomes)
			{
				if (BiomeDictionary.isBiomeOfType(x, Type.FROZEN) || x.temperature < 0.32F)
				{
					continue;
				}
				if (BiomeDictionary.isBiomeOfType(x, Type.WATER))
				{
					continue;
				}
				if (!list.contains(x))
				{
					list.add(x);
				}
			}
		}
		return (BiomeGenBase[]) list.toArray(new BiomeGenBase[0]);
	}
	
}
