package org.icannt.netherendingores.common.block.metadata;

import net.minecraft.item.EnumRarity;
import net.minecraft.util.IStringSerializable;

/**
 * Created by ICannt on 17/08/17.
 */
public enum EnumOreOther1Type implements IStringSerializable {
	
    OVERWORLD_QUARTZ_ORE ("overworld_quartz_ore", EnumRarity.COMMON, "oreOverworldQuartz", "oreQuartz", 0, 0, 3, 15, 1),
    END_QUARTZ_ORE ("end_quartz_ore", EnumRarity.COMMON, "oreEndQuartz", "oreQuartz", 0, 0, 3, 15, 1),
    OVERWORLD_ARDITE_ORE ("overworld_ardite_ore", EnumRarity.COMMON, "oreOverworldArdite", "oreArdite", 0, 4, 10, 50, 1),
    END_ARDITE_ORE ("end_ardite_ore", EnumRarity.COMMON, "oreEndArdite", "oreArdite", 0, 0, 10, 50, 1),
    OVERWORLD_COBALT_ORE ("overworld_cobalt_ore", EnumRarity.COMMON, "oreOverworldCobalt", "oreCobalt", 0, 4, 10, 50, 1),
    END_COBALT_ORE ("end_cobalt_ore", EnumRarity.COMMON, "oreEndCobalt", "oreCobalt", 0, 4, 10, 50, 1);

    private String name;
    private EnumRarity rarity;
    private String recipeOreDict;
    private String furnaceOreDict;
    private int light;
    private int harvestLevel;
    private float hardness;
    private float resistance;
    private int recipeMultiplier;

    EnumOreOther1Type(String name, EnumRarity rarity, String recipeOreDict, String furnaceOreDict, int light, int harvestLevel, float hardness, float resistance, int recipeMultiplier) {
        this.name = name;
        this.rarity = rarity;
        this.recipeOreDict = recipeOreDict;
        this.furnaceOreDict = furnaceOreDict;
        this.light = light;
        this.harvestLevel = harvestLevel;
        this.hardness = hardness;
        this.resistance = resistance;
        this.recipeMultiplier = recipeMultiplier;
    }

    @Override
    public String getName() {
        return name;
    }
    
    public EnumRarity getRarity() {
        return rarity;
    }
    
    public String getRecipeOreDict() {
        return recipeOreDict;
    }
    
    public String getFurnaceOreDict() {
        return furnaceOreDict;
    }

    public int getLight() {
        return light;
    }
    
    public int getHarvestLevel() {
        return harvestLevel;
    }

    public float getHardness() {
        return hardness;
    }

    public float getResistance() {
        return resistance;
    }
    
    public int getRecipeMultiplier() {
        return recipeMultiplier;
    }
    
}
