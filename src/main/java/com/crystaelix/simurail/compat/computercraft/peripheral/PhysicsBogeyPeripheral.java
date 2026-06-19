package com.crystaelix.simurail.compat.computercraft.peripheral;

import com.crystaelix.simurail.content.bogey.PhysicsBogeyBlockEntity;
import com.crystaelix.simurail.content.bogey.PhysicsBogeyControlMode;
import com.simibubi.create.compat.computercraft.implementation.peripherals.SyncedPeripheral;

import dan200.computercraft.api.lua.LuaFunction;

public class PhysicsBogeyPeripheral extends SyncedPeripheral<PhysicsBogeyBlockEntity> {

	public PhysicsBogeyPeripheral(PhysicsBogeyBlockEntity blockEntity) {
		super(blockEntity);
	}

	@Override
	public String getType() {
		return "Simurail_PhysicsBogey";
	}

	@LuaFunction
	public boolean isPhysicsEnabled() {
		return blockEntity.getOptions().enabled;
	}

	@LuaFunction(mainThread = true)
	public void setPhysicsEnabled(boolean enabled) {
		blockEntity.getOptions().enabled = enabled;
		blockEntity.setChanged();
	}

	@LuaFunction
	public boolean allowsYawOffset() {
		return blockEntity.getOptions().allowYawOffset;
	}

	@LuaFunction(mainThread = true)
	public void setAllowYawOffset(boolean allow) {
		blockEntity.getOptions().allowYawOffset = allow;
		blockEntity.setChanged();
	}

	@LuaFunction
	public boolean allowsPitchOffset() {
		return blockEntity.getOptions().allowPitchOffset;
	}

	@LuaFunction(mainThread = true)
	public void setAllowPitchOffset(boolean allow) {
		blockEntity.getOptions().allowPitchOffset = allow;
		blockEntity.setChanged();
	}

	@LuaFunction
	public boolean allowsVerticalOffset() {
		return blockEntity.getOptions().allowVerticalOffset;
	}

	@LuaFunction(mainThread = true)
	public void setAllowVerticalOffset(boolean allow) {
		blockEntity.getOptions().allowVerticalOffset = allow;
		blockEntity.setChanged();
	}

	@LuaFunction
	public boolean allowsLateralOffset() {
		return blockEntity.getOptions().allowLateralOffset;
	}

	@LuaFunction(mainThread = true)
	public void setAllowLateralOffset(boolean allow) {
		blockEntity.getOptions().allowLateralOffset = allow;
		blockEntity.setChanged();
	}

	@LuaFunction
	public boolean allowsVerticalMovement() {
		return blockEntity.getOptions().allowVerticalMovement;
	}

	@LuaFunction(mainThread = true)
	public void setAllowVerticalMovement(boolean allow) {
		blockEntity.getOptions().allowVerticalMovement = allow;
		blockEntity.setChanged();
	}

	@LuaFunction
	public float getMaxStress() {
		return blockEntity.getOptions().stress;
	}

	@LuaFunction(mainThread = true)
	public void setMaxStress(float stress) {
		blockEntity.getOptions().stress = stress;
		blockEntity.setChanged();
	}

	@LuaFunction
	public int getControlMode() {
		return blockEntity.getOptions().controlMode.ordinal();
	}

	@LuaFunction(mainThread = true)
	public void setControlMode(int mode) {
		blockEntity.getOptions().controlMode = PhysicsBogeyControlMode.BY_ID.apply(mode);
		blockEntity.setChanged();
	}

	@LuaFunction
	public boolean hasTrack() {
		return blockEntity.hasTrack();
	}

	@LuaFunction
	public boolean isDerailed() {
		return blockEntity.isDerailed();
	}

	@LuaFunction
	public double getLateralCurvature() {
		return blockEntity.getLateralCurvature();
	}

	@LuaFunction
	public double getVerticalCurvature() {
		return blockEntity.getVerticalCurvature();
	}
}
