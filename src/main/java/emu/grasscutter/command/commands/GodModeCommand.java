package emu.grasscutter.command.commands;

import emu.grasscutter.command.Command;
import emu.grasscutter.command.CommandHandler;
import emu.grasscutter.game.GenshinPlayer;

import java.util.List;

@Command(label = "godmode", usage = "godmode [uid]",
        description = "保护你不受到任何伤害 (依然会被击退)，仅客户端可用", permission = "player.godmode")
public final class GodModeCommand implements CommandHandler {

    @Override
    public void execute(GenshinPlayer sender, List<String> args) {
        if (sender == null) {
            CommandHandler.sendMessage(null, "在游戏中运行这个命令");
            return; // TODO: toggle player's godmode statue from console or other players
        }
        sender.setGodmode(!sender.inGodmode());
        sender.dropMessage("上帝模式已" + (sender.inGodmode() ? "开启" : "关闭"));
    }
}
