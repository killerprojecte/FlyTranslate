package flyproject.flytranslate.amazingbot;

import flyproject.flytranslate.FlyTranslate;
import flyproject.flytranslate.GoogleTranslateAPI;
import flyproject.flytranslate.LanguageAPI;
import flyproject.flytranslate.bukkit.HoverAPI;
import me.albert.amazingbot.AmazingBot;
import me.albert.amazingbot.bot.Bot;
import me.albert.amazingbot.events.GroupMessageEvent;
import net.md_5.bungee.api.chat.ClickEvent;
import org.bukkit.Bukkit;
import org.bukkit.OfflinePlayer;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.plugin.Plugin;

import java.util.UUID;

public class Group implements Listener {
    @EventHandler
    public void onGroup(GroupMessageEvent event){
        String msg = event.getMsg();
        GoogleTranslateAPI translateAPI = new GoogleTranslateAPI();
        try {
            /*if (msg.startsWith("南非荷兰语 ")) {
                msg = msg.replace("南非荷兰语 ", "");
                String transword = translateAPI.translateText(msg, "af");
                event.response(transword);
            } else if (msg.startsWith("阿尔巴尼亚语 ")) {
                msg = msg.replace("阿尔巴尼亚语 ", "");
                String transword = translateAPI.translateText(msg, "sq");
                event.response(transword);
            } else if (msg.startsWith("阿姆哈拉语 ")) {
                msg = msg.replace("阿姆哈拉语 ", "");
                String transword = translateAPI.translateText(msg, "am");
                event.response(transword);
            } else if (msg.startsWith("阿拉伯语 ")) {
                msg = msg.replace("阿拉伯语 ", "");
                String transword = translateAPI.translateText(msg, "ar");
                event.response(transword);
            } else if (msg.startsWith("亚美尼亚语 ")) {
                msg = msg.replace("亚美尼亚语 ", "");
                String transword = translateAPI.translateText(msg, "hy");
                event.response(transword);
            } else if (msg.startsWith("阿塞拜疆语 ")) {
                msg = msg.replace("阿塞拜疆语 ", "");
                String transword = translateAPI.translateText(msg, "az");
                event.response(transword);
            } else if (msg.startsWith("巴斯克语 ")) {
                msg = msg.replace("巴斯克语 ", "");
                String transword = translateAPI.translateText(msg, "eu");
                event.response(transword);
            } else if (msg.startsWith("白俄罗斯语 ")) {
                msg = msg.replace("白俄罗斯语 ", "");
                String transword = translateAPI.translateText(msg, "be");
                event.response(transword);
            } else if (msg.startsWith("孟加拉语 ")) {
                msg = msg.replace("孟加拉语 ", "");
                String transword = translateAPI.translateText(msg, "bn");
                event.response(transword);
            } else if (msg.startsWith("波斯尼亚语 ")) {
                msg = msg.replace("波斯尼亚语 ", "");
                String transword = translateAPI.translateText(msg, "bs");
                event.response(transword);
            } else if (msg.startsWith("保加利亚语 ")) {
                msg = msg.replace("保加利亚语 ", "");
                String transword = translateAPI.translateText(msg, "bg");
                event.response(transword);
            } else if (msg.startsWith("加泰罗尼亚语 ")) {
                msg = msg.replace("加泰罗尼亚语 ", "");
                String transword = translateAPI.translateText(msg, "ca");
                event.response(transword);
            } else if (msg.startsWith("宿务语 ")) {
                msg = msg.replace("宿务语 ", "");
                String transword = translateAPI.translateText(msg, "ceb");
                event.response(transword);
            } else if (msg.startsWith("中文 ")) {
                msg = msg.replace("中文 ", "");
                String transword = translateAPI.translateText(msg, "zh-CN");
                event.response(transword);
            } else if (msg.startsWith("繁体 ")) {
                msg = msg.replace("繁体 ", "");
                String transword = translateAPI.translateText(msg, "zh-TW");
                event.response(transword);
            } else if (msg.startsWith("科西嘉语 ")) {
                msg = msg.replace("科西嘉语 ", "");
                String transword = translateAPI.translateText(msg, "co");
                event.response(transword);
            } else if (msg.startsWith("克罗地亚语 ")) {
                msg = msg.replace("克罗地亚语 ", "");
                String transword = translateAPI.translateText(msg, "hr");
                event.response(transword);
            } else if (msg.startsWith("捷克语 ")) {
                msg = msg.replace("捷克语 ", "");
                String transword = translateAPI.translateText(msg, "cs");
                event.response(transword);
            } else if (msg.startsWith("丹麦语 ")) {
                msg = msg.replace("丹麦语 ", "");
                String transword = translateAPI.translateText(msg, "da");
                event.response(transword);
            } else if (msg.startsWith("荷兰语 ")) {
                msg = msg.replace("荷兰语 ", "");
                String transword = translateAPI.translateText(msg, "nl");
                event.response(transword);
            } else if (msg.startsWith("英语 ")) {
                msg = msg.replace("英语 ", "");
                String transword = translateAPI.translateText(msg, "en");
                event.response(transword);
            } else if (msg.startsWith("世界语 ")) {
                msg = msg.replace("世界语 ", "");
                String transword = translateAPI.translateText(msg, "eo");
                event.response(transword);
            } else if (msg.startsWith("爱沙尼亚语 ")) {
                msg = msg.replace("爱沙尼亚语 ", "");
                String transword = translateAPI.translateText(msg, "et");
                event.response(transword);
            } else if (msg.startsWith("芬兰语 ")) {
                msg = msg.replace("芬兰语 ", "");
                String transword = translateAPI.translateText(msg, "fi");
                event.response(transword);
            } else if (msg.startsWith("法语 ")) {
                msg = msg.replace("法语 ", "");
                String transword = translateAPI.translateText(msg, "fr");
                event.response(transword);
            } else if (msg.startsWith("弗里斯兰语 ")) {
                msg = msg.replace("弗里斯兰语 ", "");
                String transword = translateAPI.translateText(msg, "fy");
                event.response(transword);
            } else if (msg.startsWith("加利西亚语 ")) {
                msg = msg.replace("加利西亚语 ", "");
                String transword = translateAPI.translateText(msg, "gl");
                event.response(transword);
            } else if (msg.startsWith("格鲁吉亚语 ")) {
                msg = msg.replace("格鲁吉亚语 ", "");
                String transword = translateAPI.translateText(msg, "ka");
                event.response(transword);
            } else if (msg.startsWith("德语 ")) {
                msg = msg.replace("德语 ", "");
                String transword = translateAPI.translateText(msg, "de");
                event.response(transword);
            } else if (msg.startsWith("希腊语 ")) {
                msg = msg.replace("希腊语 ", "");
                String transword = translateAPI.translateText(msg, "el");
                event.response(transword);
            } else if (msg.startsWith("古吉拉特语 ")) {
                msg = msg.replace("古吉拉特语 ", "");
                String transword = translateAPI.translateText(msg, "gu");
                event.response(transword);
            } else if (msg.startsWith("海地克里奥尔语 ")) {
                msg = msg.replace("海地克里奥尔语 ", "");
                String transword = translateAPI.translateText(msg, "ht");
                event.response(transword);
            } else if (msg.startsWith("豪萨语 ")) {
                msg = msg.replace("豪萨语 ", "");
                String transword = translateAPI.translateText(msg, "ha");
                event.response(transword);
            } else if (msg.startsWith("夏威夷语 ")) {
                msg = msg.replace("夏威夷语 ", "");
                String transword = translateAPI.translateText(msg, "haw");
                event.response(transword);
            } else if (msg.startsWith("希伯来语 ")) {
                msg = msg.replace("希伯来语 ", "");
                String transword = translateAPI.translateText(msg, "he");
                event.response(transword);
            } else if (msg.startsWith("印地语 ")) {
                msg = msg.replace("印地语 ", "");
                String transword = translateAPI.translateText(msg, "hi");
                event.response(transword);
            } else if (msg.startsWith("苗语 ")) {
                msg = msg.replace("苗语 ", "");
                String transword = translateAPI.translateText(msg, "hmn");
                event.response(transword);
            } else if (msg.startsWith("匈牙利语 ")) {
                msg = msg.replace("匈牙利语 ", "");
                String transword = translateAPI.translateText(msg, "hu");
                event.response(transword);
            } else if (msg.startsWith("冰岛语 ")) {
                msg = msg.replace("冰岛语 ", "");
                String transword = translateAPI.translateText(msg, "is");
                event.response(transword);
            } else if (msg.startsWith("伊博语 ")) {
                msg = msg.replace("伊博语 ", "");
                String transword = translateAPI.translateText(msg, "ig");
                event.response(transword);
            } else if (msg.startsWith("印度尼西亚语 ")) {
                msg = msg.replace("印度尼西亚语 ", "");
                String transword = translateAPI.translateText(msg, "id");
                event.response(transword);
            } else if (msg.startsWith("爱尔兰语 ")) {
                msg = msg.replace("爱尔兰语 ", "");
                String transword = translateAPI.translateText(msg, "ga");
                event.response(transword);
            } else if (msg.startsWith("意大利语 ")) {
                msg = msg.replace("意大利语 ", "");
                String transword = translateAPI.translateText(msg, "it");
                event.response(transword);
            } else if (msg.startsWith("日语 ")) {
                msg = msg.replace("日语 ", "");
                String transword = translateAPI.translateText(msg, "ja");
                event.response(transword);
            } else if (msg.startsWith("爪哇语 ")) {
                msg = msg.replace("爪哇语 ", "");
                String transword = translateAPI.translateText(msg, "jv");
                event.response(transword);
            } else if (msg.startsWith("卡纳达语 ")) {
                msg = msg.replace("卡纳达语 ", "");
                String transword = translateAPI.translateText(msg, "kn");
                event.response(transword);
            } else if (msg.startsWith("哈萨克语 ")) {
                msg = msg.replace("哈萨克语 ", "");
                String transword = translateAPI.translateText(msg, "kk");
                event.response(transword);
            } else if (msg.startsWith("高棉语 ")) {
                msg = msg.replace("高棉语 ", "");
                String transword = translateAPI.translateText(msg, "km");
                event.response(transword);
            } else if (msg.startsWith("卢旺达语 ")) {
                msg = msg.replace("卢旺达语 ", "");
                String transword = translateAPI.translateText(msg, "rw");
                event.response(transword);
            } else if (msg.startsWith("韩语 ")) {
                msg = msg.replace("韩语 ", "");
                String transword = translateAPI.translateText(msg, "ko");
                event.response(transword);
            } else if (msg.startsWith("库尔德语 ")) {
                msg = msg.replace("库尔德语 ", "");
                String transword = translateAPI.translateText(msg, "ku");
                event.response(transword);
            } else if (msg.startsWith("吉尔吉斯语 ")) {
                msg = msg.replace("吉尔吉斯语 ", "");
                String transword = translateAPI.translateText(msg, "ky");
                event.response(transword);
            } else if (msg.startsWith("老挝文 ")) {
                msg = msg.replace("老挝文 ", "");
                String transword = translateAPI.translateText(msg, "lo");
                event.response(transword);
            } else if (msg.startsWith("拉脱维亚语 ")) {
                msg = msg.replace("拉脱维亚语 ", "");
                String transword = translateAPI.translateText(msg, "lv");
                event.response(transword);
            } else if (msg.startsWith("立陶宛语 ")) {
                msg = msg.replace("立陶宛语 ", "");
                String transword = translateAPI.translateText(msg, "lt");
                event.response(transword);
            } else if (msg.startsWith("卢森堡语 ")) {
                msg = msg.replace("卢森堡语 ", "");
                String transword = translateAPI.translateText(msg, "lb");
                event.response(transword);
            } else if (msg.startsWith("马其顿语 ")) {
                msg = msg.replace("马其顿语 ", "");
                String transword = translateAPI.translateText(msg, "mk");
                event.response(transword);
            } else if (msg.startsWith("马尔加什语 ")) {
                msg = msg.replace("马尔加什语 ", "");
                String transword = translateAPI.translateText(msg, "mg");
                event.response(transword);
            } else if (msg.startsWith("马来语 ")) {
                msg = msg.replace("马来语 ", "");
                String transword = translateAPI.translateText(msg, "ms");
                event.response(transword);
            } else if (msg.startsWith("马拉雅拉姆文 ")) {
                msg = msg.replace("马拉雅拉姆文 ", "");
                String transword = translateAPI.translateText(msg, "ml");
                event.response(transword);
            } else if (msg.startsWith("马耳他语 ")) {
                msg = msg.replace("马耳他语 ", "");
                String transword = translateAPI.translateText(msg, "mt");
                event.response(transword);
            } else if (msg.startsWith("毛利语 ")) {
                msg = msg.replace("毛利语 ", "");
                String transword = translateAPI.translateText(msg, "mi");
                event.response(transword);
            } else if (msg.startsWith("马拉地语 ")) {
                msg = msg.replace("马拉地语 ", "");
                String transword = translateAPI.translateText(msg, "mr");
                event.response(transword);
            } else if (msg.startsWith("蒙古文 ")) {
                msg = msg.replace("蒙古文 ", "");
                String transword = translateAPI.translateText(msg, "mn");
                event.response(transword);
            } else if (msg.startsWith("缅甸语 ")) {
                msg = msg.replace("缅甸语 ", "");
                String transword = translateAPI.translateText(msg, "my");
                event.response(transword);
            } else if (msg.startsWith("尼泊尔语 ")) {
                msg = msg.replace("尼泊尔语 ", "");
                String transword = translateAPI.translateText(msg, "ne");
                event.response(transword);
            } else if (msg.startsWith("挪威语 ")) {
                msg = msg.replace("挪威语 ", "");
                String transword = translateAPI.translateText(msg, "no");
                event.response(transword);
            } else if (msg.startsWith("尼杨扎语 ")) {
                msg = msg.replace("尼杨扎语 ", "");
                String transword = translateAPI.translateText(msg, "ny");
                event.response(transword);
            } else if (msg.startsWith("奥里亚语 ")) {
                msg = msg.replace("奥里亚语 ", "");
                String transword = translateAPI.translateText(msg, "or");
                event.response(transword);
            } else if (msg.startsWith("普什图语 ")) {
                msg = msg.replace("普什图语 ", "");
                String transword = translateAPI.translateText(msg, "ps");
                event.response(transword);
            } else if (msg.startsWith("波斯语 ")) {
                msg = msg.replace("波斯语 ", "");
                String transword = translateAPI.translateText(msg, "fa");
                event.response(transword);
            } else if (msg.startsWith("波兰语 ")) {
                msg = msg.replace("波兰语 ", "");
                String transword = translateAPI.translateText(msg, "pl");
                event.response(transword);
            } else if (msg.startsWith("葡萄牙语 ")) {
                msg = msg.replace("葡萄牙语 ", "");
                String transword = translateAPI.translateText(msg, "pt");
                event.response(transword);
            } else if (msg.startsWith("旁遮普语 ")) {
                msg = msg.replace("旁遮普语 ", "");
                String transword = translateAPI.translateText(msg, "pa");
                event.response(transword);
            } else if (msg.startsWith("罗马尼亚语 ")) {
                msg = msg.replace("罗马尼亚语 ", "");
                String transword = translateAPI.translateText(msg, "ro");
                event.response(transword);
            } else if (msg.startsWith("俄语 ")) {
                msg = msg.replace("俄语 ", "");
                String transword = translateAPI.translateText(msg, "ru");
                event.response(transword);
            } else if (msg.startsWith("萨摩亚语 ")) {
                msg = msg.replace("萨摩亚语 ", "");
                String transword = translateAPI.translateText(msg, "sm");
                event.response(transword);
            } else if (msg.startsWith("苏格兰盖尔语 ")) {
                msg = msg.replace("苏格兰盖尔语 ", "");
                String transword = translateAPI.translateText(msg, "gd");
                event.response(transword);
            } else if (msg.startsWith("塞尔维亚语 ")) {
                msg = msg.replace("塞尔维亚语 ", "");
                String transword = translateAPI.translateText(msg, "sr");
                event.response(transword);
            } else if (msg.startsWith("塞索托语 ")) {
                msg = msg.replace("塞索托语 ", "");
                String transword = translateAPI.translateText(msg, "st");
                event.response(transword);
            } else if (msg.startsWith("修纳语 ")) {
                msg = msg.replace("修纳语 ", "");
                String transword = translateAPI.translateText(msg, "sn");
                event.response(transword);
            } else if (msg.startsWith("信德语 ")) {
                msg = msg.replace("信德语 ", "");
                String transword = translateAPI.translateText(msg, "sd");
                event.response(transword);
            } else if (msg.startsWith("僧伽罗语 ")) {
                msg = msg.replace("僧伽罗语 ", "");
                String transword = translateAPI.translateText(msg, "si");
                event.response(transword);
            } else if (msg.startsWith("斯洛伐克语 ")) {
                msg = msg.replace("斯洛伐克语 ", "");
                String transword = translateAPI.translateText(msg, "sk");
                event.response(transword);
            } else if (msg.startsWith("斯洛文尼亚语 ")) {
                msg = msg.replace("斯洛文尼亚语 ", "");
                String transword = translateAPI.translateText(msg, "sl");
                event.response(transword);
            } else if (msg.startsWith("索马里语 ")) {
                msg = msg.replace("索马里语 ", "");
                String transword = translateAPI.translateText(msg, "so");
                event.response(transword);
            } else if (msg.startsWith("西班牙语 ")) {
                msg = msg.replace("西班牙语 ", "");
                String transword = translateAPI.translateText(msg, "es");
                event.response(transword);
            } else if (msg.startsWith("巽他语 ")) {
                msg = msg.replace("巽他语 ", "");
                String transword = translateAPI.translateText(msg, "su");
                event.response(transword);
            } else if (msg.startsWith("斯瓦希里语 ")) {
                msg = msg.replace("斯瓦希里语 ", "");
                String transword = translateAPI.translateText(msg, "sw");
                event.response(transword);
            } else if (msg.startsWith("瑞典语 ")) {
                msg = msg.replace("瑞典语 ", "");
                String transword = translateAPI.translateText(msg, "sv");
                event.response(transword);
            } else if (msg.startsWith("塔加路语 ")) {
                msg = msg.replace("塔加路语 ", "");
                String transword = translateAPI.translateText(msg, "tl");
                event.response(transword);
            } else if (msg.startsWith("塔吉克语 ")) {
                msg = msg.replace("塔吉克语 ", "");
                String transword = translateAPI.translateText(msg, "tg");
                event.response(transword);
            } else if (msg.startsWith("泰米尔语 ")) {
                msg = msg.replace("泰米尔语 ", "");
                String transword = translateAPI.translateText(msg, "ta");
                event.response(transword);
            } else if (msg.startsWith("鞑靼语 ")) {
                msg = msg.replace("鞑靼语 ", "");
                String transword = translateAPI.translateText(msg, "tt");
                event.response(transword);
            } else if (msg.startsWith("泰卢固语 ")) {
                msg = msg.replace("泰卢固语 ", "");
                String transword = translateAPI.translateText(msg, "te");
                event.response(transword);
            } else if (msg.startsWith("泰文 ")) {
                msg = msg.replace("泰文 ", "");
                String transword = translateAPI.translateText(msg, "th");
                event.response(transword);
            } else if (msg.startsWith("土耳其语 ")) {
                msg = msg.replace("土耳其语 ", "");
                String transword = translateAPI.translateText(msg, "tr");
                event.response(transword);
            } else if (msg.startsWith("土库曼语 ")) {
                msg = msg.replace("土库曼语 ", "");
                String transword = translateAPI.translateText(msg, "tk");
                event.response(transword);
            } else if (msg.startsWith("乌克兰语 ")) {
                msg = msg.replace("乌克兰语 ", "");
                String transword = translateAPI.translateText(msg, "uk");
                event.response(transword);
            } else if (msg.startsWith("乌尔都语 ")) {
                msg = msg.replace("乌尔都语 ", "");
                String transword = translateAPI.translateText(msg, "ur");
                event.response(transword);
            } else if (msg.startsWith("维吾尔语 ")) {
                msg = msg.replace("维吾尔语 ", "");
                String transword = translateAPI.translateText(msg, "ug");
                event.response(transword);
            } else if (msg.startsWith("乌兹别克语 ")) {
                msg = msg.replace("乌兹别克语 ", "");
                String transword = translateAPI.translateText(msg, "uz");
                event.response(transword);
            } else if (msg.startsWith("越南语 ")) {
                msg = msg.replace("越南语 ", "");
                String transword = translateAPI.translateText(msg, "vi");
                event.response(transword);
            } else if (msg.startsWith("威尔士语 ")) {
                msg = msg.replace("威尔士语 ", "");
                String transword = translateAPI.translateText(msg, "cy");
                event.response(transword);
            } else if (msg.startsWith("班图语 ")) {
                msg = msg.replace("班图语 ", "");
                String transword = translateAPI.translateText(msg, "xh");
                event.response(transword);
            } else if (msg.startsWith("意第绪语 ")) {
                msg = msg.replace("意第绪语 ", "");
                String transword = translateAPI.translateText(msg, "yi");
                event.response(transword);
            } else if (msg.startsWith("约鲁巴语 ")) {
                msg = msg.replace("约鲁巴语 ", "");
                String transword = translateAPI.translateText(msg, "yo");
                event.response(transword);
            } else if (msg.startsWith("祖鲁语 ")) {
                msg = msg.replace("祖鲁语 ", "");
                String transword = translateAPI.translateText(msg, "zu");
                event.response(transword);
            }*/
            //1.1.0 使用语言列表
            for (String key : LanguageAPI.map.keySet()){
                if (msg.startsWith(key)){
                    msg = msg.replace(key + " ", "");
                    String transword = translateAPI.translateText(msg, LanguageAPI.map.get(key));
                    event.response(transword);
                }
            }
        } catch (Exception e) {
            event.response("未知错误 详细信息请查看控制台");
            e.printStackTrace();
        }
    }

}
