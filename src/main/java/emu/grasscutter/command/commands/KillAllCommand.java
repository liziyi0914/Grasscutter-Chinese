package emu.grasscutter.command.commands;

import emu.grasscutter.Grasscutter;
import emu.grasscutter.command.Command;
import emu.grasscutter.command.CommandHandler;
import emu.grasscutter.game.GenshinPlayer;
import emu.grasscutter.game.GenshinScene;
import emu.grasscutter.game.entity.EntityMonster;

import java.util.List;

@Command(label = "killall", usage = "killall [uid] [场景 ID]",
        description = "杀死指定玩家世界中所在或指定场景的全部生物", permission = "server.killall")
public final class KillAllCommand implements CommandHandler {

    @Override
    public void execute(GenshinPlayer sender, List<String> args) {
        GenshinScene scene;
        GenshinPlayer genshinPlayer;

        try {
            switch (args.size()) {
                case 0: // *No args*
                    if (sender == null) {
                        CommandHandler.sendMessage(null, "用法: killall [uid] [场景 ID]");
                        return;
                    }
                    scene = sender.getScene();
                    break;
                case 1: // [playerUid]
                    genshinPlayer = Grasscutter.getGameServer().getPlayerByUid(Integer.parseInt(args.get(0)));
                    if (genshinPlayer == null) {
                        CommandHandler.sendMessage(sender, "玩家未找到或不在线");
                        return;
                    }
                    scene = genshinPlayer.getScene();
                    break;
                case 2: // [playerUid] [sceneId]
                    genshinPlayer = Grasscutter.getGameServer().getPlayerByUid(Integer.parseInt(args.get(0)));
                    if (genshinPlayer == null) {
                        CommandHandler.sendMessage(sender, "玩家未找到或不在线");
                        return;
                    }
                    GenshinScene genshinScene = sender.getWorld().getSceneById(Integer.parseInt(args.get(1)));
                    if (genshinScene == null) {
                        CommandHandler.sendMessage(sender, "在玩家的世界中找不到场景");
                        return;
                    }
                    scene = genshinScene;
                    break;
                default:
                    CommandHandler.sendMessage(sender, "用法: killall [uid] [场景 ID]");
                    return;
            }

            scene.getEntities().values().stream()
                    .filter(entity -> entity instanceof EntityMonster)
                    .forEach(entity -> scene.killEntity(entity, 0));
            CommandHandler.sendMessage(sender, "杀死场景" + scene.getId() + "中的所有怪物");
        } catch (NumberFormatException ignored) {
            CommandHandler.sendMessage(sender, "无效的参数");
        }
    }
}
