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

import com.google.common.primitives.Ints;
import lombok.Getter;
import net.runelite.api.*;
import net.runelite.api.Point;
import net.runelite.api.queries.NPCQuery;
import net.runelite.client.plugins.playerownedhouse.PlayerOwnedHouseConfig;
import net.runelite.client.ui.overlay.Overlay;
import net.runelite.client.ui.overlay.OverlayLayer;
import net.runelite.client.ui.overlay.OverlayPosition;
import net.runelite.client.ui.overlay.components.PanelComponent;
import net.runelite.client.util.QueryRunner;

import javax.inject.Inject;
import java.awt.*;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author bmoyer
 */
public class PlayerOwnedHouseOverlay extends Overlay
{

	private static final int STATIC_SPAWN = 1618;
	private static final int DYNAMIC_SPAWN = 1633;

	private final Client client;
	private final PlayerOwnedHousePlugin plugin;
	private final PlayerOwnedHouseConfig config;

	private final PanelComponent panelComponent = new PanelComponent();

	@Getter
	private final Map<Integer, Color> ids = new HashMap<>();

	@Inject
	public PlayerOwnedHouseOverlay(Client client, PlayerOwnedHousePlugin plugin, PlayerOwnedHouseConfig config)
	{
		setPosition(OverlayPosition.DYNAMIC);
		setLayer(OverlayLayer.ABOVE_SCENE);
		this.client = client;
		this.plugin = plugin;
		this.config = config;
	}

	@Override
	public Dimension render(Graphics2D graphics, java.awt.Point parent)
	{
	    if(!config.enabled()) {
	    	return null;
		}

		panelComponent.getLines().clear();
		panelComponent.setTitle("POH Plugin Active");

		return panelComponent.render(graphics, parent);

		//return null;
	}

	public void updateConfig()
	{
	}

}
