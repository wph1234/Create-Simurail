package com.crystaelix.simurail.content;

import com.crystaelix.simurail.Simurail;
import com.crystaelix.simurail.content.bogey.PhysicsBogeyMenu;
import com.crystaelix.simurail.content.bogey.PhysicsBogeyScreen;
import com.simibubi.create.foundation.data.CreateRegistrate;
import com.tterrag.registrate.util.entry.MenuEntry;

public class SimurailMenus {

	private static final CreateRegistrate REGISTRATE = Simurail.registrate();

	public static final MenuEntry<PhysicsBogeyMenu> PHYSICS_BOGEY = REGISTRATE.
			menu("physics_bogey", PhysicsBogeyMenu::new, () -> PhysicsBogeyScreen::create).
			register();

	public static void register() {
	}
}
