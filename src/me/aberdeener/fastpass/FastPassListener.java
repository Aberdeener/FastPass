package me.aberdeener.fastpass;

import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

public class FastPassListener implements Listener {

	FastPass plugin;
	
	@SuppressWarnings("deprecation")
	@EventHandler
	public void onInventoryClick(InventoryClickEvent event) {

		// set "player" variable to the player who clicked the inv
		Player player = (Player) event.getWhoClicked();
		// set "clicked" variable to the item that was clicked
		ItemStack clicked = event.getCurrentItem();
		// set "inventory" variable to the name of the open inventory
		Inventory inventory = event.getInventory();

		// if the inventory is <attraction>
		if (inventory.getName().equals(FastPassInv.BigThunderMountain.getName())) {
			// if clicked item is lime (yes)
			if (clicked.getType() == Material.LIME_CONCRETE) {
				// move block to original spot
				event.setCancelled(true);
				// Closes the inventory
				player.closeInventory();
				// remove fastpass
				player.getInventory().removeItem(new ItemStack(Material.PAPER, 1));
				// define x y z coords from config
				int x = FastPass.getInstance().getConfig().getInt("attractions.BigThunderMountain.x");
				int y = FastPass.getInstance().getConfig().getInt("attractions.BigThunderMountain.y");
				int z = FastPass.getInstance().getConfig().getInt("attractions.BigThunderMountain.z");
				int pitch = FastPass.getInstance().getConfig().getInt("attractions.BigThunderMountain.pitch");
				int yaw = FastPass.getInstance().getConfig().getInt("attractions.BigThunderMountain.yaw");
				// now teleport player to above location
	            Location BigThunderMountain = new Location(player.getWorld(), x, y, z, pitch, yaw);
	            player.teleport(BigThunderMountain);
				player.sendMessage(ChatColor.GREEN + "Welcome to BigThunderMountain!");
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
		
		// if the inventory is <attraction>
		if (inventory.getName().equals(FastPassInv.HyperSpaceMountain.getName())) {
			// if clicked item is lime (yes)
			if (clicked.getType() == Material.LIME_CONCRETE) {
				// move block to original spot
				event.setCancelled(true);
				// Closes the inventory
				player.closeInventory();
				// remove fastpass
				player.getInventory().removeItem(new ItemStack(Material.PAPER, 1));
				// define x y z coords from config
				int x = FastPass.getInstance().getConfig().getInt("attractions.HyperSpaceMountain.x");
				int y = FastPass.getInstance().getConfig().getInt("attractions.HyperSpaceMountain.y");
				int z = FastPass.getInstance().getConfig().getInt("attractions.HyperSpaceMountain.z");
				int pitch = FastPass.getInstance().getConfig().getInt("attractions.HyperSpaceMountain.pitch");
				int yaw = FastPass.getInstance().getConfig().getInt("attractions.HyperSpaceMountain.yaw");
				// now teleport player to above location
	            Location HyperSpaceMountain = new Location(player.getWorld(), x, y, z, pitch, yaw);
	            player.teleport(HyperSpaceMountain);
				player.sendMessage(ChatColor.GREEN + "Welcome to HyperSpaceMountain!");
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
		
		
		// if the inventory is <attraction>
		if (inventory.getName().equals(FastPassInv.StarTours.getName())) {
			// if clicked item is lime (yes)
			if (clicked.getType() == Material.LIME_CONCRETE) {
				// move block to original spot
				event.setCancelled(true);
				// Closes the inventory
				player.closeInventory();
				// remove fastpass
				player.getInventory().removeItem(new ItemStack(Material.PAPER, 1));
				// define x y z coords from config
				int x = FastPass.getInstance().getConfig().getInt("attractions.StarTours.x");
				int y = FastPass.getInstance().getConfig().getInt("attractions.StarTours.y");
				int z = FastPass.getInstance().getConfig().getInt("attractions.StarTours.z");
				int pitch = FastPass.getInstance().getConfig().getInt("attractions.StarTours.pitch");
				int yaw = FastPass.getInstance().getConfig().getInt("attractions.StarTours.yaw");
				// now teleport player to above location
	            Location StarTours = new Location(player.getWorld(), x, y, z, pitch, yaw);
	            player.teleport(StarTours);
				player.sendMessage(ChatColor.GREEN + "Welcome to StarTours!");
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
		
		// if the inventory is <attraction>
		if (inventory.getName().equals(FastPassInv.BuzzLightYearLaserBlast.getName())) {
			// if clicked item is lime (yes)
			if (clicked.getType() == Material.LIME_CONCRETE) {
				// move block to original spot
				event.setCancelled(true);
				// Closes the inventory
				player.closeInventory();
				// remove fastpass
				player.getInventory().removeItem(new ItemStack(Material.PAPER, 1));
				// define x y z coords from config
				int x = FastPass.getInstance().getConfig().getInt("attractions.BuzzLightYearLaserBlast.x");
				int y = FastPass.getInstance().getConfig().getInt("attractions.BuzzLightYearLaserBlast.y");
				int z = FastPass.getInstance().getConfig().getInt("attractions.BuzzLightYearLaserBlast.z");
				int pitch = FastPass.getInstance().getConfig().getInt("attractions.BuzzLightYearLaserBlast.pitch");
				int yaw = FastPass.getInstance().getConfig().getInt("attractions.BuzzLightYearLaserBlast.yaw");
				// now teleport player to above location
	            Location BuzzLightYearLaserBlast = new Location(player.getWorld(), x, y, z, pitch, yaw);
	            player.teleport(BuzzLightYearLaserBlast);
				player.sendMessage(ChatColor.GREEN + "Welcome to BuzzLightYearLaserBlast!");
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
		
		// if the inventory is <attraction>
		if (inventory.getName().equals(FastPassInv.IndianaJones.getName())) {
			// if clicked item is lime (yes)
			if (clicked.getType() == Material.LIME_CONCRETE) {
				// move block to original spot
				event.setCancelled(true);
				// Closes the inventory
				player.closeInventory();
				// remove fastpass
				player.getInventory().removeItem(new ItemStack(Material.PAPER, 1));
				// define x y z coords from config
				int x = FastPass.getInstance().getConfig().getInt("attractions.IndianaJones.x");
				int y = FastPass.getInstance().getConfig().getInt("attractions.IndianaJones.y");
				int z = FastPass.getInstance().getConfig().getInt("attractions.IndianaJones.z");
				int pitch = FastPass.getInstance().getConfig().getInt("attractions.IndianaJones.pitch");
				int yaw = FastPass.getInstance().getConfig().getInt("attractions.IndianaJones.yaw");
				// now teleport player to above location
	            Location IndianaJones = new Location(player.getWorld(), x, y, z, pitch, yaw);
	            player.teleport(IndianaJones);
				player.sendMessage(ChatColor.GREEN + "Welcome to IndianaJones!");
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
		
		// if the inventory is <attraction>
		if (inventory.getName().equals(FastPassInv.PiratesOfTheCaribbean.getName())) {
			// if clicked item is lime (yes)
			if (clicked.getType() == Material.LIME_CONCRETE) {
				// move block to original spot
				event.setCancelled(true);
				// Closes the inventory
				player.closeInventory();
				// remove fastpass
				player.getInventory().removeItem(new ItemStack(Material.PAPER, 1));
				// define x y z coords from config
				int x = FastPass.getInstance().getConfig().getInt("attractions.PiratesOfTheCaribbean.x");
				int y = FastPass.getInstance().getConfig().getInt("attractions.PiratesOfTheCaribbean.y");
				int z = FastPass.getInstance().getConfig().getInt("attractions.PiratesOfTheCaribbean.z");
				int pitch = FastPass.getInstance().getConfig().getInt("attractions.PiratesOfTheCaribbean.pitch");
				int yaw = FastPass.getInstance().getConfig().getInt("attractions.PiratesOfTheCaribbean.yaw");
				// now teleport player to above location
	            Location PiratesOfTheCaribbean = new Location(player.getWorld(), x, y, z, pitch, yaw);
	            player.teleport(PiratesOfTheCaribbean);
				player.sendMessage(ChatColor.GREEN + "Welcome to PiratesOfTheCaribbean!");
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
		
		// if the inventory is <attraction>
		if (inventory.getName().equals(FastPassInv.PeterPan.getName())) {
			// if clicked item is lime (yes)
			if (clicked.getType() == Material.LIME_CONCRETE) {
				// move block to original spot
				event.setCancelled(true);
				// Closes the inventory
				player.closeInventory();
				// remove fastpass
				player.getInventory().removeItem(new ItemStack(Material.PAPER, 1));
				// define x y z coords from config
				int x = FastPass.getInstance().getConfig().getInt("attractions.PeterPan.x");
				int y = FastPass.getInstance().getConfig().getInt("attractions.PeterPan.y");
				int z = FastPass.getInstance().getConfig().getInt("attractions.PeterPan.z");
				int pitch = FastPass.getInstance().getConfig().getInt("attractions.PeterPan.pitch");
				int yaw = FastPass.getInstance().getConfig().getInt("attractions.PeterPan.yaw");
				// now teleport player to above location
	            Location PeterPan = new Location(player.getWorld(), x, y, z, pitch, yaw);
	            player.teleport(PeterPan);
				player.sendMessage(ChatColor.GREEN + "Welcome to PeterPan!");
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
		
		// if the inventory is <attraction>
		if (inventory.getName().equals(FastPassInv.TowerOfTerror.getName())) {
			// if clicked item is lime (yes)
			if (clicked.getType() == Material.LIME_CONCRETE) {
				// move block to original spot
				event.setCancelled(true);
				// Closes the inventory
				player.closeInventory();
				// remove fastpass
				player.getInventory().removeItem(new ItemStack(Material.PAPER, 1));
				// define x y z coords from config
				int x = FastPass.getInstance().getConfig().getInt("attractions.TowerOfTerror.x");
				int y = FastPass.getInstance().getConfig().getInt("attractions.TowerOfTerror.y");
				int z = FastPass.getInstance().getConfig().getInt("attractions.TowerOfTerror.z");
				int pitch = FastPass.getInstance().getConfig().getInt("attractions.TowerOfTerror.pitch");
				int yaw = FastPass.getInstance().getConfig().getInt("attractions.TowerOfTerror.yaw");
				// now teleport player to above location
	            Location TowerOfTerror = new Location(player.getWorld(), x, y, z, pitch, yaw);
	            player.teleport(TowerOfTerror);
				player.sendMessage(ChatColor.GREEN + "Welcome to TowerOfTerror!");
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
		
		// if the inventory is <attraction>
		if (inventory.getName().equals(FastPassInv.RockNRollCoaster.getName())) {
			// if clicked item is lime (yes)
			if (clicked.getType() == Material.LIME_CONCRETE) {
				// move block to original spot
				event.setCancelled(true);
				// Closes the inventory
				player.closeInventory();
				// remove fastpass
				player.getInventory().removeItem(new ItemStack(Material.PAPER, 1));
				// define x y z coords from config
				int x = FastPass.getInstance().getConfig().getInt("attractions.RockNRollCoaster.x");
				int y = FastPass.getInstance().getConfig().getInt("attractions.RockNRollCoaster.y");
				int z = FastPass.getInstance().getConfig().getInt("attractions.RockNRollCoaster.z");
				int pitch = FastPass.getInstance().getConfig().getInt("attractions.RockNRollCoaster.pitch");
				int yaw = FastPass.getInstance().getConfig().getInt("attractions.RockNRollCoaster.yaw");
				// now teleport player to above location
	            Location RockNRollCoaster = new Location(player.getWorld(), x, y, z, pitch, yaw);
	            player.teleport(RockNRollCoaster);
				player.sendMessage(ChatColor.GREEN + "Welcome to RockNRollCoaster!");
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
		
		// if the inventory is <attraction>
		if (inventory.getName().equals(FastPassInv.Ratatouille.getName())) {
			// if clicked item is lime (yes)
			if (clicked.getType() == Material.LIME_CONCRETE) {
				// move block to original spot
				event.setCancelled(true);
				// Closes the inventory
				player.closeInventory();
				// remove fastpass
				player.getInventory().removeItem(new ItemStack(Material.PAPER, 1));
				// define x y z coords from config
				int x = FastPass.getInstance().getConfig().getInt("attractions.Ratatouille.x");
				int y = FastPass.getInstance().getConfig().getInt("attractions.Ratatouille.y");
				int z = FastPass.getInstance().getConfig().getInt("attractions.Ratatouille.z");
				int pitch = FastPass.getInstance().getConfig().getInt("attractions.Ratatouille.pitch");
				int yaw = FastPass.getInstance().getConfig().getInt("attractions.Ratatouille.yaw");
				// now teleport player to above location
	            Location Ratatouille = new Location(player.getWorld(), x, y, z, pitch, yaw);
	            player.teleport(Ratatouille);
				player.sendMessage(ChatColor.GREEN + "Welcome to Ratatouille!");
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
		
		// if the inventory is <attraction>
		if (inventory.getName().equals(FastPassInv.CrushesCoaster.getName())) {
			// if clicked item is lime (yes)
			if (clicked.getType() == Material.LIME_CONCRETE) {
				// move block to original spot
				event.setCancelled(true);
				// Closes the inventory
				player.closeInventory();
				// remove fastpass
				player.getInventory().removeItem(new ItemStack(Material.PAPER, 1));
				// define x y z coords from config
				int x = FastPass.getInstance().getConfig().getInt("attractions.CrushesCoaster.x");
				int y = FastPass.getInstance().getConfig().getInt("attractions.CrushesCoaster.y");
				int z = FastPass.getInstance().getConfig().getInt("attractions.CrushesCoaster.z");
				int pitch = FastPass.getInstance().getConfig().getInt("attractions.CrushesCoaster.pitch");
				int yaw = FastPass.getInstance().getConfig().getInt("attractions.CrushesCoaster.yaw");
				// now teleport player to above location
	            Location CrushesCoaster = new Location(player.getWorld(), x, y, z, pitch, yaw);
	            player.teleport(CrushesCoaster);
				player.sendMessage(ChatColor.GREEN + "Welcome to CrushesCoaster!");
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

}