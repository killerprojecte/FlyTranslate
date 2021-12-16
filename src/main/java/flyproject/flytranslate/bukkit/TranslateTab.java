package flyproject.flytranslate.bukkit;

import flyproject.flytranslate.LanguageAPI;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.command.TabCompleter;
import org.bukkit.util.StringUtil;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TranslateTab implements TabCompleter {

    @Override
    public List<String> onTabComplete(CommandSender sender, Command cmd, String label, String[] args) {
        List<String> completions = new ArrayList<>();
        List<String> commands = new ArrayList<>();

        if (args.length == 1) {
            //注册指令
            commands.addAll(LanguageAPI.map.keySet());
            StringUtil.copyPartialMatches(args[0], commands, completions);
        } else if (args.length == 2) {
            commands.add("在此处输入文本");
            StringUtil.copyPartialMatches(args[1], commands, completions);
        }
        Collections.sort(completions);
        return completions;
    }
}
