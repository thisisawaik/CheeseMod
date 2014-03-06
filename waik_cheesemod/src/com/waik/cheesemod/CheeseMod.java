package com.waik.cheesemod;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;

@Mod(modid = CheeseMod.MODID, version = CheeseMod.VERSION)
public class CheeseMod
{
    public static final String MODID = "cheesemod";
    public static final String VERSION = "0.0.1";
    
    @EventHandler
    public void init(FMLInitializationEvent event)
    {
        System.out.println("sajtosszendvics");
    }
}
