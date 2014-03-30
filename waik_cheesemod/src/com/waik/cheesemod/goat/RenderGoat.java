package com.waik.cheesemod.goat;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.ResourceLocation;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class RenderGoat extends RenderLiving
{
	private static final ResourceLocation goatTexture = new ResourceLocation("cheesemod",
			"textures/entity/goat/goat.png");
	
	public RenderGoat(ModelBase modelbase, float par2)
	{
		super(modelbase, par2);
		setRenderPassModel((ModelGoat) modelbase);
	}
	
	public RenderGoat()
	{
		super(new ModelGoat(), 0.8F);
		setRenderPassModel(new ModelGoat());
	}
	
	protected float getDeathMaxRotation(EntityGoat entitygoat)
	{
		return 180.0F;
	}
	
	@Override
	protected float getDeathMaxRotation(EntityLivingBase entityLivingBase)
	{
		return this.getDeathMaxRotation((EntityGoat) entityLivingBase);
	}
	
	public void renderGoat(EntityGoat entitygoat, double d, double d1, double d2, float f, float f1)
	{
		super.doRender(entitygoat, d, d1, d2, f, f1);
	}
	
	@Override
	public void doRender(EntityLivingBase entityliving, double d, double d1, double d2, float f,
			float f1)
	{
		renderGoat((EntityGoat) entityliving, d, d1, d2, f, f1);
	}
	
	@Override
	public void doRender(Entity entity, double d, double d1, double d2, float f, float f1)
	{
		renderGoat((EntityGoat) entity, d, d1, d2, f, f1);
	}
	
	@Override
	protected ResourceLocation getEntityTexture(Entity entity)
	{
		return goatTexture;
	}
}
