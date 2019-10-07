package net.landofrails.learningforge.block;

import net.landofrails.learningforge.LearningForge;
import net.landofrails.learningforge.proxy.CommonProxy;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class BlockTest extends Block {

    public BlockTest() {
        super(Material.ANVIL);
        setCreativeTab(CommonProxy.tab_learningforge);
        setSoundType(SoundType.ANVIL);
        setUnlocalizedName(LearningForge.MODID + ".test");
        setRegistryName("block_test");
    }
}
