package com.envyful.disable.trainer.card.reforged;

import com.pixelmonmod.pixelmon.comm.data.AbstractPixelmonPacket;
import com.pixelmonmod.pixelmon.comm.data.PacketDirection;
import com.pixelmonmod.pixelmon.comm.packetHandlers.trainerCard.RequestTrainerCardPacket;
import net.minecraftforge.event.network.CustomPayloadEvent;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;

@Mixin(RequestTrainerCardPacket.class)
public abstract class MixinRequestTrainerCardPacket extends AbstractPixelmonPacket {

    protected MixinRequestTrainerCardPacket(PacketDirection direction) {
        super(direction);
    }

    protected MixinRequestTrainerCardPacket(PacketDirection direction, boolean sync) {
        super(direction, sync);
    }

    protected MixinRequestTrainerCardPacket(boolean sync) {
        super(sync);
    }

    /**
     * @author Daniel
     * @reason Disable
     */
    @Overwrite(remap = false)
    public void handlePacket(CustomPayloadEvent.Context context) {
        // Do nothing
    }
}
