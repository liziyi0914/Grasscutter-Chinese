package emu.grasscutter.command.commands;

import emu.grasscutter.command.Command;
import emu.grasscutter.command.CommandHandler;
import emu.grasscutter.data.GenshinData;
import emu.grasscutter.data.def.MonsterData;
import emu.grasscutter.game.GenshinPlayer;
import emu.grasscutter.game.entity.EntityMonster;
import emu.grasscutter.utils.Position;

import java.util.List;

@Command(label = "spawn", usage = "spawn <实体 ID | 实体名称> [等级] [数量]",
        description = "在你周围生成实体", permission = "server.spawn")
public final class SpawnCommand implements CommandHandler {

    @Override
    public void execute(GenshinPlayer sender, List<String> args) {
        if (sender == null) {
            CommandHandler.sendMessage(null, "在游戏中运行此命令");
            return;
        }

        if (args.size() < 1) {
            CommandHandler.sendMessage(sender, "用法: spawn <实体 ID | 实体名称> [等级] [数量]");
            return;
        }

        try {
            int entity = Integer.parseInt(args.get(0));
            int level = args.size() > 1 ? Integer.parseInt(args.get(1)) : 1;
            int amount = args.size() > 2 ? Integer.parseInt(args.get(2)) : 1;

            MonsterData entityData = GenshinData.getMonsterDataMap().get(entity);
            if (entityData == null) {
                CommandHandler.sendMessage(sender, "无效的实体id");
                return;
            }

            float range = (5f + (.1f * amount));
            for (int i = 0; i < amount; i++) {
                Position pos = sender.getPos().clone().addX((float) (Math.random() * range) - (range / 2)).addY(3f).addZ((float) (Math.random() * range) - (range / 2));
                EntityMonster monster = new EntityMonster(sender.getScene(), entityData, pos, level);
                sender.getScene().addEntity(monster);
            }
            CommandHandler.sendMessage(sender, String.format("生成了%s1只%s.", amount, entity));
        } catch (NumberFormatException ignored) {
            CommandHandler.sendMessage(sender, "无效的物品id或玩家id");
        }
    }
}
