package net.brolgens.bettervanilla.item;

import net.brolgens.bettervanilla.BetterVanilla;
import net.brolgens.bettervanilla.item.custom.*;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.*;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {

    public static final Item COPPER_SWORD = registerItem("copper_sword",
            new SwordItem(BetterToolMaterial.COPPER, 3, -2.4f,
                    new FabricItemSettings().group(ItemGroup.COMBAT)));

    public static final Item COPPER_SHOVEL = registerItem("copper_shovel",
            new ShovelItem(BetterToolMaterial.COPPER, 2.5f, -3.0f,
                    new FabricItemSettings().group(ItemGroup.TOOLS)));

    public static final Item COPPER_HOE = registerItem("copper_hoe",
            new CustomHoeItem(BetterToolMaterial.COPPER, -1, -0.5f,
                    new FabricItemSettings().group(ItemGroup.TOOLS)));

    public static final Item COPPER_AXE = registerItem("copper_axe",
            new CustomAxeItem(BetterToolMaterial.COPPER, 6.5f, -3.0f,
                    new FabricItemSettings().group(ItemGroup.TOOLS)));

    public static final Item COPPER_PICKAXE = registerItem("copper_pickaxe",
            new CustomPickaxeItem(BetterToolMaterial.COPPER, 1, -2.8f,
                    new FabricItemSettings().group(ItemGroup.TOOLS)));
    public static final Item COPPER_HELMET = registerItem("copper_helmet",
            new ArmorItem(BetterArmorMaterial.COPPER, EquipmentSlot.HEAD,
                    new FabricItemSettings().group(ItemGroup.COMBAT)));
    public static final Item COPPER_CHESTPLATE = registerItem("copper_chestplate",
            new ArmorItem(BetterArmorMaterial.COPPER, EquipmentSlot.CHEST,
                    new FabricItemSettings().group(ItemGroup.COMBAT)));
    public static final Item COPPER_LEGGINGS = registerItem("copper_leggings",
            new ArmorItem(BetterArmorMaterial.COPPER, EquipmentSlot.LEGS,
                    new FabricItemSettings().group(ItemGroup.COMBAT)));
    public static final Item COPPER_BOOTS = registerItem("copper_boots",
            new ArmorItem(BetterArmorMaterial.COPPER, EquipmentSlot.FEET,
                    new FabricItemSettings().group(ItemGroup.COMBAT)));


    //public static final Item COPPER_AXE = registerItem("copper_axe",
    //      new Item(new FabricItemSettings().group(ItemGroup.COMBAT)));


    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(BetterVanilla.MOD_ID, name), item);
    }

    public static void registerModItems() {
        BetterVanilla.LOGGER.debug("Registering Modded Items for " + BetterVanilla.MOD_ID);
    }
}