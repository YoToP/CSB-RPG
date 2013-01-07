package csb.rpgplugin.rpgmain;

import org.bukkit.plugin.java.JavaPlugin;

public final class rpgmain extends JavaPlugin{
	@Override
    public void onEnable(){
		getLogger().info("onEnable has been invoked!");
		}
 
    @Override
    public void onDisable() {
        // TODO Insert logic to be performed when the plugin is disabled
    }
}
