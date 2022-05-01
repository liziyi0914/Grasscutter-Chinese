package emu.grasscutter.command.commands;

import emu.grasscutter.command.Command;
import emu.grasscutter.command.CommandHandler;
import emu.grasscutter.game.GenshinPlayer;
import emu.grasscutter.game.props.PlayerProperty;

import java.util.List;

@Command(label = "setworldlevel", usage = "setworldlevel <世界等级>",
        description = "设置世界等级 (重新登陆即可生效)，仅客户端可用",
        aliases = {"setworldlvl"}, permission = "player.setworldlevel")
public final class SetWorldLevelCommand implements CommandHandler {

    @Override
    public void execute(GenshinPlayer sender, List<String> args) {
        if (sender == null) {
            CommandHandler.sendMessage(null, "在游戏中运行此命令");
            return; // TODO: set player's world level from console or other players
        }

        if (args.size() < 1) {
            CommandHandler.sendMessage(sender, "用法: setworldlevel <世界等级>");
            return;
        }

        try {
            int level = Integer.parseInt(args.get(0));

            // Set in both world and player props
            sender.getWorld().setWorldLevel(level);
            sender.setProperty(PlayerProperty.PROP_PLAYER_WORLD_LEVEL, level);

            sender.dropMessage("世界等级为" + level + ".");
        } catch (NumberFormatException ignored) {
            CommandHandler.sendMessage(null, "无效的世界等级");
        }
    }
}
