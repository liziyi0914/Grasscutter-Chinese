package emu.grasscutter.command.commands;

import emu.grasscutter.Grasscutter;
import emu.grasscutter.command.Command;
import emu.grasscutter.command.CommandHandler;
import emu.grasscutter.data.GenshinData;
import emu.grasscutter.data.def.ItemData;
import emu.grasscutter.game.GenshinPlayer;
import emu.grasscutter.game.inventory.GenshinItem;
import emu.grasscutter.game.props.ActionReason;
import emu.grasscutter.server.packet.send.PacketItemAddHintNotify;

import java.util.LinkedList;
import java.util.List;

@Command(label = "give", usage = "give [uid] < 物品 ID | 物品名称 > [数量] [等级]",
        description = "给予指定玩家一定数量及等级的物品", aliases = {"g", "item", "giveitem"}, permission = "player.give")
public final class GiveCommand implements CommandHandler {

    @Override
    public void execute(GenshinPlayer sender, List<String> args) {
        int target, item, amount = 1;

        if (sender == null && args.size() < 2) {
            CommandHandler.sendMessage(null, "用法: give [uid] < 物品 ID | 物品名称 > [数量] [等级]");
            return;
        }

        switch (args.size()) {
            default: // *No args*
                CommandHandler.sendMessage(sender, "用法: give [uid] < 物品 ID | 物品名称 > [数量] [等级]");
                return;
            case 1: // <itemId|itemName>
                try {
                    item = Integer.parseInt(args.get(0));
                    target = sender.getUid();
                } catch (NumberFormatException ignored) {
                    // TODO: Parse from item name using GM Handbook.
                    CommandHandler.sendMessage(sender, "无效的物品id");
                    return;
                }
                break;
            case 2: // <itemId|itemName> [amount] | [player] <itemId|itemName>
                try {
                    target = Integer.parseInt(args.get(0));

                    if (Grasscutter.getGameServer().getPlayerByUid(target) == null && sender != null) {
                        target = sender.getUid();
                        item = Integer.parseInt(args.get(0));
                        amount = Integer.parseInt(args.get(1));
                    } else {
                        item = Integer.parseInt(args.get(1));
                    }
                } catch (NumberFormatException ignored) {
                    // TODO: Parse from item name using GM Handbook.
                    CommandHandler.sendMessage(sender, "无效的物品id或玩家id");
                    return;
                }
                break;
            case 3: // [player] <itemId|itemName> [amount]
                try {
                    target = Integer.parseInt(args.get(0));

                    if (Grasscutter.getGameServer().getPlayerByUid(target) == null) {
                        CommandHandler.sendMessage(sender, "无效的玩家id");
                        return;
                    }

                    item = Integer.parseInt(args.get(1));
                    amount = Integer.parseInt(args.get(2));
                } catch (NumberFormatException ignored) {
                    // TODO: Parse from item name using GM Handbook.
                    CommandHandler.sendMessage(sender, "无效的物品id或玩家id");
                    return;
                }
                break;
        }

        GenshinPlayer targetPlayer = Grasscutter.getGameServer().getPlayerByUid(target);

        if (targetPlayer == null) {
            CommandHandler.sendMessage(sender, "玩家未找到");
            return;
        }

        ItemData itemData = GenshinData.getItemDataMap().get(item);
        if (itemData == null) {
            CommandHandler.sendMessage(sender, "无效的物品id");
            return;
        }

        this.item(targetPlayer, itemData, amount);

        CommandHandler.sendMessage(sender, String.format("已将%s个%s给予%s", amount, item, target));
    }

    private void item(GenshinPlayer player, ItemData itemData, int amount) {
        if (itemData.isEquip()) {
            List<GenshinItem> items = new LinkedList<>();
            for (int i = 0; i < amount; i++) {
                items.add(new GenshinItem(itemData));
            }
            player.getInventory().addItems(items);
            player.sendPacket(new PacketItemAddHintNotify(items, ActionReason.SubfieldDrop));
        } else {
            GenshinItem genshinItem = new GenshinItem(itemData);
            genshinItem.setCount(amount);
            player.getInventory().addItem(genshinItem);
            player.sendPacket(new PacketItemAddHintNotify(genshinItem, ActionReason.SubfieldDrop));
        }
    }
}

