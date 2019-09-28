package me.aberdeener.fastpass;

import org.bukkit.Bukkit;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.scheduler.BukkitRunnable;

public class FastPass extends JavaPlugin implements Listener {

	// access variables etc from other classes
	public static FastPass instance;
	
	public static FastPass pl;
	
	// lets us use this instance to load coords, reload config etc
	public static FastPass getInstance() {
		return instance;
	}

    public static FastPass getPlugin() {
        return pl;
    }

	@Override
	public void onEnable() {

		getConfig().options().copyDefaults(true);
		saveConfig();

		instance = this;
		
		pl = this;

		// initiate /fastpass teleport <attraction>
		new BukkitRunnable() {
			public void run() {
				FastPassInv.init();
			}
			// reload the init to update from config
		}.runTaskTimer(FastPass.getInstance(), 0L, 50L);

		// register listeners below
		registerListeners();

		this.getCommand("fastpass").setExecutor(new FastPassCmd());
		this.getCommand("fastpass").setTabCompleter(new FastPassTab());
		
		Updat3r.getInstance().startTask();
		
		Bukkit.getPluginManager().registerEvents(new Listener() {
			
			@EventHandler
			public void onJoin(PlayerJoinEvent e) {
				Updat3r.getInstance().sendUpdateMessageLater(e.getPlayer());
			}
		}, this);
	}

	@Override
	public void onDisable() {
		this.saveConfig();
	}
	
	public void registerListeners() {

		// creates the plugin manager
		PluginManager pm = Bukkit.getServer().getPluginManager();

		// listens for the main class
		pm.registerEvents(this, this);

		// Listens for fastpasslistener class
		pm.registerEvents(new FastPassListener(), this);

	}
}