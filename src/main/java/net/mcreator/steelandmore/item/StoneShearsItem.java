
package net.mcreator.steelandmore.item;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.item.ShearsItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

public class StoneShearsItem extends ShearsItem {
	public StoneShearsItem() {
		super(new Item.Properties().durability(32));
	}

	@Override
	public int getEnchantmentValue() {
		return 5;
	}

	@Override
	public float getDestroySpeed(ItemStack stack, BlockState blockstate) {
		return 1f;
	}
}
