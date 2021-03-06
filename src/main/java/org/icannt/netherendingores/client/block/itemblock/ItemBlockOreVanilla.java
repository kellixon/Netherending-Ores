package org.icannt.netherendingores.client.block.itemblock;

import org.icannt.netherendingores.client.block.ItemBlockVariantBase;
import org.icannt.netherendingores.common.block.metadata.EnumOreNetherVanillaType;

import net.minecraft.block.Block;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.ItemStack;

/**
 * Created by ICannt on 17/08/17.
 */
public class ItemBlockOreVanilla extends ItemBlockVariantBase {

    public ItemBlockOreVanilla(Block block) {
        super(block);
        setHasSubtypes(true);
    }

    @Override
    public String getUnlocalizedName(ItemStack stack) {
        return super.getUnlocalizedName() + "." + EnumOreNetherVanillaType.values()[stack.getMetadata()].getName();
    }
    
    @Override
    public EnumRarity getRarity(ItemStack stack) {
        return EnumOreNetherVanillaType.values()[stack.getMetadata()].getRarity();
    }
}
