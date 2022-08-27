package net.brolgens.bettervanilla.item;

import net.brolgens.bettervanilla.BetterVanilla;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {

    public static final Item COPPER_SWORD = registerItem("copper_sword",
            new Item(new FabricItemSettings().group(ItemGroup.COMBAT)));

    public static final Item COPPER_AXE = registerItem("copper_axe",
            new Item(new FabricItemSettings().group(ItemGroup.COMBAT)));


    private static Item registerItem(String name, Item item){
        return Registry.register(Registry.ITEM, new Identifier(BetterVanilla.MOD_ID), item);
    }

    public static void registerModItems(){
        BetterVanilla.LOGGER.debug("Registering Mod Items for " + BetterVanilla.MOD_ID);
    }
}