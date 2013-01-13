package csb.rpgplugin.rpgmain;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.plugin.java.JavaPlugin;

public final class RPGMain extends JavaPlugin{
	@Override
    public void onEnable(){
		getLogger().info("onEnable has been invoked!");
		}
 
    @Override
    public void onDisable() {
        // TODO Insert logic to be performed when the plugin is disabled
    }
    
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args){
    	// This will throw a NullPointException if you don't have the command defined in your plugin.yml file!
    	getCommand("basic").setExecutor(new CSBCommandExecutor(this));
            // If this hasn't happened the a value of false will be returned.
    	return false; 
    }
    
}
