package me.aberdeener.fastpass;

import org.bukkit.Bukkit;
import org.bukkit.event.Listener;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public class FastPass extends JavaPlugin implements Listener {

	// access variables etc from other classes
	public static FastPass instance;

	@Override
	public void onEnable() {

		instance = this;
		
		// initiate /grant
		FastPassInv.init();

		getConfig().options().copyDefaults(true);
		saveConfig();
		reloadConfig();

		// register listeners below
		registerListeners();

		this.getCommand("fastpass").setExecutor(new FastPassCmd());
	}

	@Override
	public void onDisable() {
		this.saveConfig();
	}

	// lets us use this instance to load coords, reload config etc
	public static FastPass getInstance() {
		return instance;
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