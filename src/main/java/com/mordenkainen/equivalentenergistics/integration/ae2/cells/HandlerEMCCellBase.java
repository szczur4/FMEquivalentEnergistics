package com.mordenkainen.equivalentenergistics.integration.ae2.cells;
import appeng.api.config.*;
import appeng.api.networking.security.BaseActionSource;
import appeng.api.storage.*;
import appeng.api.storage.data.*;
import com.mordenkainen.equivalentenergistics.util.IEMCStorage;
public abstract class HandlerEMCCellBase implements IMEInventoryHandler<IAEItemStack>, IEMCStorage{
    protected final ISaveProvider saveProvider;
    public HandlerEMCCellBase(final ISaveProvider saveProvider){
        this.saveProvider=saveProvider;
    }
    @Override
    public IAEItemStack injectItems(final IAEItemStack input,final Actionable type,final BaseActionSource src){
        return input;
    }
    @Override
    public IAEItemStack extractItems(final IAEItemStack request,final Actionable mode,final BaseActionSource src){
        return null;
    }
    @Override
    public IItemList<IAEItemStack> getAvailableItems(final IItemList<IAEItemStack> stacks){
        return stacks;
    }
    @Override
    public StorageChannel getChannel(){
        return StorageChannel.ITEMS;
    }
    @Override
    public AccessRestriction getAccess(){
        return AccessRestriction.READ_WRITE;
    }
    @Override
    public boolean isPrioritized(final IAEItemStack input){
        return false;
    }
    @Override
    public boolean canAccept(final IAEItemStack input){
        return false;
    }
    @Override
    public int getPriority(){
        return 0;
    }
    @Override
    public int getSlot(){
        return 0;
    }
    @Override
    public boolean validForPass(final int pass){
        return false;
    }
    public abstract int getCellStatus();
}
