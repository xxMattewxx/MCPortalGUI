package net.matt.portalgui.mixin;

import com.mojang.authlib.GameProfile;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.network.AbstractClientPlayerEntity;
import net.minecraft.client.network.ClientPlayerEntity;
import net.minecraft.client.world.ClientWorld;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(ClientPlayerEntity.class)
public abstract class MixinClientPlayerEntity extends AbstractClientPlayerEntity {
	public MixinClientPlayerEntity(ClientWorld worldIn, GameProfile playerProfile)
	{
		super(worldIn, playerProfile);
	}

	@Redirect(method = "updateNausea()V",
			at = @At(value = "INVOKE",
					target = "Lnet/minecraft/client/gui/screen/Screen;isPauseScreen()Z"))
	private boolean onDoesGuiPauseGame(Screen gui)
	{
		return true;
	}
}
