package net.mrlest;

import net.fabricmc.api.ModInitializer;

import net.mrlest.item.ModItemGroups;
import net.mrlest.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Mrlest implements ModInitializer {
	public static final String id = "mrlest";
    public static final Logger LOGGER = LoggerFactory.getLogger(id);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
		ModItemGroups.registerModItemGroups();
	}
}