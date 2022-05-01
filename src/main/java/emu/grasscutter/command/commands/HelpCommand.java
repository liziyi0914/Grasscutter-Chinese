package emu.grasscutter.command.commands;

import emu.grasscutter.command.Command;
import emu.grasscutter.command.CommandHandler;
import emu.grasscutter.command.CommandMap;
import emu.grasscutter.game.GenshinPlayer;

import java.util.*;

@Command(label = "help", usage = "help [命令]",
        description = "显示帮助或展示指定命令的帮助")
public final class HelpCommand implements CommandHandler {

    @Override
    public void execute(GenshinPlayer player, List<String> args) {
        if (args.size() < 1) {
            HashMap<String, CommandHandler> handlers = CommandMap.getInstance().getHandlers();
            List<Command> annotations = new ArrayList<>();
            for (String key : handlers.keySet()) {
                Command annotation = handlers.get(key).getClass().getAnnotation(Command.class);

                if (!Arrays.asList(annotation.aliases()).contains(key)) {
                    if (player != null && !Objects.equals(annotation.permission(), "") && !player.getAccount().hasPermission(annotation.permission()))
                        continue;
                    annotations.add(annotation);
                }
            }

            SendAllHelpMessage(player, annotations);
        } else {
            String command = args.get(0);
            CommandHandler handler = CommandMap.getInstance().getHandler(command);
            StringBuilder builder = new StringBuilder(player == null ? "\nHelp - " : "Help - ").append(command).append(": \n");
            if (handler == null) {
                builder.append("命令未找到");
            } else {
                Command annotation = handler.getClass().getAnnotation(Command.class);

                builder.append("   ").append(annotation.description()).append("\n");
                builder.append("   用法: ").append(annotation.usage());
                if (annotation.aliases().length >= 1) {
                    builder.append("\n").append("   别名: ");
                    for (String alias : annotation.aliases()) {
                        builder.append(alias).append(" ");
                    }
                }
                if (player != null && !Objects.equals(annotation.permission(), "") && !player.getAccount().hasPermission(annotation.permission())) {
                    builder.append("\n 警告：你没有权限执行这个命令");
                }
            }

            CommandHandler.sendMessage(player, builder.toString());
        }
    }

    void SendAllHelpMessage(GenshinPlayer player, List<Command> annotations) {
        if (player == null) {
            StringBuilder builder = new StringBuilder("\n可用命令:\n");
            annotations.forEach(annotation -> {
                builder.append(annotation.label()).append("\n");
                builder.append("   ").append(annotation.description()).append("\n");
                builder.append("   用法: ").append(annotation.usage());
                if (annotation.aliases().length >= 1) {
                    builder.append("\n").append("   别名: ");
                    for (String alias : annotation.aliases()) {
                        builder.append(alias).append(" ");
                    }
                }

                builder.append("\n");
            });

            CommandHandler.sendMessage(null, builder.toString());
        } else {
            CommandHandler.sendMessage(player, "可用命令:");
            annotations.forEach(annotation -> {
                StringBuilder builder = new StringBuilder(annotation.label()).append("\n");
                builder.append("   ").append(annotation.description()).append("\n");
                builder.append("   用法: ").append(annotation.usage());
                if (annotation.aliases().length >= 1) {
                    builder.append("\n").append("   别名: ");
                    for (String alias : annotation.aliases()) {
                        builder.append(alias).append(" ");
                    }
                }

                CommandHandler.sendMessage(player, builder.toString());
            });
        }
    }
}
