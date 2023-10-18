
package net.mcreator.steelandmore.item;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.item.ShearsItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

public class SteelShearsItem extends ShearsItem {
	public SteelShearsItem() {
		super(new Item.Properties().durability(300));
	}

	@Override
	public int getEnchantmentValue() {
		return 15;
	}

	@Override
	public float getDestroySpeed(ItemStack stack, BlockState blockstate) {
		return 1f;
	}
}
