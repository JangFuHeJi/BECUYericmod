package com.eric;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.minecraft.world.gen.structure.Structure;

import static com.eric.BECUYeric.*;

public class ItemGroups implements ModInitializer {
    public static final ItemGroup BECUYservermaintain = FabricItemGroup.builder()//服务器维护物品栏
            .icon(() -> new ItemStack(miantain))
            .displayName(Text.translatable("itemgroup.becuyeric.becuyservermaintain"))
            .entries((context, entries) -> {
                entries.add(miantain);
                entries.add(miantain2);
                entries.add(miantain3);
                entries.add(miantain4);
                entries.add(miantain5);
                entries.add(miantain6);
                entries.add(miantain7);
                entries.add(miantain8);
                entries.add(miantain9);
                entries.add(miantain10);
                entries.add(miantain11);
                entries.add(miantain12);
            })
            .build();
    public static final ItemGroup BecuyServerEconItems = FabricItemGroup.builder()
            .icon(() -> new ItemStack(becuymoney_1))
            .displayName(Text.translatable("itemgroup.becuyeric.becuyservereconitems"))
            .entries((context, entries) -> {
                entries.add(becuymoney_1);
                entries.add(becuymoney_10);
                entries.add(becuymoney_50);
                entries.add(becuymoney_100);
            })
            .build();
    @Override
    public void onInitialize() {
        Registry.register(Registries.ITEM_GROUP, new Identifier(MOD_ID, "becuyservermiantainitems"),BECUYservermaintain);
        Registry.register(Registries.ITEM_GROUP, new Identifier(MOD_ID, "becuyservereconitems"),BecuyServerEconItems);
    }
}
