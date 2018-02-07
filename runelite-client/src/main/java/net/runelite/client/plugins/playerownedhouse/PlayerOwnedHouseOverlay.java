/*
 * Copyright (c) 2018, bmoyer <ben.s.moyer@gmail.com>
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

import lombok.Getter;
import net.runelite.api.*;
import net.runelite.client.ui.overlay.Overlay;
import net.runelite.client.ui.overlay.OverlayLayer;
import net.runelite.client.ui.overlay.OverlayPosition;
import net.runelite.client.ui.overlay.OverlayUtil;
import net.runelite.client.ui.overlay.components.PanelComponent;

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
	private final Client client;
	private final PlayerOwnedHousePlugin plugin;
	private final PlayerOwnedHouseConfig config;

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


		if(config.getHighlightBurners())
		{
		    drawBurnerTiles(graphics);
		}
		return null;
	}

	public void drawBurnerTiles(Graphics2D graphics)
	{
		for(GameObject burner : plugin.getBurners())
		{
			Polygon poly = Perspective.getCanvasTilePoly(client, burner.getLocalLocation());

			if (poly != null)
			{
				OverlayUtil.renderPolygon(graphics, poly, config.getBurnerColor());
			}
		}
	}

	public void updateConfig()
	{
	}

}
