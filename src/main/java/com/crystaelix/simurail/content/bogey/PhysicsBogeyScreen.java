package com.crystaelix.simurail.content.bogey;

import net.createmod.catnip.gui.AbstractSimiScreen;
import net.minecraft.client.gui.screens.inventory.MenuAccess;
import net.minecraft.network.chat.Component;
import net.minecraft.world.entity.player.Inventory;

public abstract class PhysicsBogeyScreen extends AbstractSimiScreen implements MenuAccess<PhysicsBogeyMenu> {

	protected PhysicsBogeyMenu menu;

	public PhysicsBogeyScreen(PhysicsBogeyMenu menu, Component title) {
		super(title);
		this.menu = menu;
	}

	@Override
	public PhysicsBogeyMenu getMenu() {
		return menu;
	}

	public static PhysicsBogeyScreen create(PhysicsBogeyMenu menu, Inventory inv, Component title) {
		return menu.secondary ? new PhysicsBogeyMenuScreen(menu, title) : new PhysicsBogeyOptionsScreen(menu, title);
	}
}
