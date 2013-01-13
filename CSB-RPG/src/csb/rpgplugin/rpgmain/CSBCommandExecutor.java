package csb.rpgplugin.rpgmain;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class CSBCommandExecutor implements CommandExecutor {
	 
	private RPGMain plugin; // pointer to your main class, unrequired if you don't need methods from the main class
	 
	public CSBCommandExecutor(RPGMain plugin) {
			this.plugin = plugin;
	}
	@Override
	public boolean onCommand(CommandSender sender, Command arg1, String arg2,
			String[] arg3) {
		if (sender instanceof Player) {
	           Player player = (Player) sender;
	           // do something
	        } else {
	           sender.sendMessage("You must be a player!");
	           return false;
	        }
	        // do something
	        return false;
	}

}
