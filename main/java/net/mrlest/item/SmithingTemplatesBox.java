package net.mrlest.item;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.world.World;

import java.util.concurrent.ThreadLocalRandom;

public class SmithingTemplatesBox extends Item {
    public SmithingTemplatesBox(Settings settings) {
        super(settings);
    }

    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {
        if (!world.isClient()) {
            if (hand == Hand.MAIN_HAND) {
                switch(ThreadLocalRandom.current().nextInt(0, 17)) {
                    case 0 -> user.giveItemStack(new ItemStack(Items.SENTRY_ARMOR_TRIM_SMITHING_TEMPLATE));
                    case 1 -> user.giveItemStack(new ItemStack(Items.WILD_ARMOR_TRIM_SMITHING_TEMPLATE));
                    case 2 -> user.giveItemStack(new ItemStack(Items.VEX_ARMOR_TRIM_SMITHING_TEMPLATE));
                    case 3 -> user.giveItemStack(new ItemStack(Items.COAST_ARMOR_TRIM_SMITHING_TEMPLATE));
                    case 4 -> user.giveItemStack(new ItemStack(Items.DUNE_ARMOR_TRIM_SMITHING_TEMPLATE));
                    case 5 -> user.giveItemStack(new ItemStack(Items.WAYFINDER_ARMOR_TRIM_SMITHING_TEMPLATE));
                    case 6 -> user.giveItemStack(new ItemStack(Items.RAISER_ARMOR_TRIM_SMITHING_TEMPLATE));
                    case 7 -> user.giveItemStack(new ItemStack(Items.SHAPER_ARMOR_TRIM_SMITHING_TEMPLATE));
                    case 8 -> user.giveItemStack(new ItemStack(Items.HOST_ARMOR_TRIM_SMITHING_TEMPLATE));
                    case 9 -> user.giveItemStack(new ItemStack(Items.SILENCE_ARMOR_TRIM_SMITHING_TEMPLATE));
                    case 10 -> user.giveItemStack(new ItemStack(Items.TIDE_ARMOR_TRIM_SMITHING_TEMPLATE));
                    case 11 -> user.giveItemStack(new ItemStack(Items.WARD_ARMOR_TRIM_SMITHING_TEMPLATE));
                    case 12 -> user.giveItemStack(new ItemStack(Items.SNOUT_ARMOR_TRIM_SMITHING_TEMPLATE));
                    case 13 -> user.giveItemStack(new ItemStack(Items.EYE_ARMOR_TRIM_SMITHING_TEMPLATE));
                    case 14 -> user.giveItemStack(new ItemStack(Items.SPIRE_ARMOR_TRIM_SMITHING_TEMPLATE));
                    case 15 -> user.giveItemStack(new ItemStack(Items.RIB_ARMOR_TRIM_SMITHING_TEMPLATE));
                    default -> user.giveItemStack(new ItemStack(Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE));
                }
                if (!user.isCreative()) {
                    user.getStackInHand(hand).decrement(1);
                }
            }
        }
        return super.use(world, user, hand);
    }
}