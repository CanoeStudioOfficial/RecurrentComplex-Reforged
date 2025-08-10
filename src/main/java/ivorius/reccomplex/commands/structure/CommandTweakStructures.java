/*
 *  Copyright (c) 2014, Lukas Tenbrink.
 *  * http://ivorius.net
 */

package ivorius.reccomplex.commands.structure;

import ivorius.mcopts.commands.CommandExpecting;
import ivorius.mcopts.commands.parameters.expect.Expect;
import ivorius.reccomplex.network.PacketSpawnTweaksHandler;
import net.minecraft.command.CommandException;
import net.minecraft.command.ICommandSender;
import net.minecraft.server.MinecraftServer;

/**
 * Created by lukas on 25.05.14.
 */
public class CommandTweakStructures extends CommandExpecting
{
    @Override
    public String getName()
    {
        return "tweak";
    }

    public int getRequiredPermissionLevel()
    {
        return 2;
    }

    @Override
    public void expect(Expect expect)
    {
    }

    @Override
    public void execute(MinecraftServer server, ICommandSender commandSender, String[] args) throws CommandException
    {
        PacketSpawnTweaksHandler.openGUI(getCommandSenderAsPlayer(commandSender));
    }
}
