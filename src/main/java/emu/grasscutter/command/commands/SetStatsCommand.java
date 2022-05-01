package emu.grasscutter.command.commands;

import emu.grasscutter.command.Command;
import emu.grasscutter.command.CommandHandler;
import emu.grasscutter.game.GenshinPlayer;
import emu.grasscutter.game.entity.EntityAvatar;
import emu.grasscutter.game.props.FightProperty;
import emu.grasscutter.server.packet.send.PacketEntityFightPropUpdateNotify;

import java.util.List;

@Command(label = "setstats", usage = "setstats|stats <属性> < 数值 >",
        description = "直接修改当前角色的面板，可用的属性有 hp:生命值、def:防御力、atk:攻击、em:元素精通、er:元素充能、crate:暴击率、cdmg:暴击伤害、epyro:火伤、ecryo:冰伤、ehydro:水伤、egeo:岩伤、edend:草伤、eelec:雷伤、ephys:物伤，仅客户端可用", aliases = {"stats"}, permission = "player.setstats")
public final class SetStatsCommand implements CommandHandler {

    @Override
    public void execute(GenshinPlayer sender, List<String> args) {
        if (sender == null) {
            CommandHandler.sendMessage(null, "Run this command in-game.");
            return;
        }

        if (args.size() < 2){
            CommandHandler.sendMessage(sender, "用法: setstats|stats <属性> < 数值 >");
            return;
        }

        String stat = args.get(0);
        switch (stat) {
            default:
                CommandHandler.sendMessage(sender, "用法: /setstats|stats <hp | def | atk | em | er | crate | cdmg> <数值> 于基础数值");
                CommandHandler.sendMessage(sender, "用法: /stats <epyro | ecryo | ehydro | egeo | edend | eelec | ephys> <数值> 于元素伤害");
                return;
            case "hp":
                try {
                    int health = Integer.parseInt(args.get(1));
                    EntityAvatar entity = sender.getTeamManager().getCurrentAvatarEntity();
                    entity.setFightProperty(FightProperty.FIGHT_PROP_CUR_HP, health);
                    entity.getWorld().broadcastPacket(new PacketEntityFightPropUpdateNotify(entity, FightProperty.FIGHT_PROP_CUR_HP));
                    CommandHandler.sendMessage(sender, "HP设置为" + health + ".");
                } catch (NumberFormatException ignored) {
                    CommandHandler.sendMessage(sender, "无效的HP值");
                    return;
                }
                break;
            case "def":
                try {
                    int def = Integer.parseInt(args.get(1));
                    EntityAvatar entity = sender.getTeamManager().getCurrentAvatarEntity();
                    entity.setFightProperty(FightProperty.FIGHT_PROP_CUR_DEFENSE, def);
                    entity.getWorld().broadcastPacket(new PacketEntityFightPropUpdateNotify(entity, FightProperty.FIGHT_PROP_CUR_DEFENSE));
                    CommandHandler.sendMessage(sender, "防御设置为" + def + ".");
                } catch (NumberFormatException ignored) {
                    CommandHandler.sendMessage(sender, "无效的防御值");
                    return;
                }
                break;
            case "atk":
                try {
                    int atk = Integer.parseInt(args.get(1));
                    EntityAvatar entity = sender.getTeamManager().getCurrentAvatarEntity();
                    entity.setFightProperty(FightProperty.FIGHT_PROP_CUR_ATTACK, atk);
                    entity.getWorld().broadcastPacket(new PacketEntityFightPropUpdateNotify(entity, FightProperty.FIGHT_PROP_CUR_ATTACK));
                    CommandHandler.sendMessage(sender, "攻击设置为" + atk + ".");
                } catch (NumberFormatException ignored) {
                    CommandHandler.sendMessage(sender, "无效的攻击值");
                    return;
                }
                break;
            case "em":
                try {
                    int em = Integer.parseInt(args.get(1));
                    EntityAvatar entity = sender.getTeamManager().getCurrentAvatarEntity();
                    entity.setFightProperty(FightProperty.FIGHT_PROP_ELEMENT_MASTERY, em);
                    entity.getWorld().broadcastPacket(new PacketEntityFightPropUpdateNotify(entity, FightProperty.FIGHT_PROP_ELEMENT_MASTERY));
                    CommandHandler.sendMessage(sender, "元素精通设置为" + em + ".");
                } catch (NumberFormatException ignored) {
                    CommandHandler.sendMessage(sender, "无效的元素精通值");
                    return;
                }
                break;
            case "er":
                try {
                    float er = Integer.parseInt(args.get(1));
                    EntityAvatar entity = sender.getTeamManager().getCurrentAvatarEntity();
                    float erecharge = er / 10000;
                    entity.setFightProperty(FightProperty.FIGHT_PROP_CHARGE_EFFICIENCY, erecharge);
                    entity.getWorld().broadcastPacket(new PacketEntityFightPropUpdateNotify(entity, FightProperty.FIGHT_PROP_CHARGE_EFFICIENCY));
                    float iger = erecharge * 100;
                    CommandHandler.sendMessage(sender, "元素充能设置为" + iger + "%.");
                } catch (NumberFormatException ignored) {
                    CommandHandler.sendMessage(sender, "无效的元素充能值");
                    return;
                }
                break;
            case "crate":
                try {
                    float cr = Integer.parseInt(args.get(1));
                    EntityAvatar entity = sender.getTeamManager().getCurrentAvatarEntity();
                    float crate = cr / 10000;
                    entity.setFightProperty(FightProperty.FIGHT_PROP_CRITICAL, crate);
                    entity.getWorld().broadcastPacket(new PacketEntityFightPropUpdateNotify(entity, FightProperty.FIGHT_PROP_CRITICAL));
                    float igcrate = crate * 100;
                    CommandHandler.sendMessage(sender, "暴击率设置为" + igcrate + "%.");
                } catch (NumberFormatException ignored) {
                    CommandHandler.sendMessage(sender, "无效的暴击率值");
                    return;
                }
                break;
            case "cdmg":
                try {
                    float cdmg = Integer.parseInt(args.get(1));
                    EntityAvatar entity = sender.getTeamManager().getCurrentAvatarEntity();
                    float cdamage = cdmg / 10000;
                    entity.setFightProperty(FightProperty.FIGHT_PROP_CRITICAL_HURT, cdamage);
                    entity.getWorld().broadcastPacket(new PacketEntityFightPropUpdateNotify(entity, FightProperty.FIGHT_PROP_CRITICAL_HURT));
                    float igcdmg = cdamage * 100;
                    CommandHandler.sendMessage(sender, "暴击伤害设置为" + igcdmg + "%");
                } catch (NumberFormatException ignored) {
                    CommandHandler.sendMessage(sender, "无效的暴击伤害值");
                    return;
                }
                break;
            case "epyro":
                try {
                    float epyro = Integer.parseInt(args.get(1));
                    EntityAvatar entity = sender.getTeamManager().getCurrentAvatarEntity();
                    float pyro = epyro / 10000;
                    entity.setFightProperty(FightProperty.FIGHT_PROP_FIRE_ADD_HURT, pyro);
                    entity.getWorld().broadcastPacket(new PacketEntityFightPropUpdateNotify(entity, FightProperty.FIGHT_PROP_FIRE_ADD_HURT));
                    float igpyro = pyro * 100;
                    CommandHandler.sendMessage(sender, "火伤设置为" + igpyro + "%");
                } catch (NumberFormatException ignored) {
                    CommandHandler.sendMessage(sender, "无效的火伤值");
                    return;
                }
                break;
            case "ecryo":
                try {
                    float ecryo = Integer.parseInt(args.get(1));
                    EntityAvatar entity = sender.getTeamManager().getCurrentAvatarEntity();
                    float cryo = ecryo / 10000;
                    entity.setFightProperty(FightProperty.FIGHT_PROP_ICE_ADD_HURT, cryo);
                    entity.getWorld().broadcastPacket(new PacketEntityFightPropUpdateNotify(entity, FightProperty.FIGHT_PROP_ICE_ADD_HURT));
                    float igcyro = cryo * 100;
                    CommandHandler.sendMessage(sender, "冰伤设置为" + igcyro + "%");
                } catch (NumberFormatException ignored) {
                    CommandHandler.sendMessage(sender, "无效的冰伤值");
                    return;
                }
                break;
            case "ehydro":
                try {
                    float ehydro = Integer.parseInt(args.get(1));
                    EntityAvatar entity = sender.getTeamManager().getCurrentAvatarEntity();
                    float hydro = ehydro / 10000;
                    entity.setFightProperty(FightProperty.FIGHT_PROP_WATER_ADD_HURT, hydro);
                    entity.getWorld().broadcastPacket(new PacketEntityFightPropUpdateNotify(entity, FightProperty.FIGHT_PROP_WATER_ADD_HURT));
                    float ighydro = hydro * 100;
                    CommandHandler.sendMessage(sender, "水伤设置为" + ighydro + "%");
                } catch (NumberFormatException ignored) {
                    CommandHandler.sendMessage(sender, "无效的水伤值");
                    return;
                }
                break;
            case "eanemo":
                try {
                    float eanemo = Integer.parseInt(args.get(1));
                    EntityAvatar entity = sender.getTeamManager().getCurrentAvatarEntity();
                    float anemo = eanemo / 10000;
                    entity.setFightProperty(FightProperty.FIGHT_PROP_WIND_ADD_HURT, anemo);
                    entity.getWorld().broadcastPacket(new PacketEntityFightPropUpdateNotify(entity, FightProperty.FIGHT_PROP_WIND_ADD_HURT));
                    float iganemo = anemo * 100;
                    CommandHandler.sendMessage(sender, "岩伤设置为" + iganemo + "%");
                } catch (NumberFormatException ignored) {
                    CommandHandler.sendMessage(sender, "无效的岩伤值");
                    return;
                }
                break;
            case "egeo":
                try {
                    float egeo = Integer.parseInt(args.get(1));
                    EntityAvatar entity = sender.getTeamManager().getCurrentAvatarEntity();
                    float geo = egeo / 10000;
                    entity.setFightProperty(FightProperty.FIGHT_PROP_ROCK_ADD_HURT, geo);
                    entity.getWorld().broadcastPacket(new PacketEntityFightPropUpdateNotify(entity, FightProperty.FIGHT_PROP_ROCK_ADD_HURT));
                    float iggeo = geo * 100;
                    CommandHandler.sendMessage(sender, "岩伤设置为" + iggeo + "%");
                } catch (NumberFormatException ignored) {
                    CommandHandler.sendMessage(sender, "无效的岩伤值");
                    return;
                }
                break;
            case "ethunder":
            case "eelec":
                try {
                    float eelec = Integer.parseInt(args.get(1));
                    EntityAvatar entity = sender.getTeamManager().getCurrentAvatarEntity();
                    float elec = eelec / 10000;
                    entity.setFightProperty(FightProperty.FIGHT_PROP_CRITICAL_HURT, elec);
                    entity.getWorld().broadcastPacket(new PacketEntityFightPropUpdateNotify(entity, FightProperty.FIGHT_PROP_CRITICAL_HURT));
                    float igelec = elec * 100;
                    CommandHandler.sendMessage(sender, "雷伤设置为" + igelec + "%");
                } catch (NumberFormatException ignored) {
                    CommandHandler.sendMessage(sender, "无效的雷伤值");
                    return;
                }
                break;
            case "ephys":
                try {
                    float ephys = Integer.parseInt(args.get(1));
                    EntityAvatar entity = sender.getTeamManager().getCurrentAvatarEntity();
                    float phys = ephys / 10000;
                    entity.setFightProperty(FightProperty.FIGHT_PROP_PHYSICAL_ADD_HURT, phys);
                    entity.getWorld().broadcastPacket(new PacketEntityFightPropUpdateNotify(entity, FightProperty.FIGHT_PROP_PHYSICAL_ADD_HURT));
                    float igphys = phys * 100;
                    CommandHandler.sendMessage(sender, "物伤设置为" + igphys + "%");
                } catch (NumberFormatException ignored) {
                    CommandHandler.sendMessage(sender, "无效的物伤值");
                    return;
                }
                break;
            case "edend":
                try {
                    float edend = Integer.parseInt(args.get(1));
                    EntityAvatar entity = sender.getTeamManager().getCurrentAvatarEntity();
                    float dend = edend / 10000;
                    entity.setFightProperty(FightProperty.FIGHT_PROP_GRASS_ADD_HURT, dend);
                    entity.getWorld().broadcastPacket(new PacketEntityFightPropUpdateNotify(entity, FightProperty.FIGHT_PROP_GRASS_ADD_HURT));
                    float igdend = dend * 100;
                    CommandHandler.sendMessage(sender, "草伤设置为" + igdend + "%");
                } catch (NumberFormatException ignored) {
                    CommandHandler.sendMessage(sender, "无效的草伤值");
                    return;
                }
                break;
        }
    }
}
