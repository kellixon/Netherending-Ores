package org.icannt.netherendingores.common.registry;

import org.icannt.netherendingores.NetherendingOres;
import org.icannt.netherendingores.common.block.metadata.EnumOreModded1Type;
import org.icannt.netherendingores.common.block.metadata.EnumOreVanillaType;

import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.OreDictionary;

/**
 * Created by ICannt on 20/08/17.
 */

@GameRegistry.ObjectHolder(NetherendingOres.MOD_ID)
public class RecipeRegistry {
	
	public static void registerFurnaceRecipes() {
		
		// Vanilla Nether Ores - Furnace
		for (EnumOreVanillaType variant : EnumOreVanillaType.values()) {			
	        for (ItemStack stack : OreDictionary.getOres(variant.getFurnaceOreDict()))
	        {
	        	GameRegistry.addSmelting(new ItemStack(BlockRegistry.ORE_NETHER_VANILLA, 1, variant.ordinal()), new ItemStack(stack.getItem(), 2, stack.getMetadata()), 0);
	        }
		}

		// Modded Nether Ores 1 - Furnace
		for (EnumOreModded1Type variant : EnumOreModded1Type.values()) {			
	        for (ItemStack stack : OreDictionary.getOres(variant.getFurnaceOreDict()))
	        {
	        	GameRegistry.addSmelting(new ItemStack(BlockRegistry.ORE_NETHER_MODDED_1, 1, variant.ordinal()), new ItemStack(stack.getItem(), 2, stack.getMetadata()), 0);
	        }
		}
		
		// Vanilla End Ores - Furnace
		for (EnumOreVanillaType variant : EnumOreVanillaType.values()) {			
	        for (ItemStack stack : OreDictionary.getOres(variant.getFurnaceOreDict()))
	        {
	        	GameRegistry.addSmelting(new ItemStack(BlockRegistry.ORE_END_VANILLA, 1, variant.ordinal()), new ItemStack(stack.getItem(), 2, stack.getMetadata()), 0);
	        }
		}

		// Modded End Ores 1 - Furnace
		for (EnumOreModded1Type variant : EnumOreModded1Type.values()) {			
	        for (ItemStack stack : OreDictionary.getOres(variant.getFurnaceOreDict()))
	        {
	        	GameRegistry.addSmelting(new ItemStack(BlockRegistry.ORE_END_MODDED_1, 1, variant.ordinal()), new ItemStack(stack.getItem(), 2, stack.getMetadata()), 0);
	        }
		}

	}
}