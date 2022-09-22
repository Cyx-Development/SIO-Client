package com.sioclient;

import com.google.inject.Provides;
import javax.inject.Inject;
import lombok.extern.slf4j.Slf4j;
import net.runelite.api.Client;
import net.runelite.client.config.ConfigManager;
import net.runelite.client.plugins.Plugin;
import net.runelite.client.plugins.PluginDescriptor;

@Slf4j
@PluginDescriptor(
	name = "SIO Client",
	description = "Socket.IO Communication Client"
)
public class SIOPlugin extends Plugin
{
	@Inject
	private Client client;

	@Inject
	private SIOConfig config;

	@Override
	protected void startUp() throws Exception
	{
		log.info("SIO Client started!");
	}

	@Override
	protected void shutDown() throws Exception
	{
		log.info("SIO Client stopped!");
	}

	@Provides
	SIOConfig provideConfig(ConfigManager configManager)
	{
		return configManager.getConfig(SIOConfig.class);
	}
}
