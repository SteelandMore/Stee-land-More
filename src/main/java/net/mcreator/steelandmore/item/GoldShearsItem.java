
package net.mcreator.steelandmore.item;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.item.ShearsItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

public class GoldShearsItem extends ShearsItem {
	public GoldShearsItem() {
		super(new Item.Properties().durability(64));
	}

	@Override
	public int getEnchantmentValue() {
		return 16;
	}

	@Override
	public float getDestroySpeed(ItemStack stack, BlockState blockstate) {
		return 1f;
	}
}
