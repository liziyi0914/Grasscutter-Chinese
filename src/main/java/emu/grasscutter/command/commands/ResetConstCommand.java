package emu.grasscutter.command.commands;

import emu.grasscutter.command.Command;
import emu.grasscutter.command.CommandHandler;
import emu.grasscutter.game.GenshinPlayer;
import emu.grasscutter.game.avatar.GenshinAvatar;
import emu.grasscutter.game.entity.EntityAvatar;

import java.util.List;

@Command(label = "resetconst", usage = "resetconst [all]",
        description = "重置当前角色的命座，重新登录即可生效，仅客户端可用",
        aliases = {"resetconstellation"}, permission = "player.resetconstellation")
public final class ResetConstCommand implements CommandHandler {

    @Override
    public void execute(GenshinPlayer sender, List<String> args) {
        if (sender == null) {
            CommandHandler.sendMessage(null, "在游戏中运行这个命令");
            return;
        }

        if (args.size() > 0 && args.get(0).equalsIgnoreCase("all")) {
            sender.getAvatars().forEach(this::resetConstellation);
            sender.dropMessage("重置所有角色的命之座");
        } else {
            EntityAvatar entity = sender.getTeamManager().getCurrentAvatarEntity();
            if (entity == null) {
                return;
            }

            GenshinAvatar avatar = entity.getAvatar();
            this.resetConstellation(avatar);

            sender.dropMessage(avatar.getAvatarData().getName() + "的命之座已被重置。请重新登录以查看更改");
        }
    }

    private void resetConstellation(GenshinAvatar avatar) {
        avatar.getTalentIdList().clear();
        avatar.setCoreProudSkillLevel(0);
        avatar.recalcStats();
        avatar.save();
    }
}