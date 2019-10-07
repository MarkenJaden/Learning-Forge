package net.landofrails.learningforge.items;

import net.landofrails.learningforge.init.ModItems;
import net.landofrails.learningforge.proxy.CommonProxy;
import net.minecraft.item.Item;

public class TestItem extends Item {

    public TestItem() {

        setRegistryName("item_test");
        setUnlocalizedName("item_test");
        setCreativeTab(CommonProxy.tab_learningforge);

        ModItems.ITEMS.add(this);

    }

}
