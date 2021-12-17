package flyproject.flytranslate.bukkit;

import org.bukkit.Bukkit;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class PlayerChat implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, org.bukkit.command.Command command, String label, String[] args) {
        if (label.equals("ftlchatplayersend") && sender.isOp() && args.length>=2){
            Player player = Bukkit.getPlayer(args[0]);
            StringBuilder sb = new StringBuilder(args[1]);
            if (args.length>2){
                for (int i = 3;i < args.length;i++){
                    sb.append(" ");
                    sb.append(args[i]);
                }
            }
            player.chat(sb.toString());
        }
        return false;
    }
}
