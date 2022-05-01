package emu.grasscutter.command.commands;

import emu.grasscutter.Grasscutter;
import emu.grasscutter.command.Command;
import emu.grasscutter.command.CommandHandler;
import emu.grasscutter.game.GenshinPlayer;

import java.util.List;

@Command(label = "broadcast", usage = "broadcast <信息>",
        description = "发送一个信息给全部玩家", aliases = {"b"}, permission = "server.broadcast")
public final class BroadcastCommand implements CommandHandler {

    @Override
    public void execute(GenshinPlayer sender, List<String> args) {
        if (args.size() < 1) {
            CommandHandler.sendMessage(sender, "用法: broadcast <信息>");
            return;
        }

        String message = String.join(" ", args.subList(0, args.size()));

        for (GenshinPlayer p : Grasscutter.getGameServer().getPlayers().values()) {
            CommandHandler.sendMessage(p, message);
        }

        CommandHandler.sendMessage(sender, "信息已发送");
    }
}
