package dev.imb11.icebreak.config;

import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.ModLoadingContext;
import net.neoforged.fml.common.Mod;
import net.neoforged.neoforge.client.gui.IConfigScreenFactory;

@Mod(value = "icebreak", dist = Dist.CLIENT)
public class NeoForgeCompat {
	public NeoForgeCompat(IEventBus bus) {
		ModLoadingContext.get().getActiveContainer().registerExtensionPoint(IConfigScreenFactory.class, (client, parent) -> IcebreakConfig.getInstance().generateScreen(parent));
	}
}
