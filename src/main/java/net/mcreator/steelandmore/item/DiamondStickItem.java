
package net.mcreator.steelandmore.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class DiamondStickItem extends Item {
	public DiamondStickItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}
