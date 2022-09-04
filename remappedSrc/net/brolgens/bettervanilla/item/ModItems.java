package net.brolgens.bettervanilla.item;

import net.brolgens.bettervanilla.BetterVanilla;
import net.brolgens.bettervanilla.custom.*;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.*;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {

    //COPPER ITEMS

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

    //RUBY ITEMS

    public static final Item RUBY = registerItem("ruby",
            new Item(new FabricItemSettings().group(ItemGroup.MATERIALS)));
    public static final Item RUBY_SWORD = registerItem("ruby_sword",
            new SwordItem(BetterToolMaterial.RUBY, 4, -2.4f,
                    new FabricItemSettings().group(ItemGroup.COMBAT)));
    public static final Item RUBY_SHOVEL = registerItem("ruby_shovel",
            new ShovelItem(BetterToolMaterial.RUBY, 3.0f, -3.0f,
                    new FabricItemSettings().group(ItemGroup.TOOLS)));
    public static final Item RUBY_HOE = registerItem("ruby_hoe",
            new CustomHoeItem(BetterToolMaterial.RUBY, -2, 0.0f,
                    new FabricItemSettings().group(ItemGroup.TOOLS)));
    public static final Item RUBY_AXE = registerItem("ruby_axe",
            new CustomAxeItem(BetterToolMaterial.RUBY, 6.5f, -3.0f,
                    new FabricItemSettings().group(ItemGroup.TOOLS)));
    public static final Item RUBY_PICKAXE = registerItem("ruby_pickaxe",
            new CustomPickaxeItem(BetterToolMaterial.RUBY, 2, -2.8f,
                    new FabricItemSettings().group(ItemGroup.TOOLS)));
    public static final Item RUBY_HELMET = registerItem("ruby_helmet",
            new ArmorItem(BetterArmorMaterial.RUBY, EquipmentSlot.HEAD,
                    new FabricItemSettings().group(ItemGroup.COMBAT)));
    public static final Item RUBY_CHESTPLATE = registerItem("ruby_chestplate",
            new ArmorItem(BetterArmorMaterial.RUBY, EquipmentSlot.CHEST,
                    new FabricItemSettings().group(ItemGroup.COMBAT)));
    public static final Item RUBY_LEGGINGS = registerItem("ruby_leggings",
            new ArmorItem(BetterArmorMaterial.RUBY, EquipmentSlot.LEGS,
                    new FabricItemSettings().group(ItemGroup.COMBAT)));
    public static final Item RUBY_BOOTS = registerItem("ruby_boots",
            new ArmorItem(BetterArmorMaterial.RUBY, EquipmentSlot.FEET,
                    new FabricItemSettings().group(ItemGroup.COMBAT)));


    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(BetterVanilla.MOD_ID, name), item);
    }

    public static void registerModItems() {
        BetterVanilla.LOGGER.debug("Registering Modded Items for " + BetterVanilla.MOD_ID);
    }
}