package emu.grasscutter.command.commands;

import emu.grasscutter.Grasscutter;
import emu.grasscutter.command.Command;
import emu.grasscutter.command.CommandHandler;
import emu.grasscutter.game.Account;
import emu.grasscutter.game.GenshinPlayer;

import java.util.List;

@Command(label = "permission", usage = "permission <add|remove> < 用户名 > < 权限节点 (* 为所有)>",
        description = "添加或移除玩家的权限", permission = "*")
public final class PermissionCommand implements CommandHandler {

    @Override
    public void execute(GenshinPlayer sender, List<String> args) {
        if (args.size() < 3) {
            CommandHandler.sendMessage(sender, "用法: permission <add|remove> < 用户名 > < 权限节点 (* 为所有)>");
            return;
        }

        String action = args.get(0);
        String username = args.get(1);
        String permission = args.get(2);

        Account account = Grasscutter.getGameServer().getAccountByName(username);
        if (account == null) {
            CommandHandler.sendMessage(sender, "账号未找到");
            return;
        }

        switch (action) {
            default:
                CommandHandler.sendMessage(sender, "用法: permission <add|remove> < 用户名 > < 权限节点 (* 为所有)>");
                break;
            case "add":
                if (account.addPermission(permission)) {
                    CommandHandler.sendMessage(sender, "权限已添加");
                } else CommandHandler.sendMessage(sender, "该玩家已拥有该权限");
                break;
            case "remove":
                if (account.removePermission(permission)) {
                    CommandHandler.sendMessage(sender, "权限已删除");
                } else CommandHandler.sendMessage(sender, "改玩家未拥有该权限");
                break;
        }

        account.save();
    }
}