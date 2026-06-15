package com.zuckeym17.relicmetals;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class RelicMetals implements ModInitializer {
	public static final String MOD_ID = "relic_metals";

	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		LOGGER.info("Relic Metals initialized");
	}
}
