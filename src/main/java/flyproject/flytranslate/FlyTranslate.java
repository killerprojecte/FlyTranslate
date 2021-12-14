package flyproject.flytranslate;

import flyproject.flytranslate.amazingbot.Group;
import flyproject.flytranslate.amazingbot.Private;
import flyproject.flytranslate.miraimc.MGroup;
import flyproject.flytranslate.miraimc.MPrivate;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public final class FlyTranslate extends JavaPlugin {

    @Override
    public void onEnable() {
        getLogger().info("\n" +
                "    ________     ______                      __      __     \n" +
                "   / ____/ /_  _/_  __/________ _____  _____/ /___ _/ /____ \n" +
                "  / /_  / / / / // / / ___/ __ `/ __ \\/ ___/ / __ `/ __/ _ \\\n" +
                " / __/ / / /_/ // / / /  / /_/ / / / (__  ) / /_/ / /_/  __/\n" +
                "/_/   /_/\\__, //_/ /_/   \\__,_/_/ /_/____/_/\\__,_/\\__/\\___/ \n" +
                "        /____/                                              \n\n" +
                "(c) Copyright 2021 FlyProject");
        // Plugin startup logic
        getLogger().info("此插件优先选用AmazingBot框架");
        if (Bukkit.getPluginManager().getPlugin("AmazingBot") != null) {
            getLogger().info("检测到服务器使用AmazingBot框架 正在注册事件");
            getLogger().info("注册AmazingBot 群聊事件");
            Bukkit.getPluginManager().registerEvents(new Group(), this);
            getLogger().info("注册AmazingBot 私聊事件");
            Bukkit.getPluginManager().registerEvents(new Private(), this);
        } else if (Bukkit.getPluginManager().getPlugin("MiraiMC") != null) {
            getLogger().info("检测到服务器使用MiraiMC框架 正在注册事件");
            getLogger().info("注册MiraiMC 群聊事件");
            Bukkit.getPluginManager().registerEvents(new MGroup(), this);
            getLogger().info("注册MiraiMC 私聊事件");
            Bukkit.getPluginManager().registerEvents(new MPrivate(), this);
        } else {
            getLogger().warning("没有检测到支持的框架 无法启动");
            this.setEnabled(false);
            return;
        }
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
