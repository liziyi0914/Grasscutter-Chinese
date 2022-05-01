package emu.grasscutter.command.commands;

import emu.grasscutter.Grasscutter;
import emu.grasscutter.command.Command;
import emu.grasscutter.command.CommandHandler;
import emu.grasscutter.data.GenshinData;
import emu.grasscutter.data.def.AvatarData;
import emu.grasscutter.game.GenshinPlayer;
import emu.grasscutter.game.avatar.GenshinAvatar;

import java.util.List;

@Command(label = "givechar", usage = "givechar <玩家Id> <人物Id> [等级]",
        description = "给予玩家一个指定的角色", aliases = {"givec"}, permission = "player.givechar")
public final class GiveCharCommand implements CommandHandler {

    @Override
    public void execute(GenshinPlayer sender, List<String> args) {
        int target, avatarId, level = 1, ascension;

        if (sender == null && args.size() < 2) {
            CommandHandler.sendMessage(null, "用法: givechar <玩家Id> <人物Id> [等级]");
            return;
        }

        switch (args.size()) {
            default:
                CommandHandler.sendMessage(sender, "用法: givechar <玩家Id> <人物Id> [等级]");
                return;
            case 2:
                try {
                    target = Integer.parseInt(args.get(0));
                    if (Grasscutter.getGameServer().getPlayerByUid(target) == null && sender != null) {
                        target = sender.getUid();
                        level = Integer.parseInt(args.get(1));
                        avatarId = Integer.parseInt(args.get(0));
                    } else {
                        avatarId = Integer.parseInt(args.get(1));
                    }
                } catch (NumberFormatException ignored) {
                    // TODO: Parse from avatar name using GM Handbook.
                    CommandHandler.sendMessage(sender, "无效的角色id或玩家id");
                    return;
                }
                break;
            case 3:
                try {
                    target = Integer.parseInt(args.get(0));
                    if (Grasscutter.getGameServer().getPlayerByUid(target) == null) {
                        CommandHandler.sendMessage(sender, "无效的玩家id");
                        return;
                    }

                    avatarId = Integer.parseInt(args.get(1));
                    level = Integer.parseInt(args.get(2));
                } catch (NumberFormatException ignored) {
                    // TODO: Parse from avatar name using GM Handbook.
                    CommandHandler.sendMessage(sender, "无效的角色id或玩家id");
                    return;
                }
                break;
        }

        GenshinPlayer targetPlayer = Grasscutter.getGameServer().getPlayerByUid(target);
        if (targetPlayer == null) {
            CommandHandler.sendMessage(sender, "玩家未找到");
            return;
        }

        AvatarData avatarData = GenshinData.getAvatarDataMap().get(avatarId);
        if (avatarData == null) {
            CommandHandler.sendMessage(sender, "无效的角色id");
            return;
        }

        // Calculate ascension level.
        if (level <= 40) {
            ascension = (int) Math.ceil(level / 20f);
        } else {
            ascension = (int) Math.ceil(level / 10f) - 3;
        }

        GenshinAvatar avatar = new GenshinAvatar(avatarId);
        avatar.setLevel(level);
        avatar.setPromoteLevel(ascension);

        // This will handle stats and talents
        avatar.recalcStats();

        targetPlayer.addAvatar(avatar);
        CommandHandler.sendMessage(sender, String.format("已将%s给予%s.", avatarId, target));
    }
}
