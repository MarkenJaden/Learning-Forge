package net.landofrails.learningforge.block;

import net.landofrails.learningforge.LearningForge;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class Test extends Block {

    public Test(Material material, String unlocalizedName, String registryName) {
        this(material, SoundType.ANVIL, unlocalizedName, registryName);
    }

    public Test(Material material, SoundType sound, String unlocalizedName, String registryName) {
        super(material);
        setTranslationKey(LearningForge.MODID + "." + unlocalizedName);
        setRegistryName(registryName);
        setCreativeTab(LearningForge.LEARN_TAB);
        setSoundType(sound);
    }

}
