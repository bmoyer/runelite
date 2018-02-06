/* 
 * Copyright (c) 2017, Robin <robin.weymans@gmail.com> 
 * All rights reserved. 
 * 
 * Redistribution and use in source and binary forms, with or without 
 * modification, are permitted provided that the following conditions are met: 
 * 
 * 1. Redistributions of source code must retain the above copyright notice, this 
 *    list of conditions and the following disclaimer. 
 * 2. Redistributions in binary form must reproduce the above copyright notice, 
 *    this list of conditions and the following disclaimer in the documentation 
 *    and/or other materials provided with the distribution. 
 * 
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND 
 * ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED 
 * WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE 
 * DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS BE LIABLE FOR 
 * ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES 
 * (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; 
 * LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND 
 * ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT 
 * (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS 
 * SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE. 
 */
package net.runelite.client.plugins.playerownedhouse;

import com.google.common.collect.Sets;
import com.google.common.eventbus.Subscribe;
import com.google.inject.Binder;
import com.google.inject.Provides;
import lombok.AccessLevel;
import lombok.Getter;
import net.runelite.api.GameObject;
import net.runelite.api.GameState;
import net.runelite.api.events.*;
import net.runelite.client.config.ConfigManager;
import net.runelite.client.plugins.Plugin;
import net.runelite.client.plugins.PluginDescriptor;
import net.runelite.client.plugins.playerownedhouse.PlayerOwnedHouseConfig;
//import net.runelite.client.plugins.implings.PlayerOwnedHouseOverlay;
import net.runelite.client.ui.overlay.Overlay;

import javax.inject.Inject;
import java.util.HashSet;
import java.util.Set;

import static net.runelite.api.ObjectID.INCENSE_BURNER_13212;

/**
 *
 * @author robin
 */
@PluginDescriptor(
	name = "PlayerOwnedHouse plugin"
)
public class PlayerOwnedHousePlugin extends Plugin
{
	private static final Set<Integer> BURNER_OBJECTS = Sets.newHashSet(INCENSE_BURNER_13212);

	@Inject
	private PlayerOwnedHouseOverlay overlay;

	@Getter(AccessLevel.PACKAGE)
	private final Set<GameObject> burners = new HashSet<>();
	/*
	@Override
	public void configure(Binder binder)
	{
		binder.bind(PlayerOwnedHouseOverlay.class);
	}
	*/

	@Provides
	PlayerOwnedHouseConfig getConfig(ConfigManager configManager)
	{
		return configManager.getConfig(PlayerOwnedHouseConfig.class);
	}

	@Override
	protected void startUp() throws Exception
	{
		// Initialize overlay config
		//overlay.updateConfig();
	}

	@Override
	public Overlay getOverlay()
	{
		return overlay;
	}


	@Subscribe
	public void onGameObjectSpawned(GameObjectSpawned event)
	{
		GameObject gameObject = event.getGameObject();
		if (BURNER_OBJECTS.contains(gameObject.getId()))
		{
			burners.add(gameObject);
		}
	}

	@Subscribe
	public void onGameObjectChanged(GameObjectChanged event)
	{
		GameObject previous = event.getPrevious();
		GameObject gameObject = event.getGameObject();

		burners.remove(previous);
		if (BURNER_OBJECTS.contains(gameObject.getId()))
		{
			burners.add(gameObject);
		}
	}

	@Subscribe
	public void onGameObjectDespawned(GameObjectDespawned event)
	{
		GameObject gameObject = event.getGameObject();
		burners.remove(gameObject);
	}

	@Subscribe
	public void onGameStateChanged(GameStateChanged event)
	{
		if (event.getGameState() == GameState.LOADING) {
			burners.clear();
		}
	}

	/*
	@Subscribe
	public void updateConfig(ConfigChanged event)
	{
		overlay.updateConfig();
	}
	*/
}
