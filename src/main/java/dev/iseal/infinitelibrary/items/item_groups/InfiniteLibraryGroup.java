package dev.iseal.infinitelibrary.items.item_groups;

import dev.iseal.infinitelibrary.IL;
import dev.iseal.infinitelibrary.registry.BlockRegistry;
import dev.iseal.infinitelibrary.registry.ItemRegistry;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class InfiniteLibraryGroup {

    public static final RegistryKey<ItemGroup> CUSTOM_ITEM_GROUP_KEY = RegistryKey.of(Registries.ITEM_GROUP.getKey(), Identifier.of(IL.MOD_ID, "item_group"));
    public static final ItemGroup CUSTOM_ITEM_GROUP = FabricItemGroup.builder()
            .icon(() -> new ItemStack(ItemRegistry.IVORY_BRICK))
            .displayName(Text.translatable("itemGroup.infinitelibrary"))
            .build();


    public static void initialize() {
        // Register the group.
        Registry.register(Registries.ITEM_GROUP, CUSTOM_ITEM_GROUP_KEY, CUSTOM_ITEM_GROUP);

        // Register items to the custom item group.
        ItemGroupEvents.modifyEntriesEvent(CUSTOM_ITEM_GROUP_KEY).register(itemGroup -> {
            itemGroup.add(BlockRegistry.QUARTZ_BOOKSHELF.asItem());
            itemGroup.add(BlockRegistry.GLEAMING_CHISELED_IVORY.asItem());
            itemGroup.add(BlockRegistry.DULL_CHISELED_IVORY.asItem());
            itemGroup.add(BlockRegistry.OLD_EMPTY_BOOKSHELF.asItem());
            itemGroup.add(BlockRegistry.OLD_BOOKSHELF.asItem());

            // ivory blocks
            itemGroup.add(BlockRegistry.CHISELED_IVORY.asItem());
            itemGroup.add(BlockRegistry.IVORY_BRICKS.asItem());
            itemGroup.add(BlockRegistry.IVORY_PILLAR.asItem());
            itemGroup.add(BlockRegistry.POLISHED_IVORY.asItem());

            // gilded ivory blocks
            itemGroup.add(BlockRegistry.GILDED_CHISELED_IVORY.asItem());
            itemGroup.add(BlockRegistry.GILDED_IVORY_BRICKS.asItem());
            itemGroup.add(BlockRegistry.GILDED_IVORY_PILLAR.asItem());
            itemGroup.add(BlockRegistry.GILDED_POLISHED_IVORY.asItem());

            itemGroup.add(ItemRegistry.IVORY_BRICK);

            //Wepons
            itemGroup.add(ItemRegistry.PALE_SWORD);
            itemGroup.add(ItemRegistry.SPELL_BOOK);

        });
    }

}
