package com.eric.tools;

import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

import javax.tools.Tool;

public class wcn implements ToolMaterial {
    @Override
    public int getDurability() {
        return 55;
    }

    @Override
    public float getMiningSpeedMultiplier() {
        return 0;
    }

    @Override
    public float getAttackDamage() {
        return -1;
    }

    @Override
    public int getMiningLevel() {
        return 0;
    }

    @Override
    public int getEnchantability() {
        return 0;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return null;
    }
}
