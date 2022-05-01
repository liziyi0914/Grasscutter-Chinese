package emu.grasscutter.command.commands;

import emu.grasscutter.command.Command;
import emu.grasscutter.command.CommandHandler;
import emu.grasscutter.game.GenshinPlayer;

import java.util.List;

@Command(label = "position", usage = "position", aliases = {"pos"},
        description = "获取当前坐标，仅客户端可用")
public final class PositionCommand implements CommandHandler {

    @Override
    public void execute(GenshinPlayer sender, List<String> args) {
        if (sender == null) {
            CommandHandler.sendMessage(null, "在游戏中运行这个命令");
            return;
        }

        sender.dropMessage(String.format("坐标: %.3f, %.3f, %.3f", sender.getPos().getX(), sender.getPos().getY(), sender.getPos().getZ()));
    }
}
