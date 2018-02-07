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

import java.awt.Color;
import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigItem;

/**
 *
 * @author bmoyer
 */
@ConfigGroup(
	keyName = "playerownedhouse",
	name = "Player Owned House",
	description = "Configuration for the implings plugin"
)
public interface PlayerOwnedHouseConfig extends Config
{
    @ConfigItem(
    		position = 0,
			keyName = "enabled",
			name = "Enabled",
			description = "Configures whether or not the POH plugin is enabled"
	)

	default boolean enabled()
	{
		return true;
	}

	@ConfigItem(
			position = 1,
			keyName = "Highlight altar burners when out",
			name = "Highlight extinguished burners",
			description = "Configures whether or not altar burners are highlighted once extinguished"
	)

	default boolean getHighlightBurners()
	{
		return false;
	}

	@ConfigItem(
			position = 2,
			keyName = "burnerColor",
			name = "Burner color",
			description = "Color to highlight extinguished burners"

	)

	default Color getBurnerColor()
	{
	    return Color.RED;
	}

	@ConfigItem(
			position = 3,
			keyName = "hideBury",
			name = "Hide bury option from bones",
			description = "Removes Bury option from bones and makes the first option Use"
	)

	default boolean getHideBury ()
	{
		return false;
	}
}
