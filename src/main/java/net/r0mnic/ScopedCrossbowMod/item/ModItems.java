package net.r0mnic.ScopedCrossbowMod.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.r0mnic.ScopedCrossbowMod.ScopedCrossbowMod;
import net.r0mnic.ScopedCrossbowMod.item.custom.ScopedCrossbowItem;

public class ModItems {

    public static final Item SCOPED_CROSSBOW = registerItem("scoped_crossbow", new ScopedCrossbowItem(new FabricItemSettings()));

    public static void registerModItems() {
        ScopedCrossbowMod.LOGGER.info("Registering mod items...");
        addItemsToItemGroup();
    }

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(ScopedCrossbowMod.MOD_ID, name), item);
    }

    public static void addItemsToItemGroup() {
        addToItemGroup(ItemGroups.COMBAT, SCOPED_CROSSBOW);
    }

    public static void addToItemGroup(ItemGroup group, Item item) {
        ItemGroupEvents.modifyEntriesEvent(group).register((entries) -> entries.add(item));
    }
}

