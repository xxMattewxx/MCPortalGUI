package net.matt.portalgui;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PortalGUIMod implements ModInitializer {
	public static final Logger LOGGER = LoggerFactory.getLogger("portal-gui");

	@Override
	public void onInitialize() {
		LOGGER.info("Portal GUI mod loaded.");
	}
}
