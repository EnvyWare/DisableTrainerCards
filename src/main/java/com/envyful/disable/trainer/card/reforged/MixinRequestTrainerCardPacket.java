package com.envyful.disable.trainer.card.reforged;

import com.pixelmonmod.pixelmon.comm.packetHandlers.trainerCard.RequestTrainerCardPacket;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.common.network.simpleimpl.IMessageHandler;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;

@Mixin(RequestTrainerCardPacket.Handler.class)
public abstract class MixinRequestTrainerCardPacket implements IMessageHandler<RequestTrainerCardPacket, IMessage> {

    /**
     *
     * Removes reply to the packet
     *
     * @author danorris709
     */
    @Overwrite(remap = false)
    public IMessage onMessage(RequestTrainerCardPacket message, MessageContext ctx) {
        return null;
    }
}
