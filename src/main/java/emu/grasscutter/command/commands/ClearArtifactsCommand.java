package emu.grasscutter.command.commands;

import emu.grasscutter.command.Command;
import emu.grasscutter.command.CommandHandler;
import emu.grasscutter.game.GenshinPlayer;
import emu.grasscutter.game.inventory.Inventory;
import emu.grasscutter.game.inventory.ItemType;

import java.util.List;

@Command(label = "clearartifacts", usage = "clearartifacts",
        description = "删除所有未装备及未解锁的圣遗物，包括五星，仅客户端可用",
        aliases = {"clearart"}, permission = "player.clearartifacts")
public final class ClearArtifactsCommand implements CommandHandler {

    @Override
    public void execute(GenshinPlayer sender, List<String> args) {
        if (sender == null) {
            CommandHandler.sendMessage(null, "在游戏中运行这个命令");
            return; // TODO: clear player's artifacts from console or other players
        }

        Inventory playerInventory = sender.getInventory();
        playerInventory.getItems().values().stream()
                .filter(item -> item.getItemType() == ItemType.ITEM_RELIQUARY)
                .filter(item -> item.getLevel() == 1 && item.getExp() == 0)
                .filter(item -> !item.isLocked() && !item.isEquipped())
                .forEach(item -> playerInventory.removeItem(item, item.getCount()));
    }
}
