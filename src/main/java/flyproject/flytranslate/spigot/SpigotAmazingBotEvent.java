package flyproject.flytranslate.spigot;

import flyproject.flytranslate.GoogleTranslateAPI;
import flyproject.flytranslate.LanguageAPI;
import flyproject.flytranslate.bukkit.HoverAPI;
import me.albert.amazingbot.bot.Bot;
import me.albert.amazingbot.events.GroupMessageEvent;
import me.albert.amazingbot.events.PrivateMessageEvent;
import me.dreamvoid.miraimc.api.MiraiBot;
import me.dreamvoid.miraimc.api.MiraiMC;
import me.dreamvoid.miraimc.bukkit.event.MiraiFriendMessageEvent;
import me.dreamvoid.miraimc.bukkit.event.MiraiGroupMessageEvent;
import net.md_5.bungee.api.chat.ClickEvent;
import org.bukkit.Bukkit;
import org.bukkit.OfflinePlayer;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;

import java.util.UUID;

public class SpigotAmazingBotEvent implements Listener {
    @EventHandler
    public void AmazingBotPrivateSend(PrivateMessageEvent event){
        String msg = event.getMsg();
        GoogleTranslateAPI translateAPI = new GoogleTranslateAPI();
        try {
            if (msg.startsWith("发送翻译 ")){
                msg = msg.replace("发送翻译 ","");
                UUID uuid = Bot.getApi().getPlayer(event.getUserID());
                if (uuid==null){
                    event.response("您尚未绑定游戏账号 请绑定后再使用");
                    return;
                }
                OfflinePlayer op = Bukkit.getOfflinePlayer(uuid);
                if (!op.isOnline()){
                    event.response("您绑定的账号 " + op.getName() + " 并不在线 请先加入游戏");
                    return;
                }
                Player player = Bukkit.getPlayer(op.getName());
                for (String key : LanguageAPI.map.keySet()){
                    if (msg.startsWith(key)){
                        msg = msg.replace(key + " ", "");
                        String transword = translateAPI.translateText(msg, LanguageAPI.map.get(key));
                        event.response("请在游戏内点击提示发送信息");
                        player.spigot().sendMessage(HoverAPI.getClickHoverText("§7[§b翻译§7] §a点击发送信息: " + transword,"§7请确认是否是您的请求",
                                ClickEvent.Action.RUN_COMMAND,transword));
                        return;
                    }
                }
                event.response("格式错误或目标语言不存在");
            }
        } catch (Exception e) {
            event.response("未知错误 详细信息请查看控制台");
            e.printStackTrace();
        }
    }

    @EventHandler
    public void AmazingBotGroupSend(GroupMessageEvent event){
        String msg = event.getMsg();
        GoogleTranslateAPI translateAPI = new GoogleTranslateAPI();
        try {
            if (msg.startsWith("发送翻译 ")){
                msg = msg.replace("发送翻译 ","");
                UUID uuid = Bot.getApi().getPlayer(event.getUserID());
                if (uuid==null){
                    event.response("您尚未绑定游戏账号 请绑定后再使用");
                    return;
                }
                OfflinePlayer op = Bukkit.getOfflinePlayer(uuid);
                if (!op.isOnline()){
                    event.response("您绑定的账号 " + op.getName() + " 并不在线 请先加入游戏");
                    return;
                }
                Player player = Bukkit.getPlayer(op.getName());
                for (String key : LanguageAPI.map.keySet()){
                    if (msg.startsWith(key)){
                        msg = msg.replace(key + " ", "");
                        String transword = translateAPI.translateText(msg, LanguageAPI.map.get(key));
                        event.response("请在游戏内点击提示发送信息");
                        player.spigot().sendMessage(HoverAPI.getClickHoverText("§7[§b翻译§7] §a点击发送信息: " + transword,"§7请确认是否是您的请求",
                                ClickEvent.Action.RUN_COMMAND,transword));
                        return;
                    }
                }
                event.response("格式错误或目标语言不存在");
            }
        } catch (Exception e) {
            event.response("未知错误 详细信息请查看控制台");
            e.printStackTrace();
        }
    }


}
