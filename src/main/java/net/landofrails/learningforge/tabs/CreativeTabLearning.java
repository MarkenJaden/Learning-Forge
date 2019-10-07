package net.landofrails.learningforge.tabs;

import net.landofrails.learningforge.LearningForge;
import net.landofrails.learningforge.init.ModItems;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class CreativeTabLearning extends CreativeTabs {

    public CreativeTabLearning() {
        super(LearningForge.MODID);
    }

    @Override
    public ItemStack getTabIconItem() {
        return new ItemStack(ModItems.item_test);
    }

}