package com.eric.tools;

import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

public class Eric_052 implements ToolMaterial {
    @Override
    public int getDurability() {
        return 35;
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
