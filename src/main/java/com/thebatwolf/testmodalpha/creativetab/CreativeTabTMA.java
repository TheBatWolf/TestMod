package com.thebatwolf.testmodalpha.creativetab;


import com.thebatwolf.testmodalpha.init.ModItems;
import com.thebatwolf.testmodalpha.reference.Reference;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class CreativeTabTMA
{
    public static final CreativeTabs TMA_TAB = new CreativeTabs(Reference.MOD_ID.toLowerCase())
    {
        @Override
        public Item getTabIconItem()
        {
            return ModItems.chargedNetherStar;
        }
    };
}
