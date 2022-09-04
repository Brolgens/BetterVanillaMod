package net.brolgens.bettervanilla;

import net.brolgens.bettervanilla.block.ModBlocks;
import net.brolgens.bettervanilla.item.ModItems;
import net.brolgens.bettervanilla.world.gen.ModWorldGen;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BetterVanilla implements ModInitializer {
	public static final String MOD_ID = "better_vanilla";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
		ModWorldGen.generateModWorldGen();
		ModBlocks.registerModBlocks();
		LOGGER.info("Hello in to Better Vanilla Minecraft!");
	}
}
