package emu.grasscutter.command.commands;

import emu.grasscutter.Grasscutter;
import emu.grasscutter.command.Command;
import emu.grasscutter.command.CommandHandler;
import emu.grasscutter.game.GenshinPlayer;

import java.util.List;

@Command(label = "stop", usage = "stop",
        description = "停止服务器", permission = "server.stop")
public final class StopCommand implements CommandHandler {

    @Override
    public void execute(GenshinPlayer sender, List<String> args) {
        CommandHandler.sendMessage(null, "服务器正在关闭...");
        for (GenshinPlayer p : Grasscutter.getGameServer().getPlayers().values()) {
            CommandHandler.sendMessage(p, "服务器正在关闭...");
        }

        System.exit(1);
    }
}
