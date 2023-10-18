
package net.mcreator.steelandmore.item;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.item.ShearsItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

public class CopperShearsItem extends ShearsItem {
	public CopperShearsItem() {
		super(new Item.Properties().durability(50));
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
