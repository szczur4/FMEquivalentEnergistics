package com.mordenkainen.equivalentenergistics.integration;
import com.mordenkainen.equivalentenergistics.blocks.crafter.tiles.TileEMCCrafterBase;
import java.util.*;
import net.minecraft.item.ItemStack;
public interface IEMCHandler{
    boolean hasEMC(ItemStack itemStack);
    double getEnergyValue(ItemStack itemStack);
    double getCrystalEMC(int tier);
    List<ItemStack> getTransmutations(TileEMCCrafterBase tile);
    boolean isValidTome(ItemStack itemStack);
    void setCrystalEMC();
    UUID getTomeUUID(ItemStack currentTome);
    String getTomeOwner(ItemStack currentTome);
    double getSingleEnergyValue(ItemStack stack);
    boolean isEMCStorage(ItemStack stack);
    double getStoredEMC(ItemStack stack);
    double extractEMC(ItemStack stack,double toStore);
}
