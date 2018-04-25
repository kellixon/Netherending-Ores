package org.icannt.netherendingores.common.registry;

import org.icannt.netherendingores.NetherendingOres;
import org.icannt.netherendingores.lib.Util;

import com.google.common.base.CaseFormat;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.IStringSerializable;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.oredict.OreDictionary;

/**
 * Created by ICannt on 08/04/18.
 */
public enum BlockRecipeData implements IStringSerializable {

    NETHER_COAL_ORE ("nether_coal_ore", "ore_nether_vanilla", 0, "coal", "dust", 2, 0),
    NETHER_DIAMOND_ORE ("nether_diamond_ore", "ore_nether_vanilla", 1, "gem", "dust", 2, 0),
    NETHER_EMERALD_ORE ("nether_emerald_ore", "ore_nether_vanilla", 2, "gem", "", 2, 0),
    NETHER_GOLD_ORE ("nether_gold_ore", "ore_nether_vanilla", 3, "", "", 2, 0),
    NETHER_IRON_ORE ("nether_iron_ore", "ore_nether_vanilla", 4, "", "", 2, 0),
    NETHER_LAPIS_ORE ("nether_lapis_ore", "ore_nether_vanilla", 5, "gem", "dust", 2, 0),
    NETHER_REDSTONE_ORE ("nether_redstone_ore", "ore_nether_vanilla", 6, "dust", "", 2, 0),
    END_COAL_ORE ("end_coal_ore", "ore_end_vanilla", 0, "coal", "dust", 2, 0),
    END_DIAMOND_ORE ("end_diamond_ore", "ore_end_vanilla", 1, "gem", "dust", 2, 0),
    END_EMERALD_ORE ("end_emerald_ore", "ore_end_vanilla", 2, "gem", "", 2, 0),
    END_GOLD_ORE ("end_gold_ore", "ore_end_vanilla", 3, "", "", 2, 0),
    END_IRON_ORE ("end_iron_ore", "ore_end_vanilla", 4, "", "", 2, 0),
    END_LAPIS_ORE ("end_lapis_ore", "ore_end_vanilla", 5, "gem", "dust", 2, 0),
    END_REDSTONE_ORE ("end_redstone_ore", "ore_end_vanilla", 6, "dust", "", 2, 0),
    NETHER_ALUMINUM_ORE ("nether_aluminum_ore", "ore_nether_modded_1", 0, "", "", 2, 0),
    NETHER_COPPER_ORE ("nether_copper_ore", "ore_nether_modded_1", 1, "", "", 2, 0),
    NETHER_IRIDIUM_ORE ("nether_iridium_ore", "ore_nether_modded_1", 2, "", "", 2, 0),
    NETHER_LEAD_ORE ("nether_lead_ore", "ore_nether_modded_1", 3, "", "", 2, 0),
    NETHER_MITHRIL_ORE ("nether_mithril_ore", "ore_nether_modded_1", 4, "", "", 2, 0),
    NETHER_NICKEL_ORE ("nether_nickel_ore", "ore_nether_modded_1", 5, "", "", 2, 0),
    NETHER_PLATINUM_ORE ("nether_platinum_ore", "ore_nether_modded_1", 6, "", "", 2, 0),
    NETHER_SILVER_ORE ("nether_silver_ore", "ore_nether_modded_1", 7, "", "", 2, 0),
    NETHER_TIN_ORE ("nether_tin_ore", "ore_nether_modded_1", 8, "", "", 2, 0),
    NETHER_CERTUS_QUARTZ_ORE ("nether_certus_quartz_ore", "ore_nether_modded_1", 9, "", "", 2, 0),
    NETHER_CHARGED_CERTUS_QUARTZ_ORE ("nether_charged_certus_quartz_ore", "ore_nether_modded_1", 10, "dustCertusQuartz", "", 2, 0),
    NETHER_OSMIUM_ORE ("nether_osmium_ore", "ore_nether_modded_1", 11, "", "", 2, 0),
    NETHER_URANIUM_ORE ("nether_uranium_ore", "ore_nether_modded_1", 12, "", "", 2, 0),
    NETHER_YELLORITE_ORE ("nether_yellorite_ore", "ore_nether_modded_1", 13, "", "", 2, 0),
    END_ALUMINUM_ORE ("end_aluminum_ore", "ore_end_modded_1", 0, "", "", 2, 0),
    END_COPPER_ORE ("end_copper_ore", "ore_end_modded_1", 1, "", "", 2, 0),
    END_IRIDIUM_ORE ("end_iridium_ore", "ore_end_modded_1", 2, "", "", 2, 0),
    END_LEAD_ORE ("end_lead_ore", "ore_end_modded_1", 3, "", "", 2, 0),
    END_MITHRIL_ORE ("end_mithril_ore", "ore_end_modded_1", 4, "", "", 2, 0),
    END_NICKEL_ORE ("end_nickel_ore", "ore_end_modded_1", 5, "", "", 2, 0),
    END_PLATINUM_ORE ("end_platinum_ore", "ore_end_modded_1", 6, "", "", 2, 0),
    END_SILVER_ORE ("end_silver_ore", "ore_end_modded_1", 7, "", "", 2, 0),
    END_TIN_ORE ("end_tin_ore", "ore_end_modded_1", 8, "", "", 2, 0),
    END_CERTUS_QUARTZ_ORE ("end_certus_quartz_ore", "ore_end_modded_1", 9, "", "", 2, 0),
    END_CHARGED_CERTUS_QUARTZ_ORE ("end_charged_certus_quartz_ore", "ore_end_modded_1", 10, "dustCertusQuartz", "", 2, 0),
    END_OSMIUM_ORE ("end_osmium_ore", "ore_end_modded_1", 11, "", "", 2, 0),
    END_URANIUM_ORE ("end_uranium_ore", "ore_end_modded_1", 12, "", "", 2, 0),
    END_YELLORITE_ORE ("end_yellorite_ore", "ore_end_modded_1", 13, "", "", 2, 0),
    OVERWORLD_QUARTZ_ORE ("overworld_quartz_ore", "ore_other_1", 0, "gem", "", 1, 0),
    END_QUARTZ_ORE ("end_quartz_ore", "ore_other_1", 1, "gem", "", 1, 0),
    OVERWORLD_ARDITE_ORE ("overworld_ardite_ore", "ore_other_1", 2, "", "", 1, 0),
    END_ARDITE_ORE ("end_ardite_ore", "ore_other_1", 3, "", "", 1, 0),
    OVERWORLD_COBALT_ORE ("overworld_cobalt_ore", "ore_other_1", 4, "", "", 1, 0),
    END_COBALT_ORE ("end_cobalt_ore", "ore_other_1", 5, "", "", 1, 0);


    private String name;
    private String blockName;
    private int blockMeta;
    private String itemOreDict;
    private String itemAltOreDict;
    private int defaultRecipeMultiplier;
    private int recipeMultiplier;
	
	BlockRecipeData(String name, String blockName, int blockMeta, String itemOreDict, String itemAltOreDict, int defaultRecipeMultiplier, int recipeMultiplier) {
		this.name = name;
		this.blockName = blockName;
		this.blockMeta = blockMeta;
		this.itemOreDict = itemOreDict;
		this.itemOreDict = itemAltOreDict;
		this.defaultRecipeMultiplier = defaultRecipeMultiplier;
		this.recipeMultiplier = recipeMultiplier;
	}
	
    @Override
    public String getName() {
        return name;
    }

    public Block getBlock() {
    	return Block.getBlockFromName(NetherendingOres.MOD_ID + ":" + blockName);
    }
        
    public int getBlockMeta() {
    	return blockMeta;
    }

    public String getOreDictFurnaceItem() {
        return getOreDictFurnaceItemName(itemOreDict, name);
    }
    
    public static String getOreDictFurnaceItem(int index) {
        return BlockRecipeData.values()[index].getOreDictFurnaceItem();
    }
    
    public String getOreDictPulvItem() {
        return getOreDictPulvItemName(itemOreDict, name);
    }
    
    public static String getOreDictPulvItem(int index) {
        return BlockRecipeData.values()[index].getOreDictPulvItem();
    }

    public int getDefaultRecipeMultiplier() {
        return defaultRecipeMultiplier;
    }
    
    public int getRecipeMultiplier() {
    	return recipeMultiplier;
    }

    public void setRecipeMultiplier(int multiplier) {
    	this.recipeMultiplier = multiplier;
    }
	
    public Ingredient[] getConversionIngredient() {
		return new Ingredient[]{Ingredient.fromStacks(getItemStack())};
    }
    
    public ResourceLocation getConversionResourceLocation() {
		return new ResourceLocation(NetherendingOres.MOD_ID + ":" + name + "_to_" + Util.LowerUnder(getOreDictName(1)));
    }
    
    public ItemStack getItemStack() {
    	return new ItemStack(getBlock(), 1, blockMeta);
    }
    
    /**
     * 
     * 
     * @param index
     * @return
     */
    public static ItemStack getItemStack(int index) {
    	Block block = BlockRecipeData.values()[index].getBlock(); 
    	int meta = BlockRecipeData.values()[index].getBlockMeta();
    	return new ItemStack(block, 1, meta);
    }
    
    /**
     * Returns an Ore Dictionary name based on the defined recipe 
     * multiplier from the config file. Some mods such as
     * Tinkers' Construct use the "oreNether" and "denseore"
     * prefixes to add additional recipes for 2x/3x output.
     *
     * @return      The reassembled mod ore block name
     */
    public String getOreDictName() {
    	return getOreDictPrefixedName(recipeMultiplier);
    }
    
    /**
     * Version of getOreDictName that has a callable 
     * multiplier.
     *
     * @param       multiplier The required recipe multiplier
     * @return      The reassembled mod ore block name
     */
    public String getOreDictName(int multiplier) {
    	return getOreDictPrefixedName(multiplier);
    }
    
    /**
     * The method that returns the correct OreDict prefix
     * 
     * @param multiplier
     * @return
     */
    private String getOreDictPrefixedName(int multiplier) {
    	String prefix = "";
		String ore = name;
		switch (multiplier) {
			case 1:	prefix = "ore"; ore = getRawOreName(ore); break;
			case 2:	prefix = "ore"; break;
			case 3: prefix = "denseore";
		}
		return prefix + Util.UpperCamel(ore.replace("_ore", ""));
    }
        
    /**
     * Determines which item prefix to use for grinding machines
     * then adds the ore name to it, blank input equates to "dust".
     * Anything else other than "gem" or "crystal" means use the whole
     * string as the ore name.
     *
     * @param prefix The prefix or full name from the block data table
     * @param material The ore material that is being dealt with
     * @return The reassembled other mod item name (often a dust)
     */
    private static String getOreDictPulvItemName(String prefix, String material) {    	   	
    	String ore = CaseFormat.LOWER_UNDERSCORE.to(CaseFormat.UPPER_CAMEL, getRawOreName(material));    	
    	switch (prefix) {
			case "": prefix = "dust"; break;
			case "gem": case "crystal": break;
			default:
				prefix = "";
				ore = getRawOreName(material);
    	}    	
    	return prefix + ore;    	
    }

    /**
     * Determines which item prefix to use for smelting
     * then adds the ore name to it, blank input equates to "ingot".
     * Anything else other than "dust", "gem" or "crystal" means use the whole
     * string as the ore name.
     *
     * @param prefix The prefix or full name from the block data table
     * @param material The ore material that is being dealt with
     * @return The reassembled other mod item name (often a dust)
     */
    private static String getOreDictFurnaceItemName(String prefix, String material) {    	   	
    	String ore = CaseFormat.LOWER_UNDERSCORE.to(CaseFormat.UPPER_CAMEL, getRawOreName(material));    	
    	switch (prefix) {
			case "": prefix = "ingot"; break;
			case "dust": case "gem": case "crystal": break;
			default:
				prefix = "";
				ore = getRawOreName(material);
    	}    	
    	return prefix + ore;    	
    }
    
    public String getRawOreName() {    	
    	return getRawOreName(name);
    }
    
    /**
     * Strips extensions and prefixes from ore enum names
     * 
     * @param ore The string name to be stripped
     * @return The base ore name
     */
    private static String getRawOreName(String ore) {    	
    	String[] words = {"_ore","overworld_","nether_","end_"};    	
    	for(String word : words) {
    		ore = ore.replace(word, "");
    	}
    	return ore;
    }
    
    /**
     * Strips extensions and prefixes from ore enum names
     * 
     * @param ore The string name to be stripped
     * @return The base ore name
     */
    public static String getRawOreName(int index) {
    	return getRawOreName(BlockRecipeData.values()[index].getName());
    }
    

	public ItemStack getFurnaceOutput() {
		Item output = OreDictionary.getOres(getOreDictFurnaceItem(), false).get(0).getItem();
		int meta = OreDictionary.getOres(getOreDictFurnaceItem(), false).get(0).getMetadata();
		return new ItemStack(output, 1, meta);
	}
    
}
