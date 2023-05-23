package net.r0mnic.ScopedCrossbowMod;

import net.fabricmc.api.ModInitializer;
import net.r0mnic.ScopedCrossbowMod.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ScopedCrossbowMod implements ModInitializer {

	public static final String MOD_ID = "scoped-crossbow";
	public static final Logger LOGGER = LoggerFactory.getLogger("scoped-crossbow");

	@Override
	public void onInitialize() {
		ModItems.registerModItems();

	}
}
