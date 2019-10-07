package net.landofrails.learningforge;

import net.landofrails.learningforge.proxy.CommonProxy;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.Logger;

@Mod(modid = LearningForge.MODID, name = LearningForge.NAME, version = LearningForge.VERSION)
public class LearningForge
{
    public static final String MODID = "learningforge";
    public static final String NAME = "Learning Forge";
    public static final String VERSION = "0.0.1";
    public static final String MC_VERSION = "[1.12.2]";

    private static Logger logger;

    @SidedProxy(clientSide = "net.landofrails.learningforge.proxy.ClientProxy", serverSide = "net.landofrails.learningforge.proxy.CommonProxy")
    public static CommonProxy proxy;

    @Mod.Instance
    public static LearningForge Instance;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        proxy.preInit(event);
    }

    @EventHandler
    public void init(FMLInitializationEvent event)
    {
        proxy.Init(event);
    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {
        proxy.postInit(event);
    }
}
