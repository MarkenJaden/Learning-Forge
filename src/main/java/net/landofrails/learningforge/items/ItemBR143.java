package net.landofrails.learningforge.items;

import net.landofrails.learningforge.init.ModItems;
import net.landofrails.learningforge.proxy.CommonProxy;
import net.minecraft.item.Item;

public class ItemBR143 extends Item {

    public ItemBR143() {

        setRegistryName("item_br143");
        setUnlocalizedName("item_br143");
        setCreativeTab(CommonProxy.tab_learningforge);

        ModItems.ITEMS.add(this);
    }
}
