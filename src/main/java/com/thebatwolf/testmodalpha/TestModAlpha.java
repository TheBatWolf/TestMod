package com.thebatwolf.testmodalpha;

import com.thebatwolf.testmodalpha.handler.ConfigurationHandler;
import com.thebatwolf.testmodalpha.init.ModItems;
import com.thebatwolf.testmodalpha.proxy.IProxy;
import com.thebatwolf.testmodalpha.reference.Reference;
import com.thebatwolf.testmodalpha.utility.LogHelper;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid= Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.MOD_VERSION, guiFactory = Reference.GUI_FACTORY_CLASS)
public class TestModAlpha {

    @Mod.Instance(Reference.MOD_ID)
    public static TestModAlpha instance;

    @SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS )
    public static IProxy proxy;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {

        ConfigurationHandler.init(event.getSuggestedConfigurationFile());
        FMLCommonHandler.instance().bus().register(new ConfigurationHandler());
        LogHelper.info("PreInit Complete");

        ModItems.init();

    }

    @Mod.EventHandler
    public void Init(FMLInitializationEvent event) {

        LogHelper.info("Init Complete");

    }

    @Mod.EventHandler
   public void postInit(FMLPostInitializationEvent event) {

        LogHelper.info("PostInit Complete");

    }
}