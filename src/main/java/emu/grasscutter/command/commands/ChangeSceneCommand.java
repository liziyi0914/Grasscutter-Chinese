package emu.grasscutter.command.commands;

import emu.grasscutter.command.Command;
import emu.grasscutter.command.CommandHandler;
import emu.grasscutter.game.GenshinPlayer;

import java.util.List;

@Command(label = "changescene", usage = "changescene <场景id>",
        description = "更改你的场景", aliases = {"scene"}, permission = "player.changescene")
public final class ChangeSceneCommand implements CommandHandler {
    @Override
    public void execute(GenshinPlayer sender, List<String> args) {
        if (sender == null) {
            CommandHandler.sendMessage(null, "在游戏中运行此命令");
            return;
        }

        if (args.size() < 1) {
            CommandHandler.sendMessage(sender, "用法: changescene <场景id>");
            return;
        }

        try {
            int sceneId = Integer.parseInt(args.get(0));
            
            if (sceneId == sender.getSceneId()) {
            	CommandHandler.sendMessage(sender, "你已经在那个场景中了");
            	return;
            }
            
            boolean result = sender.getWorld().transferPlayerToScene(sender, sceneId, sender.getPos());
            CommandHandler.sendMessage(sender, "更改场景为" + sceneId);
            
            if (!result) {
                CommandHandler.sendMessage(sender, "场景不存在");
            }
        } catch (Exception e) {
            CommandHandler.sendMessage(sender, "用法: changescene <场景id>");
        }
    }
}
