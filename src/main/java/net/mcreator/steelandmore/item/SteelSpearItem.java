
package net.mcreator.steelandmore.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import net.mcreator.steelandmore.init.SteelAndMoreModItems;

public class SteelSpearItem extends SwordItem {
	public SteelSpearItem() {
		super(new Tier() {
			public int getUses() {
				return 700;
			}

			public float getSpeed() {
				return 0f;
			}

			public float getAttackDamageBonus() {
				return 2f;
			}

			public int getLevel() {
				return 0;
			}

			public int getEnchantmentValue() {
				return 14;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(SteelAndMoreModItems.STEELINGOT.get()));
			}
		}, 3, -1f, new Item.Properties().fireResistant());
	}
}
