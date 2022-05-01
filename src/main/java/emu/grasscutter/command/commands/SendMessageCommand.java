package emu.grasscutter.command.commands;

import emu.grasscutter.Grasscutter;
import emu.grasscutter.command.Command;
import emu.grasscutter.command.CommandHandler;
import emu.grasscutter.game.GenshinPlayer;

import java.util.List;

@Command(label = "say", usage = "say <uid> < 消息 >", description = "作为服务器发送消息给玩家",
        aliases = {"sendservmsg", "sendservermessage", "sendmessage"}, permission = "server.sendmessage")
public final class SendMessageCommand implements CommandHandler {

    @Override
    public void execute(GenshinPlayer sender, List<String> args) {
        if (args.size() < 2) {
            CommandHandler.sendMessage(null, "用法: say <uid> < 消息 >");
            return;
        }

        try {
            int target = Integer.parseInt(args.get(0));
            String message = String.join(" ", args.subList(1, args.size()));

            GenshinPlayer targetPlayer = Grasscutter.getGameServer().getPlayerByUid(target);
            if (targetPlayer == null) {
                CommandHandler.sendMessage(sender, "玩家未找到");
                return;
            }

            CommandHandler.sendMessage(targetPlayer, message);
            CommandHandler.sendMessage(sender, "信息已发送");
        } catch (NumberFormatException ignored) {
            CommandHandler.sendMessage(sender, "无效的用户id");
        }
    }
}