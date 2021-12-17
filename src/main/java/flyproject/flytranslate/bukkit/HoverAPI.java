package flyproject.flytranslate.bukkit;

import net.md_5.bungee.api.chat.ClickEvent;
import net.md_5.bungee.api.chat.ComponentBuilder;
import net.md_5.bungee.api.chat.HoverEvent;
import net.md_5.bungee.api.chat.TextComponent;

public class HoverAPI {
    public static TextComponent getClickHoverText(String text, String hovertext, ClickEvent.Action action, String vaule){
        TextComponent mainComponent = new TextComponent(text);
        mainComponent.setHoverEvent( new HoverEvent( HoverEvent.Action.SHOW_TEXT, new ComponentBuilder(hovertext).create()));
        mainComponent.setClickEvent(new ClickEvent(action,vaule));
        return mainComponent;
    }
}
