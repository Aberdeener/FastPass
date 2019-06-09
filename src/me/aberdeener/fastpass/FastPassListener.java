package me.aberdeener.fastpass;

import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.ItemStack;

public class FastPassListener implements Listener {
	@SuppressWarnings("deprecation")
	@EventHandler
	public void onInventoryClick(InventoryClickEvent event) {

		// set "player" variable to the player who clicked the inv
		Player player = (Player) event.getWhoClicked();
		// set "clicked" variable to the item that was clicked
		ItemStack clicked = event.getCurrentItem();
		// set "inventory" variable to the name of the open inventory
		String attraction = event.getInventory().getName();
		// if they click outside of the inventory
		if (clicked == null) {
			return;
		}
		// if they click in their crafting slots
		if (event.getInventory().getName().equals("Crafting")) {
			return;
		}
		// if their open inventory is named the attraction they entered
		if (event.getInventory().getName().equals(attraction)) {
			// if clicked item is lime (yes)
			if (clicked.getType() == Material.LIME_CONCRETE) {
				// move block to original spot
				event.setCancelled(true);
				// Closes the inventory
				player.closeInventory();
				// remove fastpass from players inventory
				player.getInventory().remove(Material.PAPER);
				// define x y z coords from config
				int x = FastPass.getInstance().getConfig().getInt("attractions." + attraction + ".x");
				int y = FastPass.getInstance().getConfig().getInt("attractions." + attraction + ".y");
				int z = FastPass.getInstance().getConfig().getInt("attractions." + attraction + ".z");
				float pitch = FastPass.getInstance().getConfig().getInt("attractions." + attraction + ".pitch");
				float yaw = FastPass.getInstance().getConfig().getInt("attractions." + attraction + ".yaw");
				// now teleport player to above location
				Location attractionLoc = new Location(player.getWorld(), x, y, z, pitch, yaw);
				player.teleport(attractionLoc);
				player.sendMessage(ChatColor.GREEN + "Welcome to " + attraction + "!");
			}
			// if they click red (no)
			if (clicked.getType() == Material.RED_CONCRETE) {
				// move block to original spot
				event.setCancelled(true);
				// Closes the inventory
				player.closeInventory();
				player.sendMessage(ChatColor.RED + "Cancelled FastPass!");
			}

			if (clicked.getType() == Material.PAPER) {

				event.setCancelled(true);

				player.closeInventory();
				player.sendMessage(ChatColor.GREEN + "Buy FastPasses at our store: " + ChatColor.YELLOW
						+ FastPass.getInstance().getConfig().getString("store-url"));
			} else {

				event.setCancelled(true);
			}
		}
	}
}
