package com.fyrealchemage.magyck;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod (modid = Magyck.MODID, version = Magyck.VERSION, name = Magyck.NAME)
public class Magyck
{
	// Move these to a different class
	public static final String MODID   = "Magyck";
	public static final String VERSION = "1.7.10-1.0";
	public static final String NAME    = "Magyck: Ancient Sorcery";
	
	public void preInit(FMLPreInitializationEvent event)
	{
		// register added blocks and items
		// also register (tile)entities
		// and the ore dictionary
	}
	
	public void init(FMLInitializationEvent event)
	{
		// recipes
		// world generators
		// event handlers
		// and messages
	}
	
	public void postInit(FMLPostInitializationEvent event)
	{
		// mod compatibility and anything else needing other mods' init
		// phase completed
	}
}
