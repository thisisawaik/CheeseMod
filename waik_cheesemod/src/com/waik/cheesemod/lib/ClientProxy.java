package com.waik.cheesemod.lib;

import com.waik.cheesemod.goat.EntityGoat;
import com.waik.cheesemod.goat.ModelGoat;
import com.waik.cheesemod.goat.RenderGoat;

import cpw.mods.fml.client.registry.RenderingRegistry;

public class ClientProxy extends CommonProxy
{
	public void registerRenderInformation()
	{
		RenderingRegistry.registerEntityRenderingHandler(EntityGoat.class, new RenderGoat(
				new ModelGoat(), 0.5F));
	}
}
