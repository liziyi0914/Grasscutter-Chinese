package emu.grasscutter.command.commands;

import emu.grasscutter.command.Command;
import emu.grasscutter.command.CommandHandler;
import emu.grasscutter.database.DatabaseHelper;
import emu.grasscutter.game.GenshinPlayer;

import java.util.List;

@Command(label = "account", usage = "account <create|delete> <用户名> [uid]",
        description = "修改用户帐户")
public final class AccountCommand implements CommandHandler {

    @Override
    public void execute(GenshinPlayer sender, List<String> args) {
        if (sender != null) {
            CommandHandler.sendMessage(sender, "这个命令只能在控制台执行");
            return;
        }

        if (args.size() < 2) {
            CommandHandler.sendMessage(null, "用法: account <create|delete> <用户名> [uid]");
            return;
        }

        String action = args.get(0);
        String username = args.get(1);

        switch (action) {
            default:
                CommandHandler.sendMessage(null, "用法: account <create|delete> <用户名> [uid]");
                return;
            case "create":
                int uid = 0;
                if (args.size() > 2) {
                    try {
                        uid = Integer.parseInt(args.get(2));
                    } catch (NumberFormatException ignored) {
                        CommandHandler.sendMessage(null, "无效的UID");
                        return;
                    }
                }

                emu.grasscutter.game.Account account = DatabaseHelper.createAccountWithId(username, uid);
                if (account == null) {
                    CommandHandler.sendMessage(null, "帐户已存在");
                    return;
                } else {
                    CommandHandler.sendMessage(null, "账号创建成功UID为 " + account.getPlayerUid() + ".");
                    account.addPermission("*"); // Grant the player superuser permissions.
                    account.save(); // Save account to database.
                }
                return;
            case "delete":
                if (DatabaseHelper.deleteAccount(username)) {
                    CommandHandler.sendMessage(null, "帐户已删除");
                } else {
                    CommandHandler.sendMessage(null, "未找到帐户");
                }
        }
    }
}
