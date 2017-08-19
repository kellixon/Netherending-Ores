package org.icannt.netherendingores.common.block.variant;

import net.minecraft.item.EnumRarity;
import net.minecraft.util.IStringSerializable;

/**
 * Created by ICannt on 17/08/17.
 */
public enum EnumOreVanillaType implements IStringSerializable {
	
    COAL_ORE ("coal_ore", 0, 3, 15, EnumRarity.COMMON, 0),
    DIAMOND_ORE ("diamond_ore", 0, 3, 15, EnumRarity.COMMON, 2),
    EMERALD_ORE ("emerald_ore", 0, 3, 15, EnumRarity.COMMON, 2),
    GOLD_ORE ("gold_ore", 0, 3, 15, EnumRarity.COMMON, 2),
    IRON_ORE ("iron_ore", 0, 3, 15, EnumRarity.COMMON, 1),
    LAPIS_ORE ("lapis_ore", 0, 3, 15, EnumRarity.COMMON, 1),
    REDSTONE_ORE ("redstone_ore", 0, 3, 15, EnumRarity.COMMON, 1);

    private String name;
    private int light;
    private float hardness;
    private float resistance;
    private EnumRarity rarity;
    private int harvestLevel;

    EnumOreVanillaType(String name, int light, float hardness, float resistance, EnumRarity rarity, int harvestLevel) {
        this.name = name;
        this.light = light;
        this.hardness = hardness;
        this.resistance = resistance;
        this.rarity = rarity;
        this.harvestLevel = harvestLevel;
    }

    @Override
    public String getName() {
        return name;
    }

    public int getLight() {
        return light;
    }

    public float getHardness() {
        return hardness;
    }

    public float getResistance() {
        return resistance;
    }

    public EnumRarity getRarity() {
        return rarity;
    }
    
    public int getHarvestLevel() {
        return harvestLevel;
    }
}