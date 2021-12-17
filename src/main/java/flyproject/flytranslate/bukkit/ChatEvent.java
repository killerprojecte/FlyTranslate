package flyproject.flytranslate.bukkit;

import flyproject.flytranslate.GoogleTranslateAPI;
import flyproject.flytranslate.LanguageAPI;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;

public class ChatEvent implements Listener {
    @EventHandler
    public void onChat(AsyncPlayerChatEvent event){
        String msg = event.getMessage();
        if (msg.startsWith("[翻译:")){
            msg = msg.replace("[翻译:","");
            for (String key : LanguageAPI.map.keySet()){
                if (msg.startsWith(key + "]")){
                    msg = msg.replace(key + "]","");
                    GoogleTranslateAPI googleTranslateAPI = new GoogleTranslateAPI();
                    try {
                        String transword = googleTranslateAPI.translateText(msg,LanguageAPI.map.get(key));
                        event.setMessage(transword);
                    } catch (Exception e) {
                        event.getPlayer().sendMessage("出现未知错误 无法翻译");
                        e.printStackTrace();
                    }
                }
            }
        }
    }
}
