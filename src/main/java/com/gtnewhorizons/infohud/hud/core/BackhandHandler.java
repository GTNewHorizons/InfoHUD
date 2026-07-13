package com.gtnewhorizons.infohud.hud.core;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;

import com.gtnewhorizons.infohud.compat.Mods;

import xonin.backhand.api.core.BackhandUtils;

public class BackhandHandler {

    public static ItemStack getBackHandItemStack(EntityPlayer player) {
        if (!Mods.BACKHAND.isLoaded()) return null;

        return BackhandUtils.getOffhandItem(player);
    }
}
