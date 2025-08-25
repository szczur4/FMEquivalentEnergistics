package com.mordenkainen.equivalentenergistics.core;
import com.mordenkainen.equivalentenergistics.items.ItemEnum;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.*;
public class CreativeTabEE extends CreativeTabs{
    public CreativeTabEE(final int tabID,final String label){
        super(tabID,label);
    }
    @Override
    public Item getTabIconItem(){
        return null;
    }
    @Override
    public ItemStack getIconItemStack(){
        return ItemEnum.EMCCRYSTAL.getDamagedStack(4);
    }
}
