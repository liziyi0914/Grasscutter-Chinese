package emu.grasscutter.command.commands;

import emu.grasscutter.Grasscutter;
import emu.grasscutter.command.Command;
import emu.grasscutter.command.CommandHandler;
import emu.grasscutter.game.GenshinPlayer;

import java.util.List;

@Command(label = "reload", usage = "reload",
        description = "重载服务器配置", permission = "server.reload")
public final class ReloadCommand implements CommandHandler {

    @Override
    public void execute(GenshinPlayer sender, List<String> args) {
        CommandHandler.sendMessage(sender, "正在重载配置");
        Grasscutter.loadConfig();
        Grasscutter.getGameServer().getGachaManager().load();
        Grasscutter.getDispatchServer().loadQueries();
        CommandHandler.sendMessage(sender, "重载完毕");
    }
}
