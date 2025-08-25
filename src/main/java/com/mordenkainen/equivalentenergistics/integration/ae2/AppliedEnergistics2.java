package com.mordenkainen.equivalentenergistics.integration.ae2;
import appeng.api.AEApi;
import appeng.api.storage.ICellHandler;
import com.mordenkainen.equivalentenergistics.integration.ae2.cache.crafting.*;
import com.mordenkainen.equivalentenergistics.integration.ae2.cache.storage.*;
import com.mordenkainen.equivalentenergistics.items.ItemEnum;
import net.minecraftforge.common.MinecraftForge;
public final class AppliedEnergistics2{
    private AppliedEnergistics2(){}
    public static void init(){
        AppliedEnergistics2 instance=new AppliedEnergistics2();
        MinecraftForge.EVENT_BUS.register(instance);
        AEApi.instance().registries().gridCache().registerGridCache(IEMCStorageGrid.class,EMCStorageGrid.class);
        AEApi.instance().registries().gridCache().registerGridCache(IEMCCraftingGrid.class,EMCCraftingGrid.class);
        AEApi.instance().registries().cell().addCellHandler((ICellHandler)ItemEnum.EMCCELL.getItem());
        AEApi.instance().registries().cell().addCellHandler((ICellHandler)ItemEnum.EMCCELLCREATIVE.getItem());
    }
}
