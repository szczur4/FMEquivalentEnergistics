package com.mordenkainen.equivalentenergistics;
import com.mordenkainen.equivalentenergistics.core.*;
import com.mordenkainen.equivalentenergistics.core.config.ConfigManager;
import com.mordenkainen.equivalentenergistics.core.proxy.CommonProxy;
import cpw.mods.fml.common.*;
import cpw.mods.fml.common.Mod.*;
import cpw.mods.fml.common.event.*;
import net.minecraft.creativetab.CreativeTabs;
import org.apache.logging.log4j.Logger;
@Mod(modid=Reference.MOD_ID, name=Reference.MOD_NAME, version=Reference.MOD_VERSION, dependencies=Reference.MOD_DEPENDENCIES)public class EquivalentEnergistics{
    @Instance(Reference.MOD_ID)public static EquivalentEnergistics instance;
    @SidedProxy(clientSide=Reference.PROXY_LOC+"ClientProxy", serverSide=Reference.PROXY_LOC+"CommonProxy")public static CommonProxy proxy;
    public static final CreativeTabs tabEE=new CreativeTabEE(CreativeTabs.getNextID(),Reference.MOD_ID);
    public static Logger logger;
    @EventHandler public void preInit(final FMLPreInitializationEvent event){
        logger=event.getModLog();
        ConfigManager.init(event.getSuggestedConfigurationFile());
        proxy.preInit();
    }
    @EventHandler public void init(final FMLInitializationEvent event){proxy.init();}
    @EventHandler public void postInit(final FMLPostInitializationEvent event){proxy.postInit();}
}
