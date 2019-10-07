package net.landofrails.learningforge.proxy;

import net.landofrails.learningforge.init.ModItems;
import net.landofrails.learningforge.tabs.CreativeTabLearning;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

import java.rmi.registry.Registry;

@Mod.EventBusSubscriber
public class CommonProxy {

    public static final CreativeTabLearning tab_learningforge = new CreativeTabLearning();

    @SubscribeEvent
    public static void registerItems(RegistryEvent.Register<Item> event) {

        event.getRegistry().registerAll(ModItems.ITEMS.toArray(new Item[0]));

    }

    public void preInit(FMLPreInitializationEvent event){

    }

    public void Init(FMLInitializationEvent event) {

    }

    public void postInit(FMLPostInitializationEvent event){

    }

}
