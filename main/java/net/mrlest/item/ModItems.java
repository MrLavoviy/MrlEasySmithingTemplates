package net.mrlest.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.mrlest.Mrlest;

public class ModItems {
    public static final Item SMITHING_TEMPLATES_BOX = registerItem("smithing_templates_box", new SmithingTemplatesBox(new FabricItemSettings()));
    public static final Item SMITHING_TEMPLATE_REPLACER = registerItem("smithing_template_replacer", new Item(new FabricItemSettings()));

    public static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(Mrlest.id, name), item);
    }
    public static void registerModItems() {
        Mrlest.LOGGER.info("Registering ModItems for " + Mrlest.id);
    }
}
