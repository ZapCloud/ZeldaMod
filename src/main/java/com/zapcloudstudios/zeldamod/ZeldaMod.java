package com.zapcloudstudios.zeldamod;

import net.minecraft.init.Blocks;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.*;

@Mod(modid = ZeldaMod.MODID, version = ZeldaMod.VERSION, name = "ZeldaMod")
public class ZeldaMod
{
	@Mod.Instance("ZeldaMod")
	public static ZeldaMod instance;
	@SidedProxy(clientSide = "com.zapcloudstudios.zeldamod.ClientProxy", serverSide = "com.zapcloudstudios.zeldamod.CommonProxy")
	public static CommonProxy proxy;

	public static final String MODID = "zeldamod";
	public static final String VERSION = "1.0";

	@Mod.EventHandler
	public void preInit(FMLPreInitializationEvent event)
	{
		instance = this;
	}

	@EventHandler
	public void init(FMLInitializationEvent event)
	{
		proxy.registerRenderInformation();

		proxy.setupGuiIngameForge();
	}
}
