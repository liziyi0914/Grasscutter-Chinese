package emu.grasscutter.command.commands;

import emu.grasscutter.command.Command;
import emu.grasscutter.command.CommandHandler;
import emu.grasscutter.game.GenshinPlayer;
import emu.grasscutter.game.props.ClimateType;
import emu.grasscutter.server.packet.send.PacketSceneAreaWeatherNotify;

import java.util.List;

@Command(label = "weather", usage = "weather <天气 ID> < 气候 ID>",
        description = "改变天气，仅客户端可用", aliases = {"w"}, permission = "player.weather")
public final class WeatherCommand implements CommandHandler {

    @Override
    public void execute(GenshinPlayer sender, List<String> args) {
        if (sender == null) {
            CommandHandler.sendMessage(null, "在游戏中运行此命令");
            return;
        }

        if (args.size() < 1) {
            CommandHandler.sendMessage(sender, "用法: weather <天气 ID> < 气候 ID>");
            return;
        }

        try {
            int weatherId = Integer.parseInt(args.get(0));
            int climateId = args.size() > 1 ? Integer.parseInt(args.get(1)) : 1;

            ClimateType climate = ClimateType.getTypeByValue(climateId);

            sender.getScene().setWeather(weatherId);
            sender.getScene().setClimate(climate);
            sender.getScene().broadcastPacket(new PacketSceneAreaWeatherNotify(sender));
            CommandHandler.sendMessage(sender, "更改天气" + weatherId + "于气候" + climateId);
        } catch (NumberFormatException ignored) {
            CommandHandler.sendMessage(sender, "无效的id");
        }
    }
}
