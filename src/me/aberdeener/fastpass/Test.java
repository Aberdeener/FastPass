package me.aberdeener.fastpass;

import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.ItemStack;

public class Test implements Listener {

	@SuppressWarnings("deprecation")
	@EventHandler
	public void onInventoryClick(InventoryClickEvent event) {

		// set "player" variable to the player who clicked the inv
		Player player = (Player) event.getWhoClicked();
		// set "clicked" variable to the item that was clicked
		ItemStack clicked = event.getCurrentItem();
		// set "inventory" variable to the name of the open inventory
		String attraction = event.getInventory().getName();

		// if clicked item is lime (yes)
		if (clicked.getType() == Material.LIME_CONCRETE) {
			// move block to original spot
			event.setCancelled(true);
			// Closes the inventory
			player.closeInventory();
			// remove fastpass from players inventory
			player.getInventory().removeItem(new ItemStack(Material.PAPER, 1));
			// define x y z coords from config
			int x = FastPass.getInstance().getConfig().getInt("attractions." + attraction + ".x");
			int y = FastPass.getInstance().getConfig().getInt("attractions." + attraction + ".y");
			int z = FastPass.getInstance().getConfig().getInt("attractions." + attraction + ".z");
			int pitch = FastPass.getInstance().getConfig().getInt("attractions." + attraction + ".pitch");
			int yaw = FastPass.getInstance().getConfig().getInt("attractions." + attraction + ".yaw");
			// now teleport player to above location
			Location attractionLoc = new Location(player.getWorld(), x, y, z, pitch, yaw);
			player.teleport(attractionLoc);
			player.sendMessage(ChatColor.GREEN + "Welcome to " + attraction + "!");
		}
		// if they dont click green
		if (clicked.getType() == Material.RED_CONCRETE) {
			// move block to original spot
			event.setCancelled(true);
			// Closes the inventory
			player.closeInventory();
			player.sendMessage(ChatColor.RED + "Cancelled FastPass!");
		}
		// if they click neither
		else {
			// move block to original spot
			event.setCancelled(true);
			// Closes the inventory
			player.closeInventory();
		}

	}
}