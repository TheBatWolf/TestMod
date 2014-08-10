package com.thebatwolf.testmodalpha.init;

import com.thebatwolf.testmodalpha.item.ItemChargedNetherStar;
import com.thebatwolf.testmodalpha.item.ItemTMA;
import cpw.mods.fml.common.registry.GameRegistry;

/**
 * Created by Gwen on 8/10/2014.
 */
public class ModItems {

    public static final ItemTMA chargedNetherStar = new ItemChargedNetherStar();

    public static void init(){
        GameRegistry.registerItem(chargedNetherStar, "chargedNetherStar");
    }
}
