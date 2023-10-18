
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.steelandmore.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;

import net.minecraft.world.level.levelgen.feature.Feature;

import net.mcreator.steelandmore.world.features.ores.SteeloreFeature;
import net.mcreator.steelandmore.SteelAndMoreMod;

@Mod.EventBusSubscriber
public class SteelAndMoreModFeatures {
	public static final DeferredRegister<Feature<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.FEATURES, SteelAndMoreMod.MODID);
	public static final RegistryObject<Feature<?>> STEEL_ORE = REGISTRY.register("steel_ore", SteeloreFeature::new);
}
