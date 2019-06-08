package me.aberdeener.fastpass;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class FastPassCmd implements CommandExecutor {

	public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args) {

		// base command
		if (commandLabel.equalsIgnoreCase("fastpass")) {

			// console sender check
			if (!(sender instanceof Player)) {
				sender.sendMessage(ChatColor.RED + "[FastPass] Please execute in-game!");
				return true;
			}

			Player p = (Player) sender;

			// permission check
			if (!sender.hasPermission("fastpass.use")) {
				sender.sendMessage(ChatColor.DARK_RED + "You don't have permission to execute this command!");
				return true;
			}

			else {

				if (args.length == 0) {
					p.sendMessage(ChatColor.DARK_RED + "Correct Usage:  /fastpass <teleport|reload>");
					return true;
				}

				else if (args[0].equalsIgnoreCase("reload")) {

					// reload permission check
					if (!sender.hasPermission("fastpass.reload")) {
						sender.sendMessage(ChatColor.DARK_RED + "You don't have permission to execute this command!");
						return true;
					}

					FastPass.getInstance().reloadConfig();
					sender.sendMessage(ChatColor.GREEN + "Config Reloaded!");
					return true;
				}

				else if (args[0].equalsIgnoreCase("teleport")) {

					// create fastPass variable with meta displayname
					ItemStack fastPass = new ItemStack(Material.PAPER);
					ItemMeta fastPassMeta = fastPass.getItemMeta();
					fastPassMeta.setDisplayName("FastPass");
					fastPass.setItemMeta(fastPassMeta);

					// ensure they have the right item in their inventory
					// REPLACE WHEN FASTPASS IS FIXED
					if (p.getInventory().contains(Material.PAPER)) {

						// now check for the sub command/argument and send player to the location in
						// config
						if (args.length == 1) {
							p.sendMessage(ChatColor.DARK_RED + "Correct Usage:  /fastpass teleport <attraction>");
							return true;
						}

						else if (args[1].equalsIgnoreCase("BigThunderMountain")) {
							p.openInventory(FastPassInv.BigThunderMountain);
							return true;
						}

						else if (args[1].equalsIgnoreCase("HyperSpaceMountain")) {
							p.openInventory(FastPassInv.HyperSpaceMountain);
							return true;

						}

						else if (args[1].equalsIgnoreCase("StarTours")) {
							p.openInventory(FastPassInv.StarTours);
							return true;
						}

						else if (args[1].equalsIgnoreCase("BuzzLightYearLaserBlast")) {
							p.openInventory(FastPassInv.BuzzLightYearLaserBlast);
							return true;
						}

						else if (args[1].equalsIgnoreCase("IndianaJones")) {
							p.openInventory(FastPassInv.IndianaJones);
							return true;
						}

						else if (args[1].equalsIgnoreCase("PiratesOfTheCaribbean")) {
							p.openInventory(FastPassInv.PiratesOfTheCaribbean);
							return true;
						}

						else if (args[1].equalsIgnoreCase("PeterPan")) {
							p.openInventory(FastPassInv.PeterPan);
							return true;
						}

						else if (args[1].equalsIgnoreCase("TowerOfTerror")) {
							p.openInventory(FastPassInv.TowerOfTerror);
							return true;
						}

						else if (args[1].equalsIgnoreCase("RockNRollCoaster")) {
							p.openInventory(FastPassInv.RockNRollCoaster);
							return true;
						}

						else if (args[1].equalsIgnoreCase("Ratatouille")) {
							p.openInventory(FastPassInv.Ratatouille);
							return true;
						}

						else if (args[1].equalsIgnoreCase("CrushesCoaster")) {
							p.openInventory(FastPassInv.CrushesCoaster);
							return true;
						}

						else {
							p.sendMessage(ChatColor.DARK_RED + "Invalid Attraction!");
							return true;
						}

					}

					else {
						p.sendMessage(ChatColor.DARK_RED + "You need a FastPass to run this command!");
						return true;
					}
				}

			}
		}
		return true;
	}
}