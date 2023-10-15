package net.mrlest.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.mrlest.Mrlest;

public class ModItemGroups {
    public static ItemGroup MRLEST = Registry.register(Registries.ITEM_GROUP, new Identifier(Mrlest.id, "mrlest"),
            FabricItemGroup.builder().displayName(Text.translatable("mrlest.itemgroups.mrlest"))
                    .icon(() -> new ItemStack(ModItems.SMITHING_TEMPLATE_REPLACER)).entries((displayContext, entries) -> {
                        entries.add(ModItems.SMITHING_TEMPLATE_REPLACER);
                        entries.add(ModItems.SMITHING_TEMPLATES_BOX);
                    }).build());
    public static void registerModItemGroups() {
        Mrlest.LOGGER.info("Registering ModItemGroups for " + Mrlest.id);
    }
}