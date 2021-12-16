package flyproject.flytranslate.bukkit;

import flyproject.flytranslate.GoogleTranslateAPI;
import flyproject.flytranslate.LanguageAPI;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class TCommand implements CommandExecutor{

    @Override
    public boolean onCommand(CommandSender sender, org.bukkit.command.Command command, String label, String[] args) {
        try {
         GoogleTranslateAPI translateAPI = new GoogleTranslateAPI();
         if (label.equals("translate") || label.equals("flytranslate") || label.equals("transl")){
             if (args.length==2){
                 if (LanguageAPI.map.containsKey(args[0])){
                     String code = LanguageAPI.map.get(args[0]);
                     String transword = translateAPI.translateText(args[1], code);
                     sender.sendMessage("§7[§b翻译§7] §f翻译结果: " + transword);
                     return true;
                 }
             }
        }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
}
