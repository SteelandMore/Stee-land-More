
package net.mcreator.steelandmore.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class IronStickItem extends Item {
	public IronStickItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}
