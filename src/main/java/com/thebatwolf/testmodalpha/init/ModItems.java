package com.thebatwolf.testmodalpha.init;

import com.thebatwolf.testmodalpha.item.itemAcaciaLeaf;
import com.thebatwolf.testmodalpha.item.itemChargedNetherStar;
import com.thebatwolf.testmodalpha.item.itemTMA;
import com.thebatwolf.testmodalpha.item.testItem;
import com.thebatwolf.testmodalpha.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModItems {

    public static final itemTMA acaciaLeaf = new itemAcaciaLeaf();
    public static final itemTMA testItem = new com.thebatwolf.testmodalpha.item.testItem();
    public static final itemTMA chargedNetherStar = new itemChargedNetherStar();

    public static void init(){
        GameRegistry.registerItem(acaciaLeaf, "acaciaLeaf");
        GameRegistry.registerItem(testItem, "testItem");
        GameRegistry.registerItem(chargedNetherStar, "chargedNetherStar");
    }
}
