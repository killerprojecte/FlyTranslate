package flyproject.flytranslate.miraimc;

import flyproject.flytranslate.GoogleTranslateAPI;
import flyproject.flytranslate.LanguageAPI;
import me.albert.amazingbot.events.GroupMessageEvent;
import me.dreamvoid.miraimc.api.MiraiBot;
import me.dreamvoid.miraimc.api.MiraiMC;
import me.dreamvoid.miraimc.bukkit.event.MiraiGroupMessageEvent;
import org.bukkit.Bukkit;
import org.bukkit.OfflinePlayer;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;

import java.util.UUID;

public class MGroup implements Listener {
    @EventHandler
    public void onGroup(MiraiGroupMessageEvent event){
        String msg = event.getMessage();
        GoogleTranslateAPI translateAPI = new GoogleTranslateAPI();
        try {
            /*if (msg.startsWith("南非荷兰语 ")) {
                msg = msg.replace("南非荷兰语 ", "");
                String transword = translateAPI.translateText(msg, "af");
                MiraiBot.getBot(event.getBotID()).getGroup(event.getGroupID()).sendMessage(transword);
            } else if (msg.startsWith("阿尔巴尼亚语 ")) {
                msg = msg.replace("阿尔巴尼亚语 ", "");
                String transword = translateAPI.translateText(msg, "sq");
                MiraiBot.getBot(event.getBotID()).getGroup(event.getGroupID()).sendMessage(transword);
            } else if (msg.startsWith("阿姆哈拉语 ")) {
                msg = msg.replace("阿姆哈拉语 ", "");
                String transword = translateAPI.translateText(msg, "am");
                MiraiBot.getBot(event.getBotID()).getGroup(event.getGroupID()).sendMessage(transword);
            } else if (msg.startsWith("阿拉伯语 ")) {
                msg = msg.replace("阿拉伯语 ", "");
                String transword = translateAPI.translateText(msg, "ar");
                MiraiBot.getBot(event.getBotID()).getGroup(event.getGroupID()).sendMessage(transword);
            } else if (msg.startsWith("亚美尼亚语 ")) {
                msg = msg.replace("亚美尼亚语 ", "");
                String transword = translateAPI.translateText(msg, "hy");
                MiraiBot.getBot(event.getBotID()).getGroup(event.getGroupID()).sendMessage(transword);
            } else if (msg.startsWith("阿塞拜疆语 ")) {
                msg = msg.replace("阿塞拜疆语 ", "");
                String transword = translateAPI.translateText(msg, "az");
                MiraiBot.getBot(event.getBotID()).getGroup(event.getGroupID()).sendMessage(transword);
            } else if (msg.startsWith("巴斯克语 ")) {
                msg = msg.replace("巴斯克语 ", "");
                String transword = translateAPI.translateText(msg, "eu");
                MiraiBot.getBot(event.getBotID()).getGroup(event.getGroupID()).sendMessage(transword);
            } else if (msg.startsWith("白俄罗斯语 ")) {
                msg = msg.replace("白俄罗斯语 ", "");
                String transword = translateAPI.translateText(msg, "be");
                MiraiBot.getBot(event.getBotID()).getGroup(event.getGroupID()).sendMessage(transword);
            } else if (msg.startsWith("孟加拉语 ")) {
                msg = msg.replace("孟加拉语 ", "");
                String transword = translateAPI.translateText(msg, "bn");
                MiraiBot.getBot(event.getBotID()).getGroup(event.getGroupID()).sendMessage(transword);
            } else if (msg.startsWith("波斯尼亚语 ")) {
                msg = msg.replace("波斯尼亚语 ", "");
                String transword = translateAPI.translateText(msg, "bs");
                MiraiBot.getBot(event.getBotID()).getGroup(event.getGroupID()).sendMessage(transword);
            } else if (msg.startsWith("保加利亚语 ")) {
                msg = msg.replace("保加利亚语 ", "");
                String transword = translateAPI.translateText(msg, "bg");
                MiraiBot.getBot(event.getBotID()).getGroup(event.getGroupID()).sendMessage(transword);
            } else if (msg.startsWith("加泰罗尼亚语 ")) {
                msg = msg.replace("加泰罗尼亚语 ", "");
                String transword = translateAPI.translateText(msg, "ca");
                MiraiBot.getBot(event.getBotID()).getGroup(event.getGroupID()).sendMessage(transword);
            } else if (msg.startsWith("宿务语 ")) {
                msg = msg.replace("宿务语 ", "");
                String transword = translateAPI.translateText(msg, "ceb");
                MiraiBot.getBot(event.getBotID()).getGroup(event.getGroupID()).sendMessage(transword);
            } else if (msg.startsWith("中文 ")) {
                msg = msg.replace("中文 ", "");
                String transword = translateAPI.translateText(msg, "zh-CN");
                MiraiBot.getBot(event.getBotID()).getGroup(event.getGroupID()).sendMessage(transword);
            } else if (msg.startsWith("繁体 ")) {
                msg = msg.replace("繁体 ", "");
                String transword = translateAPI.translateText(msg, "zh-TW");
                MiraiBot.getBot(event.getBotID()).getGroup(event.getGroupID()).sendMessage(transword);
            } else if (msg.startsWith("科西嘉语 ")) {
                msg = msg.replace("科西嘉语 ", "");
                String transword = translateAPI.translateText(msg, "co");
                MiraiBot.getBot(event.getBotID()).getGroup(event.getGroupID()).sendMessage(transword);
            } else if (msg.startsWith("克罗地亚语 ")) {
                msg = msg.replace("克罗地亚语 ", "");
                String transword = translateAPI.translateText(msg, "hr");
                MiraiBot.getBot(event.getBotID()).getGroup(event.getGroupID()).sendMessage(transword);
            } else if (msg.startsWith("捷克语 ")) {
                msg = msg.replace("捷克语 ", "");
                String transword = translateAPI.translateText(msg, "cs");
                MiraiBot.getBot(event.getBotID()).getGroup(event.getGroupID()).sendMessage(transword);
            } else if (msg.startsWith("丹麦语 ")) {
                msg = msg.replace("丹麦语 ", "");
                String transword = translateAPI.translateText(msg, "da");
                MiraiBot.getBot(event.getBotID()).getGroup(event.getGroupID()).sendMessage(transword);
            } else if (msg.startsWith("荷兰语 ")) {
                msg = msg.replace("荷兰语 ", "");
                String transword = translateAPI.translateText(msg, "nl");
                MiraiBot.getBot(event.getBotID()).getGroup(event.getGroupID()).sendMessage(transword);
            } else if (msg.startsWith("英语 ")) {
                msg = msg.replace("英语 ", "");
                String transword = translateAPI.translateText(msg, "en");
                MiraiBot.getBot(event.getBotID()).getGroup(event.getGroupID()).sendMessage(transword);
            } else if (msg.startsWith("世界语 ")) {
                msg = msg.replace("世界语 ", "");
                String transword = translateAPI.translateText(msg, "eo");
                MiraiBot.getBot(event.getBotID()).getGroup(event.getGroupID()).sendMessage(transword);
            } else if (msg.startsWith("爱沙尼亚语 ")) {
                msg = msg.replace("爱沙尼亚语 ", "");
                String transword = translateAPI.translateText(msg, "et");
                MiraiBot.getBot(event.getBotID()).getGroup(event.getGroupID()).sendMessage(transword);
            } else if (msg.startsWith("芬兰语 ")) {
                msg = msg.replace("芬兰语 ", "");
                String transword = translateAPI.translateText(msg, "fi");
                MiraiBot.getBot(event.getBotID()).getGroup(event.getGroupID()).sendMessage(transword);
            } else if (msg.startsWith("法语 ")) {
                msg = msg.replace("法语 ", "");
                String transword = translateAPI.translateText(msg, "fr");
                MiraiBot.getBot(event.getBotID()).getGroup(event.getGroupID()).sendMessage(transword);
            } else if (msg.startsWith("弗里斯兰语 ")) {
                msg = msg.replace("弗里斯兰语 ", "");
                String transword = translateAPI.translateText(msg, "fy");
                MiraiBot.getBot(event.getBotID()).getGroup(event.getGroupID()).sendMessage(transword);
            } else if (msg.startsWith("加利西亚语 ")) {
                msg = msg.replace("加利西亚语 ", "");
                String transword = translateAPI.translateText(msg, "gl");
                MiraiBot.getBot(event.getBotID()).getGroup(event.getGroupID()).sendMessage(transword);
            } else if (msg.startsWith("格鲁吉亚语 ")) {
                msg = msg.replace("格鲁吉亚语 ", "");
                String transword = translateAPI.translateText(msg, "ka");
                MiraiBot.getBot(event.getBotID()).getGroup(event.getGroupID()).sendMessage(transword);
            } else if (msg.startsWith("德语 ")) {
                msg = msg.replace("德语 ", "");
                String transword = translateAPI.translateText(msg, "de");
                MiraiBot.getBot(event.getBotID()).getGroup(event.getGroupID()).sendMessage(transword);
            } else if (msg.startsWith("希腊语 ")) {
                msg = msg.replace("希腊语 ", "");
                String transword = translateAPI.translateText(msg, "el");
                MiraiBot.getBot(event.getBotID()).getGroup(event.getGroupID()).sendMessage(transword);
            } else if (msg.startsWith("古吉拉特语 ")) {
                msg = msg.replace("古吉拉特语 ", "");
                String transword = translateAPI.translateText(msg, "gu");
                MiraiBot.getBot(event.getBotID()).getGroup(event.getGroupID()).sendMessage(transword);
            } else if (msg.startsWith("海地克里奥尔语 ")) {
                msg = msg.replace("海地克里奥尔语 ", "");
                String transword = translateAPI.translateText(msg, "ht");
                MiraiBot.getBot(event.getBotID()).getGroup(event.getGroupID()).sendMessage(transword);
            } else if (msg.startsWith("豪萨语 ")) {
                msg = msg.replace("豪萨语 ", "");
                String transword = translateAPI.translateText(msg, "ha");
                MiraiBot.getBot(event.getBotID()).getGroup(event.getGroupID()).sendMessage(transword);
            } else if (msg.startsWith("夏威夷语 ")) {
                msg = msg.replace("夏威夷语 ", "");
                String transword = translateAPI.translateText(msg, "haw");
                MiraiBot.getBot(event.getBotID()).getGroup(event.getGroupID()).sendMessage(transword);
            } else if (msg.startsWith("希伯来语 ")) {
                msg = msg.replace("希伯来语 ", "");
                String transword = translateAPI.translateText(msg, "he");
                MiraiBot.getBot(event.getBotID()).getGroup(event.getGroupID()).sendMessage(transword);
            } else if (msg.startsWith("印地语 ")) {
                msg = msg.replace("印地语 ", "");
                String transword = translateAPI.translateText(msg, "hi");
                MiraiBot.getBot(event.getBotID()).getGroup(event.getGroupID()).sendMessage(transword);
            } else if (msg.startsWith("苗语 ")) {
                msg = msg.replace("苗语 ", "");
                String transword = translateAPI.translateText(msg, "hmn");
                MiraiBot.getBot(event.getBotID()).getGroup(event.getGroupID()).sendMessage(transword);
            } else if (msg.startsWith("匈牙利语 ")) {
                msg = msg.replace("匈牙利语 ", "");
                String transword = translateAPI.translateText(msg, "hu");
                MiraiBot.getBot(event.getBotID()).getGroup(event.getGroupID()).sendMessage(transword);
            } else if (msg.startsWith("冰岛语 ")) {
                msg = msg.replace("冰岛语 ", "");
                String transword = translateAPI.translateText(msg, "is");
                MiraiBot.getBot(event.getBotID()).getGroup(event.getGroupID()).sendMessage(transword);
            } else if (msg.startsWith("伊博语 ")) {
                msg = msg.replace("伊博语 ", "");
                String transword = translateAPI.translateText(msg, "ig");
                MiraiBot.getBot(event.getBotID()).getGroup(event.getGroupID()).sendMessage(transword);
            } else if (msg.startsWith("印度尼西亚语 ")) {
                msg = msg.replace("印度尼西亚语 ", "");
                String transword = translateAPI.translateText(msg, "id");
                MiraiBot.getBot(event.getBotID()).getGroup(event.getGroupID()).sendMessage(transword);
            } else if (msg.startsWith("爱尔兰语 ")) {
                msg = msg.replace("爱尔兰语 ", "");
                String transword = translateAPI.translateText(msg, "ga");
                MiraiBot.getBot(event.getBotID()).getGroup(event.getGroupID()).sendMessage(transword);
            } else if (msg.startsWith("意大利语 ")) {
                msg = msg.replace("意大利语 ", "");
                String transword = translateAPI.translateText(msg, "it");
                MiraiBot.getBot(event.getBotID()).getGroup(event.getGroupID()).sendMessage(transword);
            } else if (msg.startsWith("日语 ")) {
                msg = msg.replace("日语 ", "");
                String transword = translateAPI.translateText(msg, "ja");
                MiraiBot.getBot(event.getBotID()).getGroup(event.getGroupID()).sendMessage(transword);
            } else if (msg.startsWith("爪哇语 ")) {
                msg = msg.replace("爪哇语 ", "");
                String transword = translateAPI.translateText(msg, "jv");
                MiraiBot.getBot(event.getBotID()).getGroup(event.getGroupID()).sendMessage(transword);
            } else if (msg.startsWith("卡纳达语 ")) {
                msg = msg.replace("卡纳达语 ", "");
                String transword = translateAPI.translateText(msg, "kn");
                MiraiBot.getBot(event.getBotID()).getGroup(event.getGroupID()).sendMessage(transword);
            } else if (msg.startsWith("哈萨克语 ")) {
                msg = msg.replace("哈萨克语 ", "");
                String transword = translateAPI.translateText(msg, "kk");
                MiraiBot.getBot(event.getBotID()).getGroup(event.getGroupID()).sendMessage(transword);
            } else if (msg.startsWith("高棉语 ")) {
                msg = msg.replace("高棉语 ", "");
                String transword = translateAPI.translateText(msg, "km");
                MiraiBot.getBot(event.getBotID()).getGroup(event.getGroupID()).sendMessage(transword);
            } else if (msg.startsWith("卢旺达语 ")) {
                msg = msg.replace("卢旺达语 ", "");
                String transword = translateAPI.translateText(msg, "rw");
                MiraiBot.getBot(event.getBotID()).getGroup(event.getGroupID()).sendMessage(transword);
            } else if (msg.startsWith("韩语 ")) {
                msg = msg.replace("韩语 ", "");
                String transword = translateAPI.translateText(msg, "ko");
                MiraiBot.getBot(event.getBotID()).getGroup(event.getGroupID()).sendMessage(transword);
            } else if (msg.startsWith("库尔德语 ")) {
                msg = msg.replace("库尔德语 ", "");
                String transword = translateAPI.translateText(msg, "ku");
                MiraiBot.getBot(event.getBotID()).getGroup(event.getGroupID()).sendMessage(transword);
            } else if (msg.startsWith("吉尔吉斯语 ")) {
                msg = msg.replace("吉尔吉斯语 ", "");
                String transword = translateAPI.translateText(msg, "ky");
                MiraiBot.getBot(event.getBotID()).getGroup(event.getGroupID()).sendMessage(transword);
            } else if (msg.startsWith("老挝文 ")) {
                msg = msg.replace("老挝文 ", "");
                String transword = translateAPI.translateText(msg, "lo");
                MiraiBot.getBot(event.getBotID()).getGroup(event.getGroupID()).sendMessage(transword);
            } else if (msg.startsWith("拉脱维亚语 ")) {
                msg = msg.replace("拉脱维亚语 ", "");
                String transword = translateAPI.translateText(msg, "lv");
                MiraiBot.getBot(event.getBotID()).getGroup(event.getGroupID()).sendMessage(transword);
            } else if (msg.startsWith("立陶宛语 ")) {
                msg = msg.replace("立陶宛语 ", "");
                String transword = translateAPI.translateText(msg, "lt");
                MiraiBot.getBot(event.getBotID()).getGroup(event.getGroupID()).sendMessage(transword);
            } else if (msg.startsWith("卢森堡语 ")) {
                msg = msg.replace("卢森堡语 ", "");
                String transword = translateAPI.translateText(msg, "lb");
                MiraiBot.getBot(event.getBotID()).getGroup(event.getGroupID()).sendMessage(transword);
            } else if (msg.startsWith("马其顿语 ")) {
                msg = msg.replace("马其顿语 ", "");
                String transword = translateAPI.translateText(msg, "mk");
                MiraiBot.getBot(event.getBotID()).getGroup(event.getGroupID()).sendMessage(transword);
            } else if (msg.startsWith("马尔加什语 ")) {
                msg = msg.replace("马尔加什语 ", "");
                String transword = translateAPI.translateText(msg, "mg");
                MiraiBot.getBot(event.getBotID()).getGroup(event.getGroupID()).sendMessage(transword);
            } else if (msg.startsWith("马来语 ")) {
                msg = msg.replace("马来语 ", "");
                String transword = translateAPI.translateText(msg, "ms");
                MiraiBot.getBot(event.getBotID()).getGroup(event.getGroupID()).sendMessage(transword);
            } else if (msg.startsWith("马拉雅拉姆文 ")) {
                msg = msg.replace("马拉雅拉姆文 ", "");
                String transword = translateAPI.translateText(msg, "ml");
                MiraiBot.getBot(event.getBotID()).getGroup(event.getGroupID()).sendMessage(transword);
            } else if (msg.startsWith("马耳他语 ")) {
                msg = msg.replace("马耳他语 ", "");
                String transword = translateAPI.translateText(msg, "mt");
                MiraiBot.getBot(event.getBotID()).getGroup(event.getGroupID()).sendMessage(transword);
            } else if (msg.startsWith("毛利语 ")) {
                msg = msg.replace("毛利语 ", "");
                String transword = translateAPI.translateText(msg, "mi");
                MiraiBot.getBot(event.getBotID()).getGroup(event.getGroupID()).sendMessage(transword);
            } else if (msg.startsWith("马拉地语 ")) {
                msg = msg.replace("马拉地语 ", "");
                String transword = translateAPI.translateText(msg, "mr");
                MiraiBot.getBot(event.getBotID()).getGroup(event.getGroupID()).sendMessage(transword);
            } else if (msg.startsWith("蒙古文 ")) {
                msg = msg.replace("蒙古文 ", "");
                String transword = translateAPI.translateText(msg, "mn");
                MiraiBot.getBot(event.getBotID()).getGroup(event.getGroupID()).sendMessage(transword);
            } else if (msg.startsWith("缅甸语 ")) {
                msg = msg.replace("缅甸语 ", "");
                String transword = translateAPI.translateText(msg, "my");
                MiraiBot.getBot(event.getBotID()).getGroup(event.getGroupID()).sendMessage(transword);
            } else if (msg.startsWith("尼泊尔语 ")) {
                msg = msg.replace("尼泊尔语 ", "");
                String transword = translateAPI.translateText(msg, "ne");
                MiraiBot.getBot(event.getBotID()).getGroup(event.getGroupID()).sendMessage(transword);
            } else if (msg.startsWith("挪威语 ")) {
                msg = msg.replace("挪威语 ", "");
                String transword = translateAPI.translateText(msg, "no");
                MiraiBot.getBot(event.getBotID()).getGroup(event.getGroupID()).sendMessage(transword);
            } else if (msg.startsWith("尼杨扎语 ")) {
                msg = msg.replace("尼杨扎语 ", "");
                String transword = translateAPI.translateText(msg, "ny");
                MiraiBot.getBot(event.getBotID()).getGroup(event.getGroupID()).sendMessage(transword);
            } else if (msg.startsWith("奥里亚语 ")) {
                msg = msg.replace("奥里亚语 ", "");
                String transword = translateAPI.translateText(msg, "or");
                MiraiBot.getBot(event.getBotID()).getGroup(event.getGroupID()).sendMessage(transword);
            } else if (msg.startsWith("普什图语 ")) {
                msg = msg.replace("普什图语 ", "");
                String transword = translateAPI.translateText(msg, "ps");
                MiraiBot.getBot(event.getBotID()).getGroup(event.getGroupID()).sendMessage(transword);
            } else if (msg.startsWith("波斯语 ")) {
                msg = msg.replace("波斯语 ", "");
                String transword = translateAPI.translateText(msg, "fa");
                MiraiBot.getBot(event.getBotID()).getGroup(event.getGroupID()).sendMessage(transword);
            } else if (msg.startsWith("波兰语 ")) {
                msg = msg.replace("波兰语 ", "");
                String transword = translateAPI.translateText(msg, "pl");
                MiraiBot.getBot(event.getBotID()).getGroup(event.getGroupID()).sendMessage(transword);
            } else if (msg.startsWith("葡萄牙语 ")) {
                msg = msg.replace("葡萄牙语 ", "");
                String transword = translateAPI.translateText(msg, "pt");
                MiraiBot.getBot(event.getBotID()).getGroup(event.getGroupID()).sendMessage(transword);
            } else if (msg.startsWith("旁遮普语 ")) {
                msg = msg.replace("旁遮普语 ", "");
                String transword = translateAPI.translateText(msg, "pa");
                MiraiBot.getBot(event.getBotID()).getGroup(event.getGroupID()).sendMessage(transword);
            } else if (msg.startsWith("罗马尼亚语 ")) {
                msg = msg.replace("罗马尼亚语 ", "");
                String transword = translateAPI.translateText(msg, "ro");
                MiraiBot.getBot(event.getBotID()).getGroup(event.getGroupID()).sendMessage(transword);
            } else if (msg.startsWith("俄语 ")) {
                msg = msg.replace("俄语 ", "");
                String transword = translateAPI.translateText(msg, "ru");
                MiraiBot.getBot(event.getBotID()).getGroup(event.getGroupID()).sendMessage(transword);
            } else if (msg.startsWith("萨摩亚语 ")) {
                msg = msg.replace("萨摩亚语 ", "");
                String transword = translateAPI.translateText(msg, "sm");
                MiraiBot.getBot(event.getBotID()).getGroup(event.getGroupID()).sendMessage(transword);
            } else if (msg.startsWith("苏格兰盖尔语 ")) {
                msg = msg.replace("苏格兰盖尔语 ", "");
                String transword = translateAPI.translateText(msg, "gd");
                MiraiBot.getBot(event.getBotID()).getGroup(event.getGroupID()).sendMessage(transword);
            } else if (msg.startsWith("塞尔维亚语 ")) {
                msg = msg.replace("塞尔维亚语 ", "");
                String transword = translateAPI.translateText(msg, "sr");
                MiraiBot.getBot(event.getBotID()).getGroup(event.getGroupID()).sendMessage(transword);
            } else if (msg.startsWith("塞索托语 ")) {
                msg = msg.replace("塞索托语 ", "");
                String transword = translateAPI.translateText(msg, "st");
                MiraiBot.getBot(event.getBotID()).getGroup(event.getGroupID()).sendMessage(transword);
            } else if (msg.startsWith("修纳语 ")) {
                msg = msg.replace("修纳语 ", "");
                String transword = translateAPI.translateText(msg, "sn");
                MiraiBot.getBot(event.getBotID()).getGroup(event.getGroupID()).sendMessage(transword);
            } else if (msg.startsWith("信德语 ")) {
                msg = msg.replace("信德语 ", "");
                String transword = translateAPI.translateText(msg, "sd");
                MiraiBot.getBot(event.getBotID()).getGroup(event.getGroupID()).sendMessage(transword);
            } else if (msg.startsWith("僧伽罗语 ")) {
                msg = msg.replace("僧伽罗语 ", "");
                String transword = translateAPI.translateText(msg, "si");
                MiraiBot.getBot(event.getBotID()).getGroup(event.getGroupID()).sendMessage(transword);
            } else if (msg.startsWith("斯洛伐克语 ")) {
                msg = msg.replace("斯洛伐克语 ", "");
                String transword = translateAPI.translateText(msg, "sk");
                MiraiBot.getBot(event.getBotID()).getGroup(event.getGroupID()).sendMessage(transword);
            } else if (msg.startsWith("斯洛文尼亚语 ")) {
                msg = msg.replace("斯洛文尼亚语 ", "");
                String transword = translateAPI.translateText(msg, "sl");
                MiraiBot.getBot(event.getBotID()).getGroup(event.getGroupID()).sendMessage(transword);
            } else if (msg.startsWith("索马里语 ")) {
                msg = msg.replace("索马里语 ", "");
                String transword = translateAPI.translateText(msg, "so");
                MiraiBot.getBot(event.getBotID()).getGroup(event.getGroupID()).sendMessage(transword);
            } else if (msg.startsWith("西班牙语 ")) {
                msg = msg.replace("西班牙语 ", "");
                String transword = translateAPI.translateText(msg, "es");
                MiraiBot.getBot(event.getBotID()).getGroup(event.getGroupID()).sendMessage(transword);
            } else if (msg.startsWith("巽他语 ")) {
                msg = msg.replace("巽他语 ", "");
                String transword = translateAPI.translateText(msg, "su");
                MiraiBot.getBot(event.getBotID()).getGroup(event.getGroupID()).sendMessage(transword);
            } else if (msg.startsWith("斯瓦希里语 ")) {
                msg = msg.replace("斯瓦希里语 ", "");
                String transword = translateAPI.translateText(msg, "sw");
                MiraiBot.getBot(event.getBotID()).getGroup(event.getGroupID()).sendMessage(transword);
            } else if (msg.startsWith("瑞典语 ")) {
                msg = msg.replace("瑞典语 ", "");
                String transword = translateAPI.translateText(msg, "sv");
                MiraiBot.getBot(event.getBotID()).getGroup(event.getGroupID()).sendMessage(transword);
            } else if (msg.startsWith("塔加路语 ")) {
                msg = msg.replace("塔加路语 ", "");
                String transword = translateAPI.translateText(msg, "tl");
                MiraiBot.getBot(event.getBotID()).getGroup(event.getGroupID()).sendMessage(transword);
            } else if (msg.startsWith("塔吉克语 ")) {
                msg = msg.replace("塔吉克语 ", "");
                String transword = translateAPI.translateText(msg, "tg");
                MiraiBot.getBot(event.getBotID()).getGroup(event.getGroupID()).sendMessage(transword);
            } else if (msg.startsWith("泰米尔语 ")) {
                msg = msg.replace("泰米尔语 ", "");
                String transword = translateAPI.translateText(msg, "ta");
                MiraiBot.getBot(event.getBotID()).getGroup(event.getGroupID()).sendMessage(transword);
            } else if (msg.startsWith("鞑靼语 ")) {
                msg = msg.replace("鞑靼语 ", "");
                String transword = translateAPI.translateText(msg, "tt");
                MiraiBot.getBot(event.getBotID()).getGroup(event.getGroupID()).sendMessage(transword);
            } else if (msg.startsWith("泰卢固语 ")) {
                msg = msg.replace("泰卢固语 ", "");
                String transword = translateAPI.translateText(msg, "te");
                MiraiBot.getBot(event.getBotID()).getGroup(event.getGroupID()).sendMessage(transword);
            } else if (msg.startsWith("泰文 ")) {
                msg = msg.replace("泰文 ", "");
                String transword = translateAPI.translateText(msg, "th");
                MiraiBot.getBot(event.getBotID()).getGroup(event.getGroupID()).sendMessage(transword);
            } else if (msg.startsWith("土耳其语 ")) {
                msg = msg.replace("土耳其语 ", "");
                String transword = translateAPI.translateText(msg, "tr");
                MiraiBot.getBot(event.getBotID()).getGroup(event.getGroupID()).sendMessage(transword);
            } else if (msg.startsWith("土库曼语 ")) {
                msg = msg.replace("土库曼语 ", "");
                String transword = translateAPI.translateText(msg, "tk");
                MiraiBot.getBot(event.getBotID()).getGroup(event.getGroupID()).sendMessage(transword);
            } else if (msg.startsWith("乌克兰语 ")) {
                msg = msg.replace("乌克兰语 ", "");
                String transword = translateAPI.translateText(msg, "uk");
                MiraiBot.getBot(event.getBotID()).getGroup(event.getGroupID()).sendMessage(transword);
            } else if (msg.startsWith("乌尔都语 ")) {
                msg = msg.replace("乌尔都语 ", "");
                String transword = translateAPI.translateText(msg, "ur");
                MiraiBot.getBot(event.getBotID()).getGroup(event.getGroupID()).sendMessage(transword);
            } else if (msg.startsWith("维吾尔语 ")) {
                msg = msg.replace("维吾尔语 ", "");
                String transword = translateAPI.translateText(msg, "ug");
                MiraiBot.getBot(event.getBotID()).getGroup(event.getGroupID()).sendMessage(transword);
            } else if (msg.startsWith("乌兹别克语 ")) {
                msg = msg.replace("乌兹别克语 ", "");
                String transword = translateAPI.translateText(msg, "uz");
                MiraiBot.getBot(event.getBotID()).getGroup(event.getGroupID()).sendMessage(transword);
            } else if (msg.startsWith("越南语 ")) {
                msg = msg.replace("越南语 ", "");
                String transword = translateAPI.translateText(msg, "vi");
                MiraiBot.getBot(event.getBotID()).getGroup(event.getGroupID()).sendMessage(transword);
            } else if (msg.startsWith("威尔士语 ")) {
                msg = msg.replace("威尔士语 ", "");
                String transword = translateAPI.translateText(msg, "cy");
                MiraiBot.getBot(event.getBotID()).getGroup(event.getGroupID()).sendMessage(transword);
            } else if (msg.startsWith("班图语 ")) {
                msg = msg.replace("班图语 ", "");
                String transword = translateAPI.translateText(msg, "xh");
                MiraiBot.getBot(event.getBotID()).getGroup(event.getGroupID()).sendMessage(transword);
            } else if (msg.startsWith("意第绪语 ")) {
                msg = msg.replace("意第绪语 ", "");
                String transword = translateAPI.translateText(msg, "yi");
                MiraiBot.getBot(event.getBotID()).getGroup(event.getGroupID()).sendMessage(transword);
            } else if (msg.startsWith("约鲁巴语 ")) {
                msg = msg.replace("约鲁巴语 ", "");
                String transword = translateAPI.translateText(msg, "yo");
                MiraiBot.getBot(event.getBotID()).getGroup(event.getGroupID()).sendMessage(transword);
            } else if (msg.startsWith("祖鲁语 ")) {
                msg = msg.replace("祖鲁语 ", "");
                String transword = translateAPI.translateText(msg, "zu");
                MiraiBot.getBot(event.getBotID()).getGroup(event.getGroupID()).sendMessage(transword);
            }*/
            //1.1.0
            for (String key : LanguageAPI.map.keySet()){
                if (msg.startsWith(key)){
                    msg = msg.replace(key + " ", "");
                    String transword = translateAPI.translateText(msg, LanguageAPI.map.get(key));
                    MiraiBot.getBot(event.getBotID()).getGroup(event.getGroupID()).sendMessage(transword);
                }
            }
        } catch (Exception e) {
            MiraiBot.getBot(event.getBotID()).getGroup(event.getGroupID()).sendMessage("未知错误 详细信息请查看控制台");
            e.printStackTrace();
        }
    }
    @EventHandler
    public void GroupSend(MiraiGroupMessageEvent event){
        String msg = event.getMessage();
        GoogleTranslateAPI translateAPI = new GoogleTranslateAPI();
        try {
            if (msg.startsWith("发送翻译 ")){
                msg = msg.replace("发送翻译 ","");
                String uuidstr = MiraiMC.getBinding(event.getSenderID());
                if (uuidstr==null){
                    MiraiBot.getBot(event.getBotID()).getGroup(event.getGroupID()).sendMessage("您尚未绑定游戏账号 请绑定后再使用");
                    return;
                }
                UUID uuid = UUID.fromString(uuidstr);
                OfflinePlayer op = Bukkit.getOfflinePlayer(uuid);
                if (!op.isOnline()){
                    MiraiBot.getBot(event.getBotID()).getGroup(event.getGroupID()).sendMessage("您绑定的账号 " + op.getName() + " 并不在线 请先加入游戏");
                    return;
                }
                Player player = Bukkit.getPlayer(op.getName());
                for (String key : LanguageAPI.map.keySet()){
                    if (msg.startsWith(key)){
                        msg = msg.replace(key + " ", "");
                        String transword = translateAPI.translateText(msg, LanguageAPI.map.get(key));
                        MiraiBot.getBot(event.getBotID()).getGroup(event.getGroupID()).sendMessage("发送成功");
                        sendMessage(player,transword);
                        return;
                    }
                }
                MiraiBot.getBot(event.getBotID()).getGroup(event.getGroupID()).sendMessage("格式错误或目标语言不存在");
            }
        } catch (Exception e) {
            MiraiBot.getBot(event.getBotID()).getGroup(event.getGroupID()).sendMessage("未知错误 详细信息请查看控制台");
            e.printStackTrace();
        }
    }
    public void sendMessage(Player player,String message){
        player.chat(message);
    }
}
