package com.sioclient;

import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigItem;
import net.runelite.client.config.ConfigSection;

@ConfigGroup("sioclient")
public interface SIOConfig extends Config
{

	//Server Settings
	@ConfigSection (
			name = "Server Settings",
			description = "Settings for Socket.IO Server",
			position = 0
	)
	String mainConfig = "mainConfig";

	@ConfigItem(
			keyName = "socket",
			name = "Socket.IO Server URL",
			description = "URL to Socket.IO Server",
			section = mainConfig,
			position = 1
	)
	String socket();

	@ConfigItem(
			keyName = "token",
			name = "Authorization Token (optional)",
			description = "Enter Authorization Token if needed",
			section = mainConfig,
			position = 2
	)
	String token();
}
